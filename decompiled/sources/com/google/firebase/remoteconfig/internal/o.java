package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f40621e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Pattern f40622f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Pattern f40623g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f40624a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f40625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f40626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f40627d;

    public o(Executor executor, f fVar, f fVar2) {
        this.f40625b = executor;
        this.f40626c = fVar;
        this.f40627d = fVar2;
    }

    private void c(final String str, final g gVar) {
        if (gVar == null) {
            return;
        }
        synchronized (this.f40624a) {
            try {
                for (final BiConsumer biConsumer : this.f40624a) {
                    this.f40625b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            biConsumer.accept(str, gVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static g e(f fVar) {
        return fVar.f();
    }

    private static Set f(f fVar) {
        HashSet hashSet = new HashSet();
        g gVarE = e(fVar);
        if (gVarE != null) {
            Iterator<String> itKeys = gVarE.g().keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    private static String g(f fVar, String str) {
        g gVarE = e(fVar);
        if (gVarE == null) {
            return null;
        }
        try {
            return gVarE.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void i(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(BiConsumer biConsumer) {
        synchronized (this.f40624a) {
            this.f40624a.add(biConsumer);
        }
    }

    public Map d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(f(this.f40626c));
        hashSet.addAll(f(this.f40627d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, h(str));
        }
        return map;
    }

    public p008a7.n h(String str) {
        String strG = g(this.f40626c, str);
        if (strG != null) {
            c(str, e(this.f40626c));
            return new w(strG, 2);
        }
        String strG2 = g(this.f40627d, str);
        if (strG2 != null) {
            return new w(strG2, 1);
        }
        i(str, "FirebaseRemoteConfigValue");
        return new w("", 0);
    }
}

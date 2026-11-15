package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4367mU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L4.a f31522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f31523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f31524d = new AtomicReference("");

    C4367mU(Context context, L4.a aVar, Executor executor) {
        this.f31521a = context;
        this.f31522b = aVar;
        this.f31523c = executor;
    }

    private final String c() {
        String name;
        L4.a aVar = this.f31522b;
        String strD = null;
        if (aVar.f3100d) {
            name = AbstractC2321Qw.class.getName();
        } else {
            try {
                name = (String) new JSONObject(d((String) H4.B.c().d(AbstractC3892ii.Nf))).get(Integer.toString(aVar.f3099c));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e10) {
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Mf)).booleanValue()) {
                    G4.t.l().j(e10, "SdkIE");
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return CommonGetHeaderBiddingToken.HB_TOKEN_VERSION;
        }
        try {
            strD = d((String) H4.B.c().d(AbstractC3892ii.Of));
        } catch (IllegalArgumentException e11) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Mf)).booleanValue()) {
                G4.t.l().j(e11, "SdkIE");
            }
        }
        if (TextUtils.isEmpty(strD)) {
            return "3";
        }
        try {
            for (Method method : this.f31521a.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strD)) {
                    return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }

    private static final String d(String str) {
        return K4.F0.Y(new String(Base64.decode(str, 0)), new String(Base64.decode((String) H4.B.c().d(AbstractC3892ii.Pf), 10), StandardCharsets.UTF_8));
    }

    public final String a() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Lf)).booleanValue()) {
            if (!((String) H4.B.c().d(AbstractC3892ii.Nf)).isEmpty()) {
                if (!((String) H4.B.c().d(AbstractC3892ii.Of)).isEmpty()) {
                    if (!((String) H4.B.c().d(AbstractC3892ii.Pf)).isEmpty()) {
                        String str = (String) this.f31524d.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.f31523c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.lU
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f31276a.b();
                            }
                        });
                        return null;
                    }
                }
            }
        }
        return null;
    }

    final /* synthetic */ void b() {
        AtomicReference atomicReference = this.f31524d;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(c());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6116q implements InterfaceC6127u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f36129h = new p190t.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f36130i = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f36131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f36132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f36133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentObserver f36134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f36135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Map f36136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f36137g;

    private C6116q(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C6113p c6113p = new C6113p(this, null);
        this.f36134d = c6113p;
        this.f36135e = new Object();
        this.f36137g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f36131a = contentResolver;
        this.f36132b = uri;
        this.f36133c = runnable;
        contentResolver.registerContentObserver(uri, false, c6113p);
    }

    public static C6116q a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C6116q c6116q;
        synchronized (C6116q.class) {
            Map map = f36129h;
            c6116q = (C6116q) map.get(uri);
            if (c6116q == null) {
                try {
                    C6116q c6116q2 = new C6116q(contentResolver, uri, runnable);
                    try {
                        map.put(uri, c6116q2);
                    } catch (SecurityException unused) {
                    }
                    c6116q = c6116q2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c6116q;
    }

    static synchronized void c() {
        try {
            for (C6116q c6116q : f36129h.values()) {
                c6116q.f36131a.unregisterContentObserver(c6116q.f36134d);
            }
            f36129h.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ Map b() {
        Cursor cursorQuery = this.f36131a.query(this.f36132b, f36130i, null, null, null);
        if (cursorQuery == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            Map aVar = count <= 256 ? new p190t.a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return aVar;
        } finally {
            cursorQuery.close();
        }
    }

    public final void d() {
        synchronized (this.f36135e) {
            this.f36136f = null;
            M.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f36137g.iterator();
                if (it.hasNext()) {
                    p070h.w.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // com.google.android.gms.internal.auth.InterfaceC6127u
    public final /* bridge */ /* synthetic */ Object j(String str) {
        Map map;
        ?? r10;
        Map map2 = this.f36136f;
        Map map3 = map2;
        if (map2 == null) {
            synchronized (this.f36135e) {
                Map map4 = this.f36136f;
                if (map4 != null) {
                    r10 = map4;
                } else {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) AbstractC6121s.a(new InterfaceC6124t() { // from class: com.google.android.gms.internal.auth.o
                                @Override // com.google.android.gms.internal.auth.InterfaceC6124t
                                public final Object zza() {
                                    return this.f36127a.b();
                                }
                            });
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        }
                        this.f36136f = map;
                        threadPolicyAllowThreadDiskReads = map;
                        r10 = threadPolicyAllowThreadDiskReads;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
            map3 = r10;
        }
        if (map3 == 0) {
            map3 = Collections.EMPTY_MAP;
        }
        return (String) map3.get(str);
    }
}

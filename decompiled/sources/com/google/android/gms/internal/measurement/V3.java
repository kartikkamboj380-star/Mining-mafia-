package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class V3 implements Y3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ConcurrentMap f36508i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f36509j = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f36510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f36511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f36512c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Map f36516g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ContentObserver f36513d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f36514e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f36515f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f36517h = new ArrayList();

    private V3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        X5.j.h(contentResolver);
        X5.j.h(uri);
        this.f36510a = contentResolver;
        this.f36511b = uri;
        this.f36512c = runnable;
    }

    public static V3 b(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        V3 v10 = (V3) f36508i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.U3
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return V3.f(contentResolver, uri, runnable, (Uri) obj);
            }
        });
        try {
            if (!v10.f36514e) {
                return v10;
            }
            synchronized (v10) {
                try {
                    if (v10.f36514e) {
                        S3 s10 = new S3(v10, null);
                        v10.f36510a.registerContentObserver(v10.f36511b, false, s10);
                        v10.f36513d = s10;
                        v10.f36514e = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return v10;
        } catch (SecurityException unused) {
            return null;
        }
    }

    static void e() {
        Iterator it = f36508i.values().iterator();
        while (it.hasNext()) {
            V3 v10 = (V3) it.next();
            synchronized (v10) {
                try {
                    if (v10.f36514e) {
                        v10.f36514e = false;
                    } else {
                        ContentObserver contentObserver = v10.f36513d;
                        if (contentObserver != null) {
                            v10.f36510a.unregisterContentObserver(contentObserver);
                            v10.f36513d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    static /* synthetic */ V3 f(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new V3(contentResolver, uri, runnable);
    }

    public final Map c() {
        Map map;
        Map map2 = this.f36516g;
        if (map2 == null) {
            synchronized (this.f36515f) {
                map2 = this.f36516g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) Y3.a(new X3() { // from class: com.google.android.gms.internal.measurement.T3
                                @Override // com.google.android.gms.internal.measurement.X3
                                public final /* synthetic */ Object zza() {
                                    return this.f36493a.g();
                                }
                            });
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e10) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e10);
                        map = Collections.EMPTY_MAP;
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    this.f36516g = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void d() {
        synchronized (this.f36515f) {
            this.f36516g = null;
            this.f36512c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f36517h.iterator();
                if (it.hasNext()) {
                    p070h.w.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ Map g() {
        ContentResolver contentResolver = this.f36510a;
        Uri uri = this.f36511b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, f36509j, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map aVar = count <= 256 ? new p190t.a(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return aVar;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } catch (Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (RemoteException e10) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final /* bridge */ /* synthetic */ Object k(String str) {
        return (String) c().get(str);
    }
}

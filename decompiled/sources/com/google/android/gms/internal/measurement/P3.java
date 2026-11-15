package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class P3 implements L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f36446a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f36447b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f36448c = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f36449d = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f36450e = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f36451f = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f36452g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36453h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String[] f36454i = new String[0];

    @Override // com.google.android.gms.internal.measurement.L3
    public final String a(ContentResolver contentResolver, String str, String str2) {
        String string;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str3 = null;
                if (this.f36447b == null) {
                    this.f36446a.set(false);
                    this.f36447b = new HashMap(16, 1.0f);
                    this.f36452g = new Object();
                    contentResolver.registerContentObserver(K3.f36319a, true, new N3(this, null));
                } else if (this.f36446a.getAndSet(false)) {
                    this.f36447b.clear();
                    this.f36448c.clear();
                    this.f36449d.clear();
                    this.f36450e.clear();
                    this.f36451f.clear();
                    this.f36452g = new Object();
                    this.f36453h = false;
                }
                Object obj = this.f36452g;
                if (this.f36447b.containsKey(str)) {
                    String str4 = (String) this.f36447b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    Uri uri = K3.f36319a;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new O3("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new O3("ContentProvider query returned null cursor");
                                }
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(1);
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                } else {
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                    string = null;
                                }
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.f36452g) {
                                            this.f36447b.put(str, string);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } catch (Throwable th2) {
                                if (cursorQuery == null) {
                                    throw th2;
                                }
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (RemoteException e10) {
                            throw new O3("ContentProvider query failed", e10);
                        }
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                } catch (O3 unused) {
                    return null;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    final /* synthetic */ AtomicBoolean b() {
        return this.f36446a;
    }
}

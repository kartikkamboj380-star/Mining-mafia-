package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1452Ad extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile String f17381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f17382i = new Object();

    public C1452Ad(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11) {
        super(c2645Xc, "yZXKjkpxohkfNrA4/dntjy5UGv8pEqMsOsdSv+5n+sZgEYNlImB4QjlGv7rNs0BZ", "qPvuYJ0m6OwVM7zFkNMQ820WzknyvHgBl013Si7b8nM=", c1966Ka, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        this.f21301d.f0("E");
        if (f17381h == null) {
            synchronized (f17382i) {
                try {
                    if (f17381h == null) {
                        f17381h = (String) this.f21302e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C1966Ka c1966Ka = this.f21301d;
        synchronized (c1966Ka) {
            c1966Ka.f0(f17381h);
        }
    }
}

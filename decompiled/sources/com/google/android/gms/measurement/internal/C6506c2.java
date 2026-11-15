package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6506c2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f37882g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N f37884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f37885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f37886d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f37887e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f37888f = null;

    /* synthetic */ C6506c2(String str, Object obj, Object obj2, N n10, byte[] bArr) {
        this.f37883a = str;
        this.f37885c = obj;
        this.f37884b = n10;
    }

    public final String a() {
        return this.f37883a;
    }

    public final Object b(Object obj) {
        synchronized (this.f37886d) {
        }
        if (obj != null) {
            return obj;
        }
        if (W1.f37768a == null) {
            return this.f37885c;
        }
        synchronized (f37882g) {
            try {
                if (C6527f.a()) {
                    return this.f37888f == null ? this.f37885c : this.f37888f;
                }
                try {
                    for (C6506c2 c6506c2 : AbstractC6514d2.f37956a) {
                        if (C6527f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            N n10 = c6506c2.f37884b;
                            if (n10 != null) {
                                objZza = n10.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f37882g) {
                            c6506c2.f37888f = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                N n11 = this.f37884b;
                if (n11 != null) {
                    try {
                        return n11.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f37885c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

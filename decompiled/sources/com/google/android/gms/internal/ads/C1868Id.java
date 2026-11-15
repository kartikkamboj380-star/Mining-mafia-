package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1868Id extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Long f19589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f19590i = new Object();

    public C1868Id(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11) {
        super(c2645Xc, "R0KTYl+9Bi7RshEQmYhK/YeVyfjIkHliDPJVeC+XBbAz0q1EMlAcoZ8JeP0fdmTX", "AARE3CI7+7Fq5atzy8wcVAJTjdNJGGNM3rGztRoG23E=", c1966Ka, i10, 33);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        if (f19589h == null) {
            synchronized (f19590i) {
                try {
                    if (f19589h == null) {
                        f19589h = (Long) this.f21302e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C1966Ka c1966Ka = this.f21301d;
        synchronized (c1966Ka) {
            c1966Ka.H0(f19589h.longValue());
        }
    }
}

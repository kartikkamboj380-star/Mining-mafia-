package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4763pd extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Long f32436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f32437i = new Object();

    public C4763pd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11) {
        super(c2645Xc, "FynI9c5fEiMzQz2B7twhubBCGA6OmnD4m4mZd8FrJbuEtgSrrhq+E+F7XsfWYfqR", "1Y9Pw3JU+olt+lWU2l7rblcsXGsm1mQtokTJIYT27m0=", c1966Ka, i10, 44);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        if (f32436h == null) {
            synchronized (f32437i) {
                try {
                    if (f32436h == null) {
                        f32436h = (Long) this.f21302e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C1966Ka c1966Ka = this.f21301d;
        synchronized (c1966Ka) {
            c1966Ka.B(f32436h.longValue());
        }
    }
}

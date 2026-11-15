package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1920Jd extends AbstractCallableC2127Nd {
    public C1920Jd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11) {
        super(c2645Xc, "WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", c1966Ka, i10, 48);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        C1966Ka c1966Ka = this.f21301d;
        c1966Ka.k0(3);
        boolean zBooleanValue = ((Boolean) this.f21302e.invoke(null, this.f21298a.b())).booleanValue();
        synchronized (c1966Ka) {
            try {
                if (zBooleanValue) {
                    c1966Ka.k0(2);
                } else {
                    c1966Ka.k0(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

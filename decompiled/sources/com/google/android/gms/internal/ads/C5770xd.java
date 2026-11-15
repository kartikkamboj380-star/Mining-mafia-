package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5770xd extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2229Pc f34960h;

    public C5770xd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11, C2229Pc c2229Pc) {
        super(c2645Xc, "mt+WJZ1rsk0A64GmF9v+ldp/SXHcK6tYIctDM1+NeYG+QzoGvdHV21P9oFWIcCVk", "JGpzBcqG4jzyQyzoEbT5NvLNZXRWAW3o2QUKET83n6Q=", c1966Ka, i10, 94);
        this.f34960h = c2229Pc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        int iIntValue = ((Integer) this.f21302e.invoke(null, this.f34960h.b())).intValue();
        C1966Ka c1966Ka = this.f21301d;
        synchronized (c1966Ka) {
            c1966Ka.p0(AbstractC2693Ya.a(iIntValue));
        }
    }
}

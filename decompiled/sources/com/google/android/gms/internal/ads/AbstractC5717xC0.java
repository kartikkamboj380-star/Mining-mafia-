package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5717xC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4096kK0 f34761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f34762b;

    /* synthetic */ AbstractC5717xC0(C4096kK0 c4096kK0, Class cls, byte[] bArr) {
        this.f34761a = c4096kK0;
        this.f34762b = cls;
    }

    public static AbstractC5717xC0 d(InterfaceC5591wC0 interfaceC5591wC0, C4096kK0 c4096kK0, Class cls) {
        return new C5465vC0(c4096kK0, cls, interfaceC5591wC0);
    }

    public abstract AbstractC4050jy0 a(AD0 ad0, C1703Ey0 c1703Ey0);

    public final C4096kK0 b() {
        return this.f34761a;
    }

    public final Class c() {
        return this.f34762b;
    }
}

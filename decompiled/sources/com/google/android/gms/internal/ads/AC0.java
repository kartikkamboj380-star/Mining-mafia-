package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f17270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f17271b;

    /* synthetic */ AC0(Class cls, Class cls2, byte[] bArr) {
        this.f17270a = cls;
        this.f17271b = cls2;
    }

    public static AC0 d(InterfaceC5969zC0 interfaceC5969zC0, Class cls, Class cls2) {
        return new C5843yC0(cls, cls2, interfaceC5969zC0);
    }

    public abstract AD0 a(AbstractC4050jy0 abstractC4050jy0, C1703Ey0 c1703Ey0);

    public final Class b() {
        return this.f17270a;
    }

    public final Class c() {
        return this.f17271b;
    }
}

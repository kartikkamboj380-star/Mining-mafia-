package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4460nD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f31760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f31761b;

    /* synthetic */ AbstractC4460nD0(Class cls, Class cls2, byte[] bArr) {
        this.f31760a = cls;
        this.f31761b = cls2;
    }

    public static AbstractC4460nD0 d(InterfaceC4334mD0 interfaceC4334mD0, Class cls, Class cls2) {
        return new C4208lD0(cls, cls2, interfaceC4334mD0);
    }

    public abstract Object a(AbstractC4050jy0 abstractC4050jy0);

    public final Class b() {
        return this.f31760a;
    }

    public final Class c() {
        return this.f31761b;
    }
}

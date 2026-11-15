package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3580gD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f28601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f28602b;

    /* synthetic */ AbstractC3580gD0(Class cls, Class cls2, byte[] bArr) {
        this.f28601a = cls;
        this.f28602b = cls2;
    }

    public static AbstractC3580gD0 d(InterfaceC3454fD0 interfaceC3454fD0, Class cls, Class cls2) {
        return new C3328eD0(cls, cls2, interfaceC3454fD0);
    }

    public abstract AD0 a(AbstractC1495Ay0 abstractC1495Ay0);

    public final Class b() {
        return this.f28601a;
    }

    public final Class c() {
        return this.f28602b;
    }
}

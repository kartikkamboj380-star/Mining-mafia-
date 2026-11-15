package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3203dD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4096kK0 f27380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f27381b;

    /* synthetic */ AbstractC3203dD0(C4096kK0 c4096kK0, Class cls, byte[] bArr) {
        this.f27380a = c4096kK0;
        this.f27381b = cls;
    }

    public static AbstractC3203dD0 d(InterfaceC3077cD0 interfaceC3077cD0, C4096kK0 c4096kK0, Class cls) {
        return new C2952bD0(c4096kK0, cls, interfaceC3077cD0);
    }

    public abstract AbstractC1495Ay0 a(AD0 ad0);

    public final C4096kK0 b() {
        return this.f27380a;
    }

    public final Class c() {
        return this.f27381b;
    }
}

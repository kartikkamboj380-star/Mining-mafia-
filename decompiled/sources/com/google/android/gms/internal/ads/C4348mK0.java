package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4348mK0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4096kK0 f31493a;

    private C4348mK0(C4096kK0 c4096kK0) {
        this.f31493a = c4096kK0;
    }

    public static C4348mK0 a(byte[] bArr, C1703Ey0 c1703Ey0) {
        return new C4348mK0(C4096kK0.a(bArr));
    }

    public static C4348mK0 b(int i10) {
        return new C4348mK0(C4096kK0.a(AbstractC5845yD0.a(i10)));
    }

    public final byte[] c(C1703Ey0 c1703Ey0) {
        return this.f31493a.c();
    }

    public final int d() {
        return this.f31493a.d();
    }
}

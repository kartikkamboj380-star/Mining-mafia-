package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4856qM0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4730pM0 f32625a;

    private C4856qM0(EnumC4480nN0 enumC4480nN0, Object obj, EnumC4480nN0 enumC4480nN1, Object obj2) {
        this.f32625a = new C4730pM0(enumC4480nN0, "", enumC4480nN1, obj2);
    }

    public static C4856qM0 a(EnumC4480nN0 enumC4480nN0, Object obj, EnumC4480nN0 enumC4480nN1, Object obj2) {
        return new C4856qM0(enumC4480nN0, "", enumC4480nN1, obj2);
    }

    static void b(CL0 cl0, C4730pM0 c4730pM0, Object obj, Object obj2) {
        ML0.c(cl0, c4730pM0.f32368a, 1, obj);
        ML0.c(cl0, c4730pM0.f32370c, 2, obj2);
    }

    static int c(C4730pM0 c4730pM0, Object obj, Object obj2) {
        return ML0.d(c4730pM0.f32368a, 1, obj) + ML0.d(c4730pM0.f32370c, 2, obj2);
    }

    public final int d(int i10, Object obj, Object obj2) {
        C4730pM0 c4730pM0 = this.f32625a;
        int iB = CL0.b(i10 << 3);
        int iC = c(c4730pM0, obj, obj2);
        return iB + CL0.b(iC) + iC;
    }

    final C4730pM0 e() {
        return this.f32625a;
    }
}

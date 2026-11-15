package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6374y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6366x5 f36954a;

    private C6374y5(EnumC6269m6 enumC6269m6, Object obj, EnumC6269m6 enumC6269m7, Object obj2) {
        this.f36954a = new C6366x5(enumC6269m6, "", enumC6269m7, "");
    }

    public static C6374y5 a(EnumC6269m6 enumC6269m6, Object obj, EnumC6269m6 enumC6269m7, Object obj2) {
        return new C6374y5(enumC6269m6, "", enumC6269m7, "");
    }

    static void b(P4 p10, C6366x5 c6366x5, Object obj, Object obj2) {
        Y4.c(p10, c6366x5.f36945a, 1, obj);
        Y4.c(p10, c6366x5.f36947c, 2, obj2);
    }

    static int c(C6366x5 c6366x5, Object obj, Object obj2) {
        return Y4.d(c6366x5.f36945a, 1, obj) + Y4.d(c6366x5.f36947c, 2, obj2);
    }

    public final int d(int i10, Object obj, Object obj2) {
        C6366x5 c6366x5 = this.f36954a;
        int iE = P4.E(i10 << 3);
        int iC = c(c6366x5, obj, obj2);
        return iE + P4.E(iC) + iC;
    }

    final C6366x5 e() {
        return this.f36954a;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class J2 implements F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19734c;

    private J2(int i10, int i11, int i12, int i13) {
        this.f19732a = i10;
        this.f19733b = i11;
        this.f19734c = i12;
    }

    public static J2 a(P10 p10) {
        int iC = p10.c();
        p10.J(8);
        int iC2 = p10.c();
        int iC3 = p10.c();
        p10.J(4);
        int iC4 = p10.c();
        p10.J(12);
        return new J2(iC, iC2, iC3, iC4);
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final int zza() {
        return 1751742049;
    }
}

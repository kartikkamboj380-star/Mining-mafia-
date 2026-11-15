package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class K2 implements F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20046f;

    private K2(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f20041a = i10;
        this.f20042b = i12;
        this.f20043c = i13;
        this.f20044d = i14;
        this.f20045e = i15;
        this.f20046f = i16;
    }

    public static K2 a(P10 p10) {
        int iC = p10.c();
        p10.J(12);
        int iC2 = p10.c();
        int iC3 = p10.c();
        int iC4 = p10.c();
        p10.J(4);
        int iC5 = p10.c();
        int iC6 = p10.c();
        p10.J(4);
        return new K2(iC, iC2, iC3, iC4, iC5, iC6, p10.c());
    }

    public final int b() {
        int i10 = this.f20041a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        YU.c("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i10))));
        return -1;
    }

    public final long c() {
        return AbstractC4634ob0.P(this.f20044d, ((long) this.f20042b) * 1000000, this.f20043c, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final int zza() {
        return 1752331379;
    }
}

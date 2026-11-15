package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4699p7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32308e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L90 f32304a = new L90(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f32309f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f32310g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f32311h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f32305b = new P10();

    C4699p7(int i10) {
    }

    private final int e(J1 j10) {
        byte[] bArr = AbstractC4634ob0.f32118b;
        int length = bArr.length;
        this.f32305b.A(bArr, 0);
        this.f32306c = true;
        j10.zzl();
        return 0;
    }

    public final boolean a() {
        return this.f32306c;
    }

    public final int b(J1 j10, C3933j2 c3933j2, int i10) {
        if (i10 <= 0) {
            e(j10);
            return 0;
        }
        long j11 = -9223372036854775807L;
        if (this.f32308e) {
            if (this.f32310g == -9223372036854775807L) {
                e(j10);
                return 0;
            }
            if (this.f32307d) {
                long j12 = this.f32309f;
                if (j12 == -9223372036854775807L) {
                    e(j10);
                    return 0;
                }
                L90 l90 = this.f32304a;
                this.f32311h = l90.f(this.f32310g) - l90.e(j12);
                e(j10);
                return 0;
            }
            int iMin = (int) Math.min(112800L, j10.zzo());
            if (j10.zzn() != 0) {
                c3933j2.f30283a = 0L;
                return 1;
            }
            P10 p10 = this.f32305b;
            p10.z(iMin);
            j10.zzl();
            j10.J(p10.H(), 0, iMin);
            int iD = p10.D();
            for (int iF = p10.F(); iF < iD; iF++) {
                if (p10.H()[iF] == 71) {
                    long jB = AbstractC5958z7.b(p10, iF, i10);
                    if (jB != -9223372036854775807L) {
                        j11 = jB;
                        break;
                    }
                }
            }
            this.f32309f = j11;
            this.f32307d = true;
            return 0;
        }
        long jZzo = j10.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j13 = jZzo - ((long) iMin2);
        if (j10.zzn() != j13) {
            c3933j2.f30283a = j13;
            return 1;
        }
        P10 p11 = this.f32305b;
        p11.z(iMin2);
        j10.zzl();
        j10.J(p11.H(), 0, iMin2);
        int iF2 = p11.F();
        int iD2 = p11.D();
        for (int i11 = iD2 - 188; i11 >= iF2; i11--) {
            byte[] bArrH = p11.H();
            int i12 = 0;
            for (int i13 = -4; i13 <= 4; i13++) {
                int i14 = (i13 * 188) + i11;
                if (i14 >= iF2 && i14 < iD2 && bArrH[i14] == 71) {
                    i12++;
                    if (i12 == 5) {
                        long jB2 = AbstractC5958z7.b(p11, i11, i10);
                        if (jB2 == -9223372036854775807L) {
                            break;
                        }
                        j11 = jB2;
                        break;
                    }
                } else {
                    i12 = 0;
                }
            }
        }
        this.f32310g = j11;
        this.f32308e = true;
        return 0;
    }

    public final long c() {
        return this.f32311h;
    }

    public final L90 d() {
        return this.f32304a;
    }
}

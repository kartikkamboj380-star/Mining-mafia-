package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3441f7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28189e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L90 f28185a = new L90(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f28190f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f28191g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f28192h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f28186b = new P10();

    C3441f7() {
    }

    public static long e(P10 p10) {
        int iF = p10.F();
        if (p10.C() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        p10.L(bArr, 0, 9);
        p10.G(iF);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j10 = b10;
        long j11 = b11;
        long j12 = (248 & j11) >> 3;
        long j13 = (j11 & 3) << 13;
        return j13 | ((bArr[1] & 255) << 20) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (j12 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
    }

    private final int f(J1 j10) {
        byte[] bArr = AbstractC4634ob0.f32118b;
        int length = bArr.length;
        this.f28186b.A(bArr, 0);
        this.f28187c = true;
        j10.zzl();
        return 0;
    }

    private static final int g(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final boolean a() {
        return this.f28187c;
    }

    public final L90 b() {
        return this.f28185a;
    }

    public final int c(J1 j10, C3933j2 c3933j2) {
        long j11 = -9223372036854775807L;
        if (!this.f28189e) {
            long jZzo = j10.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j12 = jZzo - ((long) iMin);
            if (j10.zzn() != j12) {
                c3933j2.f30283a = j12;
                return 1;
            }
            P10 p10 = this.f28186b;
            p10.z(iMin);
            j10.zzl();
            j10.J(p10.H(), 0, iMin);
            int iF = p10.F();
            for (int iD = p10.D() - 4; iD >= iF; iD--) {
                if (g(p10.H(), iD) == 442) {
                    p10.G(iD + 4);
                    long jE = e(p10);
                    if (jE != -9223372036854775807L) {
                        j11 = jE;
                        break;
                    }
                }
            }
            this.f28191g = j11;
            this.f28189e = true;
            return 0;
        }
        if (this.f28191g == -9223372036854775807L) {
            f(j10);
            return 0;
        }
        if (this.f28188d) {
            long j13 = this.f28190f;
            if (j13 == -9223372036854775807L) {
                f(j10);
                return 0;
            }
            L90 l90 = this.f28185a;
            this.f28192h = l90.f(this.f28191g) - l90.e(j13);
            f(j10);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, j10.zzo());
        if (j10.zzn() != 0) {
            c3933j2.f30283a = 0L;
            return 1;
        }
        P10 p11 = this.f28186b;
        p11.z(iMin2);
        j10.zzl();
        j10.J(p11.H(), 0, iMin2);
        int iD2 = p11.D();
        for (int iF2 = p11.F(); iF2 < iD2 - 3; iF2++) {
            if (g(p11.H(), iF2) == 442) {
                p11.G(iF2 + 4);
                long jE2 = e(p11);
                if (jE2 != -9223372036854775807L) {
                    j11 = jE2;
                    break;
                }
            }
        }
        this.f28190f = j11;
        this.f28188d = true;
        return 0;
    }

    public final long d() {
        return this.f28192h;
    }
}

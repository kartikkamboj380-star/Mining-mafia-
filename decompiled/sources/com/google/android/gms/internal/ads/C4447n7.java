package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4447n7 implements InterfaceC5190t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L90 f31691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f31692b = new P10();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31693c;

    public C4447n7(int i10, L90 l90, int i11) {
        this.f31693c = i10;
        this.f31691a = l90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t1
    public final C5064s1 a(J1 j10, long j11) {
        int iA;
        int iA2;
        long jZzn = j10.zzn();
        int iMin = (int) Math.min(112800L, j10.zzo() - jZzn);
        P10 p10 = this.f31692b;
        p10.z(iMin);
        j10.J(p10.H(), 0, iMin);
        int iD = p10.D();
        long j12 = -1;
        long j13 = -9223372036854775807L;
        long j14 = -1;
        while (p10.C() >= 188 && (iA2 = (iA = AbstractC5958z7.a(p10.H(), p10.F(), iD)) + 188) <= iD) {
            long jB = AbstractC5958z7.b(p10, iA, this.f31693c);
            if (jB != -9223372036854775807L) {
                long jE = this.f31691a.e(jB);
                if (jE > j11) {
                    return j13 == -9223372036854775807L ? C5064s1.a(jE, jZzn) : C5064s1.c(jZzn + j14);
                }
                j14 = iA;
                if (100000 + jE > j11) {
                    return C5064s1.c(jZzn + j14);
                }
                j13 = jE;
            }
            p10.G(iA2);
            j12 = iA2;
        }
        return j13 != -9223372036854775807L ? C5064s1.b(j13, jZzn + j12) : C5064s1.f33065d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t1
    public final void zzb() {
        byte[] bArr = AbstractC4634ob0.f32118b;
        int length = bArr.length;
        this.f31692b.A(bArr, 0);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class T2 implements InterfaceC5190t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V1 f23369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P1 f23371c = new P1();

    /* synthetic */ T2(V1 v10, int i10, byte[] bArr) {
        this.f23369a = v10;
        this.f23370b = i10;
    }

    private final long b(J1 j10) {
        while (j10.e() < j10.zzo() - 6) {
            V1 v10 = this.f23369a;
            int i10 = this.f23370b;
            P1 p10 = this.f23371c;
            long jE = j10.e();
            P10 p11 = new P10(17);
            j10.J(p11.H(), 0, 2);
            if (p11.N() != i10) {
                j10.zzl();
                j10.E((int) (jE - j10.zzn()));
            } else {
                p11.E(M1.b(j10, p11.H(), 2, 15) + 2);
                j10.zzl();
                j10.E((int) (jE - j10.zzn()));
                if (Q1.a(p11, v10, i10, p10)) {
                    break;
                }
            }
            j10.E(1);
        }
        if (j10.e() < j10.zzo() - 6) {
            return this.f23371c.f22002a;
        }
        j10.E((int) (j10.zzo() - j10.e()));
        return this.f23369a.f24166j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t1
    public final C5064s1 a(J1 j10, long j11) {
        long jZzn = j10.zzn();
        long jB = b(j10);
        long jE = j10.e();
        j10.E(Math.max(6, this.f23369a.f24159c));
        long jB2 = b(j10);
        long jE2 = j10.e();
        if (jB > j11 || jB2 <= j11) {
            return jB2 <= j11 ? C5064s1.b(jB2, jE2) : C5064s1.a(jB, jZzn);
        }
        return C5064s1.c(jE);
    }
}

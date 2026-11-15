package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class E7 implements D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L1 f18410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5570w2 f18411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H7 f18412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JY0 f18413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f18415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f18417h;

    public E7(L1 l10, InterfaceC5570w2 interfaceC5570w2, H7 h10, String str, int i10) throws C2817a9 {
        this.f18410a = l10;
        this.f18411b = interfaceC5570w2;
        this.f18412c = h10;
        int i11 = h10.f19220b * h10.f19223e;
        int i12 = h10.f19222d;
        int i13 = i11 / 8;
        if (i12 != i13) {
            StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 28 + String.valueOf(i12).length());
            sb.append("Expected block size: ");
            sb.append(i13);
            sb.append("; got: ");
            sb.append(i12);
            throw C2817a9.b(sb.toString(), null);
        }
        int i14 = h10.f19221c * i13;
        int i15 = i14 * 8;
        int iMax = Math.max(i13, i14 / 10);
        this.f18414e = iMax;
        C5507vX0 c5507vX0 = new C5507vX0();
        c5507vX0.k0("audio/wav");
        c5507vX0.l0(str);
        c5507vX0.g0(i15);
        c5507vX0.h0(i15);
        c5507vX0.m0(iMax);
        c5507vX0.e(h10.f19220b);
        c5507vX0.f(h10.f19221c);
        c5507vX0.g(i10);
        this.f18413d = c5507vX0.m();
    }

    @Override // com.google.android.gms.internal.ads.D7
    public final void a(long j10) {
        this.f18415f = j10;
        this.f18416g = 0;
        this.f18417h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.D7
    public final void b(int i10, long j10) {
        K7 k10 = new K7(this.f18412c, 1, i10, j10);
        this.f18410a.o(k10);
        InterfaceC5570w2 interfaceC5570w2 = this.f18411b;
        interfaceC5570w2.f(this.f18413d);
        interfaceC5570w2.g(k10.zza());
    }

    @Override // com.google.android.gms.internal.ads.D7
    public final boolean c(J1 j10, long j11) {
        int i10;
        int i11;
        long j12 = j11;
        while (j12 > 0 && (i10 = this.f18416g) < (i11 = this.f18414e)) {
            int iD = this.f18411b.d(j10, (int) Math.min(i11 - i10, j12), true);
            if (iD == -1) {
                j12 = 0;
            } else {
                this.f18416g += iD;
                j12 -= (long) iD;
            }
        }
        H7 h10 = this.f18412c;
        int i12 = this.f18416g;
        int i13 = h10.f19222d;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long jP = this.f18415f + AbstractC4634ob0.P(this.f18417h, 1000000L, h10.f19221c, RoundingMode.DOWN);
            int i15 = i14 * i13;
            int i16 = this.f18416g - i15;
            this.f18411b.c(jP, 1, i15, i16, null);
            this.f18417h += (long) i14;
            this.f18416g = i16;
        }
        return j12 <= 0;
    }
}

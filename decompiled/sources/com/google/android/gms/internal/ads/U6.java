package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class U6 implements I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f23915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3431f2 f23916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f23919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC5570w2 f23920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f23921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23922h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f23926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f23928n;

    public U6(String str, int i10, String str2) {
        P10 p10 = new P10(4);
        this.f23915a = p10;
        p10.H()[0] = -1;
        this.f23916b = new C3431f2();
        this.f23928n = -9223372036854775807L;
        this.f23917c = str;
        this.f23918d = i10;
        this.f23919e = str2;
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void l0(boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void m0(L1 l10, C5706x7 c5706x7) {
        c5706x7.a();
        this.f23921g = c5706x7.c();
        this.f23920f = l10.b(c5706x7.b(), 1);
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void n0(long j10, int i10) {
        this.f23928n = j10;
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void o0(P10 p10) {
        this.f23920f.getClass();
        while (p10.C() > 0) {
            int i10 = this.f23922h;
            if (i10 == 0) {
                byte[] bArrH = p10.H();
                int iF = p10.F();
                int iD = p10.D();
                while (true) {
                    if (iF >= iD) {
                        p10.G(iD);
                        break;
                    }
                    int i11 = iF + 1;
                    byte b10 = bArrH[iF];
                    boolean z9 = (b10 & 255) == 255;
                    boolean z10 = this.f23925k && (b10 & 224) == 224;
                    this.f23925k = z9;
                    if (z10) {
                        p10.G(i11);
                        this.f23925k = false;
                        this.f23915a.H()[1] = bArrH[iF];
                        this.f23923i = 2;
                        this.f23922h = 1;
                        break;
                    }
                    iF = i11;
                }
            } else if (i10 != 1) {
                int iMin = Math.min(p10.C(), this.f23927m - this.f23923i);
                this.f23920f.b(p10, iMin);
                int i12 = this.f23923i + iMin;
                this.f23923i = i12;
                if (i12 >= this.f23927m) {
                    AbstractC2418Ss0.i(this.f23928n != -9223372036854775807L);
                    this.f23920f.c(this.f23928n, 1, this.f23927m, 0, null);
                    this.f23928n += this.f23926l;
                    this.f23923i = 0;
                    this.f23922h = 0;
                }
            } else {
                int iMin2 = Math.min(p10.C(), 4 - this.f23923i);
                P10 p11 = this.f23915a;
                p10.L(p11.H(), this.f23923i, iMin2);
                int i13 = this.f23923i + iMin2;
                this.f23923i = i13;
                if (i13 >= 4) {
                    p11.G(0);
                    C3431f2 c3431f2 = this.f23916b;
                    if (c3431f2.a(p11.b())) {
                        this.f23927m = c3431f2.f28132c;
                        if (!this.f23924j) {
                            this.f23926l = (((long) c3431f2.f28136g) * 1000000) / ((long) c3431f2.f28133d);
                            C5507vX0 c5507vX0 = new C5507vX0();
                            c5507vX0.A(this.f23921g);
                            c5507vX0.k0(this.f23919e);
                            c5507vX0.l0(c3431f2.f28131b);
                            c5507vX0.m0(CodedOutputStream.DEFAULT_BUFFER_SIZE);
                            c5507vX0.e(c3431f2.f28134e);
                            c5507vX0.f(c3431f2.f28133d);
                            c5507vX0.d0(this.f23917c);
                            c5507vX0.f0(this.f23918d);
                            this.f23920f.f(c5507vX0.m());
                            this.f23924j = true;
                        }
                        p11.G(0);
                        this.f23920f.b(p11, 4);
                        this.f23922h = 2;
                    } else {
                        this.f23923i = 0;
                        this.f23922h = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void zza() {
        this.f23922h = 0;
        this.f23923i = 0;
        this.f23925k = false;
        this.f23928n = -9223372036854775807L;
    }
}

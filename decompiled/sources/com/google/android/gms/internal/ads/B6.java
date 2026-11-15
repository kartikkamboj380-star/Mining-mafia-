package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class B6 implements I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4436n10 f17482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f17483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f17486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f17487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC5570w2 f17488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f17489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f17492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JY0 f17493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f17495n;

    public B6(String str, int i10, String str2) {
        C4436n10 c4436n10 = new C4436n10(new byte[16], 16);
        this.f17482a = c4436n10;
        this.f17483b = new P10(c4436n10.f31642a);
        this.f17489h = 0;
        this.f17490i = 0;
        this.f17491j = false;
        this.f17495n = -9223372036854775807L;
        this.f17484c = str;
        this.f17485d = i10;
        this.f17486e = str2;
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void l0(boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void m0(L1 l10, C5706x7 c5706x7) {
        c5706x7.a();
        this.f17487f = c5706x7.c();
        this.f17488g = l10.b(c5706x7.b(), 1);
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void n0(long j10, int i10) {
        this.f17495n = j10;
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void o0(P10 p10) {
        this.f17488g.getClass();
        while (p10.C() > 0) {
            int i10 = this.f17489h;
            if (i10 == 0) {
                while (true) {
                    if (p10.C() > 0) {
                        if (this.f17491j) {
                            int iR = p10.R();
                            this.f17491j = iR == 172;
                            if (iR != 64) {
                                if (iR == 65) {
                                    iR = 65;
                                }
                            }
                            this.f17489h = 1;
                            P10 p11 = this.f17483b;
                            p11.H()[0] = -84;
                            p11.H()[1] = iR == 65 ? (byte) 65 : (byte) 64;
                            this.f17490i = 2;
                        } else {
                            this.f17491j = p10.R() == 172;
                        }
                    }
                }
            } else if (i10 != 1) {
                int iMin = Math.min(p10.C(), this.f17494m - this.f17490i);
                this.f17488g.b(p10, iMin);
                int i11 = this.f17490i + iMin;
                this.f17490i = i11;
                if (i11 == this.f17494m) {
                    AbstractC2418Ss0.i(this.f17495n != -9223372036854775807L);
                    this.f17488g.c(this.f17495n, 1, this.f17494m, 0, null);
                    this.f17495n += this.f17492k;
                    this.f17489h = 0;
                }
            } else {
                P10 p12 = this.f17483b;
                byte[] bArrH = p12.H();
                int iMin2 = Math.min(p10.C(), 16 - this.f17490i);
                p10.L(bArrH, this.f17490i, iMin2);
                int i12 = this.f17490i + iMin2;
                this.f17490i = i12;
                if (i12 == 16) {
                    C4436n10 c4436n10 = this.f17482a;
                    c4436n10.f(0);
                    C4057k1 c4057k1B = AbstractC4183l1.b(c4436n10);
                    JY0 jy0 = this.f17493l;
                    if (jy0 == null || jy0.f19906G != 2 || c4057k1B.f30668a != jy0.f19907H || !"audio/ac4".equals(jy0.f19929o)) {
                        C5507vX0 c5507vX0 = new C5507vX0();
                        c5507vX0.A(this.f17487f);
                        c5507vX0.k0(this.f17486e);
                        c5507vX0.l0("audio/ac4");
                        c5507vX0.e(2);
                        c5507vX0.f(c4057k1B.f30668a);
                        c5507vX0.d0(this.f17484c);
                        c5507vX0.f0(this.f17485d);
                        JY0 jy0M = c5507vX0.m();
                        this.f17493l = jy0M;
                        this.f17488g.f(jy0M);
                    }
                    this.f17494m = c4057k1B.f30669b;
                    this.f17492k = (((long) c4057k1B.f30670c) * 1000000) / ((long) this.f17493l.f19907H);
                    p12.G(0);
                    this.f17488g.b(p12, 16);
                    this.f17489h = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void zza() {
        this.f17489h = 0;
        this.f17490i = 0;
        this.f17491j = false;
        this.f17495n = -9223372036854775807L;
    }
}

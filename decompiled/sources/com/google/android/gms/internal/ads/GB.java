package com.google.android.gms.internal.ads;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class GB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f18982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f18983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f18984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f18985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f18986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f18987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EA f18988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f18989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f18990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f18991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f18993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f18994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private double f18996q;

    public GB(int i10, int i11, float f10, float f11, int i12, boolean z9) {
        this.f18980a = i10;
        this.f18981b = i11;
        this.f18982c = f10;
        this.f18983d = f11;
        this.f18984e = i10 / i12;
        this.f18985f = i10 / CommonGatewayClient.CODE_400;
        int i13 = i10 / 65;
        this.f18986g = i13;
        this.f18987h = i13 + i13;
        this.f18988i = z9 ? new C3196dA(this) : new C3449fB(this);
    }

    private final void o(int i10, int i11) {
        EA ea = this.f18988i;
        ea.E(i11);
        Object objL = ea.l();
        Object objA = ea.a();
        int i12 = this.f18990k;
        int i13 = this.f18981b;
        System.arraycopy(objL, i10 * i13, objA, i12 * i13, i11 * i13);
        this.f18990k += i11;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e A[EDGE_INSN: B:101:0x017e->B:59:0x017e BREAK  A[LOOP:3: B:13:0x0035->B:92:0x024c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:92:0x024c A[LOOP:3: B:13:0x0035->B:92:0x024c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void p() {
        EA ea;
        int i10;
        int i11;
        int iC;
        int iC2;
        int i12;
        int i13;
        int i14;
        double d10;
        int i15;
        int i16;
        float f10;
        int i17;
        int i18;
        long j10;
        long j11;
        float f11 = this.f18982c;
        float f12 = this.f18983d;
        double d11 = f11 / f12;
        int i19 = this.f18990k;
        int i20 = 0;
        int i21 = 1;
        if (d11 > 1.0000100135803223d || d11 < 0.9999899864196777d) {
            int i22 = this.f18989j;
            int i23 = this.f18987h;
            if (i22 >= i23) {
                int i24 = 0;
                while (true) {
                    int i25 = this.f18994o;
                    if (i25 > 0) {
                        int iMin = Math.min(i23, i25);
                        o(i24, iMin);
                        this.f18994o -= iMin;
                        i24 += iMin;
                        f12 = f12;
                        d10 = d11;
                        i21 = i21;
                        i23 = i23;
                    } else {
                        int i26 = this.f18980a;
                        int i27 = i26 > 4000 ? i26 / 4000 : i21;
                        int i28 = this.f18981b;
                        if (i28 != i21) {
                            ea = this.f18988i;
                            ea.b(i24, i27);
                            i10 = this.f18985f;
                            i11 = this.f18986g;
                            iC = ea.c(i20, i10 / i27, i11 / i27);
                            if (i27 != i21) {
                                int i29 = iC * i27;
                                int i30 = i27 * 4;
                                i13 = i29 - i30;
                                if (i13 >= i10) {
                                    i10 = i13;
                                }
                                i14 = i29 + i30;
                                if (i14 <= i11) {
                                    i11 = i14;
                                }
                                if (i28 == i21) {
                                    iC2 = ea.d(i24, i10, i11);
                                } else {
                                    ea.b(i24, i21);
                                    iC2 = ea.c(i20, i10, i11);
                                }
                            } else {
                                iC2 = iC;
                            }
                            i12 = i28;
                        } else if (i27 == i21) {
                            iC2 = this.f18988i.d(i24, this.f18985f, this.f18986g);
                            i12 = i21;
                        } else {
                            i28 = i21;
                            ea = this.f18988i;
                            ea.b(i24, i27);
                            i10 = this.f18985f;
                            i11 = this.f18986g;
                            iC = ea.c(i20, i10 / i27, i11 / i27);
                            if (i27 != i21) {
                                int i210 = iC * i27;
                                int i31 = i27 * 4;
                                i13 = i210 - i31;
                                if (i13 >= i10) {
                                    i10 = i13;
                                }
                                i14 = i210 + i31;
                                if (i14 <= i11) {
                                    i11 = i14;
                                }
                                if (i28 == i21) {
                                    iC2 = ea.d(i24, i10, i11);
                                } else {
                                    ea.b(i24, i21);
                                    iC2 = ea.c(i20, i10, i11);
                                }
                            } else {
                                iC2 = iC;
                            }
                            i12 = i28;
                        }
                        EA ea2 = this.f18988i;
                        int i32 = ea2.zzc() ? this.f18995p : iC2;
                        int i33 = i24 + i32;
                        ea2.zzi();
                        this.f18995p = iC2;
                        double d12 = i32;
                        if (d11 > 1.0d) {
                            double d13 = d11 - 1.0d;
                            if (d11 >= 2.0d) {
                                double d14 = (d12 / d13) + this.f18996q;
                                int iRound = (int) Math.round(d14);
                                d10 = d11;
                                this.f18996q = d14 - ((double) iRound);
                                i16 = iRound;
                            } else {
                                d10 = d11;
                                double d15 = ((d12 * (2.0d - d10)) / d13) + this.f18996q;
                                int iRound2 = (int) Math.round(d15);
                                this.f18994o = iRound2;
                                this.f18996q = d15 - ((double) iRound2);
                                i16 = i32;
                            }
                            ea2.E(i16);
                            ea2.j(i16, i12, this.f18990k, i24, i33);
                            this.f18990k += i16;
                            i24 += i32 + i16;
                        } else {
                            d10 = d11;
                            i21 = i21;
                            i23 = i23;
                            double d16 = 1.0d - d10;
                            if (d10 < 0.5d) {
                                double d17 = ((d12 * d10) / d16) + this.f18996q;
                                int iRound3 = (int) Math.round(d17);
                                this.f18996q = d17 - ((double) iRound3);
                                i15 = iRound3;
                            } else {
                                double d18 = ((d12 * ((d10 + d10) - 1.0d)) / d16) + this.f18996q;
                                int iRound4 = (int) Math.round(d18);
                                this.f18994o = iRound4;
                                this.f18996q = d18 - ((double) iRound4);
                                i15 = i32;
                            }
                            int i34 = i32 + i15;
                            ea2.E(i34);
                            System.arraycopy(ea2.l(), i24 * i12, ea2.a(), this.f18990k * i12, i32 * i12);
                            int i35 = i24;
                            ea2.j(i15, i12, this.f18990k + i32, i33, i35);
                            this.f18990k += i34;
                            i24 = i35 + i15;
                        }
                        if (i24 + i23 > i22) {
                            break;
                        }
                        i19 = i19;
                        f12 = f12;
                        i21 = i21;
                        i23 = i23;
                        d11 = d10;
                        i20 = 0;
                    }
                    i19 = i19;
                    if (i24 + i23 > i22) {
                        break;
                        break;
                    }
                    i19 = i19;
                    f12 = f12;
                    i21 = i21;
                    i23 = i23;
                    d11 = d10;
                    i20 = 0;
                }
                int i36 = this.f18989j - i24;
                EA ea3 = this.f18988i;
                int i37 = this.f18981b;
                System.arraycopy(ea3.l(), i24 * i37, ea3.l(), 0, i37 * i36);
                this.f18989j = i36;
            }
            f10 = this.f18984e * f12;
            if (f10 != 1.0f || this.f18990k == i19) {
            }
            int i38 = this.f18980a;
            long j12 = i38;
            long j13 = (long) (i38 / f10);
            while (j13 != 0 && j12 != 0 && j13 % 2 == 0 && j12 % 2 == 0) {
                j13 /= 2;
                j12 /= 2;
            }
            int i39 = this.f18990k - i19;
            EA ea4 = this.f18988i;
            ea4.f(i39);
            int i40 = this.f18981b;
            System.arraycopy(ea4.a(), i19 * i40, ea4.h(), this.f18991l * i40, i39 * i40);
            this.f18990k = i19;
            this.f18991l += i39;
            int i41 = 0;
            while (true) {
                i17 = this.f18991l - 1;
                if (i41 >= i17) {
                    break;
                }
                while (true) {
                    i18 = this.f18992m + 1;
                    j10 = i18;
                    long j14 = j10 * j13;
                    j11 = this.f18993n;
                    if (j14 <= j11 * j12) {
                        break;
                    }
                    int i42 = i21;
                    ea4.E(i42);
                    ea4.e(i41, j12, j13);
                    this.f18993n += i42;
                    this.f18990k += i42;
                }
                int i43 = i21;
                this.f18992m = i18;
                if (j10 == j12) {
                    this.f18992m = 0;
                    AbstractC2418Ss0.i(j11 == j13 ? i43 : 0);
                    this.f18993n = 0;
                }
                i41++;
                i21 = i43;
            }
            if (i17 != 0) {
                System.arraycopy(ea4.h(), i17 * i40, ea4.h(), 0, (this.f18991l - i17) * i40);
                this.f18991l -= i17;
                return;
            }
            return;
        }
        o(0, this.f18989j);
        this.f18989j = 0;
        f12 = f12;
        i19 = i19;
        i21 = 1;
        f10 = this.f18984e * f12;
        if (f10 != 1.0f) {
        }
    }

    public final int a() {
        return this.f18989j * this.f18981b * this.f18988i.zza();
    }

    public final void b(ByteBuffer byteBuffer) {
        EA ea = this.f18988i;
        int iRemaining = byteBuffer.remaining();
        int iZza = iRemaining / (this.f18981b * ea.zza());
        ea.V(iZza);
        ea.i(byteBuffer, iRemaining);
        this.f18989j += iZza;
        p();
    }

    public final void c(ByteBuffer byteBuffer) {
        AbstractC2418Ss0.i(this.f18990k >= 0);
        int i10 = this.f18981b;
        int iRemaining = byteBuffer.remaining();
        EA ea = this.f18988i;
        int iMin = Math.min(iRemaining / (ea.zza() * i10), this.f18990k);
        ea.g(byteBuffer, iMin);
        this.f18990k -= iMin;
        System.arraycopy(ea.a(), iMin * i10, ea.a(), 0, this.f18990k * i10);
    }

    public final void d() {
        int i10 = this.f18989j;
        int i11 = this.f18994o;
        int i12 = this.f18990k;
        float f10 = this.f18982c;
        float f11 = this.f18983d;
        int i13 = i12 + ((int) ((((((((double) (i10 - i11)) / ((double) (f10 / f11))) + ((double) i11)) + this.f18996q) + ((double) this.f18991l)) / ((double) (this.f18984e * f11))) + 0.5d));
        this.f18996q = 0.0d;
        int i14 = this.f18987h;
        int i15 = i14 + i14;
        EA ea = this.f18988i;
        ea.V(i10 + i15);
        ea.k(i10 * this.f18981b, i15);
        this.f18989j += i15;
        p();
        if (this.f18990k > i13) {
            this.f18990k = Math.max(i13, 0);
        }
        this.f18989j = 0;
        this.f18994o = 0;
        this.f18991l = 0;
    }

    public final void e() {
        this.f18989j = 0;
        this.f18990k = 0;
        this.f18991l = 0;
        this.f18992m = 0;
        this.f18993n = 0;
        this.f18994o = 0;
        this.f18995p = 0;
        this.f18996q = 0.0d;
        this.f18988i.zzg();
    }

    public final int f() {
        AbstractC2418Ss0.i(this.f18990k >= 0);
        return this.f18990k * this.f18981b * this.f18988i.zza();
    }

    final /* synthetic */ int g() {
        return this.f18981b;
    }

    final /* synthetic */ int h() {
        return this.f18987h;
    }

    final /* synthetic */ int i() {
        return this.f18989j;
    }

    final /* synthetic */ int j() {
        return this.f18990k;
    }

    final /* synthetic */ int k() {
        return this.f18991l;
    }

    final /* synthetic */ int l() {
        return this.f18992m;
    }

    final /* synthetic */ int m() {
        return this.f18993n;
    }

    final /* synthetic */ int n() {
        return this.f18995p;
    }
}

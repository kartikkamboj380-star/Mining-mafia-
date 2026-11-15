package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class R9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M9 f22737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC5962z9 f22738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D9 f22739d;

    public R9(D9 d10) {
        this(M9.f20776b, 0, new A9());
        this.f22739d = d10;
    }

    private final long g() throws Q9, O9 {
        int i10 = ((((~1246322141) & 272302173) | 1841378864) + ((1246322141 & 825937997) | 658822930)) - (-1823634633);
        int i11 = 1600766768 % 649830540;
        int i12 = ((((~680326130) & 1378702392) | 3315809) + ((680326130 & 1913472410) | 739293607)) - 2048099035;
        int i13 = 1743768897 % 152059765;
        int i14 = ((((~973294814) & 1252035530) | 51191353) + ((973294814 & 1755616710) | 889459732)) - 1494176168;
        int i15 = 1861701682 % 1196748250;
        int i16 = ((((~29116548) & 174422021) | 84710160) + ((29116548 & (-1973327347)) | (-1266641286))) - (-1891729929);
        int i17 = 2091729405 % 1207774949;
        int i18 = ((((~80201211) & 1629524354) | 38778411) + ((80201211 & 1977746312) | 382371455)) - 1921480783;
        int i19 = 1050760512 % 184320788;
        int i20 = 0;
        long j10 = 0;
        while (i20 < (i10 ^ i11)) {
            try {
                InterfaceC5962z9 interfaceC5962z9 = this.f22738c;
                M9 m10 = this.f22737b;
                int i21 = i10;
                int i22 = this.f22736a;
                int i23 = i11;
                this.f22736a = i22 + 1;
                byte bA = interfaceC5962z9.a(m10, i22);
                int i24 = i14 ^ i15;
                j10 |= ((long) ((i12 ^ i13) & bA)) << i20;
                if (i20 == i24) {
                    if (bA > 1) {
                        throw new O9();
                    }
                    i20 = i24;
                }
                if ((bA & (i16 ^ i17)) == 0) {
                    return (j10 >>> 1) ^ (-(1 & j10));
                }
                i20 += i18 ^ i19;
                i10 = i21;
                i11 = i23;
            } catch (IndexOutOfBoundsException e10) {
                throw new Q9(e10);
            }
        }
        throw new O9();
    }

    private static final void h(long j10) throws P9 {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        if (j10 % ((jArr[6] + (((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16)) ^ (jArr[7] % 477127367)) != 0) {
            throw new P9();
        }
    }

    public final void a(long j10) {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        h(j10);
        long j19 = j10 / ((j17 + (((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16)) ^ (j18 % 899334107));
        if (j19 < 0 || j19 > this.f22737b.f20778a.length) {
            throw new Q9();
        }
        this.f22736a = (int) j19;
    }

    public final long b() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        return ((long) this.f22736a) * ((jArr[6] + (((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15)) ^ (jArr[7] % 1780695788));
    }

    public final long c() throws Q9 {
        try {
            InterfaceC5962z9 interfaceC5962z9 = this.f22738c;
            M9 m10 = this.f22737b;
            int i10 = this.f22736a;
            this.f22736a = i10 + 1;
            return interfaceC5962z9.a(m10, i10);
        } catch (IndexOutOfBoundsException e10) {
            throw new Q9(e10);
        }
    }

    public final int d() {
        int i10 = ((((~413360099) & 1621678468) | 84323740) + ((413360099 & 1621644360) | 385888249)) - 1513564466;
        int i11 = 1609416931 % 1031126087;
        int i12 = ((((~978587665) & 1228171537) | 1025392332) + ((978587665 & 1075859857) | 983056096)) - (-1589113644);
        int i13 = 1723578341 % 672563970;
        int i14 = ((((~1163384280) & 546336857) | 505597090) + ((1163384280 & 546323033) | 358992768)) - 1346988633;
        int i15 = 1124734562 % 530406424;
        int i16 = ((((~217161528) & 116398273) | 202500381) + ((217161528 & 316821712) | 269928733)) - 410012058;
        int i17 = 529302443 % 418646579;
        try {
            InterfaceC5962z9 interfaceC5962z9 = this.f22738c;
            M9 m10 = this.f22737b;
            int i18 = this.f22736a;
            this.f22736a = i18 + 1;
            int i19 = i10 ^ i11;
            int iA = interfaceC5962z9.a(m10, i18) & i19;
            InterfaceC5962z9 interfaceC5962z10 = this.f22738c;
            M9 m11 = this.f22737b;
            int i20 = this.f22736a;
            this.f22736a = i20 + 1;
            int iA2 = iA | ((interfaceC5962z10.a(m11, i20) & i19) << (i12 ^ i13));
            InterfaceC5962z9 interfaceC5962z11 = this.f22738c;
            M9 m12 = this.f22737b;
            int i21 = this.f22736a;
            this.f22736a = i21 + 1;
            int iA3 = iA2 | ((i19 & interfaceC5962z11.a(m12, i21)) << (i14 ^ i15));
            InterfaceC5962z9 interfaceC5962z12 = this.f22738c;
            M9 m13 = this.f22737b;
            int i22 = this.f22736a;
            this.f22736a = i22 + 1;
            return iA3 | (interfaceC5962z12.a(m13, i22) << (i16 ^ i17));
        } catch (IndexOutOfBoundsException e10) {
            throw new Q9(e10);
        }
    }

    public final long e() {
        return g();
    }

    public final M9 f(long j10) throws Q9, P9 {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        h(b() + j10);
        int i19 = this.f22736a;
        long j11 = i19;
        M9 m10 = this.f22737b;
        long j12 = (j10 >> ((i17 % 774318984) ^ i18)) + j11;
        if (j12 > m10.f20778a.length || j12 < j11) {
            throw new Q9();
        }
        try {
            int i20 = (int) j12;
            M9 m9B = this.f22738c.b(m10, i19, i20);
            this.f22736a = i20;
            return m9B;
        } catch (IndexOutOfBoundsException e10) {
            throw new AssertionError(K9.a("CEiv6BFfPnitUE+D"), e10);
        }
    }

    private R9(M9 m10, int i10, InterfaceC5962z9 interfaceC5962z9) {
        this.f22737b = m10;
        this.f22736a = i10;
        this.f22738c = interfaceC5962z9;
    }

    public R9(M9 m10, int i10, InterfaceC5962z9 interfaceC5962z9, D9 d10) {
        this(m10, i10, interfaceC5962z9);
        this.f22739d = d10;
    }
}

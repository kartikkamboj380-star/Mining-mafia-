package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5357uL0 extends AbstractC5609wL0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f33780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f33784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33786m;

    /* synthetic */ C5357uL0(byte[] bArr, int i10, int i11, boolean z9, byte[] bArr2) {
        super(null);
        this.f33786m = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f33780g = bArr;
        this.f33781h = i11 + i10;
        this.f33783j = i10;
        this.f33784k = i10;
    }

    private final void H() {
        int i10 = this.f33781h + this.f33782i;
        this.f33781h = i10;
        int i11 = i10 - this.f33784k;
        int i12 = this.f33786m;
        if (i11 <= i12) {
            this.f33782i = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f33782i = i13;
        this.f33781h = i10 - i13;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int A() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final long B() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int C() {
        return AbstractC5609wL0.i(I());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final long D() {
        return AbstractC5609wL0.j(J());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int E(int i10) {
        if (i10 < 0) {
            throw new C3598gM0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + (this.f33783j - this.f33784k);
        if (i11 < 0) {
            throw new C3598gM0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.f33786m;
        if (i11 > i12) {
            throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f33786m = i11;
        H();
        return i12;
    }

    public final byte F() throws C3598gM0 {
        int i10 = this.f33783j;
        if (i10 == this.f33781h) {
            throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f33780g;
        this.f33783j = i10 + 1;
        return bArr[i10];
    }

    public final void G(int i10) throws C3598gM0 {
        if (i10 >= 0) {
            int i11 = this.f33781h;
            int i12 = this.f33783j;
            if (i10 <= i11 - i12) {
                this.f33783j = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C3598gM0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int I() {
        int i10;
        int i11 = this.f33783j;
        int i12 = this.f33781h;
        if (i12 != i11) {
            byte[] bArr = this.f33780g;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f33783j = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f33783j = i14;
                return i10;
            }
        }
        return (int) K();
    }

    public final long J() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f33783j;
        int i11 = this.f33781h;
        if (i11 != i10) {
            byte[] bArr = this.f33780g;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f33783j = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            long j13 = (-2080896) ^ i18;
                            i13 = i17;
                            j10 = j13;
                        } else {
                            i15 = i10 + 5;
                            long j14 = (((long) bArr[i17]) << 28) ^ ((long) i18);
                            if (j14 >= 0) {
                                j10 = j14 ^ 266354560;
                            } else {
                                i13 = i10 + 6;
                                long j15 = (((long) bArr[i15]) << 35) ^ j14;
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    int i19 = i10 + 7;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 42);
                                    if (j16 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j15 = j16 ^ (((long) bArr[i19]) << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i19 = i10 + 9;
                                            j16 = j15 ^ (((long) bArr[i13]) << 56);
                                            if (j16 >= 0) {
                                                j11 = 71499008037633920L;
                                            } else {
                                                i13 = i10 + 10;
                                                long j17 = j16 ^ (((long) bArr[i19]) << 63);
                                                if (j17 >= 0) {
                                                    j10 = j17 ^ (-9151873028817141888L);
                                                }
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    i13 = i15;
                }
                this.f33783j = i13;
                return j10;
            }
        }
        return K();
    }

    final long K() throws C3598gM0 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bF = F();
            j10 |= ((long) (bF & 127)) << i10;
            if ((bF & 128) == 0) {
                return j10;
            }
        }
        throw new C3598gM0("CodedInputStream encountered a malformed varint.");
    }

    public final int L() throws C3598gM0 {
        int i10 = this.f33783j;
        if (this.f33781h - i10 < 4) {
            throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f33780g;
        this.f33783j = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final long M() throws C3598gM0 {
        int i10 = this.f33783j;
        if (this.f33781h - i10 < 8) {
            throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f33780g;
        this.f33783j = i10 + 8;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 6]) & 255) << 48) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final void a(int i10) {
        this.f33786m = i10;
        H();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final boolean b() {
        return this.f33783j == this.f33781h;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int c() {
        return this.f33783j - this.f33784k;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int k() throws C3598gM0 {
        if (b()) {
            this.f33785l = 0;
            return 0;
        }
        int I9 = I();
        this.f33785l = I9;
        if ((I9 >>> 3) != 0) {
            return I9;
        }
        throw new C3598gM0("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final void l(int i10) throws C3598gM0 {
        if (this.f33785l != i10) {
            throw new C3598gM0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final boolean m(int i10) throws C3598gM0 {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f33781h - this.f33783j < 10) {
                while (i12 < 10) {
                    if (F() < 0) {
                        i12++;
                    }
                }
                throw new C3598gM0("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.f33780g;
                int i13 = this.f33783j;
                this.f33783j = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw new C3598gM0("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            G(8);
            return true;
        }
        if (i11 == 2) {
            G(I());
            return true;
        }
        if (i11 == 3) {
            h();
            l(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            g();
            return false;
        }
        if (i11 != 5) {
            throw new C3472fM0("Protocol message tag had invalid wire type.");
        }
        G(4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final double n() {
        return Double.longBitsToDouble(M());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final float o() {
        return Float.intBitsToFloat(L());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final long p() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final long q() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int r() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final long s() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int t() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final boolean u() {
        return J() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final String v() throws C3598gM0 {
        int I9 = I();
        if (I9 > 0) {
            int i10 = this.f33781h;
            int i11 = this.f33783j;
            if (I9 <= i10 - i11) {
                String str = new String(this.f33780g, i11, I9, AbstractC3346eM0.f27765a);
                this.f33783j += I9;
                return str;
            }
        }
        if (I9 == 0) {
            return "";
        }
        if (I9 < 0) {
            throw new C3598gM0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final String w() throws C3598gM0 {
        int I9 = I();
        if (I9 > 0) {
            int i10 = this.f33781h;
            int i11 = this.f33783j;
            if (I9 <= i10 - i11) {
                String strD = AbstractC4354mN0.d(this.f33780g, i11, I9);
                this.f33783j += I9;
                return strD;
            }
        }
        if (I9 == 0) {
            return "";
        }
        if (I9 <= 0) {
            throw new C3598gM0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final AbstractC5231tL0 x() throws C3598gM0 {
        int I9 = I();
        if (I9 > 0) {
            int i10 = this.f33781h;
            int i11 = this.f33783j;
            if (I9 <= i10 - i11) {
                AbstractC5231tL0 abstractC5231tL0Y = AbstractC5231tL0.y(this.f33780g, i11, I9, false);
                this.f33783j += I9;
                return abstractC5231tL0Y;
            }
        }
        if (I9 == 0) {
            return AbstractC5231tL0.f33386b;
        }
        if (I9 > 0) {
            int i12 = this.f33781h;
            int i13 = this.f33783j;
            if (I9 <= i12 - i13) {
                int i14 = I9 + i13;
                this.f33783j = i14;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f33780g, i13, i14);
                AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
                return new C4979rL0(bArrCopyOfRange);
            }
        }
        if (I9 <= 0) {
            throw new C3598gM0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int y() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int z() {
        return I();
    }
}

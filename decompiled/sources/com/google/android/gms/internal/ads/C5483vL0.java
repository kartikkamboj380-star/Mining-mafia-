package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5483vL0 extends AbstractC5609wL0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InputStream f34037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f34038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f34041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34044n;

    /* synthetic */ C5483vL0(InputStream inputStream, int i10, byte[] bArr) {
        super(null);
        this.f34044n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        byte[] bArr2 = AbstractC3346eM0.f27766b;
        this.f34037g = inputStream;
        this.f34038h = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
        this.f34039i = 0;
        this.f34041k = 0;
        this.f34043m = 0;
    }

    private final void H() {
        int i10 = this.f34039i + this.f34040j;
        this.f34039i = i10;
        int i11 = this.f34043m + i10;
        int i12 = this.f34044n;
        if (i11 <= i12) {
            this.f34040j = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f34040j = i13;
        this.f34039i = i10 - i13;
    }

    private final void I(int i10) throws C3598gM0 {
        if (J(i10)) {
            return;
        }
        if (i10 <= (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.f34043m) - this.f34041k) {
            throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C3598gM0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean J(int i10) throws IOException {
        int i11 = this.f34041k;
        int i12 = i11 + i10;
        int i13 = this.f34039i;
        if (i12 <= i13) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i10);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i14 = this.f34043m;
        if (i10 > (Api.BaseClientBuilder.API_PRIORITY_OTHER - i14) - i11 || i14 + i11 + i10 > this.f34044n) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.f34038h;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.f34043m + i11;
            this.f34043m = i14;
            i13 = this.f34039i - i11;
            this.f34039i = i13;
            this.f34041k = 0;
        }
        try {
            int i15 = this.f34037g.read(this.f34038h, i13, Math.min(4096 - i13, (Api.BaseClientBuilder.API_PRIORITY_OTHER - i14) - i13));
            if (i15 != 0 && i15 >= -1 && i15 <= 4096) {
                if (i15 <= 0) {
                    return false;
                }
                this.f34039i += i15;
                H();
                return this.f34039i >= i10 || J(i10);
            }
            String strValueOf = String.valueOf(this.f34037g.getClass());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39 + String.valueOf(i15).length() + 41);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(i15);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        } catch (C3598gM0 e10) {
            e10.a();
            throw e10;
        }
    }

    private final byte[] K(int i10, boolean z9) throws IOException {
        byte[] bArrL = L(i10);
        if (bArrL != null) {
            return bArrL;
        }
        int i11 = this.f34041k;
        int i12 = this.f34039i;
        int i13 = i12 - i11;
        this.f34043m += i12;
        this.f34041k = 0;
        this.f34039i = 0;
        List<byte[]> listM = M(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f34038h, i11, bArr, 0, i13);
        for (byte[] bArr2 : listM) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] L(int i10) throws IOException {
        if (i10 == 0) {
            return AbstractC3346eM0.f27766b;
        }
        int i11 = this.f34043m;
        int i12 = this.f34041k;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw new C3598gM0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i14 = this.f34044n;
        if (i13 > i14) {
            G((i14 - i11) - i12);
            throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.f34039i - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.f34037g.available()) {
                    return null;
                }
            } catch (C3598gM0 e10) {
                e10.a();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f34038h, this.f34041k, bArr, 0, i15);
        this.f34043m += this.f34039i;
        this.f34041k = 0;
        this.f34039i = 0;
        while (i15 < i10) {
            try {
                int i17 = this.f34037g.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f34043m += i17;
                i15 += i17;
            } catch (C3598gM0 e11) {
                e11.a();
                throw e11;
            }
        }
        return bArr;
    }

    private final List M(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f34037g.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f34043m += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int A() {
        return Q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final long B() {
        return R();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int C() {
        return AbstractC5609wL0.i(N());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final long D() {
        return AbstractC5609wL0.j(O());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int E(int i10) throws C3598gM0 {
        if (i10 < 0) {
            throw new C3598gM0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + this.f34043m + this.f34041k;
        if (i11 < 0) {
            throw new C3598gM0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.f34044n;
        if (i11 > i12) {
            throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f34044n = i11;
        H();
        return i12;
    }

    public final byte F() throws C3598gM0 {
        if (this.f34041k == this.f34039i) {
            I(1);
        }
        byte[] bArr = this.f34038h;
        int i10 = this.f34041k;
        this.f34041k = i10 + 1;
        return bArr[i10];
    }

    public final void G(int i10) throws C3598gM0 {
        int i11 = this.f34039i;
        int i12 = this.f34041k;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f34041k = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new C3598gM0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f34043m;
        int i15 = i14 + i12;
        int i16 = this.f34044n;
        if (i15 + i10 > i16) {
            G((i16 - i14) - i12);
            throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f34043m = i15;
        this.f34039i = 0;
        this.f34041k = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                try {
                    long jSkip = this.f34037g.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        String strValueOf = String.valueOf(this.f34037g.getClass());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (C3598gM0 e10) {
                    e10.a();
                    throw e10;
                }
            } catch (Throwable th) {
                this.f34043m += i13;
                H();
                throw th;
            }
        }
        this.f34043m += i13;
        H();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.f34039i;
        int i18 = i17 - this.f34041k;
        this.f34041k = i17;
        I(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.f34039i;
            if (i19 <= i20) {
                this.f34041k = i19;
                return;
            } else {
                i18 += i20;
                this.f34041k = i20;
                I(1);
            }
        }
    }

    public final int N() {
        int i10;
        int i11 = this.f34041k;
        int i12 = this.f34039i;
        if (i12 != i11) {
            byte[] bArr = this.f34038h;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f34041k = i13;
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
                this.f34041k = i14;
                return i10;
            }
        }
        return (int) P();
    }

    public final long O() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f34041k;
        int i11 = this.f34039i;
        if (i11 != i10) {
            byte[] bArr = this.f34038h;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f34041k = i12;
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
                this.f34041k = i13;
                return j10;
            }
        }
        return P();
    }

    final long P() throws C3598gM0 {
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

    public final int Q() throws C3598gM0 {
        int i10 = this.f34041k;
        if (this.f34039i - i10 < 4) {
            I(4);
            i10 = this.f34041k;
        }
        byte[] bArr = this.f34038h;
        this.f34041k = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final long R() throws C3598gM0 {
        int i10 = this.f34041k;
        if (this.f34039i - i10 < 8) {
            I(8);
            i10 = this.f34041k;
        }
        byte[] bArr = this.f34038h;
        this.f34041k = i10 + 8;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 6]) & 255) << 48) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final void a(int i10) {
        this.f34044n = i10;
        H();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final boolean b() {
        return this.f34041k == this.f34039i && !J(1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int c() {
        return this.f34043m + this.f34041k;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int k() throws C3598gM0 {
        if (b()) {
            this.f34042l = 0;
            return 0;
        }
        int iN = N();
        this.f34042l = iN;
        if ((iN >>> 3) != 0) {
            return iN;
        }
        throw new C3598gM0("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final void l(int i10) throws C3598gM0 {
        if (this.f34042l != i10) {
            throw new C3598gM0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final boolean m(int i10) throws C3598gM0 {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f34039i - this.f34041k < 10) {
                while (i12 < 10) {
                    if (F() < 0) {
                        i12++;
                    }
                }
                throw new C3598gM0("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.f34038h;
                int i13 = this.f34041k;
                this.f34041k = i13 + 1;
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
            G(N());
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
        return Double.longBitsToDouble(R());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final float o() {
        return Float.intBitsToFloat(Q());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final long p() {
        return O();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final long q() {
        return O();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int r() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final long s() {
        return R();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int t() {
        return Q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final boolean u() {
        return O() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final String v() throws C3598gM0 {
        int iN = N();
        if (iN > 0) {
            int i10 = this.f34039i;
            int i11 = this.f34041k;
            if (iN <= i10 - i11) {
                String str = new String(this.f34038h, i11, iN, AbstractC3346eM0.f27765a);
                this.f34041k += iN;
                return str;
            }
        }
        if (iN == 0) {
            return "";
        }
        if (iN < 0) {
            throw new C3598gM0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iN > this.f34039i) {
            return new String(K(iN, false), AbstractC3346eM0.f27765a);
        }
        I(iN);
        String str2 = new String(this.f34038h, this.f34041k, iN, AbstractC3346eM0.f27765a);
        this.f34041k += iN;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final String w() throws IOException {
        byte[] bArrK;
        int iN = N();
        int i10 = this.f34041k;
        int i11 = this.f34039i;
        if (iN <= i11 - i10 && iN > 0) {
            bArrK = this.f34038h;
            this.f34041k = i10 + iN;
        } else {
            if (iN == 0) {
                return "";
            }
            if (iN < 0) {
                throw new C3598gM0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i10 = 0;
            if (iN <= i11) {
                I(iN);
                bArrK = this.f34038h;
                this.f34041k = iN;
            } else {
                bArrK = K(iN, false);
            }
        }
        return AbstractC4354mN0.d(bArrK, i10, iN);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final AbstractC5231tL0 x() throws IOException {
        int iN = N();
        int i10 = this.f34039i;
        int i11 = this.f34041k;
        if (iN <= i10 - i11 && iN > 0) {
            AbstractC5231tL0 abstractC5231tL0Y = AbstractC5231tL0.y(this.f34038h, i11, iN, false);
            this.f34041k += iN;
            return abstractC5231tL0Y;
        }
        if (iN == 0) {
            return AbstractC5231tL0.f33386b;
        }
        if (iN < 0) {
            throw new C3598gM0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrL = L(iN);
        if (bArrL != null) {
            return AbstractC5231tL0.y(bArrL, 0, bArrL.length, false);
        }
        int i12 = this.f34041k;
        int i13 = this.f34039i;
        int i14 = i13 - i12;
        this.f34043m += i13;
        this.f34041k = 0;
        this.f34039i = 0;
        List<byte[]> listM = M(iN - i14);
        byte[] bArr = new byte[iN];
        System.arraycopy(this.f34038h, i12, bArr, 0, i14);
        for (byte[] bArr2 : listM) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        return AbstractC5231tL0.z(bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int y() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5609wL0
    public final int z() {
        return N();
    }
}

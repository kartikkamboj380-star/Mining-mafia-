package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class P10 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f22003d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f22004e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC1903Iu0 f22005f = AbstractC1903Iu0.p(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f22006g = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f22007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22009c;

    public P10(byte[] bArr, int i10) {
        this.f22007a = bArr;
        this.f22009c = i10;
    }

    private final char s(ByteOrder byteOrder, int i10) {
        w(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f22007a;
            int i11 = this.f22008b + i10;
            return AbstractC4928qw0.a(bArr[i11], bArr[i11 + 1]);
        }
        byte[] bArr2 = this.f22007a;
        int i12 = this.f22008b + i10;
        return AbstractC4928qw0.a(bArr2[i12 + 1], bArr2[i12]);
    }

    private final char t(Charset charset, char[] cArr) {
        int iU;
        if (C() >= v(charset) && (iU = u(charset)) != 0) {
            int i10 = iU >>> 8;
            if (!Character.isSupplementaryCodePoint(i10)) {
                long j10 = i10;
                char c10 = (char) j10;
                AbstractC2418Ss0.e(((long) c10) == j10, "Out of range: %s", j10);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.f22008b += AbstractC5305tw0.a(iU & 255);
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    private final int u(Charset charset) {
        int codePoint;
        int i10;
        int iA;
        AbstractC2418Ss0.f(f22005f.contains(charset), "Unsupported charset: %s", charset);
        if (C() < v(charset)) {
            int i11 = this.f22008b;
            int i12 = this.f22009c;
            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 17 + String.valueOf(i12).length());
            sb.append("position=");
            sb.append(i11);
            sb.append(", limit=");
            sb.append(i12);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i13 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.f22007a[this.f22008b];
            if ((b10 & 128) == 0) {
                codePoint = O10.a(b10);
                return (codePoint << 8) | i13;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.f22007a[this.f22008b];
            if ((b11 & 128) == 0) {
                i10 = 1;
            } else if ((b11 & 224) == 192 && C() >= 2 && x(this.f22007a[this.f22008b + 1])) {
                i10 = 2;
            } else if ((this.f22007a[this.f22008b] & 240) == 224 && C() >= 3) {
                byte[] bArr = this.f22007a;
                int i14 = this.f22008b;
                if (x(bArr[i14 + 1]) && x(bArr[i14 + 2])) {
                    i10 = 3;
                } else if ((this.f22007a[this.f22008b] & 248) == 240) {
                    i10 = 0;
                } else {
                    i10 = 0;
                }
            } else if ((this.f22007a[this.f22008b] & 248) == 240 || C() < 4) {
                i10 = 0;
            } else {
                byte[] bArr2 = this.f22007a;
                int i15 = this.f22008b;
                if (x(bArr2[i15 + 1]) && x(bArr2[i15 + 2]) && x(bArr2[i15 + 3])) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
            }
            if (i10 == 1) {
                iA = O10.a(this.f22007a[this.f22008b]);
            } else if (i10 == 2) {
                byte[] bArr3 = this.f22007a;
                int i16 = this.f22008b;
                iA = y(0, 0, bArr3[i16], bArr3[i16 + 1]);
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        byte[] bArr4 = this.f22007a;
                        int i17 = this.f22008b;
                        iA = y(bArr4[i17], bArr4[i17 + 1], bArr4[i17 + 2], bArr4[i17 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.f22007a;
                int i18 = this.f22008b;
                iA = y(0, bArr5[i18] & 15, bArr5[i18 + 1], bArr5[i18 + 2]);
            }
            i13 = i10;
            codePoint = iA;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cS = s(byteOrder, 0);
            if (!Character.isHighSurrogate(cS) || C() < 4) {
                codePoint = cS;
                i13 = 2;
            } else {
                codePoint = Character.toCodePoint(cS, s(byteOrder, 2));
                i13 = 4;
            }
        }
        return (codePoint << 8) | i13;
    }

    private static int v(Charset charset) {
        AbstractC2418Ss0.f(f22005f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void w(int i10) {
        if (!f22006g.get() || C() >= i10) {
            return;
        }
        int iC = C();
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 25 + String.valueOf(iC).length());
        sb.append("bytesNeeded= ");
        sb.append(i10);
        sb.append(", bytesLeft=");
        sb.append(iC);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private static boolean x(byte b10) {
        return (b10 & 192) == 128;
    }

    private static int y(int i10, int i11, int i12, int i13) {
        return AbstractC5305tw0.e((byte) 0, AbstractC5935yw0.a(((i10 & 7) << 2) | ((i11 & 48) >> 4)), AbstractC5935yw0.a(((i12 & 60) >> 2) | ((i11 & 15) << 4)), AbstractC5935yw0.a((i13 & 63) | ((i12 & 3) << 6)));
    }

    public final void A(byte[] bArr, int i10) {
        this.f22007a = bArr;
        this.f22009c = i10;
        this.f22008b = 0;
    }

    public final void B(int i10) {
        byte[] bArr = this.f22007a;
        if (i10 > bArr.length) {
            this.f22007a = Arrays.copyOf(bArr, i10);
        }
    }

    public final int C() {
        return Math.max(this.f22009c - this.f22008b, 0);
    }

    public final int D() {
        return this.f22009c;
    }

    public final void E(int i10) {
        boolean z9 = false;
        if (i10 >= 0 && i10 <= this.f22007a.length) {
            z9 = true;
        }
        AbstractC2418Ss0.a(z9);
        this.f22009c = i10;
    }

    public final int F() {
        return this.f22008b;
    }

    public final void G(int i10) {
        boolean z9 = false;
        if (i10 >= 0 && i10 <= this.f22009c) {
            z9 = true;
        }
        AbstractC2418Ss0.a(z9);
        this.f22008b = i10;
    }

    public final byte[] H() {
        return this.f22007a;
    }

    public final int I() {
        return this.f22007a.length;
    }

    public final void J(int i10) {
        G(this.f22008b + i10);
    }

    public final void K(C4436n10 c4436n10, int i10) {
        L(c4436n10.f31642a, 0, i10);
        c4436n10.f(0);
    }

    public final void L(byte[] bArr, int i10, int i11) {
        w(i11);
        System.arraycopy(this.f22007a, this.f22008b, bArr, i10, i11);
        this.f22008b += i11;
    }

    public final int M() {
        w(1);
        return this.f22007a[this.f22008b] & 255;
    }

    public final char N() {
        return s(ByteOrder.BIG_ENDIAN, 0);
    }

    public final int O(Charset charset) {
        int iU = u(charset);
        if (iU != 0) {
            return AbstractC5305tw0.a(iU >>> 8);
        }
        return 1114112;
    }

    public final int P() {
        if (C() >= 3) {
            int iW = W();
            this.f22008b -= 3;
            return iW;
        }
        int i10 = this.f22008b;
        int i11 = this.f22009c;
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length());
        sb.append("position=");
        sb.append(i10);
        sb.append(", limit=");
        sb.append(i11);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int Q() {
        if (C() >= 4) {
            int iB = b();
            this.f22008b -= 4;
            return iB;
        }
        int i10 = this.f22008b;
        int i11 = this.f22009c;
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length());
        sb.append("position=");
        sb.append(i10);
        sb.append(", limit=");
        sb.append(i11);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int R() {
        w(1);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        this.f22008b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int S() {
        w(2);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        int i12 = bArr[i10] & 255;
        this.f22008b = i10 + 2;
        return (bArr[i11] & 255) | (i12 << 8);
    }

    public final int T() {
        w(2);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        int i12 = bArr[i10] & 255;
        this.f22008b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final short U() {
        w(2);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        int i12 = bArr[i10] & 255;
        this.f22008b = i10 + 2;
        return (short) ((bArr[i11] & 255) | (i12 << 8));
    }

    public final short V() {
        w(2);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        int i12 = bArr[i10] & 255;
        this.f22008b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final int W() {
        w(3);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f22008b = i13;
        int i14 = bArr[i11] & 255;
        this.f22008b = i10 + 3;
        return (bArr[i13] & 255) | (i12 << 16) | (i14 << 8);
    }

    public final int X() {
        w(3);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f22008b = i13;
        int i14 = bArr[i11] & 255;
        this.f22008b = i10 + 3;
        return (bArr[i13] & 255) | ((i12 << 24) >> 8) | (i14 << 8);
    }

    public final long Y() {
        w(4);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.f22008b = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.f22008b = i13;
        long j12 = bArr[i12];
        this.f22008b = i10 + 4;
        return (((long) bArr[i13]) & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public final long a() {
        w(4);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.f22008b = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.f22008b = i13;
        long j12 = bArr[i12];
        this.f22008b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | (255 & j10) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final int b() {
        w(4);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f22008b = i13;
        int i14 = bArr[i11] & 255;
        int i15 = i10 + 3;
        this.f22008b = i15;
        int i16 = bArr[i13] & 255;
        this.f22008b = i10 + 4;
        return (bArr[i15] & 255) | (i12 << 24) | (i14 << 16) | (i16 << 8);
    }

    public final int c() {
        w(4);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f22008b = i13;
        int i14 = bArr[i11] & 255;
        int i15 = i10 + 3;
        this.f22008b = i15;
        int i16 = bArr[i13] & 255;
        this.f22008b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | (i14 << 8) | i12 | (i16 << 16);
    }

    public final long d() {
        w(8);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.f22008b = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.f22008b = i13;
        long j12 = bArr[i12];
        int i14 = i10 + 4;
        this.f22008b = i14;
        long j13 = bArr[i13];
        int i15 = i10 + 5;
        this.f22008b = i15;
        long j14 = bArr[i14];
        int i16 = i10 + 6;
        this.f22008b = i16;
        long j15 = bArr[i15];
        int i17 = i10 + 7;
        this.f22008b = i17;
        long j16 = bArr[i16];
        this.f22008b = i10 + 8;
        return ((j16 & 255) << 8) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | (((long) bArr[i17]) & 255);
    }

    public final long e() {
        w(8);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.f22008b = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.f22008b = i13;
        long j12 = bArr[i12];
        int i14 = i10 + 4;
        this.f22008b = i14;
        long j13 = bArr[i13];
        int i15 = i10 + 5;
        this.f22008b = i15;
        long j14 = bArr[i14];
        int i16 = i10 + 6;
        this.f22008b = i16;
        long j15 = bArr[i15];
        int i17 = i10 + 7;
        this.f22008b = i17;
        long j16 = bArr[i16];
        this.f22008b = i10 + 8;
        return ((j16 & 255) << 48) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j15 & 255) << 40) | ((((long) bArr[i17]) & 255) << 56);
    }

    public final int f() {
        w(4);
        byte[] bArr = this.f22007a;
        int i10 = this.f22008b;
        int i11 = i10 + 1;
        this.f22008b = i11;
        int i12 = bArr[i10] & 255;
        this.f22008b = i10 + 2;
        int i13 = bArr[i11] & 255;
        this.f22008b = i10 + 4;
        return (i12 << 8) | i13;
    }

    public final int g() {
        return (R() << 21) | (R() << 14) | (R() << 7) | R();
    }

    public final int h() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(iB);
        throw new IllegalStateException(sb.toString());
    }

    public final int i() {
        int iC = c();
        if (iC >= 0) {
            return iC;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iC).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(iC);
        throw new IllegalStateException(sb.toString());
    }

    public final long j() {
        long jD = d();
        if (jD >= 0) {
            return jD;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(jD).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(jD);
        throw new IllegalStateException(sb.toString());
    }

    public final String k(int i10, Charset charset) {
        w(i10);
        byte[] bArr = this.f22007a;
        int i11 = this.f22008b;
        String str = new String(bArr, i11, i10, charset);
        this.f22008b = i11 + i10;
        return str;
    }

    public final String l(int i10) {
        w(i10);
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f22008b;
        int i12 = (i11 + i10) - 1;
        String strF = AbstractC4634ob0.F(this.f22007a, i11, (i12 >= this.f22009c || this.f22007a[i12] != 0) ? i10 : i10 - 1);
        this.f22008b += i10;
        return strF;
    }

    public final String m(char c10) {
        if (C() == 0) {
            return null;
        }
        int i10 = this.f22008b;
        while (i10 < this.f22009c && this.f22007a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f22007a;
        int i11 = this.f22008b;
        String strF = AbstractC4634ob0.F(bArr, i11, i10 - i11);
        this.f22008b = i10;
        if (i10 < this.f22009c) {
            this.f22008b = i10 + 1;
        }
        return strF;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5 A[SYNTHETIC] */
    public final String n(Charset charset) {
        byte[] bArr;
        AbstractC2418Ss0.f(f22005f.contains(charset), "Unsupported charset: %s", charset);
        if (C() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            r();
        }
        int i10 = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i10 = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i11 = this.f22008b;
        while (true) {
            int i12 = this.f22009c;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && AbstractC4634ob0.G(this.f22007a[i11])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.f22007a;
                if (bArr2[i11] == 0 && AbstractC4634ob0.G(bArr2[i11 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f22007a;
                    if (bArr[i11 + 1] == 0 && AbstractC4634ob0.G(bArr[i11])) {
                        break;
                    }
                }
                i11 += i10;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f22007a;
                    if (bArr[i11 + 1] == 0) {
                        continue;
                    }
                }
                i11 += i10;
            }
        }
        String strK = k(i11 - this.f22008b, charset);
        if (this.f22008b != this.f22009c && t(charset, f22003d) == '\r') {
            t(charset, f22004e);
        }
        return strK;
    }

    public final long o() {
        int i10;
        w(1);
        long j10 = this.f22007a[this.f22008b];
        int i11 = 7;
        while (true) {
            i10 = 0;
            if (i11 < 0) {
                break;
            }
            int i12 = 1 << i11;
            if ((((long) i12) & j10) == 0) {
                if (i11 >= 6) {
                    if (i11 != 7) {
                        break;
                    }
                    i10 = 1;
                    break;
                }
                j10 &= (long) (i12 - 1);
                i10 = 7 - i11;
                break;
            }
            i11--;
        }
        if (i10 == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 35);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j10);
            throw new NumberFormatException(sb.toString());
        }
        w(i10);
        for (int i13 = 1; i13 < i10; i13++) {
            byte b10 = this.f22007a[this.f22008b + i13];
            if ((b10 & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 42);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j10);
                throw new NumberFormatException(sb2.toString());
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f22008b += i10;
        return j10;
    }

    public final long p() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f22008b == this.f22009c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jR = R();
            j10 |= (127 & jR) << (i10 * 7);
            if ((jR & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public final void q() {
        while ((R() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
        }
    }

    public final Charset r() {
        if (C() >= 3) {
            byte[] bArr = this.f22007a;
            int i10 = this.f22008b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f22008b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (C() < 2) {
            return null;
        }
        byte[] bArr2 = this.f22007a;
        int i11 = this.f22008b;
        byte b10 = bArr2[i11];
        if (b10 == -2) {
            if (bArr2[i11 + 1] != -1) {
                return null;
            }
            this.f22008b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f22008b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void z(int i10) {
        byte[] bArr = this.f22007a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        A(bArr, i10);
    }

    public P10() {
        this.f22007a = AbstractC4634ob0.f32118b;
    }

    public P10(int i10) {
        this.f22007a = new byte[i10];
        this.f22009c = i10;
    }

    public P10(byte[] bArr) {
        this.f22007a = bArr;
        this.f22009c = bArr.length;
    }
}

package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ov0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2216Ov0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f21720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f21721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f21722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f21723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f21724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f21725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f21726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f21727i;

    /* JADX WARN: Illegal instructions before constructor call */
    C2216Ov0(String str, char[] cArr) {
        byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            boolean z9 = true;
            AbstractC2418Ss0.c(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z9 = false;
            }
            AbstractC2418Ss0.c(z9, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    final char a(int i10) {
        return this.f21720b[i10];
    }

    final boolean b(int i10) {
        return this.f21726h[i10 % this.f21723e];
    }

    final int c(char c10) throws C2372Rv0 {
        if (c10 > 127) {
            throw new C2372Rv0("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        byte b10 = this.f21725g[c10];
        if (b10 != -1) {
            return b10;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new C2372Rv0("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c10).length() + 24);
        sb.append("Unrecognized character: ");
        sb.append(c10);
        throw new C2372Rv0(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    final C2216Ov0 d() {
        boolean z9;
        int i10 = 0;
        while (true) {
            char[] cArr = this.f21720b;
            int length = cArr.length;
            if (i10 >= length) {
                return this;
            }
            if (AbstractC1483As0.d(cArr[i10])) {
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z9 = false;
                        break;
                    }
                    if (AbstractC1483As0.c(cArr[i11])) {
                        z9 = true;
                        break;
                    }
                    i11++;
                }
                AbstractC2418Ss0.j(!z9, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i12 = 0; i12 < cArr.length; i12++) {
                    char c10 = cArr[i12];
                    if (AbstractC1483As0.d(c10)) {
                        c10 ^= 32;
                    }
                    cArr2[i12] = (char) c10;
                }
                C2216Ov0 c2216Ov0 = new C2216Ov0(this.f21719a.concat(".lowerCase()"), cArr2);
                if (!this.f21727i || c2216Ov0.f21727i) {
                    return c2216Ov0;
                }
                byte[] bArr = c2216Ov0.f21725g;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i13 = 65; i13 <= 90; i13++) {
                    int i14 = i13 | 32;
                    byte b10 = bArr[i13];
                    byte b11 = bArr[i14];
                    if (b10 == -1) {
                        bArrCopyOf[i13] = b11;
                    } else {
                        char c11 = (char) i13;
                        char c12 = (char) i14;
                        if (b11 != -1) {
                            throw new IllegalStateException(AbstractC4040jt0.d("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                        }
                        bArrCopyOf[i14] = b10;
                    }
                }
                return new C2216Ov0(c2216Ov0.f21719a.concat(".ignoreCase()"), c2216Ov0.f21720b, bArrCopyOf, true);
            }
            i10++;
        }
    }

    public final boolean e(char c10) {
        byte[] bArr = this.f21725g;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2216Ov0) {
            C2216Ov0 c2216Ov0 = (C2216Ov0) obj;
            if (this.f21727i == c2216Ov0.f21727i && Arrays.equals(this.f21720b, c2216Ov0.f21720b)) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ char[] f() {
        return this.f21720b;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21720b) + (true != this.f21727i ? 1237 : 1231);
    }

    public final String toString() {
        return this.f21719a;
    }

    private C2216Ov0(String str, char[] cArr, byte[] bArr, boolean z9) {
        this.f21719a = str;
        cArr.getClass();
        this.f21720b = cArr;
        try {
            int length = cArr.length;
            int iA = AbstractC4424mw0.a(length, RoundingMode.UNNECESSARY);
            this.f21722d = iA;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iA);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.f21723e = i10;
            this.f21724f = iA >> iNumberOfTrailingZeros;
            this.f21721c = length - 1;
            this.f21725g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f21724f; i11++) {
                zArr[AbstractC4424mw0.b(i11 * 8, this.f21722d, RoundingMode.CEILING)] = true;
            }
            this.f21726h = zArr;
            this.f21727i = z9;
        } catch (ArithmeticException e10) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 24);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e10);
        }
    }
}

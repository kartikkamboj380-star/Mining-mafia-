package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class M9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M9 f20776b = new M9(new byte[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator f20777c = new L9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f20778a;

    public M9(byte[] bArr) {
        this.f20778a = bArr;
    }

    public static M9 e(byte[] bArr) {
        return new M9(h(bArr, 0, bArr.length));
    }

    public static M9 f(String str) {
        return e(str.getBytes(Charset.forName(K9.a("Hn2H4l0="))));
    }

    public static int g(byte b10) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        return b10 & ((iArr[7] % 837626799) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
    }

    public static byte[] h(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    public final byte[] a() {
        byte[] bArr = this.f20778a;
        int length = bArr.length;
        return length == 0 ? new byte[0] : h(bArr, 0, length);
    }

    public final byte b(int i10) {
        int i11 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i12 = 2013725218 % 1633938701;
        int i13 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i14 = 1442767057 % 63299708;
        byte[] bArr = this.f20778a;
        int length = bArr.length;
        if (((length - (i10 + 1)) | i10) >= 0) {
            return bArr[i10];
        }
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + (i11 ^ i12));
            sb.append(K9.a("Akelqh1fajntGgo="));
            sb.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + (i13 ^ i14) + String.valueOf(length).length());
        sb2.append(K9.a("Akelqh1faDmxRUSK1T9GeQ=="));
        sb2.append(i10);
        sb2.append(K9.a("Zwk="));
        sb2.append(length);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final String c() {
        Charset charsetForName = Charset.forName(K9.a("Hn2H4l0="));
        byte[] bArr = this.f20778a;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    public final M9 d(M9 m10) {
        byte[] bArr = m10.f20778a;
        int length = bArr.length;
        byte[] bArr2 = this.f20778a;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return e(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M9) {
            return Arrays.equals(this.f20778a, ((M9) obj).f20778a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.f20778a));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        String string = Arrays.toString(this.f20778a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + ((i17 % 981766422) ^ i18));
        sb.append(K9.a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb.append(string);
        sb.append(K9.a("Ng=="));
        return sb.toString();
    }
}

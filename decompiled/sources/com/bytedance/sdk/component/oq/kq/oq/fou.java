package com.bytedance.sdk.component.oq.kq.oq;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class fou implements Serializable, Comparable<fou> {
    transient int csi;
    final byte[] fou;
    transient String rhi;
    static final char[] kq = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset oq = Charset.forName("UTF-8");
    public static final fou bob = kq(new byte[0]);

    fou(byte[] bArr) {
        this.fou = bArr;
    }

    public static fou kq(byte... bArr) {
        if (bArr != null) {
            return new fou((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public int bob() {
        return this.fou.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fou) {
            fou fouVar = (fou) obj;
            int iBob = fouVar.bob();
            byte[] bArr = this.fou;
            if (iBob == bArr.length && fouVar.kq(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] fou() {
        return (byte[]) this.fou.clone();
    }

    public int hashCode() {
        int i10 = this.csi;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.fou);
        this.csi = iHashCode;
        return iHashCode;
    }

    public String oq() {
        byte[] bArr = this.fou;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = kq;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public String toString() {
        if (this.fou.length == 0) {
            return "[size=0]";
        }
        String strKq = kq();
        int iKq = kq(strKq, 64);
        if (iKq == -1) {
            if (this.fou.length <= 64) {
                return "[hex=" + oq() + "]";
            }
            return "[size=" + this.fou.length + " hex=" + kq(0, 64).oq() + "…]";
        }
        String strReplace = strKq.substring(0, iKq).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (iKq >= strKq.length()) {
            return "[text=" + strReplace + "]";
        }
        return "[size=" + this.fou.length + " text=" + strReplace + "…]";
    }

    public String kq() {
        String str = this.rhi;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.fou, oq);
        this.rhi = str2;
        return str2;
    }

    public fou kq(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.fou;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.fou.length + ")");
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new fou(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte kq(int i10) {
        return this.fou[i10];
    }

    public boolean kq(int i10, fou fouVar, int i11, int i12) {
        return fouVar.kq(i11, this.fou, i10, i12);
    }

    public boolean kq(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.fou;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && dgq.kq(bArr2, i10, bArr, i11, i12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public int compareTo(fou fouVar) {
        int iBob = bob();
        int iBob2 = fouVar.bob();
        int iMin = Math.min(iBob, iBob2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iKq = kq(i10) & 255;
            int iKq2 = fouVar.kq(i10) & 255;
            if (iKq != iKq2) {
                return iKq < iKq2 ? -1 : 1;
            }
        }
        if (iBob == iBob2) {
            return 0;
        }
        return iBob < iBob2 ? -1 : 1;
    }

    static int kq(String str, int i10) {
        int length = str.length();
        int iCharCount = 0;
        int i11 = 0;
        while (iCharCount < length) {
            if (i11 == i10) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i11++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}

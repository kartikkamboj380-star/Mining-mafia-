package com.bytedance.sdk.component.oq.kq.oq;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class kq implements bob, oq, Cloneable, ByteChannel {
    private static final byte[] bob = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    csi kq;
    long oq;

    public String bob() {
        try {
            return kq(this.oq, dgq.kq);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public final fou csi() {
        long j10 = this.oq;
        if (j10 <= 2147483647L) {
            return fou((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.oq);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq)) {
            return false;
        }
        kq kqVar = (kq) obj;
        long j10 = this.oq;
        if (j10 != kqVar.oq) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        csi csiVar = this.kq;
        csi csiVar2 = kqVar.kq;
        int i10 = csiVar.oq;
        int i11 = csiVar2.oq;
        while (j11 < this.oq) {
            long jMin = Math.min(csiVar.bob - i10, csiVar2.bob - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (csiVar.kq[i10] != csiVar2.kq[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == csiVar.bob) {
                csiVar = csiVar.rhi;
                i10 = csiVar.oq;
            }
            if (i11 == csiVar2.bob) {
                csiVar2 = csiVar2.rhi;
                i11 = csiVar2.oq;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    /* JADX INFO: renamed from: fou, reason: merged with bridge method [inline-methods] */
    public kq clone() {
        kq kqVar = new kq();
        if (this.oq == 0) {
            return kqVar;
        }
        csi csiVarKq = this.kq.kq();
        kqVar.kq = csiVarKq;
        csiVarKq.rjo = csiVarKq;
        csiVarKq.rhi = csiVarKq;
        csi csiVar = this.kq;
        while (true) {
            csiVar = csiVar.rhi;
            if (csiVar == this.kq) {
                kqVar.oq = this.oq;
                return kqVar;
            }
            kqVar.kq.rjo.kq(csiVar.kq());
        }
    }

    public int hashCode() {
        csi csiVar = this.kq;
        if (csiVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = csiVar.bob;
            for (int i12 = csiVar.oq; i12 < i11; i12++) {
                i10 = (i10 * 31) + csiVar.kq[i12];
            }
            csiVar = csiVar.rhi;
        } while (csiVar != this.kq);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public boolean kq() {
        return this.oq == 0;
    }

    public byte oq() {
        long j10 = this.oq;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        csi csiVar = this.kq;
        int i10 = csiVar.oq;
        int i11 = csiVar.bob;
        int i12 = i10 + 1;
        byte b10 = csiVar.kq[i10];
        this.oq = j10 - 1;
        if (i12 != i11) {
            csiVar.oq = i12;
            return b10;
        }
        this.kq = csiVar.oq();
        rhi.kq(csiVar);
        return b10;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        csi csiVar = this.kq;
        if (csiVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), csiVar.bob - csiVar.oq);
        byteBuffer.put(csiVar.kq, csiVar.oq, iMin);
        int i10 = csiVar.oq + iMin;
        csiVar.oq = i10;
        this.oq -= (long) iMin;
        if (i10 == csiVar.bob) {
            this.kq = csiVar.oq();
            rhi.kq(csiVar);
        }
        return iMin;
    }

    public String toString() {
        return csi().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            csi csiVarBob = bob(1);
            int iMin = Math.min(i10, 8192 - csiVarBob.bob);
            byteBuffer.get(csiVarBob.kq, csiVarBob.bob, iMin);
            i10 -= iMin;
            csiVarBob.bob += iMin;
        }
        this.oq += (long) iRemaining;
        return iRemaining;
    }

    public String kq(long j10, Charset charset) {
        dgq.kq(this.oq, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
        }
        if (j10 == 0) {
            return "";
        }
        csi csiVar = this.kq;
        int i10 = csiVar.oq;
        if (((long) i10) + j10 > csiVar.bob) {
            return new String(kq(j10), charset);
        }
        String str = new String(csiVar.kq, i10, (int) j10, charset);
        int i11 = (int) (((long) csiVar.oq) + j10);
        csiVar.oq = i11;
        this.oq -= j10;
        if (i11 == csiVar.bob) {
            this.kq = csiVar.oq();
            rhi.kq(csiVar);
        }
        return str;
    }

    csi bob(int i10) {
        if (i10 > 0 && i10 <= 8192) {
            csi csiVar = this.kq;
            if (csiVar == null) {
                csi csiVarKq = rhi.kq();
                this.kq = csiVarKq;
                csiVarKq.rjo = csiVarKq;
                csiVarKq.rhi = csiVarKq;
                return csiVarKq;
            }
            csi csiVar2 = csiVar.rjo;
            return (csiVar2.bob + i10 > 8192 || !csiVar2.csi) ? csiVar2.kq(rhi.kq()) : csiVar2;
        }
        throw new IllegalArgumentException();
    }

    public final fou fou(int i10) {
        if (i10 == 0) {
            return fou.bob;
        }
        return new rjo(this, i10);
    }

    public kq oq(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            dgq.kq(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                csi csiVarBob = bob(1);
                int iMin = Math.min(i12 - i10, 8192 - csiVarBob.bob);
                System.arraycopy(bArr, i10, csiVarBob.kq, csiVarBob.bob, iMin);
                i10 += iMin;
                csiVarBob.bob += iMin;
            }
            this.oq += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] kq(long j10) throws EOFException {
        dgq.kq(this.oq, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            kq(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
    }

    public void kq(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int iKq = kq(bArr, i10, bArr.length - i10);
            if (iKq == -1) {
                throw new EOFException();
            }
            i10 += iKq;
        }
    }

    public kq oq(int i10) {
        csi csiVarBob = bob(1);
        byte[] bArr = csiVarBob.kq;
        int i11 = csiVarBob.bob;
        csiVarBob.bob = i11 + 1;
        bArr[i11] = (byte) i10;
        this.oq++;
        return this;
    }

    public int kq(byte[] bArr, int i10, int i11) {
        dgq.kq(bArr.length, i10, i11);
        csi csiVar = this.kq;
        if (csiVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, csiVar.bob - csiVar.oq);
        System.arraycopy(csiVar.kq, csiVar.oq, bArr, i10, iMin);
        int i12 = csiVar.oq + iMin;
        csiVar.oq = i12;
        this.oq -= (long) iMin;
        if (i12 == csiVar.bob) {
            this.kq = csiVar.oq();
            rhi.kq(csiVar);
        }
        return iMin;
    }

    public kq oq(long j10) {
        if (j10 == 0) {
            return oq(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        csi csiVarBob = bob(iNumberOfTrailingZeros);
        byte[] bArr = csiVarBob.kq;
        int i10 = csiVarBob.bob;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = bob[(int) (15 & j10)];
            j10 >>>= 4;
        }
        csiVarBob.bob += iNumberOfTrailingZeros;
        this.oq += (long) iNumberOfTrailingZeros;
        return this;
    }

    public kq kq(String str) {
        return kq(str, 0, str.length());
    }

    public kq kq(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    csi csiVarBob = bob(1);
                    byte[] bArr = csiVarBob.kq;
                    int i12 = csiVarBob.bob - i10;
                    int iMin = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) cCharAt;
                    }
                    int i14 = csiVarBob.bob;
                    int i15 = (i12 + i10) - i14;
                    csiVarBob.bob = i14 + i15;
                    this.oq += (long) i15;
                } else {
                    if (cCharAt2 < 2048) {
                        oq((cCharAt2 >> 6) | 192);
                        oq((cCharAt2 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            oq((i17 >> 18) | 240);
                            oq(((i17 >> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                            oq(((i17 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                            oq((i17 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                            i10 += 2;
                        } else {
                            oq(63);
                            i10 = i16;
                        }
                    } else {
                        oq((cCharAt2 >> '\f') | 224);
                        oq(((cCharAt2 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        oq((cCharAt2 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    public kq kq(int i10) {
        if (i10 < 128) {
            oq(i10);
            return this;
        }
        if (i10 < 2048) {
            oq((i10 >> 6) | 192);
            oq((i10 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            return this;
        }
        if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                oq(63);
                return this;
            }
            oq((i10 >> 12) | 224);
            oq(((i10 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            oq((i10 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            return this;
        }
        if (i10 <= 1114111) {
            oq((i10 >> 18) | 240);
            oq(((i10 >> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            oq(((i10 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            oq((i10 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
    }

    public kq kq(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            if (charset != null) {
                if (charset.equals(dgq.kq)) {
                    return kq(str, i10, i11);
                }
                byte[] bytes = str.substring(i10, i11).getBytes(charset);
                return oq(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }
}

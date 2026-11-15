package r9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: r9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7105h implements InterfaceC7107j, InterfaceC7106i, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X f48456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f48457b;

    /* JADX INFO: renamed from: r9.h$a */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C7105h f48458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f48459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private X f48460c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f48462e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f48461d = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f48463f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f48464g = -1;

        public final X a() {
            return this.f48460c;
        }

        public final int c() {
            long j10 = this.f48461d;
            C7105h c7105h = this.f48458a;
            Intrinsics.c(c7105h);
            if (j10 == c7105h.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.f48461d;
            return j(j11 == -1 ? 0L : j11 + ((long) (this.f48464g - this.f48463f)));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f48458a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f48458a = null;
            n(null);
            this.f48461d = -1L;
            this.f48462e = null;
            this.f48463f = -1;
            this.f48464g = -1;
        }

        public final long h(long j10) {
            C7105h c7105h = this.f48458a;
            if (c7105h == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f48459b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = c7105h.size();
            if (j10 <= size) {
                if (j10 < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                }
                long j11 = size - j10;
                while (j11 > 0) {
                    X x10 = c7105h.f48456a;
                    Intrinsics.c(x10);
                    X x11 = x10.f48415g;
                    Intrinsics.c(x11);
                    int i10 = x11.f48411c;
                    long j12 = i10 - x11.f48410b;
                    if (j12 > j11) {
                        x11.f48411c = i10 - ((int) j11);
                        break;
                    }
                    c7105h.f48456a = x11.b();
                    Y.b(x11);
                    j11 -= j12;
                }
                n(null);
                this.f48461d = j10;
                this.f48462e = null;
                this.f48463f = -1;
                this.f48464g = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z9 = true;
                while (j13 > 0) {
                    X xQ1 = c7105h.q1(1);
                    int iMin = (int) Math.min(j13, 8192 - xQ1.f48411c);
                    xQ1.f48411c += iMin;
                    j13 -= (long) iMin;
                    if (z9) {
                        n(xQ1);
                        this.f48461d = size;
                        this.f48462e = xQ1.f48409a;
                        int i11 = xQ1.f48411c;
                        this.f48463f = i11 - iMin;
                        this.f48464g = i11;
                        z9 = false;
                    }
                }
            }
            c7105h.n1(j10);
            return size;
        }

        public final int j(long j10) {
            X xC;
            C7105h c7105h = this.f48458a;
            if (c7105h == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j10 < -1 || j10 > c7105h.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + c7105h.size());
            }
            if (j10 == -1 || j10 == c7105h.size()) {
                n(null);
                this.f48461d = j10;
                this.f48462e = null;
                this.f48463f = -1;
                this.f48464g = -1;
                return -1;
            }
            long size = c7105h.size();
            X xA = c7105h.f48456a;
            long j11 = 0;
            if (a() != null) {
                long j12 = this.f48461d;
                int i10 = this.f48463f;
                X xA2 = a();
                Intrinsics.c(xA2);
                long j13 = j12 - ((long) (i10 - xA2.f48410b));
                if (j13 > j10) {
                    xC = xA;
                    xA = a();
                    size = j13;
                } else {
                    xC = a();
                    j11 = j13;
                }
            } else {
                xC = xA;
            }
            if (size - j10 > j10 - j11) {
                while (true) {
                    Intrinsics.c(xC);
                    int i11 = xC.f48411c;
                    int i12 = xC.f48410b;
                    if (j10 < ((long) (i11 - i12)) + j11) {
                        break;
                    }
                    j11 += (long) (i11 - i12);
                    xC = xC.f48414f;
                }
            } else {
                while (size > j10) {
                    Intrinsics.c(xA);
                    xA = xA.f48415g;
                    Intrinsics.c(xA);
                    size -= (long) (xA.f48411c - xA.f48410b);
                }
                j11 = size;
                xC = xA;
            }
            if (this.f48459b) {
                Intrinsics.c(xC);
                if (xC.f48412d) {
                    X xF = xC.f();
                    if (c7105h.f48456a == xC) {
                        c7105h.f48456a = xF;
                    }
                    xC = xC.c(xF);
                    X x10 = xC.f48415g;
                    Intrinsics.c(x10);
                    x10.b();
                }
            }
            n(xC);
            this.f48461d = j10;
            Intrinsics.c(xC);
            this.f48462e = xC.f48409a;
            int i13 = xC.f48410b + ((int) (j10 - j11));
            this.f48463f = i13;
            int i14 = xC.f48411c;
            this.f48464g = i14;
            return i14 - i13;
        }

        public final void n(X x10) {
            this.f48460c = x10;
        }
    }

    /* JADX INFO: renamed from: r9.h$c */
    public static final class c extends OutputStream {
        c() {
        }

        public String toString() {
            return C7105h.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            C7105h.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            C7105h.this.write(data, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public static /* synthetic */ a g1(C7105h c7105h, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = AbstractC7102e.d();
        }
        return c7105h.V0(aVar);
    }

    @Override // r9.InterfaceC7107j
    public String A(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jY = y((byte) 10, 0L, j11);
        if (jY != -1) {
            return s9.a.d(this, jY);
        }
        if (j11 < size() && V(j11 - 1) == 13 && V(j11) == 10) {
            return s9.a.d(this, j11);
        }
        C7105h c7105h = new C7105h();
        G(c7105h, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + c7105h.l1().n() + (char) 8230);
    }

    public C7105h A1(String string, int i10, int i11, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (Intrinsics.b(charset, Charsets.UTF_8)) {
            return C1(string, i10, i11);
        }
        String strSubstring = string.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // r9.InterfaceC7106i
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public C7105h I(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return C1(string, 0, string.length());
    }

    public C7105h C1(String string, int i10, int i11) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                X xQ1 = q1(1);
                byte[] bArr = xQ1.f48409a;
                int i12 = xQ1.f48411c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = xQ1.f48411c;
                int i15 = (i12 + i10) - i14;
                xQ1.f48411c = i14 + i15;
                n1(size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    X xQ2 = q1(2);
                    byte[] bArr2 = xQ2.f48409a;
                    int i16 = xQ2.f48411c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    xQ2.f48411c = i16 + 2;
                    n1(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    X xQ3 = q1(3);
                    byte[] bArr3 = xQ3.f48409a;
                    int i17 = xQ3.f48411c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    xQ3.f48411c = i17 + 3;
                    n1(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        X xQ4 = q1(4);
                        byte[] bArr4 = xQ4.f48409a;
                        int i20 = xQ4.f48411c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        xQ4.f48411c = i20 + 4;
                        n1(size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    public C7105h D1(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            X xQ1 = q1(2);
            byte[] bArr = xQ1.f48409a;
            int i11 = xQ1.f48411c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            xQ1.f48411c = i11 + 2;
            n1(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            X xQ2 = q1(3);
            byte[] bArr2 = xQ2.f48409a;
            int i12 = xQ2.f48411c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            xQ2.f48411c = i12 + 3;
            n1(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC7102e.l(i10));
        }
        X xQ3 = q1(4);
        byte[] bArr3 = xQ3.f48409a;
        int i13 = xQ3.f48411c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        xQ3.f48411c = i13 + 4;
        n1(size() + 4);
        return this;
    }

    public final C7105h G(C7105h out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j12 = j10;
        AbstractC7102e.b(size(), j12, j11);
        if (j11 != 0) {
            out.n1(out.size() + j11);
            X x10 = this.f48456a;
            while (true) {
                Intrinsics.c(x10);
                int i10 = x10.f48411c;
                int i11 = x10.f48410b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                x10 = x10.f48414f;
            }
            X x11 = x10;
            long j13 = j11;
            while (j13 > 0) {
                Intrinsics.c(x11);
                X xD = x11.d();
                int i12 = xD.f48410b + ((int) j12);
                xD.f48410b = i12;
                xD.f48411c = Math.min(i12 + ((int) j13), xD.f48411c);
                X x12 = out.f48456a;
                if (x12 == null) {
                    xD.f48415g = xD;
                    xD.f48414f = xD;
                    out.f48456a = xD;
                } else {
                    Intrinsics.c(x12);
                    X x13 = x12.f48415g;
                    Intrinsics.c(x13);
                    x13.c(xD);
                }
                j13 -= (long) (xD.f48411c - xD.f48410b);
                x11 = x11.f48414f;
                j12 = 0;
            }
        }
        return this;
    }

    public long I0(C7108k targetBytes, long j10) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        X x10 = this.f48456a;
        if (x10 == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                x10 = x10.f48415g;
                Intrinsics.c(x10);
                size -= (long) (x10.f48411c - x10.f48410b);
            }
            if (targetBytes.E() == 2) {
                byte bI = targetBytes.i(0);
                byte bI2 = targetBytes.i(1);
                while (size < size()) {
                    byte[] bArr = x10.f48409a;
                    i10 = (int) ((((long) x10.f48410b) + j10) - size);
                    int i12 = x10.f48411c;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (x10.f48411c - x10.f48410b);
                            x10 = x10.f48414f;
                            Intrinsics.c(x10);
                            j10 = size;
                        } else {
                            byte b10 = bArr[i10];
                            if (b10 == bI || b10 == bI2) {
                                i11 = x10.f48410b;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrR = targetBytes.r();
                while (size < size()) {
                    byte[] bArr2 = x10.f48409a;
                    i10 = (int) ((((long) x10.f48410b) + j10) - size);
                    int i13 = x10.f48411c;
                    while (true) {
                        if (i10 < i13) {
                            byte b11 = bArr2[i10];
                            int length = bArrR.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b11 == bArrR[i14]) {
                                    i11 = x10.f48410b;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            size += (long) (x10.f48411c - x10.f48410b);
                            x10 = x10.f48414f;
                            Intrinsics.c(x10);
                            j10 = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (x10.f48411c - x10.f48410b)) + size;
            if (j11 > j10) {
                break;
            }
            x10 = x10.f48414f;
            Intrinsics.c(x10);
            size = j11;
        }
        if (targetBytes.E() == 2) {
            byte bI3 = targetBytes.i(0);
            byte bI4 = targetBytes.i(1);
            while (size < size()) {
                byte[] bArr3 = x10.f48409a;
                i10 = (int) ((((long) x10.f48410b) + j10) - size);
                int i15 = x10.f48411c;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (x10.f48411c - x10.f48410b);
                        x10 = x10.f48414f;
                        Intrinsics.c(x10);
                        j10 = size;
                    } else {
                        byte b12 = bArr3[i10];
                        if (b12 == bI3 || b12 == bI4) {
                            i11 = x10.f48410b;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrR2 = targetBytes.r();
            while (size < size()) {
                byte[] bArr4 = x10.f48409a;
                i10 = (int) ((((long) x10.f48410b) + j10) - size);
                int i16 = x10.f48411c;
                while (true) {
                    if (i10 < i16) {
                        byte b13 = bArr4[i10];
                        int length2 = bArrR2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b13 == bArrR2[i17]) {
                                i11 = x10.f48410b;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        size += (long) (x10.f48411c - x10.f48410b);
                        x10 = x10.f48414f;
                        Intrinsics.c(x10);
                        j10 = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    @Override // r9.InterfaceC7107j
    public String L0(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return m1(this.f48457b, charset);
    }

    @Override // r9.InterfaceC7107j
    public void O(C7105h sink, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (size() >= j10) {
            sink.W0(this, j10);
        } else {
            sink.W0(this, size());
            throw new EOFException();
        }
    }

    @Override // r9.InterfaceC7107j
    public boolean P(long j10) {
        return this.f48457b >= j10;
    }

    public boolean R0(long j10, C7108k bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || size() - j10 < i11 || bytes.E() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (V(((long) i12) + j10) != bytes.i(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // r9.InterfaceC7107j
    public String U() {
        return A(Long.MAX_VALUE);
    }

    @Override // r9.InterfaceC7107j
    public int U0() {
        return AbstractC7102e.h(readInt());
    }

    public final byte V(long j10) {
        AbstractC7102e.b(size(), j10, 1L);
        X x10 = this.f48456a;
        if (x10 == null) {
            Intrinsics.c(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                x10 = x10.f48415g;
                Intrinsics.c(x10);
                size -= (long) (x10.f48411c - x10.f48410b);
            }
            Intrinsics.c(x10);
            return x10.f48409a[(int) ((((long) x10.f48410b) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (x10.f48411c - x10.f48410b)) + j11;
            if (j12 > j10) {
                Intrinsics.c(x10);
                return x10.f48409a[(int) ((((long) x10.f48410b) + j10) - j11)];
            }
            x10 = x10.f48414f;
            Intrinsics.c(x10);
            j11 = j12;
        }
    }

    public final a V0(a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return s9.a.a(this, unsafeCursor);
    }

    public long W(C7108k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return X(bytes, 0L);
    }

    @Override // r9.a0
    public void W0(C7105h source, long j10) {
        X x10;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC7102e.b(source.size(), 0L, j10);
        while (j10 > 0) {
            X x11 = source.f48456a;
            Intrinsics.c(x11);
            int i10 = x11.f48411c;
            X x12 = source.f48456a;
            Intrinsics.c(x12);
            if (j10 < i10 - x12.f48410b) {
                X x13 = this.f48456a;
                if (x13 != null) {
                    Intrinsics.c(x13);
                    x10 = x13.f48415g;
                } else {
                    x10 = null;
                }
                if (x10 != null && x10.f48413e) {
                    if ((((long) x10.f48411c) + j10) - ((long) (x10.f48412d ? 0 : x10.f48410b)) <= 8192) {
                        X x14 = source.f48456a;
                        Intrinsics.c(x14);
                        x14.g(x10, (int) j10);
                        source.n1(source.size() - j10);
                        n1(size() + j10);
                        return;
                    }
                }
                X x15 = source.f48456a;
                Intrinsics.c(x15);
                source.f48456a = x15.e((int) j10);
            }
            X x16 = source.f48456a;
            Intrinsics.c(x16);
            long j11 = x16.f48411c - x16.f48410b;
            source.f48456a = x16.b();
            X x17 = this.f48456a;
            if (x17 == null) {
                this.f48456a = x16;
                x16.f48415g = x16;
                x16.f48414f = x16;
            } else {
                Intrinsics.c(x17);
                X x18 = x17.f48415g;
                Intrinsics.c(x18);
                x18.c(x16).a();
            }
            source.n1(source.size() - j11);
            n1(size() + j11);
            j10 -= j11;
        }
    }

    public long X(C7108k bytes, long j10) {
        int i10;
        long j11 = j10;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.E() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        X x10 = this.f48456a;
        if (x10 == null) {
            return -1L;
        }
        if (size() - j11 >= j11) {
            while (true) {
                long j12 = ((long) (x10.f48411c - x10.f48410b)) + size;
                if (j12 > j11) {
                    break;
                }
                x10 = x10.f48414f;
                Intrinsics.c(x10);
                size = j12;
            }
            byte[] bArrR = bytes.r();
            byte b10 = bArrR[0];
            int iE = bytes.E();
            long size2 = (size() - ((long) iE)) + 1;
            while (size < size2) {
                byte[] bArr = x10.f48409a;
                int iMin = (int) Math.min(x10.f48411c, (((long) x10.f48410b) + size2) - size);
                i10 = (int) ((((long) x10.f48410b) + j11) - size);
                while (i10 < iMin) {
                    if (bArr[i10] == b10 && s9.a.c(x10, i10 + 1, bArrR, 1, iE)) {
                    }
                    i10++;
                }
                size += (long) (x10.f48411c - x10.f48410b);
                x10 = x10.f48414f;
                Intrinsics.c(x10);
                j11 = size;
            }
            return -1L;
        }
        size = size();
        while (size > j11) {
            x10 = x10.f48415g;
            Intrinsics.c(x10);
            size -= (long) (x10.f48411c - x10.f48410b);
        }
        byte[] bArrR2 = bytes.r();
        byte b11 = bArrR2[0];
        int iE2 = bytes.E();
        long size3 = (size() - ((long) iE2)) + 1;
        while (size < size3) {
            byte[] bArr2 = x10.f48409a;
            long j13 = size3;
            int iMin2 = (int) Math.min(x10.f48411c, (((long) x10.f48410b) + size3) - size);
            i10 = (int) ((((long) x10.f48410b) + j11) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b11 || !s9.a.c(x10, i10 + 1, bArrR2, 1, iE2)) {
                    i10++;
                }
            }
            size += (long) (x10.f48411c - x10.f48410b);
            x10 = x10.f48414f;
            Intrinsics.c(x10);
            j11 = size;
            size3 = j13;
        }
        return -1L;
        return ((long) (i10 - x10.f48410b)) + size;
    }

    @Override // r9.InterfaceC7107j
    public String Y0() {
        return m1(this.f48457b, Charsets.UTF_8);
    }

    @Override // r9.InterfaceC7107j
    public byte[] Z(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    public long a0(C7108k targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return I0(targetBytes, 0L);
    }

    @Override // r9.InterfaceC7107j
    public short b0() {
        return AbstractC7102e.j(readShort());
    }

    public final long c() {
        return this.f48457b;
    }

    @Override // r9.InterfaceC7107j
    public int c0(P options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iF = s9.a.f(this, options, false, 2, null);
        if (iF == -1) {
            return -1;
        }
        skip(options.j()[iF].E());
        return iF;
    }

    @Override // r9.InterfaceC7107j
    public long d0() {
        return AbstractC7102e.i(readLong());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7105h)) {
            return false;
        }
        C7105h c7105h = (C7105h) obj;
        if (size() != c7105h.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        X x10 = this.f48456a;
        Intrinsics.c(x10);
        X x11 = c7105h.f48456a;
        Intrinsics.c(x11);
        int i10 = x10.f48410b;
        int i11 = x11.f48410b;
        long j10 = 0;
        while (j10 < size()) {
            long jMin = Math.min(x10.f48411c - i10, x11.f48411c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (x10.f48409a[i10] != x11.f48409a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == x10.f48411c) {
                x10 = x10.f48414f;
                Intrinsics.c(x10);
                i10 = x10.f48410b;
            }
            if (i11 == x11.f48411c) {
                x11 = x11.f48414f;
                Intrinsics.c(x11);
                i11 = x11.f48410b;
            }
            j10 += jMin;
        }
        return true;
    }

    public final void h() throws EOFException {
        skip(size());
    }

    @Override // r9.InterfaceC7106i
    public OutputStream h1() {
        return new c();
    }

    public int hashCode() {
        X x10 = this.f48456a;
        if (x10 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = x10.f48411c;
            for (int i12 = x10.f48410b; i12 < i11; i12++) {
                i10 = (i10 * 31) + x10.f48409a[i12];
            }
            x10 = x10.f48414f;
            Intrinsics.c(x10);
        } while (x10 != this.f48456a);
        return i10;
    }

    @Override // r9.c0
    public d0 i() {
        return d0.f48431e;
    }

    @Override // r9.InterfaceC7107j
    public void i0(long j10) throws EOFException {
        if (this.f48457b < j10) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // r9.InterfaceC7107j
    public long j1() throws EOFException {
        int i10;
        if (size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z9 = false;
        long j10 = 0;
        do {
            X x10 = this.f48456a;
            Intrinsics.c(x10);
            byte[] bArr = x10.f48409a;
            int i12 = x10.f48410b;
            int i13 = x10.f48411c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z9 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + AbstractC7102e.k(b10));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new C7105h().N0(j10).writeByte(b10).Y0());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f48456a = x10.b();
                Y.b(x10);
            } else {
                x10.f48410b = i12;
            }
            if (z9) {
                break;
            }
        } while (this.f48456a != null);
        n1(size() - ((long) i11));
        return j10;
    }

    @Override // r9.InterfaceC7107j
    public InputStream k1() {
        return new b();
    }

    public C7108k l1() {
        return q0(size());
    }

    @Override // r9.InterfaceC7107j
    public boolean m0(long j10, C7108k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return R0(j10, bytes, 0, bytes.E());
    }

    public String m1(long j10, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f48457b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        X x10 = this.f48456a;
        Intrinsics.c(x10);
        int i10 = x10.f48410b;
        if (((long) i10) + j10 > x10.f48411c) {
            return new String(Z(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(x10.f48409a, i10, i11, charset);
        int i12 = x10.f48410b + i11;
        x10.f48410b = i12;
        this.f48457b -= j10;
        if (i12 == x10.f48411c) {
            this.f48456a = x10.b();
            Y.b(x10);
        }
        return str;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C7105h clone() {
        return x();
    }

    public final void n1(long j10) {
        this.f48457b = j10;
    }

    @Override // r9.InterfaceC7107j
    public String o0(long j10) throws EOFException {
        return m1(j10, Charsets.UTF_8);
    }

    public final C7108k o1() {
        if (size() <= 2147483647L) {
            return p1((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final C7108k p1(int i10) {
        if (i10 == 0) {
            return C7108k.f48468e;
        }
        AbstractC7102e.b(size(), 0L, i10);
        X x10 = this.f48456a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Intrinsics.c(x10);
            int i14 = x10.f48411c;
            int i15 = x10.f48410b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            x10 = x10.f48414f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        X x11 = this.f48456a;
        int i16 = 0;
        while (i11 < i10) {
            Intrinsics.c(x11);
            bArr[i16] = x11.f48409a;
            i11 += x11.f48411c - x11.f48410b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = x11.f48410b;
            x11.f48412d = true;
            i16++;
            x11 = x11.f48414f;
        }
        return new Z(bArr, iArr);
    }

    @Override // r9.InterfaceC7107j
    public InterfaceC7107j peek() {
        return L.d(new U(this));
    }

    @Override // r9.InterfaceC7107j
    public C7108k q0(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new C7108k(Z(j10));
        }
        C7108k c7108kP1 = p1((int) j10);
        skip(j10);
        return c7108kP1;
    }

    public final X q1(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        X x10 = this.f48456a;
        if (x10 != null) {
            Intrinsics.c(x10);
            X x11 = x10.f48415g;
            Intrinsics.c(x11);
            return (x11.f48411c + i10 > 8192 || !x11.f48413e) ? x11.c(Y.c()) : x11;
        }
        X xC = Y.c();
        this.f48456a = xC;
        xC.f48415g = xC;
        xC.f48414f = xC;
        return xC;
    }

    @Override // r9.InterfaceC7106i
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public C7105h F(C7108k byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.L(this, 0, byteString.E());
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        X x10 = this.f48456a;
        if (x10 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), x10.f48411c - x10.f48410b);
        sink.put(x10.f48409a, x10.f48410b, iMin);
        int i10 = x10.f48410b + iMin;
        x10.f48410b = i10;
        this.f48457b -= (long) iMin;
        if (i10 == x10.f48411c) {
            this.f48456a = x10.b();
            Y.b(x10);
        }
        return iMin;
    }

    @Override // r9.InterfaceC7107j
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        X x10 = this.f48456a;
        Intrinsics.c(x10);
        int i10 = x10.f48410b;
        int i11 = x10.f48411c;
        int i12 = i10 + 1;
        byte b10 = x10.f48409a[i10];
        n1(size() - 1);
        if (i12 != i11) {
            x10.f48410b = i12;
            return b10;
        }
        this.f48456a = x10.b();
        Y.b(x10);
        return b10;
    }

    @Override // r9.InterfaceC7107j
    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // r9.InterfaceC7107j
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        X x10 = this.f48456a;
        Intrinsics.c(x10);
        int i10 = x10.f48410b;
        int i11 = x10.f48411c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = x10.f48409a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        n1(size() - 4);
        if (i14 != i11) {
            x10.f48410b = i14;
            return i15;
        }
        this.f48456a = x10.b();
        Y.b(x10);
        return i15;
    }

    @Override // r9.InterfaceC7107j
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        X x10 = this.f48456a;
        Intrinsics.c(x10);
        int i10 = x10.f48410b;
        int i11 = x10.f48411c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = x10.f48409a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        n1(size() - 8);
        if (i13 != i11) {
            x10.f48410b = i13;
            return j11;
        }
        this.f48456a = x10.b();
        Y.b(x10);
        return j11;
    }

    @Override // r9.InterfaceC7107j
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        X x10 = this.f48456a;
        Intrinsics.c(x10);
        int i10 = x10.f48410b;
        int i11 = x10.f48411c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = x10.f48409a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        n1(size() - 2);
        if (i14 == i11) {
            this.f48456a = x10.b();
            Y.b(x10);
        } else {
            x10.f48410b = i14;
        }
        return (short) i15;
    }

    @Override // r9.c0
    public long s(C7105h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.W0(this, j10);
        return j10;
    }

    @Override // r9.InterfaceC7107j
    public long s0(a0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.W0(this, size);
        }
        return size;
    }

    @Override // r9.InterfaceC7106i
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public C7105h write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    public final long size() {
        return this.f48457b;
    }

    @Override // r9.InterfaceC7107j
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            X x10 = this.f48456a;
            if (x10 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, x10.f48411c - x10.f48410b);
            long j11 = iMin;
            n1(size() - j11);
            j10 -= j11;
            int i10 = x10.f48410b + iMin;
            x10.f48410b = i10;
            if (i10 == x10.f48411c) {
                this.f48456a = x10.b();
                Y.b(x10);
            }
        }
    }

    @Override // r9.InterfaceC7106i
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public C7105h write(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = i11;
        AbstractC7102e.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            X xQ1 = q1(1);
            int iMin = Math.min(i12 - i10, 8192 - xQ1.f48411c);
            int i13 = i10 + iMin;
            AbstractC7024j.e(source, xQ1.f48409a, xQ1.f48411c, i10, i13);
            xQ1.f48411c += iMin;
            i10 = i13;
        }
        n1(size() + j10);
        return this;
    }

    public String toString() {
        return o1().toString();
    }

    @Override // r9.InterfaceC7107j
    public byte[] u0() {
        return Z(size());
    }

    @Override // r9.InterfaceC7106i
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public C7105h writeByte(int i10) {
        X xQ1 = q1(1);
        byte[] bArr = xQ1.f48409a;
        int i11 = xQ1.f48411c;
        xQ1.f48411c = i11 + 1;
        bArr[i11] = (byte) i10;
        n1(size() + 1);
        return this;
    }

    @Override // r9.InterfaceC7106i
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public C7105h k0(long j10) {
        boolean z9;
        if (j10 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return I("-9223372036854775808");
            }
            z9 = true;
        } else {
            z9 = false;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 >= 100) {
                    i10 = j10 < 1000 ? 3 : 4;
                } else if (j10 >= 10) {
                    i10 = 2;
                }
            } else if (j10 < 1000000) {
                i10 = j10 < 100000 ? 5 : 6;
            } else {
                i10 = j10 < 10000000 ? 7 : 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < 10000000000L) {
                i10 = j10 < 1000000000 ? 9 : 10;
            } else {
                i10 = j10 < 100000000000L ? 11 : 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = j10 < 100000000000000L ? 14 : 15;
            }
        } else if (j10 < 100000000000000000L) {
            i10 = j10 < 10000000000000000L ? 16 : 17;
        } else {
            i10 = j10 < 1000000000000000000L ? 18 : 19;
        }
        if (z9) {
            i10++;
        }
        X xQ1 = q1(i10);
        byte[] bArr = xQ1.f48409a;
        int i11 = xQ1.f48411c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = s9.a.b()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z9) {
            bArr[i11 - 1] = 45;
        }
        xQ1.f48411c += i10;
        n1(size() + ((long) i10));
        return this;
    }

    public final long w() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        X x10 = this.f48456a;
        Intrinsics.c(x10);
        X x11 = x10.f48415g;
        Intrinsics.c(x11);
        int i10 = x11.f48411c;
        return (i10 >= 8192 || !x11.f48413e) ? size : size - ((long) (i10 - x11.f48410b));
    }

    @Override // r9.InterfaceC7106i
    public long w0(c0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long jS = source.s(this, 8192L);
            if (jS == -1) {
                return j10;
            }
            j10 += jS;
        }
    }

    @Override // r9.InterfaceC7106i
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public C7105h N0(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        X xQ1 = q1(i10);
        byte[] bArr = xQ1.f48409a;
        int i11 = xQ1.f48411c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = s9.a.b()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        xQ1.f48411c += i10;
        n1(size() + ((long) i10));
        return this;
    }

    public final C7105h x() {
        C7105h c7105h = new C7105h();
        if (size() == 0) {
            return c7105h;
        }
        X x10 = this.f48456a;
        Intrinsics.c(x10);
        X xD = x10.d();
        c7105h.f48456a = xD;
        xD.f48415g = xD;
        xD.f48414f = xD;
        for (X x11 = x10.f48414f; x11 != x10; x11 = x11.f48414f) {
            X x12 = xD.f48415g;
            Intrinsics.c(x12);
            Intrinsics.c(x11);
            x12.c(x11.d());
        }
        c7105h.n1(size());
        return c7105h;
    }

    @Override // r9.InterfaceC7107j
    public boolean x0() {
        return this.f48457b == 0;
    }

    @Override // r9.InterfaceC7106i
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C7105h writeInt(int i10) {
        X xQ1 = q1(4);
        byte[] bArr = xQ1.f48409a;
        int i11 = xQ1.f48411c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        xQ1.f48411c = i11 + 4;
        n1(size() + 4);
        return this;
    }

    @Override // r9.InterfaceC7107j
    public long y(byte b10, long j10, long j11) {
        X x10;
        int i10;
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (x10 = this.f48456a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                x10 = x10.f48415g;
                Intrinsics.c(x10);
                size -= (long) (x10.f48411c - x10.f48410b);
            }
            while (size < j11) {
                byte[] bArr = x10.f48409a;
                int iMin = (int) Math.min(x10.f48411c, (((long) x10.f48410b) + j11) - size);
                i10 = (int) ((((long) x10.f48410b) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (x10.f48411c - x10.f48410b);
                x10 = x10.f48414f;
                Intrinsics.c(x10);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (x10.f48411c - x10.f48410b)) + size;
            if (j12 > j10) {
                break;
            }
            x10 = x10.f48414f;
            Intrinsics.c(x10);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = x10.f48409a;
            int iMin2 = (int) Math.min(x10.f48411c, (((long) x10.f48410b) + j11) - size);
            i10 = (int) ((((long) x10.f48410b) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (x10.f48411c - x10.f48410b);
            x10 = x10.f48414f;
            Intrinsics.c(x10);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - x10.f48410b)) + size;
    }

    public C7105h y1(long j10) {
        X xQ1 = q1(8);
        byte[] bArr = xQ1.f48409a;
        int i10 = xQ1.f48411c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        xQ1.f48411c = i10 + 8;
        n1(size() + 8);
        return this;
    }

    @Override // r9.InterfaceC7107j
    public long z0() throws EOFException {
        long j10;
        byte b10;
        long j11 = 0;
        if (size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z9 = false;
        long j12 = 0;
        long j13 = -7;
        boolean z10 = false;
        loop0: while (true) {
            X x10 = this.f48456a;
            Intrinsics.c(x10);
            byte[] bArr = x10.f48409a;
            int i11 = x10.f48410b;
            int i12 = x10.f48411c;
            while (true) {
                if (i11 >= i12) {
                    j10 = j11;
                    break;
                }
                b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j12 < -922337203685477580L) {
                        break loop0;
                    }
                    j10 = j11;
                    if (j12 == -922337203685477580L && i13 < j13) {
                        break loop0;
                    }
                    j12 = (j12 * 10) + ((long) i13);
                } else {
                    j10 = j11;
                    if (b10 != 45 || i10 != 0) {
                        z10 = true;
                        break;
                    }
                    j13--;
                    z9 = true;
                }
                i11++;
                i10++;
                j11 = j10;
            }
            if (i11 == i12) {
                this.f48456a = x10.b();
                Y.b(x10);
            } else {
                x10.f48410b = i11;
            }
            if (z10 || this.f48456a == null) {
                n1(size() - ((long) i10));
                if (i10 >= (z9 ? 2 : 1)) {
                    return z9 ? j12 : -j12;
                }
                if (size() == j10) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z9 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + AbstractC7102e.k(V(j10)));
            }
            j11 = j10;
        }
        C7105h c7105hWriteByte = new C7105h().k0(j12).writeByte(b10);
        if (!z9) {
            c7105hWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + c7105hWriteByte.Y0());
    }

    @Override // r9.InterfaceC7106i
    /* JADX INFO: renamed from: z1, reason: merged with bridge method [inline-methods] */
    public C7105h writeShort(int i10) {
        X xQ1 = q1(2);
        byte[] bArr = xQ1.f48409a;
        int i11 = xQ1.f48411c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        xQ1.f48411c = i11 + 2;
        n1(size() + 2);
        return this;
    }

    /* JADX INFO: renamed from: r9.h$b */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C7105h.this.size(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C7105h.this.size() > 0) {
                return C7105h.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C7105h.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return C7105h.this.read(sink, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            X xQ1 = q1(1);
            int iMin = Math.min(i10, 8192 - xQ1.f48411c);
            source.get(xQ1.f48409a, xQ1.f48411c, iMin);
            i10 -= iMin;
            xQ1.f48411c += iMin;
        }
        this.f48457b += (long) iRemaining;
        return iRemaining;
    }

    public int read(byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        AbstractC7102e.b(sink.length, i10, i11);
        X x10 = this.f48456a;
        if (x10 == null) {
            return -1;
        }
        int iMin = Math.min(i11, x10.f48411c - x10.f48410b);
        byte[] bArr = x10.f48409a;
        int i12 = x10.f48410b;
        AbstractC7024j.e(bArr, sink, i10, i12, i12 + iMin);
        x10.f48410b += iMin;
        n1(size() - ((long) iMin));
        if (x10.f48410b == x10.f48411c) {
            this.f48456a = x10.b();
            Y.b(x10);
        }
        return iMin;
    }

    @Override // r9.InterfaceC7106i
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public C7105h q() {
        return this;
    }

    @Override // r9.InterfaceC7106i
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public C7105h z() {
        return this;
    }

    @Override // r9.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // r9.InterfaceC7106i, r9.a0, java.io.Flushable
    public void flush() {
    }

    @Override // r9.InterfaceC7107j
    public C7105h g() {
        return this;
    }
}

package com.google.protobuf;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: com.google.protobuf.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6747e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f41248a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f41249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f41250c;

    static {
        Class clsE = e("java.io.FileOutputStream");
        f41249b = clsE;
        f41250c = b(clsE);
    }

    private static byte[] a() {
        SoftReference softReference = (SoftReference) f41248a.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    private static long b(Class cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (V.J()) {
                return V.M(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static byte[] c(int i10) {
        int iMax = Math.max(i10, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        byte[] bArrA = a();
        if (bArrA != null && !d(iMax, bArrA.length)) {
            return bArrA;
        }
        byte[] bArr = new byte[iMax];
        if (iMax <= 16384) {
            f(bArr);
        }
        return bArr;
    }

    private static boolean d(int i10, int i11) {
        return i11 < i10 && ((float) i11) < ((float) i10) * 0.5f;
    }

    private static Class e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void f(byte[] bArr) {
        f41248a.set(new SoftReference(bArr));
    }

    static void g(ByteBuffer byteBuffer, OutputStream outputStream) {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!h(byteBuffer, outputStream)) {
                byte[] bArrC = c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = Math.min(byteBuffer.remaining(), bArrC.length);
                    byteBuffer.get(bArrC, 0, iMin);
                    outputStream.write(bArrC, 0, iMin);
                }
            }
        } finally {
            AbstractC6759q.d(byteBuffer, iPosition);
        }
    }

    private static boolean h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j10 = f41250c;
        if (j10 < 0 || !f41249b.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) V.H(outputStream, j10);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}

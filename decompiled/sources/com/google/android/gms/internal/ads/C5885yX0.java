package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5885yX0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f35369d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f35370e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f35371a = InterfaceC3046bz.f26964a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35373c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35372b = 2;

    private static final void c(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z9) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z9 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(AbstractC5935yw0.a(i11));
    }

    public final void a(C5741xO0 c5741xO0, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i10;
        ByteBuffer byteBuffer2 = c5741xO0.f34803d;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - c5741xO0.f34803d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f35372b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = c5741xO0.f34803d;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int i13 = i12 + 27 + i11;
        if (this.f35372b == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i13 += length + 44;
        } else {
            length = 0;
        }
        if (this.f35371a.capacity() < i13) {
            this.f35371a = ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f35371a.clear();
        }
        ByteBuffer byteBuffer4 = this.f35371a;
        if (this.f35372b == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i10 = 22;
                c(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(AbstractC5935yw0.a(length2));
                byteBuffer.put(bArr);
                int i14 = length2 + 28;
                byteBuffer.putInt(22, AbstractC4634ob0.g(byteBuffer.array(), byteBuffer.arrayOffset(), i14, 0));
                byteBuffer.position(i14);
            } else {
                byteBuffer = byteBuffer4;
                i10 = 22;
                byteBuffer.put(f35369d);
            }
            byteBuffer.put(f35370e);
        } else {
            byteBuffer = byteBuffer4;
            i10 = 22;
        }
        int iC = this.f35373c + AbstractC3809i2.c(byteBuffer3);
        this.f35373c = iC;
        int i15 = i10;
        ByteBuffer byteBuffer5 = byteBuffer;
        c(byteBuffer5, iC, this.f35372b, i12, false);
        for (int i16 = 0; i16 < i12; i16++) {
            if (i11 >= 255) {
                byteBuffer5.put((byte) -1);
                i11 -= 255;
            } else {
                byteBuffer5.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f35372b == 2) {
            byteBuffer5.putInt(length + 66, AbstractC4634ob0.g(byteBuffer5.array(), byteBuffer5.arrayOffset() + length + 44, byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i15, AbstractC4634ob0.g(byteBuffer5.array(), byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.f35372b++;
        this.f35371a = byteBuffer5;
        c5741xO0.a();
        c5741xO0.j(this.f35371a.remaining());
        c5741xO0.f34803d.put(this.f35371a);
        c5741xO0.l();
    }

    public final void b() {
        this.f35371a = InterfaceC3046bz.f26964a;
        this.f35373c = 0;
        this.f35372b = 2;
    }
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5741xO0 extends AbstractC2844aM0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JY0 f34801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VM0 f34802c = new VM0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f34803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f34805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f34806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f34807h;

    static {
        R4.b("media3.decoder");
    }

    public C5741xO0(int i10, int i11) {
        this.f34807h = i10;
    }

    private final ByteBuffer m(int i10) {
        int i11 = this.f34807h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f34803d;
        throw new WN0(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2844aM0
    public void a() {
        super.a();
        ByteBuffer byteBuffer = this.f34803d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f34806g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f34804e = false;
    }

    public final void j(int i10) {
        ByteBuffer byteBuffer = this.f34803d;
        if (byteBuffer == null) {
            this.f34803d = m(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f34803d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM = m(i11);
        byteBufferM.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM.put(byteBuffer);
        }
        this.f34803d = byteBufferM;
    }

    public final boolean k() {
        return i(1073741824);
    }

    public final void l() {
        ByteBuffer byteBuffer = this.f34803d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f34806g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}

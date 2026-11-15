package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC5861yL0 extends CL0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f35329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f35330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f35331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f35332g;

    AbstractC5861yL0(int i10) {
        super(null);
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.f35329d = bArr;
        this.f35330e = bArr.length;
    }

    final void C(byte b10) {
        byte[] bArr = this.f35329d;
        int i10 = this.f35331f;
        bArr[i10] = b10;
        this.f35331f = i10 + 1;
        this.f35332g++;
    }

    final void D(int i10) {
        if (!CL0.f17855b) {
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.f35329d;
                int i11 = this.f35331f;
                this.f35331f = i11 + 1;
                bArr[i11] = (byte) (i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                this.f35332g++;
                i10 >>>= 7;
            }
            byte[] bArr2 = this.f35329d;
            int i12 = this.f35331f;
            this.f35331f = i12 + 1;
            bArr2[i12] = (byte) i10;
            this.f35332g++;
            return;
        }
        long j10 = this.f35331f;
        while ((i10 & (-128)) != 0) {
            byte[] bArr3 = this.f35329d;
            int i13 = this.f35331f;
            this.f35331f = i13 + 1;
            AbstractC3726hN0.w(bArr3, i13, (byte) (i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
            i10 >>>= 7;
        }
        byte[] bArr4 = this.f35329d;
        int i14 = this.f35331f;
        this.f35331f = i14 + 1;
        AbstractC3726hN0.w(bArr4, i14, (byte) i10);
        this.f35332g += (int) (((long) this.f35331f) - j10);
    }

    final void E(long j10) {
        if (CL0.f17855b) {
            long j11 = this.f35331f;
            while (true) {
                int i10 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    byte[] bArr = this.f35329d;
                    int i11 = this.f35331f;
                    this.f35331f = i11 + 1;
                    AbstractC3726hN0.w(bArr, i11, (byte) i10);
                    this.f35332g += (int) (((long) this.f35331f) - j11);
                    return;
                }
                byte[] bArr2 = this.f35329d;
                int i12 = this.f35331f;
                this.f35331f = i12 + 1;
                AbstractC3726hN0.w(bArr2, i12, (byte) (i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                j10 >>>= 7;
            }
        } else {
            while (true) {
                int i13 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    byte[] bArr3 = this.f35329d;
                    int i14 = this.f35331f;
                    this.f35331f = i14 + 1;
                    bArr3[i14] = (byte) i13;
                    this.f35332g++;
                    return;
                }
                byte[] bArr4 = this.f35329d;
                int i15 = this.f35331f;
                this.f35331f = i15 + 1;
                bArr4[i15] = (byte) (i13 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                this.f35332g++;
                j10 >>>= 7;
            }
        }
    }

    final void F(int i10) {
        int i11 = this.f35331f;
        byte[] bArr = this.f35329d;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
        this.f35331f = i11 + 4;
        this.f35332g += 4;
    }

    final void G(long j10) {
        int i10 = this.f35331f;
        byte[] bArr = this.f35329d;
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
        bArr[i10 + 4] = (byte) (j10 >> 32);
        bArr[i10 + 5] = (byte) (j10 >> 40);
        bArr[i10 + 6] = (byte) (j10 >> 48);
        bArr[i10 + 7] = (byte) (j10 >> 56);
        this.f35331f = i10 + 8;
        this.f35332g += 8;
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final int l() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}

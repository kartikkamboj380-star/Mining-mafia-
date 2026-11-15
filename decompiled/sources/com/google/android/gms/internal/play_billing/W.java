package com.google.android.gms.internal.play_billing;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
final class W extends Z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f37145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37147f;

    W(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f37145d = bArr;
        this.f37147f = 0;
        this.f37146e = i11;
    }

    public final void A(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f37145d, this.f37147f, i11);
            this.f37147f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new X(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37147f), Integer.valueOf(this.f37146e), Integer.valueOf(i11)), e10);
        }
    }

    public final void B(String str) throws X {
        int i10 = this.f37147f;
        try {
            int iW = Z.w(str.length() * 3);
            int iW2 = Z.w(str.length());
            if (iW2 != iW) {
                q(M1.c(str));
                byte[] bArr = this.f37145d;
                int i11 = this.f37147f;
                this.f37147f = M1.b(str, bArr, i11, this.f37146e - i11);
                return;
            }
            int i12 = i10 + iW2;
            this.f37147f = i12;
            int iB = M1.b(str, this.f37145d, i12, this.f37146e - i12);
            this.f37147f = i10;
            q((iB - i10) - iW2);
            this.f37147f = iB;
        } catch (L1 e10) {
            this.f37147f = i10;
            a(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new X(e11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final int c() {
        return this.f37146e - this.f37147f;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void d(byte b10) throws X {
        try {
            byte[] bArr = this.f37145d;
            int i10 = this.f37147f;
            this.f37147f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new X(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37147f), Integer.valueOf(this.f37146e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void e(int i10, boolean z9) throws X {
        q(i10 << 3);
        d(z9 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void f(int i10, Q q10) {
        q((i10 << 3) | 2);
        q(q10.d());
        q10.j(this);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void g(int i10, int i11) throws X {
        q((i10 << 3) | 5);
        h(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void h(int i10) throws X {
        try {
            byte[] bArr = this.f37145d;
            int i11 = this.f37147f;
            int i12 = i11 + 1;
            this.f37147f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f37147f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f37147f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f37147f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new X(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37147f), Integer.valueOf(this.f37146e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void i(int i10, long j10) throws X {
        q((i10 << 3) | 1);
        j(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void j(long j10) throws X {
        try {
            byte[] bArr = this.f37145d;
            int i10 = this.f37147f;
            int i11 = i10 + 1;
            this.f37147f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f37147f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f37147f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f37147f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f37147f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f37147f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f37147f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f37147f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new X(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37147f), Integer.valueOf(this.f37146e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void k(int i10, int i11) throws X {
        q(i10 << 3);
        l(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void l(int i10) throws X {
        if (i10 >= 0) {
            q(i10);
        } else {
            s(i10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void m(byte[] bArr, int i10, int i11) {
        A(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void n(int i10, String str) throws X {
        q((i10 << 3) | 2);
        B(str);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void o(int i10, int i11) {
        q((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void p(int i10, int i11) {
        q(i10 << 3);
        q(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void q(int i10) {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f37145d;
                int i11 = this.f37147f;
                this.f37147f = i11 + 1;
                bArr[i11] = (byte) ((i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new X(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37147f), Integer.valueOf(this.f37146e), 1), e10);
            }
        }
        byte[] bArr2 = this.f37145d;
        int i12 = this.f37147f;
        this.f37147f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void r(int i10, long j10) throws X {
        q(i10 << 3);
        s(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final void s(long j10) throws X {
        if (!Z.f37169c || this.f37146e - this.f37147f < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f37145d;
                    int i10 = this.f37147f;
                    this.f37147f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new X(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37147f), Integer.valueOf(this.f37146e), 1), e10);
                }
            }
            byte[] bArr2 = this.f37145d;
            int i11 = this.f37147f;
            this.f37147f = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.f37145d;
                int i13 = this.f37147f;
                this.f37147f = i13 + 1;
                H1.s(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.f37145d;
            int i14 = this.f37147f;
            this.f37147f = i14 + 1;
            H1.s(bArr4, i14, (byte) ((i12 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255));
            j10 >>>= 7;
        }
    }
}

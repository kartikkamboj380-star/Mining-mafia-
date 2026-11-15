package com.google.android.gms.internal.measurement;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class N4 extends P4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f36420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f36421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36422g;

    N4(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f36420e = bArr;
        this.f36422g = 0;
        this.f36421f = i11;
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void A(long j10) throws O4 {
        int i10 = this.f36422g;
        try {
            byte[] bArr = this.f36420e;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f36422g = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new O4(i10, this.f36421f, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void B(byte[] bArr, int i10, int i11) {
        F(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void C(String str) throws O4 {
        int i10 = this.f36422g;
        try {
            int iE = P4.E(str.length() * 3);
            int iE2 = P4.E(str.length());
            if (iE2 != iE) {
                x(AbstractC6260l6.b(str));
                byte[] bArr = this.f36420e;
                int i11 = this.f36422g;
                this.f36422g = AbstractC6260l6.c(str, bArr, i11, this.f36421f - i11);
                return;
            }
            int i12 = i10 + iE2;
            this.f36422g = i12;
            int iC = AbstractC6260l6.c(str, this.f36420e, i12, this.f36421f - i12);
            this.f36422g = i10;
            x((iC - i10) - iE2);
            this.f36422g = iC;
        } catch (C6251k6 e10) {
            this.f36422g = i10;
            f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new O4(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final int D() {
        return this.f36421f - this.f36422g;
    }

    public final void F(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f36420e, this.f36422g, i11);
            this.f36422g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new O4(this.f36422g, this.f36421f, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void i(int i10, int i11) throws O4 {
        x((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void j(int i10, int i11) throws O4 {
        x(i10 << 3);
        w(i11);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void k(int i10, int i11) throws O4 {
        x(i10 << 3);
        x(i11);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void l(int i10, int i11) throws O4 {
        x((i10 << 3) | 5);
        y(i11);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void m(int i10, long j10) throws O4 {
        x(i10 << 3);
        z(j10);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void n(int i10, long j10) throws O4 {
        x((i10 << 3) | 1);
        A(j10);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void o(int i10, boolean z9) throws O4 {
        x(i10 << 3);
        v(z9 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void p(int i10, String str) throws O4 {
        x((i10 << 3) | 2);
        C(str);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void q(int i10, K4 k10) throws O4 {
        x((i10 << 3) | 2);
        r(k10);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void r(K4 k10) throws O4 {
        x(k10.d());
        k10.g(this);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void s(byte[] bArr, int i10, int i11) throws O4 {
        x(i11);
        F(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    final void t(int i10, F5 f10, Q5 q10) throws O4 {
        x((i10 << 3) | 2);
        x(((AbstractC6356w4) f10).f(q10));
        q10.h(f10, this.f36458a);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void u(F5 f10) throws O4 {
        x(f10.b());
        f10.c(this);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void v(byte b10) throws O4 {
        int i10 = this.f36422g;
        try {
            int i11 = i10 + 1;
            try {
                this.f36420e[i10] = b10;
                this.f36422g = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new O4(i10, this.f36421f, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void w(int i10) throws O4 {
        if (i10 >= 0) {
            x(i10);
        } else {
            z(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void x(int i10) throws O4 {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f36422g;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f36420e[i12] = (byte) (i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new O4(i12, this.f36421f, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new O4(i12, this.f36421f, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f36420e[i12] = (byte) i10;
        this.f36422g = i11;
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void y(int i10) throws O4 {
        int i11 = this.f36422g;
        try {
            byte[] bArr = this.f36420e;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f36422g = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new O4(i11, this.f36421f, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void z(long j10) throws O4 {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z9 = P4.f36456c;
        int i11 = this.f36422g;
        if (!z9 || this.f36421f - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.f36420e[i11] = (byte) (((int) j10) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new O4(i11, this.f36421f, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.f36420e[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new O4(i11, this.f36421f, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                AbstractC6233i6.u(this.f36420e, i11, (byte) (((int) j10) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            AbstractC6233i6.u(this.f36420e, i11, (byte) j10);
        }
        this.f36422g = i10;
    }
}

package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5987zL0 extends CL0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f35693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f35694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35695f;

    C5987zL0(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f35693d = bArr;
        this.f35695f = 0;
        this.f35694e = i11;
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void A() {
    }

    public final void C(byte[] bArr, int i10, int i11) throws AL0 {
        try {
            System.arraycopy(bArr, i10, this.f35693d, this.f35695f, i11);
            this.f35695f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new AL0(this.f35695f, this.f35694e, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4098kL0
    public final void a(byte[] bArr, int i10, int i11) throws AL0 {
        C(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void g(int i10, int i11) throws AL0 {
        v((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void h(int i10, int i11) throws AL0 {
        v(i10 << 3);
        u(i11);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void i(int i10, int i11) throws AL0 {
        v(i10 << 3);
        v(i11);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void j(int i10, int i11) throws AL0 {
        v((i10 << 3) | 5);
        w(i11);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void k(int i10, long j10) throws AL0 {
        v(i10 << 3);
        x(j10);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final int l() {
        return this.f35694e - this.f35695f;
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void m(int i10, long j10) throws AL0 {
        v((i10 << 3) | 1);
        y(j10);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void n(int i10, boolean z9) throws AL0 {
        v(i10 << 3);
        t(z9 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void o(int i10, String str) throws AL0 {
        v((i10 << 3) | 2);
        z(str);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void p(int i10, AbstractC5231tL0 abstractC5231tL0) throws AL0 {
        v((i10 << 3) | 2);
        q(abstractC5231tL0);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void q(AbstractC5231tL0 abstractC5231tL0) throws AL0 {
        v(abstractC5231tL0.j());
        abstractC5231tL0.o(this);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void r(byte[] bArr, int i10, int i11) throws AL0 {
        v(i11);
        C(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void s(InterfaceC5863yM0 interfaceC5863yM0) throws AL0 {
        v(interfaceC5863yM0.e());
        interfaceC5863yM0.d(this);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void t(byte b10) throws AL0 {
        int i10 = this.f35695f;
        try {
            int i11 = i10 + 1;
            try {
                this.f35693d[i10] = b10;
                this.f35695f = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new AL0(i10, this.f35694e, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void u(int i10) throws AL0 {
        if (i10 >= 0) {
            v(i10);
        } else {
            x(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void v(int i10) throws AL0 {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f35695f;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f35693d[i12] = (byte) (i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new AL0(i12, this.f35694e, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new AL0(i12, this.f35694e, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f35693d[i12] = (byte) i10;
        this.f35695f = i11;
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void w(int i10) throws AL0 {
        int i11 = this.f35695f;
        try {
            byte[] bArr = this.f35693d;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f35695f = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new AL0(i11, this.f35694e, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void x(long j10) throws AL0 {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z9 = CL0.f17855b;
        int i11 = this.f35695f;
        if (!z9 || this.f35694e - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.f35693d[i11] = (byte) (((int) j10) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new AL0(i11, this.f35694e, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.f35693d[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new AL0(i11, this.f35694e, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                AbstractC3726hN0.w(this.f35693d, i11, (byte) (((int) j10) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            AbstractC3726hN0.w(this.f35693d, i11, (byte) j10);
        }
        this.f35695f = i10;
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void y(long j10) throws AL0 {
        int i10 = this.f35695f;
        try {
            byte[] bArr = this.f35693d;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f35695f = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new AL0(i10, this.f35694e, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void z(String str) throws AL0 {
        int i10 = this.f35695f;
        try {
            int iB = CL0.b(str.length() * 3);
            int iB2 = CL0.b(str.length());
            if (iB2 != iB) {
                v(AbstractC4354mN0.b(str));
                byte[] bArr = this.f35693d;
                int i11 = this.f35695f;
                this.f35695f = AbstractC4354mN0.c(str, bArr, i11, this.f35694e - i11);
                return;
            }
            int i12 = i10 + iB2;
            this.f35695f = i12;
            int iC = AbstractC4354mN0.c(str, this.f35693d, i12, this.f35694e - i12);
            this.f35695f = i10;
            v((iC - i10) - iB2);
            this.f35695f = iC;
        } catch (IndexOutOfBoundsException e10) {
            throw new AL0(e10);
        }
    }
}

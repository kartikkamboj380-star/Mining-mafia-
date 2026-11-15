package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class BL0 extends AbstractC5861yL0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final OutputStream f17551h;

    BL0(OutputStream outputStream, int i10) {
        super(i10);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f17551h = outputStream;
    }

    private final void H(int i10) throws IOException {
        if (this.f35330e - this.f35331f < i10) {
            I();
        }
    }

    private final void I() throws IOException {
        this.f17551h.write(this.f35329d, 0, this.f35331f);
        this.f35331f = 0;
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void A() throws IOException {
        if (this.f35331f > 0) {
            I();
        }
    }

    public final void J(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f35330e;
        int i13 = this.f35331f;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.f35329d, i13, i11);
            this.f35331f += i11;
            this.f35332g += i11;
            return;
        }
        byte[] bArr2 = this.f35329d;
        System.arraycopy(bArr, i10, bArr2, i13, i14);
        int i15 = i10 + i14;
        this.f35331f = i12;
        this.f35332g += i14;
        I();
        int i16 = i11 - i14;
        if (i16 <= i12) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f35331f = i16;
        } else {
            this.f17551h.write(bArr, i15, i16);
        }
        this.f35332g += i16;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4098kL0
    public final void a(byte[] bArr, int i10, int i11) throws IOException {
        J(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void g(int i10, int i11) throws IOException {
        v((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void h(int i10, int i11) throws IOException {
        H(20);
        D(i10 << 3);
        if (i11 >= 0) {
            D(i11);
        } else {
            E(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void i(int i10, int i11) throws IOException {
        H(20);
        D(i10 << 3);
        D(i11);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void j(int i10, int i11) throws IOException {
        H(14);
        D((i10 << 3) | 5);
        F(i11);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void k(int i10, long j10) throws IOException {
        H(20);
        D(i10 << 3);
        E(j10);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void m(int i10, long j10) throws IOException {
        H(18);
        D((i10 << 3) | 1);
        G(j10);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void n(int i10, boolean z9) throws IOException {
        H(11);
        D(i10 << 3);
        C(z9 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void o(int i10, String str) throws IOException {
        v((i10 << 3) | 2);
        z(str);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void p(int i10, AbstractC5231tL0 abstractC5231tL0) throws IOException {
        v((i10 << 3) | 2);
        q(abstractC5231tL0);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void q(AbstractC5231tL0 abstractC5231tL0) throws IOException {
        v(abstractC5231tL0.j());
        abstractC5231tL0.o(this);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void r(byte[] bArr, int i10, int i11) throws IOException {
        v(i11);
        J(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void s(InterfaceC5863yM0 interfaceC5863yM0) throws IOException {
        v(interfaceC5863yM0.e());
        interfaceC5863yM0.d(this);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void t(byte b10) throws IOException {
        if (this.f35331f == this.f35330e) {
            I();
        }
        C(b10);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void u(int i10) throws IOException {
        if (i10 >= 0) {
            v(i10);
        } else {
            x(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void v(int i10) throws IOException {
        H(5);
        D(i10);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void w(int i10) throws IOException {
        H(4);
        F(i10);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void x(long j10) throws IOException {
        H(10);
        E(j10);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void y(long j10) throws IOException {
        H(8);
        G(j10);
    }

    @Override // com.google.android.gms.internal.ads.CL0
    public final void z(String str) throws IOException {
        int iB;
        int length = str.length() * 3;
        int iB2 = CL0.b(length);
        int i10 = iB2 + length;
        int i11 = this.f35330e;
        if (i10 > i11) {
            byte[] bArr = new byte[length];
            int iC = AbstractC4354mN0.c(str, bArr, 0, length);
            v(iC);
            J(bArr, 0, iC);
            return;
        }
        if (i10 > i11 - this.f35331f) {
            I();
        }
        int iB3 = CL0.b(str.length());
        int i12 = this.f35331f;
        try {
            if (iB3 == iB2) {
                int i13 = i12 + iB3;
                this.f35331f = i13;
                int iC2 = AbstractC4354mN0.c(str, this.f35329d, i13, i11 - i13);
                this.f35331f = i12;
                iB = (iC2 - i12) - iB3;
                D(iB);
                this.f35331f = iC2;
            } else {
                iB = AbstractC4354mN0.b(str);
                D(iB);
                this.f35331f = AbstractC4354mN0.c(str, this.f35329d, this.f35331f, iB);
            }
            this.f35332g += iB;
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new AL0(e10);
        }
    }
}

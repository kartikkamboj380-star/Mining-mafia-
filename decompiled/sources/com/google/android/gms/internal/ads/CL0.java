package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CL0 extends AbstractC4098kL0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f17855b = AbstractC3726hN0.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17856c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f17857a;

    /* synthetic */ CL0(byte[] bArr) {
    }

    static int B(int i10) {
        return i10 > 4096 ? CodedOutputStream.DEFAULT_BUFFER_SIZE : i10;
    }

    public static int b(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int c(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int d(InterfaceC5863yM0 interfaceC5863yM0) {
        int iE = interfaceC5863yM0.e();
        return b(iE) + iE;
    }

    public abstract void A();

    public final void e() {
        if (l() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void g(int i10, int i11);

    public abstract void h(int i10, int i11);

    public abstract void i(int i10, int i11);

    public abstract void j(int i10, int i11);

    public abstract void k(int i10, long j10);

    public abstract int l();

    public abstract void m(int i10, long j10);

    public abstract void n(int i10, boolean z9);

    public abstract void o(int i10, String str);

    public abstract void p(int i10, AbstractC5231tL0 abstractC5231tL0);

    public abstract void q(AbstractC5231tL0 abstractC5231tL0);

    abstract void r(byte[] bArr, int i10, int i11);

    public abstract void s(InterfaceC5863yM0 interfaceC5863yM0);

    public abstract void t(byte b10);

    public abstract void u(int i10);

    public abstract void v(int i10);

    public abstract void w(int i10);

    public abstract void x(long j10);

    public abstract void y(long j10);

    public abstract void z(String str);
}

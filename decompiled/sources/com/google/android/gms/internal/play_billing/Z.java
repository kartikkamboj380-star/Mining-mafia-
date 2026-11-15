package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Z extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f37168b = Logger.getLogger(Z.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f37169c = H1.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C6385a0 f37170a;

    /* synthetic */ Z(Y y9) {
    }

    static int t(int i10, V0 v10, InterfaceC6410g1 interfaceC6410g1) {
        int iW = w(i10 << 3);
        return iW + iW + ((AbstractC6483z) v10).a(interfaceC6410g1);
    }

    static int u(V0 v10, InterfaceC6410g1 interfaceC6410g1) {
        int iA = ((AbstractC6483z) v10).a(interfaceC6410g1);
        return w(iA) + iA;
    }

    public static int v(String str) {
        int length;
        try {
            length = M1.c(str);
        } catch (L1 unused) {
            length = str.getBytes(AbstractC6480y0.f37347b).length;
        }
        return w(length) + length;
    }

    public static int w(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int x(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static Z y(byte[] bArr, int i10, int i11) {
        return new W(bArr, 0, i11);
    }

    final void a(String str, L1 l10) throws X {
        f37168b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) l10);
        byte[] bytes = str.getBytes(AbstractC6480y0.f37347b);
        try {
            int length = bytes.length;
            q(length);
            m(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new X(e10);
        }
    }

    public abstract int c();

    public abstract void d(byte b10);

    public abstract void e(int i10, boolean z9);

    public abstract void f(int i10, Q q10);

    public abstract void g(int i10, int i11);

    public abstract void h(int i10);

    public abstract void i(int i10, long j10);

    public abstract void j(long j10);

    public abstract void k(int i10, int i11);

    public abstract void l(int i10);

    public abstract void m(byte[] bArr, int i10, int i11);

    public abstract void n(int i10, String str);

    public abstract void o(int i10, int i11);

    public abstract void p(int i10, int i11);

    public abstract void q(int i10);

    public abstract void r(int i10, long j10);

    public abstract void s(long j10);

    public final void z() {
        if (c() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}

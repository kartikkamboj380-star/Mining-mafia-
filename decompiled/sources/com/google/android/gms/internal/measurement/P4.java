package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class P4 extends B4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f36455b = Logger.getLogger(P4.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f36456c = AbstractC6233i6.f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f36457d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Q4 f36458a;

    /* synthetic */ P4(byte[] bArr) {
    }

    public static int E(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int a(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = AbstractC6260l6.b(str);
        } catch (C6251k6 unused) {
            length = str.getBytes(AbstractC6268m5.f36751a).length;
        }
        return E(length) + length;
    }

    public static int c(F5 f10) {
        int iB = f10.b();
        return E(iB) + iB;
    }

    static int d(F5 f10, Q5 q10) {
        int iF = ((AbstractC6356w4) f10).f(q10);
        return E(iF) + iF;
    }

    static int g(int i10, F5 f10, Q5 q10) {
        int iE = E(i10 << 3);
        return iE + iE + ((AbstractC6356w4) f10).f(q10);
    }

    public abstract void A(long j10);

    public abstract void B(byte[] bArr, int i10, int i11);

    public abstract void C(String str);

    public abstract int D();

    public final void e() {
        if (D() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void f(String str, C6251k6 c6251k6) throws O4 {
        f36455b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c6251k6);
        byte[] bytes = str.getBytes(AbstractC6268m5.f36751a);
        try {
            int length = bytes.length;
            x(length);
            B(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new O4(e10);
        }
    }

    public abstract void i(int i10, int i11);

    public abstract void j(int i10, int i11);

    public abstract void k(int i10, int i11);

    public abstract void l(int i10, int i11);

    public abstract void m(int i10, long j10);

    public abstract void n(int i10, long j10);

    public abstract void o(int i10, boolean z9);

    public abstract void p(int i10, String str);

    public abstract void q(int i10, K4 k10);

    public abstract void r(K4 k10);

    abstract void s(byte[] bArr, int i10, int i11);

    abstract void t(int i10, F5 f10, Q5 q10);

    public abstract void u(F5 f10);

    public abstract void v(byte b10);

    public abstract void w(int i10);

    public abstract void x(int i10);

    public abstract void y(int i10);

    public abstract void z(long j10);
}

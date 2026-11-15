package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5609wL0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile int f34527e = 100;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34528f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f34529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f34530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f34531c = f34527e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f34532d;

    /* synthetic */ AbstractC5609wL0(byte[] bArr) {
    }

    public static AbstractC5609wL0 d(InputStream inputStream, int i10) {
        if (inputStream != null) {
            return new C5483vL0(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE, null);
        }
        byte[] bArr = AbstractC3346eM0.f27766b;
        int length = bArr.length;
        return e(bArr, 0, 0, false);
    }

    static AbstractC5609wL0 e(byte[] bArr, int i10, int i11, boolean z9) {
        C5357uL0 c5357uL0 = new C5357uL0(bArr, i10, i11, z9, null);
        try {
            c5357uL0.E(i11);
            return c5357uL0;
        } catch (C3598gM0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int i(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long j(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public abstract int A();

    public abstract long B();

    public abstract int C();

    public abstract long D();

    public abstract int E(int i10);

    public abstract void a(int i10);

    public abstract boolean b();

    public abstract int c();

    public final void f() throws C3598gM0 {
        if (this.f34529a + this.f34530b >= this.f34531c) {
            throw new C3598gM0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void g() {
        if (this.f34530b == 0) {
            l(0);
        }
    }

    public final void h() throws C3598gM0 {
        boolean zM;
        do {
            int iK = k();
            if (iK == 0) {
                return;
            }
            f();
            this.f34530b++;
            zM = m(iK);
            this.f34530b--;
        } while (zM);
    }

    public abstract int k();

    public abstract void l(int i10);

    public abstract boolean m(int i10);

    public abstract double n();

    public abstract float o();

    public abstract long p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract boolean u();

    public abstract String v();

    public abstract String w();

    public abstract AbstractC5231tL0 x();

    public abstract int y();

    public abstract int z();
}

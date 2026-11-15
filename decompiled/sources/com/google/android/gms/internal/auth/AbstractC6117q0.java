package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6117q0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC6117q0 f36138b = new C6108n0(G0.f35914d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator f36139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C6114p0 f36140d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36141a = 0;

    static {
        int i10 = AbstractC6078d0.f36000a;
        f36140d = new C6114p0(null);
        f36139c = new C6090h0();
    }

    AbstractC6117q0() {
    }

    static int k(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static AbstractC6117q0 m(byte[] bArr, int i10, int i11) {
        k(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C6108n0(bArr2);
    }

    public abstract byte a(int i10);

    abstract byte b(int i10);

    public abstract int d();

    protected abstract int e(int i10, int i11, int i12);

    public abstract boolean equals(Object obj);

    public abstract AbstractC6117q0 g(int i10, int i11);

    public final int hashCode() {
        int iE = this.f36141a;
        if (iE == 0) {
            int iD = d();
            iE = e(iD, 0, iD);
            if (iE == 0) {
                iE = 1;
            }
            this.f36141a = iE;
        }
        return iE;
    }

    protected abstract String i(Charset charset);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C6087g0(this);
    }

    public abstract boolean j();

    protected final int l() {
        return this.f36141a;
    }

    public final String o(Charset charset) {
        return d() == 0 ? "" : i(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? AbstractC6109n1.a(this) : AbstractC6109n1.a(g(0, 47)).concat("..."));
    }
}

package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q f37133b = new N(AbstractC6480y0.f37349d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator f37134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final P f37135d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37136a = 0;

    static {
        int i10 = C.f37067a;
        f37135d = new P(null);
        f37134c = new H();
    }

    Q() {
    }

    static int l(int i10, int i11, int i12) {
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

    public static Q o(byte[] bArr, int i10, int i11) {
        l(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new N(bArr2);
    }

    public abstract byte a(int i10);

    abstract byte b(int i10);

    public abstract int d();

    protected abstract int e(int i10, int i11, int i12);

    public abstract boolean equals(Object obj);

    public abstract Q g(int i10, int i11);

    public final int hashCode() {
        int iE = this.f37136a;
        if (iE == 0) {
            int iD = d();
            iE = e(iD, 0, iD);
            if (iE == 0) {
                iE = 1;
            }
            this.f37136a = iE;
        }
        return iE;
    }

    protected abstract String i(Charset charset);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new G(this);
    }

    abstract void j(F f10);

    public abstract boolean k();

    protected final int m() {
        return this.f37136a;
    }

    public final String p(Charset charset) {
        return d() == 0 ? "" : i(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? AbstractC6469v1.a(this) : AbstractC6469v1.a(g(0, 47)).concat("..."));
    }
}

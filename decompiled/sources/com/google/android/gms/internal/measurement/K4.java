package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K4 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K4 f36323b = new J4(AbstractC6268m5.f36752b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36324a = 0;

    static {
        int i10 = AbstractC6373y4.f36953a;
    }

    K4() {
    }

    public static K4 j(byte[] bArr, int i10, int i11) {
        l(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new J4(bArr2);
    }

    static int l(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i10);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i11 < i10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb3.append("End index: ");
        sb3.append(i11);
        sb3.append(" >= ");
        sb3.append(i12);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public abstract byte a(int i10);

    abstract byte b(int i10);

    public abstract int d();

    public abstract K4 e(int i10, int i11);

    public abstract boolean equals(Object obj);

    abstract void g(B4 b10);

    public final int hashCode() {
        int i10 = this.f36324a;
        if (i10 == 0) {
            int iD = d();
            i10 = i(iD, 0, iD);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f36324a = i10;
        }
        return i10;
    }

    protected abstract int i(int i10, int i11, int i12);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new D4(this);
    }

    protected final int k() {
        return this.f36324a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? Z5.a(this) : Z5.a(e(0, 47)).concat("..."));
    }
}

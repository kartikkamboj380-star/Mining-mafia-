package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1110f implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1110f f9469b = new i(AbstractC1124u.f9685d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final InterfaceC0150f f9470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator f9471d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9472a = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$a */
    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9473a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9474b;

        a() {
            this.f9474b = AbstractC1110f.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9473a < this.f9474b;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f.g
        public byte nextByte() {
            int i10 = this.f9473a;
            if (i10 >= this.f9474b) {
                throw new NoSuchElementException();
            }
            this.f9473a = i10 + 1;
            return AbstractC1110f.this.l(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC1110f abstractC1110f, AbstractC1110f abstractC1110f2) {
            g gVarM = abstractC1110f.m();
            g gVarM2 = abstractC1110f2.m();
            while (gVarM.hasNext() && gVarM2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC1110f.s(gVarM.nextByte())).compareTo(Integer.valueOf(AbstractC1110f.s(gVarM2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC1110f.size()).compareTo(Integer.valueOf(abstractC1110f2.size()));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$c */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$d */
    private static final class d implements InterfaceC0150f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f.InterfaceC0150f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$e */
    private static final class e extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f9476f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f9477g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC1110f.e(i10, i10 + i11, bArr.length);
            this.f9476f = i10;
            this.f9477g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f.i, androidx.datastore.preferences.protobuf.AbstractC1110f
        public byte b(int i10) {
            AbstractC1110f.d(i10, size());
            return this.f9478e[this.f9476f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f.i, androidx.datastore.preferences.protobuf.AbstractC1110f
        protected void k(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f9478e, z() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f.i, androidx.datastore.preferences.protobuf.AbstractC1110f
        byte l(int i10) {
            return this.f9478e[this.f9476f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f.i, androidx.datastore.preferences.protobuf.AbstractC1110f
        public int size() {
            return this.f9477g;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f.i
        protected int z() {
            return this.f9476f;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$f, reason: collision with other inner class name */
    private interface InterfaceC0150f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$g */
    public interface g extends Iterator {
        byte nextByte();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$h */
    static abstract class h extends AbstractC1110f {
        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.m();
        }

        private h() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$i */
    private static class i extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f9478e;

        i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f9478e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f
        public byte b(int i10) {
            return this.f9478e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1110f) || size() != ((AbstractC1110f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iP = p();
            int iP2 = iVar.p();
            if (iP == 0 || iP2 == 0 || iP == iP2) {
                return y(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f
        protected void k(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f9478e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f
        byte l(int i10) {
            return this.f9478e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f
        protected final int o(int i10, int i11, int i12) {
            return AbstractC1124u.g(i10, this.f9478e, z() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f
        public final AbstractC1110f q(int i10, int i11) {
            int iE = AbstractC1110f.e(i10, i11, size());
            return iE == 0 ? AbstractC1110f.f9469b : new e(this.f9478e, z() + i10, iE);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f
        public int size() {
            return this.f9478e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f
        final void w(AbstractC1109e abstractC1109e) {
            abstractC1109e.a(this.f9478e, z(), size());
        }

        final boolean y(AbstractC1110f abstractC1110f, int i10, int i11) {
            if (i11 > abstractC1110f.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC1110f.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC1110f.size());
            }
            if (!(abstractC1110f instanceof i)) {
                return abstractC1110f.q(i10, i12).equals(q(0, i11));
            }
            i iVar = (i) abstractC1110f;
            byte[] bArr = this.f9478e;
            byte[] bArr2 = iVar.f9478e;
            int iZ = z() + i11;
            int iZ2 = z();
            int iZ3 = iVar.z() + i10;
            while (iZ2 < iZ) {
                if (bArr[iZ2] != bArr2[iZ3]) {
                    return false;
                }
                iZ2++;
                iZ3++;
            }
            return true;
        }

        protected int z() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$j */
    private static final class j implements InterfaceC0150f {
        private j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1110f.InterfaceC0150f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f9470c = AbstractC1108d.c() ? new j(aVar) : new d(aVar);
        f9471d = new b();
    }

    AbstractC1110f() {
    }

    static void d(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int e(int i10, int i11, int i12) {
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

    public static AbstractC1110f g(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC1110f i(byte[] bArr, int i10, int i11) {
        e(i10, i10 + i11, bArr.length);
        return new i(f9470c.a(bArr, i10, i11));
    }

    public static AbstractC1110f j(String str) {
        return new i(str.getBytes(AbstractC1124u.f9683b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(byte b10) {
        return b10 & 255;
    }

    private String t() {
        if (size() <= 50) {
            return d0.a(this);
        }
        return d0.a(q(0, 47)) + "...";
    }

    static AbstractC1110f u(byte[] bArr) {
        return new i(bArr);
    }

    static AbstractC1110f v(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iO = this.f9472a;
        if (iO == 0) {
            int size = size();
            iO = o(size, 0, size);
            if (iO == 0) {
                iO = 1;
            }
            this.f9472a = iO;
        }
        return iO;
    }

    protected abstract void k(byte[] bArr, int i10, int i11, int i12);

    abstract byte l(int i10);

    public g m() {
        return new a();
    }

    protected abstract int o(int i10, int i11, int i12);

    protected final int p() {
        return this.f9472a;
    }

    public abstract AbstractC1110f q(int i10, int i11);

    public final byte[] r() {
        int size = size();
        if (size == 0) {
            return AbstractC1124u.f9685d;
        }
        byte[] bArr = new byte[size];
        k(bArr, 0, 0, size);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), t());
    }

    abstract void w(AbstractC1109e abstractC1109e);
}

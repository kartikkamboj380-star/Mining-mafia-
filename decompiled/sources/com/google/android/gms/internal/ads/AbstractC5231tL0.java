package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5231tL0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC5231tL0 f33386b = new C4979rL0(AbstractC3346eM0.f27766b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33387a = 0;

    static {
        int i10 = AbstractC3722hL0.f28900a;
    }

    AbstractC5231tL0() {
    }

    public static AbstractC5231tL0 A(String str) {
        return new C4979rL0(str.getBytes(AbstractC3346eM0.f27765a));
    }

    public static AbstractC5231tL0 B(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f33386b : q(iterable.iterator(), size);
    }

    public static C5105sL0 a() {
        return new C5105sL0(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
    }

    static void b(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 11);
                sb.append("Index < 0: ");
                sb.append(i10);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
            sb2.append("Index > length: ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    static int d(int i10, int i11, int i12) {
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

    static /* synthetic */ boolean e(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        d(i10, i13, bArr.length);
        d(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    private static AbstractC5231tL0 q(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (AbstractC5231tL0) it.next();
        }
        int i11 = i10 >>> 1;
        AbstractC5231tL0 abstractC5231tL0Q = q(it, i11);
        AbstractC5231tL0 abstractC5231tL0Q2 = q(it, i10 - i11);
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - abstractC5231tL0Q.j() >= abstractC5231tL0Q2.j()) {
            return OM0.H(abstractC5231tL0Q, abstractC5231tL0Q2);
        }
        int iJ = abstractC5231tL0Q.j();
        int iJ2 = abstractC5231tL0Q2.j();
        StringBuilder sb = new StringBuilder(String.valueOf(iJ).length() + 31 + String.valueOf(iJ2).length());
        sb.append("ByteString would be too long: ");
        sb.append(iJ);
        sb.append("+");
        sb.append(iJ2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static AbstractC5231tL0 w(byte[] bArr, int i10, int i11) {
        try {
            return y(bArr, i10, i11, false);
        } catch (C3598gM0 e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    static AbstractC5231tL0 y(byte[] bArr, int i10, int i11, boolean z9) {
        d(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C4979rL0(bArr2);
    }

    static AbstractC5231tL0 z(byte[] bArr) {
        try {
            return new C4979rL0(bArr);
        } catch (C3598gM0 e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public final void C(byte[] bArr, int i10, int i11, int i12) {
        d(0, i12, j());
        d(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            l(bArr, 0, i11, i12);
        }
    }

    public final byte[] D() {
        int iJ = j();
        if (iJ == 0) {
            return AbstractC3346eM0.f27766b;
        }
        byte[] bArr = new byte[iJ];
        l(bArr, 0, 0, iJ);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5231tL0)) {
            return false;
        }
        AbstractC5231tL0 abstractC5231tL0 = (AbstractC5231tL0) obj;
        int iJ = j();
        if (iJ != abstractC5231tL0.j()) {
            return false;
        }
        if (iJ == 0) {
            return true;
        }
        int i10 = this.f33387a;
        int i11 = abstractC5231tL0.f33387a;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return p(abstractC5231tL0);
        }
        return false;
    }

    public abstract byte g(int i10);

    public final int hashCode() {
        int iR = this.f33387a;
        if (iR == 0) {
            int iJ = j();
            iR = r(iJ, 0, iJ);
            if (iR == 0) {
                iR = 1;
            }
            this.f33387a = iR;
        }
        return iR;
    }

    abstract byte i(int i10);

    public abstract int j();

    public abstract AbstractC5231tL0 k(int i10, int i11);

    protected abstract void l(byte[] bArr, int i10, int i11, int i12);

    public abstract ByteBuffer m();

    abstract void o(AbstractC4098kL0 abstractC4098kL0);

    protected abstract boolean p(AbstractC5231tL0 abstractC5231tL0);

    protected abstract int r(int i10, int i11, int i12);

    public abstract AbstractC5609wL0 s();

    protected abstract int t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(j()), j() <= 50 ? YM0.a(this) : YM0.a(k(0, 47)).concat("..."));
    }

    protected abstract boolean u();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceC4602oL0 iterator() {
        return new C4224lL0(this);
    }
}

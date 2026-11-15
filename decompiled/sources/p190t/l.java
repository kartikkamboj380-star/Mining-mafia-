package p190t;

import java.util.Arrays;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p200u.a;

/* JADX INFO: loaded from: classes.dex */
public class l implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f49473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f49474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f49475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f49476d;

    public l() {
        this(0, 1, null);
    }

    public void b(int i10, Object obj) {
        int i11 = this.f49476d;
        if (i11 != 0 && i10 <= this.f49474b[i11 - 1]) {
            k(i10, obj);
            return;
        }
        if (this.f49473a && i11 >= this.f49474b.length) {
            m.d(this);
        }
        int i12 = this.f49476d;
        if (i12 >= this.f49474b.length) {
            int iE = a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f49474b, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f49474b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f49475c, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f49475c = objArrCopyOf;
        }
        this.f49474b[i12] = i10;
        this.f49475c[i12] = obj;
        this.f49476d = i12 + 1;
    }

    public void c() {
        int i10 = this.f49476d;
        Object[] objArr = this.f49475c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f49476d = 0;
        this.f49473a = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public l clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l lVar = (l) objClone;
        lVar.f49474b = (int[]) this.f49474b.clone();
        lVar.f49475c = (Object[]) this.f49475c.clone();
        return lVar;
    }

    public boolean e(int i10) {
        return g(i10) >= 0;
    }

    public Object f(int i10) {
        return m.c(this, i10);
    }

    public int g(int i10) {
        if (this.f49473a) {
            m.d(this);
        }
        return a.a(this.f49474b, this.f49476d, i10);
    }

    public int h(Object obj) {
        if (this.f49473a) {
            m.d(this);
        }
        int i10 = this.f49476d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f49475c[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public int i(int i10) {
        if (this.f49473a) {
            m.d(this);
        }
        return this.f49474b[i10];
    }

    public void k(int i10, Object obj) {
        int iA = a.a(this.f49474b, this.f49476d, i10);
        if (iA >= 0) {
            this.f49475c[iA] = obj;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f49476d && this.f49475c[i11] == m.f49477a) {
            this.f49474b[i11] = i10;
            this.f49475c[i11] = obj;
            return;
        }
        if (this.f49473a && this.f49476d >= this.f49474b.length) {
            m.d(this);
            i11 = ~a.a(this.f49474b, this.f49476d, i10);
        }
        int i12 = this.f49476d;
        if (i12 >= this.f49474b.length) {
            int iE = a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f49474b, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f49474b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f49475c, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f49475c = objArrCopyOf;
        }
        int i13 = this.f49476d;
        if (i13 - i11 != 0) {
            int[] iArr = this.f49474b;
            int i14 = i11 + 1;
            AbstractC7024j.f(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f49475c;
            AbstractC7024j.h(objArr, objArr, i14, i11, this.f49476d);
        }
        this.f49474b[i11] = i10;
        this.f49475c[i11] = obj;
        this.f49476d++;
    }

    public int l() {
        if (this.f49473a) {
            m.d(this);
        }
        return this.f49476d;
    }

    public Object m(int i10) {
        if (this.f49473a) {
            m.d(this);
        }
        return this.f49475c[i10];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f49476d * 28);
        sb.append('{');
        int i10 = this.f49476d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(i(i11));
            sb.append('=');
            Object objM = m(i11);
            if (objM != this) {
                sb.append(objM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    public l(int i10) {
        if (i10 == 0) {
            this.f49474b = a.f49746a;
            this.f49475c = a.f49748c;
        } else {
            int iE = a.e(i10);
            this.f49474b = new int[iE];
            this.f49475c = new Object[iE];
        }
    }

    public /* synthetic */ l(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}

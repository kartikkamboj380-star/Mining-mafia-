package p190t;

import java.util.Arrays;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p200u.a;

/* JADX INFO: loaded from: classes.dex */
public class h implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f49456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f49457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f49458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f49459d;

    public h() {
        this(0, 1, null);
    }

    public void b() {
        int i10 = this.f49459d;
        Object[] objArr = this.f49458c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f49459d = 0;
        this.f49456a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) objClone;
        hVar.f49457b = (long[]) this.f49457b.clone();
        hVar.f49458c = (Object[]) this.f49458c.clone();
        return hVar;
    }

    public Object d(long j10) {
        int iB = a.b(this.f49457b, this.f49459d, j10);
        if (iB < 0 || this.f49458c[iB] == i.f49460a) {
            return null;
        }
        return this.f49458c[iB];
    }

    public int e(long j10) {
        if (this.f49456a) {
            int i10 = this.f49459d;
            long[] jArr = this.f49457b;
            Object[] objArr = this.f49458c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != i.f49460a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f49456a = false;
            this.f49459d = i11;
        }
        return a.b(this.f49457b, this.f49459d, j10);
    }

    public long f(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f49459d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f49456a) {
            long[] jArr = this.f49457b;
            Object[] objArr = this.f49458c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != i.f49460a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f49456a = false;
            this.f49459d = i12;
        }
        return this.f49457b[i10];
    }

    public void g(long j10, Object obj) {
        int iB = a.b(this.f49457b, this.f49459d, j10);
        if (iB >= 0) {
            this.f49458c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f49459d && this.f49458c[i10] == i.f49460a) {
            this.f49457b[i10] = j10;
            this.f49458c[i10] = obj;
            return;
        }
        if (this.f49456a) {
            int i11 = this.f49459d;
            long[] jArr = this.f49457b;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f49458c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != i.f49460a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f49456a = false;
                this.f49459d = i12;
                i10 = ~a.b(this.f49457b, i12, j10);
            }
        }
        int i14 = this.f49459d;
        if (i14 >= this.f49457b.length) {
            int iF = a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f49457b, iF);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f49457b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f49458c, iF);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f49458c = objArrCopyOf;
        }
        int i15 = this.f49459d;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f49457b;
            int i16 = i10 + 1;
            AbstractC7024j.g(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f49458c;
            AbstractC7024j.h(objArr2, objArr2, i16, i10, this.f49459d);
        }
        this.f49457b[i10] = j10;
        this.f49458c[i10] = obj;
        this.f49459d++;
    }

    public void h(long j10) {
        int iB = a.b(this.f49457b, this.f49459d, j10);
        if (iB < 0 || this.f49458c[iB] == i.f49460a) {
            return;
        }
        this.f49458c[iB] = i.f49460a;
        this.f49456a = true;
    }

    public void i(int i10) {
        if (this.f49458c[i10] != i.f49460a) {
            this.f49458c[i10] = i.f49460a;
            this.f49456a = true;
        }
    }

    public int k() {
        if (this.f49456a) {
            int i10 = this.f49459d;
            long[] jArr = this.f49457b;
            Object[] objArr = this.f49458c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != i.f49460a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f49456a = false;
            this.f49459d = i11;
        }
        return this.f49459d;
    }

    public Object l(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f49459d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f49456a) {
            long[] jArr = this.f49457b;
            Object[] objArr = this.f49458c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != i.f49460a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f49456a = false;
            this.f49459d = i12;
        }
        return this.f49458c[i10];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f49459d * 28);
        sb.append('{');
        int i10 = this.f49459d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(f(i11));
            sb.append('=');
            Object objL = l(i11);
            if (objL != sb) {
                sb.append(objL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public h(int i10) {
        if (i10 == 0) {
            this.f49457b = a.f49747b;
            this.f49458c = a.f49748c;
        } else {
            int iF = a.f(i10);
            this.f49457b = new long[iF];
            this.f49458c = new Object[iF];
        }
    }

    public /* synthetic */ h(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}

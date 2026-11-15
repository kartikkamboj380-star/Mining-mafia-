package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class q extends C7030p {
    public static final Collection f(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new C7022h(objArr, false);
    }

    public static final int g(List list, Comparable comparable, int i10, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        p(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iA = p159p8.a.a((Comparable) list.get(i13), comparable);
            if (iA < 0) {
                i10 = i13 + 1;
            } else {
                if (iA <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int h(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return g(list, comparable, i10, i11);
    }

    public static List i() {
        return z.f45949a;
    }

    public static IntRange j(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1);
    }

    public static int k(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static List l(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? C7027m.d(elements) : i();
    }

    public static List m(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7028n.u(elements);
    }

    public static List n(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C7022h(elements, true));
    }

    public static final List o(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : C7030p.d(list.get(0));
        }
        return i();
    }

    private static final void p(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    public static void q() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void r() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

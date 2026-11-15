package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class w extends v {
    public static List I(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new L(list);
    }

    public static List J(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new K(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int K(List list, int i10) {
        if (i10 >= 0 && i10 <= q.k(list)) {
            return q.k(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new IntRange(0, q.k(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int L(List list, int i10) {
        return q.k(list) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new IntRange(0, list.size()) + "].");
    }
}

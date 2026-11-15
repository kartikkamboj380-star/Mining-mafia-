package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: kotlin.collections.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7030p {
    public static List a(List builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((p139n8.b) builder).s();
    }

    public static final Object[] b(Object[] objArr, boolean z9) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (z9 && Intrinsics.b(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new p139n8.b(0, 1, null);
    }

    public static List d(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static Object[] e(int i10, Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}

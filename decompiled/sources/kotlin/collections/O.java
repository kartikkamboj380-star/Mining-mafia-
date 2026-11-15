package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class O extends N {
    public static Set d() {
        return B.f45920a;
    }

    public static Set e(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) C7028n.X(elements, new LinkedHashSet(G.d(elements.length)));
    }

    public static final Set f(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : N.c(set.iterator().next());
        }
        return d();
    }

    public static Set g(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7028n.b0(elements);
    }
}

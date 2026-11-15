package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class P extends O {
    public static Set h(Set set, Object obj) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(G.d(set.size()));
        boolean z9 = false;
        for (Object obj2 : set) {
            boolean z10 = true;
            if (!z9 && Intrinsics.b(obj2, obj)) {
                z9 = true;
                z10 = false;
            }
            if (z10) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set i(Set set, Object obj) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(G.d(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}

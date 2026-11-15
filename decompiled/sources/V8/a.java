package V8;

import X8.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final F8.c a(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar instanceof x) {
            return a(((x) dVar).j());
        }
        return null;
    }

    public static final d b(a9.b bVar, d descriptor) {
        T8.b bVarB;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        F8.c cVarA = a(descriptor);
        if (cVarA == null || (bVarB = a9.b.b(bVar, cVarA, null, 2, null)) == null) {
            return null;
        }
        return bVarB.a();
    }
}

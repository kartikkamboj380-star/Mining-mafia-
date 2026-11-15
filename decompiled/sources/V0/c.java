package V0;

import androidx.work.p;
import androidx.work.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f6072a;

    static {
        String strI = q.i("ConstraintTrkngWrkr");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        f6072a = strI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(androidx.work.impl.utils.futures.c cVar) {
        return cVar.p(p.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(androidx.work.impl.utils.futures.c cVar) {
        return cVar.p(p.a.b());
    }
}

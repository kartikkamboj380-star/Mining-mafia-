package K0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f2403b;

    static {
        String strI = androidx.work.q.i("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WrkDbPathHelper\")");
        f2402a = strI;
        f2403b = new String[]{"-journal", "-shm", "-wal"};
    }
}

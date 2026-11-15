package N8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B {
    public static final A b(Object obj) {
        if (obj == AbstractC0824a.f3692a) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (A) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC0824a.f3692a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}

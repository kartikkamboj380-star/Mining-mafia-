package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface a extends TimeMark, Comparable {

    /* JADX INFO: renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C0465a {
        public static int a(a aVar, a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return b.j(aVar.a(other), b.f46051b.c());
        }
    }

    long a(a aVar);
}

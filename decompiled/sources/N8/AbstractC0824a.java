package N8;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: N8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0824a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f3692a = new D("CLOSED");

    public static final AbstractC0825b b(AbstractC0825b abstractC0825b) {
        while (true) {
            Object objG = abstractC0825b.g();
            if (objG == f3692a) {
                return abstractC0825b;
            }
            AbstractC0825b abstractC0825b2 = (AbstractC0825b) objG;
            if (abstractC0825b2 != null) {
                abstractC0825b = abstractC0825b2;
            } else if (abstractC0825b.m()) {
                return abstractC0825b;
            }
        }
    }

    public static final Object c(A a10, long j10, Function2 function2) {
        while (true) {
            if (a10.f3676c >= j10 && !a10.k()) {
                return B.a(a10);
            }
            Object objG = a10.g();
            if (objG == f3692a) {
                return B.a(f3692a);
            }
            A a11 = (A) ((AbstractC0825b) objG);
            if (a11 == null) {
                a11 = (A) function2.invoke(Long.valueOf(a10.f3676c + 1), a10);
                if (a10.o(a11)) {
                    if (a10.k()) {
                        a10.n();
                    }
                }
            }
            a10 = a11;
        }
    }
}

package I8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: I8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0683n extends p169q8.b {

    /* JADX INFO: renamed from: I8.n$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC0683n interfaceC0683n, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC0683n.j(th);
        }
    }

    boolean a();

    Object b(Object obj, Object obj2, p259z8.n nVar);

    void e(K k10, Object obj);

    void f(Function1 function1);

    Object i(Throwable th);

    boolean isActive();

    boolean j(Throwable th);

    void r(Object obj, p259z8.n nVar);

    void s(Object obj);
}

package K8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface y {

    public static final class a {
        public static /* synthetic */ boolean a(y yVar, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return yVar.o(th);
        }
    }

    void d(Function1 function1);

    Object g(Object obj);

    Object k(Object obj, p169q8.b bVar);

    boolean o(Throwable th);

    boolean q();
}

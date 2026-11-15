package I8;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public interface B0 extends CoroutineContext.Element {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f1699o = b.f1700a;

    public static final class a {
        public static /* synthetic */ void a(B0 b10, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            b10.c(cancellationException);
        }

        public static Object b(B0 b10, Object obj, Function2 function2) {
            return CoroutineContext.Element.a.a(b10, obj, function2);
        }

        public static CoroutineContext.Element c(B0 b10, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.b(b10, bVar);
        }

        public static CoroutineContext d(B0 b10, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.c(b10, bVar);
        }

        public static CoroutineContext e(B0 b10, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(b10, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f1700a = new b();

        private b() {
        }
    }

    Object G(p169q8.b bVar);

    InterfaceC0670g0 Q(Function1 function1);

    InterfaceC0696u S(InterfaceC0700w interfaceC0700w);

    boolean a();

    void c(CancellationException cancellationException);

    boolean isActive();

    boolean isCancelled();

    boolean start();

    InterfaceC0670g0 w(boolean z9, boolean z10, Function1 function1);

    CancellationException x();
}

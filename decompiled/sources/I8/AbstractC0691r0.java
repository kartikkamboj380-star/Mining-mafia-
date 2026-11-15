package I8;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: I8.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0691r0 extends K implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1813b = new a(null);

    /* JADX INFO: renamed from: I8.r0$a */
    public static final class a extends kotlin.coroutines.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC0691r0 d(CoroutineContext.Element element) {
            if (element instanceof AbstractC0691r0) {
                return (AbstractC0691r0) element;
            }
            return null;
        }

        private a() {
            super(K.f1727a, new Function1() { // from class: I8.q0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC0691r0.a.d((CoroutineContext.Element) obj);
                }
            });
        }
    }

    public abstract Executor q1();
}

package J0;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class p extends I0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JsReplyProxyBoundaryInterface f1911a;

    public p(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f1911a = jsReplyProxyBoundaryInterface;
    }

    public static /* synthetic */ Object a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new p(jsReplyProxyBoundaryInterface);
    }

    public static p b(InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) t9.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (p) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: J0.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p.a(jsReplyProxyBoundaryInterface);
            }
        });
    }
}

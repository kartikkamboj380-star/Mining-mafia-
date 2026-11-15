package J0;

import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class y extends I0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebResourceError f1924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f1925b;

    public y(InvocationHandler invocationHandler) {
        this.f1925b = (WebResourceErrorBoundaryInterface) t9.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface c() {
        if (this.f1925b == null) {
            this.f1925b = (WebResourceErrorBoundaryInterface) t9.a.a(WebResourceErrorBoundaryInterface.class, C.c().e(this.f1924a));
        }
        return this.f1925b;
    }

    private WebResourceError d() {
        if (this.f1924a == null) {
            this.f1924a = C.c().d(Proxy.getInvocationHandler(this.f1925b));
        }
        return this.f1924a;
    }

    @Override // I0.g
    public CharSequence a() {
        AbstractC0708a.b bVar = B.f1894v;
        if (bVar.b()) {
            return AbstractC0709b.a(d());
        }
        if (bVar.c()) {
            return c().getDescription();
        }
        throw B.a();
    }

    @Override // I0.g
    public int b() {
        AbstractC0708a.b bVar = B.f1895w;
        if (bVar.b()) {
            return AbstractC0709b.b(d());
        }
        if (bVar.c()) {
            return c().getErrorCode();
        }
        throw B.a();
    }

    public y(WebResourceError webResourceError) {
        this.f1924a = webResourceError;
    }
}

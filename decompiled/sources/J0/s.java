package J0;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class s extends I0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SafeBrowsingResponse f1915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f1916b;

    public s(InvocationHandler invocationHandler) {
        this.f1916b = (SafeBrowsingResponseBoundaryInterface) t9.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface b() {
        if (this.f1916b == null) {
            this.f1916b = (SafeBrowsingResponseBoundaryInterface) t9.a.a(SafeBrowsingResponseBoundaryInterface.class, C.c().b(this.f1915a));
        }
        return this.f1916b;
    }

    private SafeBrowsingResponse c() {
        if (this.f1915a == null) {
            this.f1915a = C.c().a(Proxy.getInvocationHandler(this.f1916b));
        }
        return this.f1915a;
    }

    @Override // I0.c
    public void a(boolean z9) {
        AbstractC0708a.f fVar = B.f1898z;
        if (fVar.b()) {
            AbstractC0714g.a(c(), z9);
        } else {
            if (!fVar.c()) {
                throw B.a();
            }
            b().showInterstitial(z9);
        }
    }

    public s(SafeBrowsingResponse safeBrowsingResponse) {
        this.f1915a = safeBrowsingResponse;
    }
}

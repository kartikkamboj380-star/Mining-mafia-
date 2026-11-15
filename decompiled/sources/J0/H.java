package J0;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f1904a;

    public H(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f1904a = webkitToCompatConverterBoundaryInterface;
    }

    public SafeBrowsingResponse a(InvocationHandler invocationHandler) {
        return G.a(this.f1904a.convertSafeBrowsingResponse(invocationHandler));
    }

    public InvocationHandler b(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f1904a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public z c(WebSettings webSettings) {
        return new z((WebSettingsBoundaryInterface) t9.a.a(WebSettingsBoundaryInterface.class, this.f1904a.convertSettings(webSettings)));
    }

    public WebResourceError d(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f1904a.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler e(WebResourceError webResourceError) {
        return this.f1904a.convertWebResourceError(webResourceError);
    }
}

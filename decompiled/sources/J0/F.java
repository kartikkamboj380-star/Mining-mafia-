package J0;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class F implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f1903a;

    public F(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f1903a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // J0.E
    public String[] a() {
        return this.f1903a.getSupportedFeatures();
    }

    @Override // J0.E
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) t9.a.a(WebViewProviderBoundaryInterface.class, this.f1903a.createWebView(webView));
    }

    @Override // J0.E
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) t9.a.a(ProfileStoreBoundaryInterface.class, this.f1903a.getProfileStore());
    }

    @Override // J0.E
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) t9.a.a(StaticsBoundaryInterface.class, this.f1903a.getStatics());
    }

    @Override // J0.E
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) t9.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f1903a.getWebkitToCompatConverter());
    }
}

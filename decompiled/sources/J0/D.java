package J0;

import android.webkit.WebViewClient;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WebViewProviderBoundaryInterface f1902a;

    public D(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f1902a = webViewProviderBoundaryInterface;
    }

    public t a(String str, String[] strArr) {
        return t.a(this.f1902a.addDocumentStartJavaScript(str, strArr));
    }

    public void b(String str, String[] strArr, I0.i.a aVar) {
        this.f1902a.addWebMessageListener(str, strArr, t9.a.c(new w(aVar)));
    }

    public WebViewClient c() {
        return this.f1902a.getWebViewClient();
    }

    public void d(String str) {
        this.f1902a.removeWebMessageListener(str);
    }

    public void e(boolean z9) {
        this.f1902a.setAudioMuted(z9);
    }

    public void f(String str) {
        this.f1902a.setProfile(str);
    }
}

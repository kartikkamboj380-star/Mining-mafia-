package p212v1;

import android.os.Handler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p202u1.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h.a f50104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f50106c;

    public b(h.a attempt, String javascriptToInject) {
        Intrinsics.checkNotNullParameter(attempt, "attempt");
        Intrinsics.checkNotNullParameter(javascriptToInject, "javascriptToInject");
        this.f50104a = attempt;
        this.f50105b = javascriptToInject;
        this.f50106c = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(WebView webView, b bVar) {
        if (webView != null) {
            webView.stopLoading();
        }
        if (webView != null) {
            webView.loadUrl("javascript:" + bVar.f50105b);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(final WebView webView, WebResourceRequest webResourceRequest) {
        if (Intrinsics.b(webResourceRequest != null ? webResourceRequest.getMethod() : null, "POST")) {
            String string = webResourceRequest.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (StringsKt.P(string, this.f50104a.b(), false, 2, null)) {
                try {
                    Thread.currentThread().interrupt();
                } catch (Exception unused) {
                }
                this.f50106c.post(new Runnable() { // from class: v1.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.b(webView, this);
                    }
                });
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}

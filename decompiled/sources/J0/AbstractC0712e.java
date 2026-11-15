package J0;

import android.content.pm.PackageInfo;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: J0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0712e {
    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }

    public static WebViewClient b(WebView webView) {
        return webView.getWebViewClient();
    }
}

package p198t7;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public class b extends a {
    public b(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        c(webView);
    }
}

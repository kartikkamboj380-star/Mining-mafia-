package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public class suf {
    private static final kq kq = new oq();

    private static class kq {
        private kq() {
        }

        public void kq(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    @TargetApi(19)
    private static class oq extends kq {
        private oq() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.suf.kq
        public void kq(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Throwable th) {
                    boolean z9 = th instanceof IllegalStateException;
                }
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void kq(WebView webView, String str) {
        kq.kq(webView, str);
    }
}

package com.bytedance.sdk.openadsdk.core.widget.kq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.fax;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private final WeakReference<Context> kq;
    private boolean oq = true;
    private final boolean bob = true;
    private final boolean fou = true;
    private final boolean csi = false;
    private final boolean rhi = true;
    private boolean rjo = true;

    private bob(Context context) {
        this.kq = new WeakReference<>(context);
    }

    public static bob kq(Context context) {
        return new bob(context);
    }

    public bob oq(boolean z9) {
        this.oq = z9;
        return this;
    }

    public static void oq(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            fax.bob(th.toString(), new Object[0]);
        }
    }

    public bob kq(boolean z9) {
        this.rjo = z9;
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void kq(WebView webView) {
        if (webView == null || this.kq.get() == null) {
            return;
        }
        oq(webView);
        WebSettings settings = webView.getSettings();
        kq(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e10) {
            fax.bob("SSWebSettings", e10.getMessage());
        }
        try {
            if (this.oq) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            fax.bob("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.rjo) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            fax.bob("SSWebSettings", th2.getMessage());
        }
    }

    private void kq(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            fax.bob(th.toString(), new Object[0]);
        }
    }

    public static void kq(com.bytedance.sdk.component.dgq.rhi rhiVar) {
        if (rhiVar == null) {
            return;
        }
        int iKq = com.bytedance.sdk.openadsdk.jhe.kq.kq("clear_web_cache_new", 0);
        if (iKq == 0) {
            rhiVar.kq(true);
        } else if (iKq == 1) {
            rhiVar.kq(false);
        }
    }
}

package com.bytedance.sdk.component.kq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public class fax extends kq {
    static final /* synthetic */ boolean nn = true;
    protected WebView dgq;
    protected String syt;

    @SuppressLint({"AddJavascriptInterface"})
    protected void bob() {
        if (!nn && this.dgq == null) {
            throw new AssertionError();
        }
        this.dgq.addJavascriptInterface(this, this.syt);
    }

    protected void fou() {
        this.dgq.removeJavascriptInterface(this.syt);
    }

    @Override // com.bytedance.sdk.component.kq.kq
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.kq.kq
    protected Context kq(dgq dgqVar) {
        Context context = dgqVar.csi;
        if (context != null) {
            return context;
        }
        WebView webView = dgqVar.kq;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.kq.kq
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    protected void oq(dgq dgqVar) {
        this.dgq = dgqVar.kq;
        this.syt = dgqVar.bob;
        if (dgqVar.wki) {
            return;
        }
        bob();
    }

    @Override // com.bytedance.sdk.component.kq.kq
    protected String kq() {
        return this.dgq.getUrl();
    }

    @Override // com.bytedance.sdk.component.kq.kq
    protected void oq() {
        super.oq();
        fou();
    }

    @Override // com.bytedance.sdk.component.kq.kq
    protected void kq(String str, suf sufVar) {
        if (sufVar != null && !TextUtils.isEmpty(sufVar.syt)) {
            String str2 = sufVar.syt;
            kq(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.kq(str, sufVar);
    }

    @Override // com.bytedance.sdk.component.kq.kq
    protected void kq(String str) {
        kq(str, "javascript:" + this.syt + "._handleMessageFromToutiao(" + str + ")");
    }

    private void kq(String str, final String str2) {
        if (this.rhi || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.kq.fax.1
            @Override // java.lang.Runnable
            public void run() {
                if (fax.this.rhi) {
                    return;
                }
                try {
                    fax.this.dgq.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.fou.post(runnable);
        } else {
            runnable.run();
        }
    }
}

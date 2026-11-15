package com.bytedance.sdk.component.kq;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class dgq {
    Context csi;
    vvw dgq;
    rjo fou;
    WebView kq;
    kq oq;
    boolean rhi;
    boolean rjo;
    ubx syt;
    boolean wki;
    String bob = "IESJSBridge";
    String nn = "host";
    final Set<String> ubx = new LinkedHashSet();
    final Set<String> vvw = new LinkedHashSet();

    dgq(WebView webView) {
        this.kq = webView;
    }

    public dgq kq(kq kqVar) {
        this.oq = kqVar;
        return this;
    }

    public dgq oq(boolean z9) {
        this.rjo = z9;
        return this;
    }

    private void oq() {
        if ((this.kq == null && !this.wki && this.oq == null) || ((TextUtils.isEmpty(this.bob) && this.kq != null) || this.fou == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public dgq kq(String str) {
        this.bob = str;
        return this;
    }

    public dgq kq(nn nnVar) {
        this.fou = rjo.kq(nnVar);
        return this;
    }

    public dgq kq(boolean z9) {
        this.rhi = z9;
        return this;
    }

    public nze kq() {
        oq();
        return new nze(this);
    }

    dgq() {
    }
}

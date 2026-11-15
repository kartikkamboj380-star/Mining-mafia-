package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2602Wg0 extends AbstractC2550Vg0 {
    public C2602Wg0(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        c(webView);
    }
}

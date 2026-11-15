package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2654Xg0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2886ah0 f25363a;

    C2654Xg0(C2886ah0 c2886ah0) {
        Objects.requireNonNull(c2886ah0);
        this.f25363a = c2886ah0;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String string = renderProcessGoneDetail.toString();
        String strValueOf = String.valueOf(webView);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length());
        sb.append("WebView renderer gone: ");
        sb.append(string);
        sb.append("for WebView: ");
        sb.append(strValueOf);
        Log.w("NativeBridge", sb.toString());
        C2886ah0 c2886ah0 = this.f25363a;
        if (c2886ah0.d() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            c2886ah0.c(null);
        }
        webView.destroy();
        return true;
    }
}

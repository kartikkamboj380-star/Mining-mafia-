package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2493Ue implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ValueCallback f24063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2026Le f24064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ WebView f24065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f24066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2597We f24067e;

    RunnableC2493Ue(C2597We c2597We, final C2026Le c2026Le, final WebView webView, final boolean z9) {
        this.f24064b = c2026Le;
        this.f24065c = webView;
        this.f24066d = z9;
        Objects.requireNonNull(c2597We);
        this.f24067e = c2597We;
        this.f24063a = new ValueCallback() { // from class: com.google.android.gms.internal.ads.Te
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                this.f23581a.f24067e.d(c2026Le, webView, (String) obj, z9);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.f24065c;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f24063a);
            } catch (Throwable unused) {
                this.f24063a.onReceiveValue("");
            }
        }
    }
}

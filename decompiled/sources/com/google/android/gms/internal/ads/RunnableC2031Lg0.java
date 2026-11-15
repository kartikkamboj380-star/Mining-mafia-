package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2031Lg0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebView f20584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f20585b;

    RunnableC2031Lg0(C2082Mg0 c2082Mg0, WebView webView, String str) {
        this.f20584a = webView;
        this.f20585b = str;
        Objects.requireNonNull(c2082Mg0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2082Mg0.k(this.f20584a, this.f20585b);
    }
}

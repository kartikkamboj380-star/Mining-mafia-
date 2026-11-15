package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class DialogInterfaceOnCancelListenerC1490Aw implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f17434a;

    DialogInterfaceOnCancelListenerC1490Aw(JsPromptResult jsPromptResult) {
        this.f17434a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f17434a.cancel();
    }
}

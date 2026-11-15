package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class DialogInterfaceOnCancelListenerC5808xw implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsResult f35066a;

    DialogInterfaceOnCancelListenerC5808xw(JsResult jsResult) {
        this.f35066a = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f35066a.cancel();
    }
}

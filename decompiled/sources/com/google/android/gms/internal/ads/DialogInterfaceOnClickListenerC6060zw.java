package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC6060zw implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsResult f35886a;

    DialogInterfaceOnClickListenerC6060zw(JsResult jsResult) {
        this.f35886a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f35886a.confirm();
    }
}

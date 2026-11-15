package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC5934yw implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsResult f35487a;

    DialogInterfaceOnClickListenerC5934yw(JsResult jsResult) {
        this.f35487a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f35487a.cancel();
    }
}

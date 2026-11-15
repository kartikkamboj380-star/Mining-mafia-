package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC1594Cw implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f18013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditText f18014b;

    DialogInterfaceOnClickListenerC1594Cw(JsPromptResult jsPromptResult, EditText editText) {
        this.f18013a = jsPromptResult;
        this.f18014b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f18013a.confirm(this.f18014b.getText().toString());
    }
}

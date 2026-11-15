package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: loaded from: classes2.dex */
final class W extends zabw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f17024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ X f17025b;

    W(X x10, Dialog dialog) {
        this.f17025b = x10;
        this.f17024a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        this.f17025b.f17027b.zad();
        if (this.f17024a.isShowing()) {
            this.f17024a.dismiss();
        }
    }
}

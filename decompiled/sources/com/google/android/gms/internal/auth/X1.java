package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class X1 extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7094k f35988a;

    X1(C6071b c6071b, C7094k c7094k) {
        this.f35988a = c7094k;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        C6071b.d(status, null, this.f35988a);
    }
}

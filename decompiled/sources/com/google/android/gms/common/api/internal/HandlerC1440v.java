package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class HandlerC1440v extends com.google.android.gms.internal.base.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zabe f17086a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC1440v(zabe zabeVar, Looper looper) {
        super(looper);
        this.f17086a = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            zabe.zaj(this.f17086a);
            return;
        }
        if (i10 == 2) {
            zabe.zai(this.f17086a);
            return;
        }
        Log.w("GoogleApiClientImpl", "Unknown message id: " + i10);
    }
}

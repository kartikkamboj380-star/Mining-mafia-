package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class HandlerC1443y extends com.google.android.gms.internal.base.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zabi f17089a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC1443y(zabi zabiVar, Looper looper) {
        super(looper);
        this.f17089a = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ((AbstractC1442x) message.obj).b(this.f17089a);
        } else {
            if (i10 == 2) {
                throw ((RuntimeException) message.obj);
            }
            Log.w("GACStateManager", "Unknown message id: " + i10);
        }
    }
}

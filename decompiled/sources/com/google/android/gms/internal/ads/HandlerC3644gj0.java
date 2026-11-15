package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC3644gj0 extends Handler {
    public HandlerC3644gj0(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    protected void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        a(message);
    }
}

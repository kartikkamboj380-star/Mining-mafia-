package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class t extends Handler {
    private final Looper zaa;

    public t(Looper looper) {
        super(looper);
        this.zaa = Looper.getMainLooper();
    }

    public t(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zaa = Looper.getMainLooper();
    }
}

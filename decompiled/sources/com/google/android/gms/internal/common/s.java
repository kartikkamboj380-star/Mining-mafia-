package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class s extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f36230a;

    public s(Looper looper) {
        super(looper);
        this.f36230a = Looper.getMainLooper();
    }

    public s(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f36230a = Looper.getMainLooper();
    }
}

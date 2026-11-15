package com.tenjin.android.utils.threading;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class TenjinHandlerThread extends HandlerThread implements IThreading {
    private volatile Handler handler;

    public TenjinHandlerThread(String str) {
        super(str, 10);
    }

    @Override // com.tenjin.android.utils.threading.IThreading
    public void post(Runnable runnable) {
        if (this.handler != null) {
            this.handler.post(runnable);
        } else {
            Log.e("TenjinHandlerThread", "Handler is not initialized.");
        }
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        super.start();
        this.handler = new Handler(getLooper());
    }
}

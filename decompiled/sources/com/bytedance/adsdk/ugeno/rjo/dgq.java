package com.bytedance.adsdk.ugeno.rjo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends Handler {
    private final WeakReference<kq> kq;

    public interface kq {
        void kq(Message message);
    }

    public dgq(Looper looper, kq kqVar) {
        super(looper);
        this.kq = new WeakReference<>(kqVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        kq kqVar = this.kq.get();
        if (kqVar == null || message == null) {
            return;
        }
        kqVar.kq(message);
    }
}

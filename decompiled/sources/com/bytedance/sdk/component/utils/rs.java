package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class rs extends Handler {
    protected WeakReference<kq> kq;

    public interface kq {
        void kq(Message message);
    }

    public rs(kq kqVar) {
        if (kqVar != null) {
            this.kq = new WeakReference<>(kqVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        kq kqVar;
        WeakReference<kq> weakReference = this.kq;
        if (weakReference == null || (kqVar = weakReference.get()) == null || message == null) {
            return;
        }
        kqVar.kq(message);
    }

    public rs(Looper looper, kq kqVar) {
        super(looper);
        if (kqVar != null) {
            this.kq = new WeakReference<>(kqVar);
        }
    }
}

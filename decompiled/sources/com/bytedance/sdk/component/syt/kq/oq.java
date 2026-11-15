package com.bytedance.sdk.component.syt.kq;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.rs;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class oq extends rs implements bob {
    private final HandlerThread oq;

    oq(HandlerThread handlerThread, rs.kq kqVar) {
        super(handlerThread.getLooper(), kqVar);
        this.oq = handlerThread;
    }

    @Override // com.bytedance.sdk.component.syt.kq.bob
    public void kq() {
        removeCallbacksAndMessages(null);
        WeakReference<rs.kq> weakReference = this.kq;
        if (weakReference != null) {
            weakReference.clear();
            this.kq = null;
        }
    }

    public void oq() {
        HandlerThread handlerThread = this.oq;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    public void kq(rs.kq kqVar) {
        this.kq = new WeakReference<>(kqVar);
    }
}

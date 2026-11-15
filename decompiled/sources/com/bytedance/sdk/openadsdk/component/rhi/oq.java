package com.bytedance.sdk.openadsdk.component.rhi;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class oq implements Handler.Callback {
    private kq bob;
    private long nn;
    private final com.bytedance.sdk.openadsdk.component.syt.kq oq;
    private boolean rjo;
    private long ubx;
    private boolean vvw;
    private Handler kq = new Handler(Looper.myLooper(), this);
    private int fou = 0;
    private int csi = 5;
    private int rhi = 0;
    private final int syt = 1000;
    private int dgq = 1000;

    public oq(com.bytedance.sdk.openadsdk.component.syt.kq kqVar) {
        this.oq = kqVar;
    }

    public void bob() {
        if (this.kq != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.fou;
            this.kq.sendMessage(messageObtain);
        }
    }

    public void csi() {
        this.kq.removeCallbacksAndMessages(null);
        this.kq = null;
    }

    public void fou() {
        Handler handler = this.kq;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 100 && this.kq != null) {
            int i10 = message.arg1;
            kq(i10);
            if (i10 > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i10 - 1;
                this.kq.sendMessageDelayed(messageObtain, this.dgq);
            }
        }
        return true;
    }

    public void kq(int i10) {
        this.fou = i10;
        int i11 = this.csi - i10;
        this.oq.oq(((long) i11) * 1000);
        boolean z9 = true;
        if (i10 <= 0) {
            kq kqVar = this.bob;
            if (kqVar != null && !this.rjo) {
                kqVar.oq();
                this.rjo = true;
            }
            i10 = 0;
        }
        kq kqVar2 = this.bob;
        if (kqVar2 != null) {
            int iMax = Math.max(this.rhi - i11, 0);
            if (i10 != 0 && i11 < this.rhi) {
                z9 = false;
            }
            kqVar2.kq(iMax, z9);
        }
    }

    public void oq(int i10) {
        this.rhi = Math.min(i10, this.csi);
    }

    public void oq() {
        Handler handler = this.kq;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.csi, 0));
        }
    }

    public void kq(float f10) {
        int i10 = (int) f10;
        this.csi = i10;
        if (i10 <= 0) {
            this.csi = 5;
        }
    }

    public void kq(kq kqVar) {
        this.bob = kqVar;
    }

    public int kq() {
        return this.rhi;
    }

    public void kq(int i10, float f10, boolean z9) {
        com.bytedance.sdk.openadsdk.component.syt.kq kqVar;
        if ((i10 == 1 || i10 == 2) && this.vvw != z9) {
            this.vvw = z9;
            if (i10 == 1 && (kqVar = this.oq) != null) {
                kqVar.kq(z9);
            }
            if (z9) {
                try {
                    this.dgq = (int) (1000.0f / f10);
                    this.ubx = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = this.nn + (System.currentTimeMillis() - this.ubx);
                this.nn = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.syt.kq kqVar2 = this.oq;
                if (kqVar2 != null) {
                    kqVar2.kq(jCurrentTimeMillis);
                }
            }
            this.dgq = 1000;
        }
    }
}

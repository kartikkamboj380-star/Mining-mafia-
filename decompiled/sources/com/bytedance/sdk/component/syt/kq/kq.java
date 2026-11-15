package com.bytedance.sdk.component.syt.kq;

import android.os.Handler;
import com.bytedance.sdk.component.utils.rs;
import com.bytedance.sdk.component.utils.syt;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private final fou<oq> kq;
    private Handler oq;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.syt.kq.kq$kq, reason: collision with other inner class name */
    private static class C0257kq {
        private static final kq kq = new kq();
    }

    public Handler oq() {
        if (this.oq == null) {
            synchronized (kq.class) {
                try {
                    if (this.oq == null) {
                        this.oq = kq("csj_io_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.oq;
    }

    private kq() {
        this.kq = fou.kq(2);
    }

    public static kq kq() {
        return C0257kq.kq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.syt.kq.kq.1
                @Override // java.lang.Runnable
                public void run() {
                    kq.this.kq(handler, handler2);
                }
            }, 1000L);
        }
    }

    private oq oq(rs.kq kqVar, String str) {
        return new oq(syt.kq(str), kqVar);
    }

    public rs kq(rs.kq kqVar, final String str) {
        oq oqVar = (oq) this.kq.kq();
        if (oqVar != null) {
            oqVar.kq(kqVar);
            oqVar.post(new Runnable() { // from class: com.bytedance.sdk.component.syt.kq.kq.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return oqVar;
        }
        return oq(kqVar, str);
    }

    public rs kq(String str) {
        return kq((rs.kq) null, str);
    }

    public boolean kq(rs rsVar) {
        if (!(rsVar instanceof oq)) {
            return false;
        }
        oq oqVar = (oq) rsVar;
        if (this.kq.kq(oqVar)) {
            return true;
        }
        oqVar.oq();
        return true;
    }
}

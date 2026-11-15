package com.bytedance.sdk.openadsdk.ou.oq;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.fax;

/* JADX INFO: loaded from: classes.dex */
public class rjo {
    private static kq kq;
    private static HandlerThread oq;

    private static class kq extends Handler {
        public kq(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            oq oqVar = (oq) message.obj;
            if (oqVar == null) {
                return;
            }
            int iOq = oqVar.oq();
            if (iOq == 1) {
                oqVar.rjo();
            } else {
                if (iOq != 2) {
                    csi.oq(oqVar.ubx());
                    return;
                }
                oqVar.syt();
            }
            if (oqVar.dgq()) {
                csi.oq(oqVar.ubx());
            } else if (oqVar.vvw()) {
                kq(oqVar);
            }
        }

        public void kq(oq oqVar) {
            if (oqVar == null) {
                return;
            }
            int iIntValue = oqVar.ubx().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = oqVar;
            sendMessageDelayed(messageObtain, oqVar.rhi());
        }
    }

    public static void kq() {
    }

    public static void oq(oq oqVar) {
        if (oqVar == null || kq == null) {
            return;
        }
        try {
            int iIntValue = oqVar.ubx().intValue();
            if (kq.hasMessages(iIntValue)) {
                kq.removeMessages(iIntValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void kq(oq oqVar) {
        if (oqVar == null) {
            return;
        }
        oq();
        kq kqVar = kq;
        if (kqVar != null) {
            kqVar.kq(oqVar);
        }
    }

    public static void oq() {
        if (kq != null) {
            return;
        }
        try {
            HandlerThread handlerThread = oq;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (rjo.class) {
                try {
                    HandlerThread handlerThread2 = oq;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        oq = com.bytedance.sdk.component.utils.syt.kq("csj_MRC");
                        kq = new kq(oq.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            fax.bob("MRC", th2.getMessage());
        }
    }
}

package com.bytedance.sdk.openadsdk.ou.kq;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.syt.syt;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.utils.nz;
import com.bytedance.sdk.openadsdk.utils.wol;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private final uml oq;
    private int kq = bob.oq;
    private final AtomicBoolean bob = new AtomicBoolean(false);
    private final AtomicBoolean fou = new AtomicBoolean(true);
    private final AtomicInteger csi = new AtomicInteger(0);
    private long rhi = 0;
    private long rjo = 0;
    private final Runnable syt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ou.kq.oq.3
        @Override // java.lang.Runnable
        public void run() {
            oq.this.fou();
        }
    };

    public oq(uml umlVar) {
        this.oq = umlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rhi() {
        if (this.csi.get() != 1 || this.rhi == 0) {
            return;
        }
        Handler handlerKq = kq.kq();
        if (handlerKq != null) {
            handlerKq.removeCallbacks(this.syt);
        }
        this.rjo += SystemClock.elapsedRealtime() - this.rhi;
        this.rhi = 0L;
        this.csi.set(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void csi() {
        if (this.csi.get() == 2) {
            this.rhi = SystemClock.elapsedRealtime();
            Handler handlerKq = kq.kq();
            if (handlerKq != null) {
                handlerKq.postDelayed(this.syt, ((long) this.kq) - this.rjo);
            }
            this.csi.set(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fou() {
        if (this.bob.compareAndSet(false, true)) {
            oq();
            final long jElapsedRealtime = this.rjo + (SystemClock.elapsedRealtime() - this.rhi);
            this.rjo = jElapsedRealtime;
            nz.bob(new syt("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.ou.kq.oq.1
                @Override // java.lang.Runnable
                public void run() {
                    String strKq = wol.kq(oq.this.oq);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", oq.this.oq.kcj() * 1000);
                        jSONObject.put("ev_wait_time_client", jElapsedRealtime);
                    } catch (JSONException e10) {
                        fax.bob("EvTracker", e10.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.fou.bob.oq(oq.this.oq, strKq, oq.this.oq.lr(), jSONObject);
                }
            });
        }
    }

    public boolean bob() {
        return this.csi.get() == 3;
    }

    public void kq() {
        if (this.csi.get() != 0) {
            return;
        }
        this.kq = this.oq.kcj() * 1000;
        this.csi.set(1);
        this.rhi = SystemClock.elapsedRealtime();
        Handler handlerKq = kq.kq();
        if (handlerKq != null) {
            handlerKq.postDelayed(this.syt, this.kq);
        }
    }

    public void oq() {
        this.csi.set(3);
        Handler handlerKq = kq.kq();
        if (handlerKq != null) {
            handlerKq.removeCallbacks(this.syt);
        }
    }

    public void kq(final int i10) {
        Handler handlerKq;
        if (this.csi.get() == 3 || (handlerKq = kq.kq()) == null) {
            return;
        }
        handlerKq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ou.kq.oq.2
            @Override // java.lang.Runnable
            public void run() {
                if (i10 == 4 && oq.this.fou.get()) {
                    oq.this.csi();
                    return;
                }
                int i11 = i10;
                if (i11 == 8) {
                    oq.this.rhi();
                } else if (i11 == 5) {
                    oq.this.fou();
                }
            }
        });
    }

    public void kq(boolean z9) {
        this.fou.set(z9);
    }
}

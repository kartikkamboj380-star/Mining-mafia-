package com.bytedance.sdk.component.adexpress.kq.oq;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.mq;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class csi extends bob {
    private static File kq;
    private static volatile csi oq;
    private AtomicBoolean bob = new AtomicBoolean(true);
    private AtomicBoolean fou = new AtomicBoolean(false);
    private boolean csi = false;
    private AtomicBoolean rhi = new AtomicBoolean(false);
    private AtomicInteger rjo = new AtomicInteger(0);
    private AtomicLong syt = new AtomicLong();

    private csi() {
        nn();
    }

    private void nn() {
        com.bytedance.sdk.component.adexpress.fou.fou.oq(new com.bytedance.sdk.component.syt.syt("init") { // from class: com.bytedance.sdk.component.adexpress.kq.oq.csi.1
            @Override // java.lang.Runnable
            public void run() {
                syt.kq();
                csi.this.bob.set(false);
                csi.this.fou();
                csi.this.rjo();
                if (com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob() == null || !mq.kq(com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().oq()) || com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob() == null) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().fou();
            }
        }, 10);
    }

    public static csi oq() {
        if (oq == null) {
            synchronized (csi.class) {
                try {
                    if (oq == null) {
                        oq = new csi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oq;
    }

    public static File syt() {
        if (kq == null) {
            try {
                File file = new File(new File(fou.kq(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                kq = file;
            } catch (Throwable unused) {
            }
        }
        return kq;
    }

    private void ubx() {
        if (this.rjo.getAndSet(0) <= 0 || System.currentTimeMillis() - this.syt.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        rjo();
    }

    public void bob() {
        nn();
    }

    public boolean csi() {
        return this.csi;
    }

    public void dgq() {
        this.rhi.set(true);
        this.csi = false;
        this.fou.set(false);
    }

    public void fou() {
        com.bytedance.sdk.component.adexpress.kq.bob.kq kqVarOq = syt.oq();
        if (kqVarOq == null || !kqVarOq.syt()) {
            return;
        }
        boolean zKq = kq(kqVarOq);
        if (!zKq) {
            syt.fou();
        }
        this.csi = zKq;
    }

    public com.bytedance.sdk.component.adexpress.kq.bob.kq rhi() {
        return syt.oq();
    }

    public void rjo() {
        kq(false);
    }

    public boolean kq(com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar) {
        if (kqVar == null) {
            return false;
        }
        return kq(kqVar.kq()) || kq(kqVar.csi()) || kq(kqVar.rhi());
    }

    @Override // com.bytedance.sdk.component.adexpress.kq.oq.bob
    public File kq() {
        return syt();
    }

    public void kq(boolean z9) {
        List<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> listKq;
        boolean z10;
        if (this.bob.get()) {
            return;
        }
        try {
            if (this.fou.get()) {
                if (z9) {
                    this.rjo.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z11 = true;
            this.fou.set(true);
            com.bytedance.sdk.component.adexpress.kq.bob.kq kqVarCsi = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().csi();
            com.bytedance.sdk.component.adexpress.kq.bob.kq kqVarOq = syt.oq();
            if (kqVarCsi != null && kqVarCsi.syt()) {
                if (!syt.oq(kqVarCsi)) {
                    this.fou.set(false);
                    this.syt.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob() != null) {
                    com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().bob().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.kq.oq.csi.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.csi.csi.kq().oq();
                        }
                    });
                }
                syt.kq(kqVarCsi);
                boolean zKq = (kqVarCsi.csi() == null || TextUtils.isEmpty(kqVarCsi.csi().kq())) ? false : kq(kqVarCsi.csi().kq());
                if (kqVarCsi.kq().size() != 0) {
                    listKq = kq(kqVarCsi, kqVarOq);
                    z10 = listKq != null;
                } else {
                    listKq = null;
                    z10 = zKq;
                }
                if (!zKq) {
                    List<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> listOq = oq(kqVarCsi, kqVarOq);
                    if (listKq == null || listOq == null) {
                        listKq = listOq;
                    } else {
                        listKq.addAll(listOq);
                    }
                    if (listOq == null) {
                        z11 = false;
                    }
                    if (listOq == null) {
                        this.fou.set(false);
                    }
                    z10 = z11;
                }
                if (z10 && kq(kqVarCsi)) {
                    syt.kq(kqVarCsi);
                    syt.bob();
                    oq(listKq);
                }
                fou();
                this.fou.set(false);
                this.syt.set(System.currentTimeMillis());
                ubx();
                return;
            }
            this.fou.set(false);
            kq(109);
        } catch (Throwable unused) {
        }
    }

    public void oq(boolean z9) {
        this.rhi.set(z9);
    }
}

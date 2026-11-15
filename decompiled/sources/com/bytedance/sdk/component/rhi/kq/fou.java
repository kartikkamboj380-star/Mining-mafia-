package com.bytedance.sdk.component.rhi.kq;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.mq;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    public static final fou kq = new fou();

    private boolean bob() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private void oq(kq kqVar, Context context) {
        bob.kq(context, "context == null");
        bob.kq(kqVar, "AdLogConfig == null");
        bob.kq(kqVar.fou(), "AdLogDepend ==null");
    }

    public void kq(kq kqVar, Context context) {
        oq(kqVar, context);
        syt.rjo().kq(context);
        syt.rjo().kq(kqVar.nn());
        syt.rjo().oq(kqVar.rjo());
        syt.rjo().bob(kqVar.syt());
        syt.rjo().kq(kqVar.oq());
        syt.rjo().fou(kqVar.dgq());
        syt.rjo().csi(kqVar.rhi());
        syt.rjo().kq(kqVar.kq() == null ? com.bytedance.sdk.component.rhi.kq.kq.kq.csi.kq : kqVar.kq());
        syt.rjo().oq(kqVar.ubx());
        syt.rjo().kq(kqVar.fou());
        syt.rjo().kq(kqVar.bob());
        syt.rjo().kq(kqVar.csi());
        com.bytedance.sdk.component.rhi.kq.oq.bob.bob.kq(kqVar.wki());
        com.bytedance.sdk.component.rhi.kq.oq.bob.bob.oq(kqVar.vvw());
        kq(kqVar);
    }

    public void oq() {
        final csi csiVarMxq = syt.rjo().mxq();
        if (csiVarMxq == null || syt.rjo().rhi() == null || csiVarMxq.fou() == null) {
            return;
        }
        if (syt.rjo().oq()) {
            if (kq(syt.rjo().rhi(), csiVarMxq)) {
                syt.rjo().ubx();
                return;
            } else if (bob()) {
                csiVarMxq.fou().execute(new com.bytedance.sdk.component.rhi.kq.csi.csi("stop") { // from class: com.bytedance.sdk.component.rhi.kq.fou.3
                    @Override // java.lang.Runnable
                    public void run() {
                        fou.this.oq(csiVarMxq.rhi());
                    }
                });
                return;
            } else {
                oq(csiVarMxq.rhi());
                return;
            }
        }
        syt.rjo().ubx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq(int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.rhi.kq.oq.oq.kq.oq();
        } else if (i10 == 1) {
            com.bytedance.sdk.component.rhi.kq.oq.oq.oq.oq();
        }
    }

    private void oq(final com.bytedance.sdk.component.rhi.kq.fou.kq kqVar) {
        final csi csiVarMxq = syt.rjo().mxq();
        if (kqVar == null || csiVarMxq == null || syt.rjo().rhi() == null || csiVarMxq.fou() == null) {
            return;
        }
        if (syt.rjo().oq()) {
            if (kq(syt.rjo().rhi(), csiVarMxq)) {
                syt.rjo().kq(kqVar);
                return;
            }
            bob();
            if (bob()) {
                csiVarMxq.fou().execute(new com.bytedance.sdk.component.rhi.kq.csi.csi("dispatchEvent") { // from class: com.bytedance.sdk.component.rhi.kq.fou.4
                    @Override // java.lang.Runnable
                    public void run() {
                        fou.this.kq(kqVar, csiVarMxq.rhi());
                    }
                });
                return;
            } else {
                kq(kqVar, csiVarMxq.rhi());
                return;
            }
        }
        syt.rjo().kq(kqVar);
    }

    private void kq(kq kqVar) {
        Executor executorCsi;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.rhi.kq.bob.kq.oq()) {
            com.bytedance.sdk.component.rhi.kq.bob.kq.kq();
            return;
        }
        csi csiVarFou = kqVar.fou();
        if (csiVarFou == null || !com.bytedance.sdk.component.rhi.kq.bob.kq.oq() || (executorCsi = csiVarFou.csi()) == null) {
            return;
        }
        executorCsi.execute(new Runnable() { // from class: com.bytedance.sdk.component.rhi.kq.fou.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.rhi.kq.bob.kq.kq();
            }
        });
    }

    public void kq(boolean z9) {
        syt.rjo().kq(z9);
    }

    private boolean kq(Context context, csi csiVar) {
        if (context == null || csiVar == null) {
            return false;
        }
        if (csiVar.rhi() == 2) {
            return true;
        }
        if (csiVar.rhi() == 1) {
            return csiVar.wki();
        }
        try {
            return mq.kq(context);
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void kq() {
        final csi csiVarMxq = syt.rjo().mxq();
        if (csiVarMxq == null || syt.rjo().rhi() == null || csiVarMxq.fou() == null) {
            return;
        }
        if (syt.rjo().oq()) {
            if (kq(syt.rjo().rhi(), csiVarMxq)) {
                syt.rjo().dgq();
                return;
            } else if (bob()) {
                csiVarMxq.fou().execute(new com.bytedance.sdk.component.rhi.kq.csi.csi("start") { // from class: com.bytedance.sdk.component.rhi.kq.fou.2
                    @Override // java.lang.Runnable
                    public void run() {
                        fou.this.kq(csiVarMxq.rhi());
                    }
                });
                return;
            } else {
                kq(csiVarMxq.rhi());
                return;
            }
        }
        syt.rjo().dgq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.rhi.kq.oq.oq.kq.kq();
        } else if (i10 == 1) {
            com.bytedance.sdk.component.rhi.kq.oq.oq.oq.kq();
        }
    }

    public void kq(com.bytedance.sdk.component.rhi.kq.fou.kq kqVar) {
        oq(kqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(com.bytedance.sdk.component.rhi.kq.fou.kq kqVar, int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.rhi.kq.oq.oq.kq.kq(kqVar);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.rhi.kq.oq.oq.oq.kq(kqVar);
        }
    }

    public void kq(final String str, final List<String> list, final boolean z9, Map<String, String> map, final int i10, final String str2) {
        final csi csiVarMxq = syt.rjo().mxq();
        if (csiVarMxq == null || syt.rjo().rhi() == null || csiVarMxq.fou() == null || !csiVarMxq.syt()) {
            return;
        }
        if (csiVarMxq.rhi() == 1) {
            if (list == null || list.isEmpty()) {
                return;
            }
        } else if (csiVarMxq.rhi() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
            return;
        }
        if (syt.rjo().oq() && !kq(syt.rjo().rhi(), csiVarMxq)) {
            if (bob()) {
                csiVarMxq.fou().execute(new com.bytedance.sdk.component.rhi.kq.csi.csi("trackFailed") { // from class: com.bytedance.sdk.component.rhi.kq.fou.5
                    @Override // java.lang.Runnable
                    public void run() {
                        fou.this.kq(str, (List<String>) list, z9, csiVarMxq.rhi(), i10, str2);
                    }
                });
                return;
            } else {
                kq(str, list, z9, csiVarMxq.rhi(), i10, str2);
                return;
            }
        }
        syt.rjo().kq(str, list, z9, map, i10, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(String str, List<String> list, boolean z9, int i10, int i11, String str2) {
        if (i10 == 0) {
            com.bytedance.sdk.component.rhi.kq.oq.oq.kq.kq(str, list, z9);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.rhi.kq.oq.oq.oq.kq(str, list, z9, i11, str2);
        }
    }

    public void kq(final String str, final boolean z9) {
        final csi csiVarMxq = syt.rjo().mxq();
        if (csiVarMxq == null || syt.rjo().rhi() == null || csiVarMxq.fou() == null || !csiVarMxq.syt() || (csiVarMxq.rhi() == 0 && TextUtils.isEmpty(str))) {
            return;
        }
        if (syt.rjo().oq() && !kq(syt.rjo().rhi(), csiVarMxq)) {
            if (bob()) {
                csiVarMxq.fou().execute(new com.bytedance.sdk.component.rhi.kq.csi.csi("trackFailed") { // from class: com.bytedance.sdk.component.rhi.kq.fou.6
                    @Override // java.lang.Runnable
                    public void run() {
                        fou.this.kq(str, csiVarMxq.rhi(), z9);
                    }
                });
                return;
            } else {
                kq(str, csiVarMxq.rhi(), z9);
                return;
            }
        }
        syt.rjo().kq(str, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(String str, int i10, boolean z9) {
        if (i10 == 0) {
            com.bytedance.sdk.component.rhi.kq.oq.oq.kq.kq(str);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.rhi.kq.oq.oq.oq.kq(str, z9);
        }
    }
}

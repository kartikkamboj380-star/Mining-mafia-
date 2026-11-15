package com.bytedance.sdk.component.adexpress.dynamic.kq;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.bob;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xn;
import com.bytedance.sdk.component.adexpress.dynamic.fou.rhi;
import com.bytedance.sdk.component.adexpress.oq.fou;
import com.bytedance.sdk.component.adexpress.oq.rjo;
import com.bytedance.sdk.component.adexpress.oq.suf;
import com.bytedance.sdk.component.adexpress.oq.syt;
import com.bytedance.sdk.component.adexpress.oq.ubx;
import com.bytedance.sdk.component.adexpress.oq.wki;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.dgq;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq implements fou<DynamicRootView>, ubx {
    private Context bob;
    private syt csi;
    private rjo fou;
    private DynamicRootView kq;
    private com.bytedance.sdk.component.adexpress.dynamic.csi.syt oq;
    private wki rhi;
    private ScheduledFuture<?> rjo;
    private AtomicBoolean syt = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.kq.kq$kq, reason: collision with other inner class name */
    private class RunnableC0237kq implements Runnable {
        private int oq;

        public RunnableC0237kq(int i10) {
            this.oq = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.oq == 2) {
                kq.this.kq.callBackRenderFail(kq.this.oq instanceof com.bytedance.sdk.component.adexpress.dynamic.csi.rjo ? 127 : 117, null);
            }
        }
    }

    public kq(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z9, com.bytedance.sdk.component.adexpress.dynamic.csi.syt sytVar, wki wkiVar, com.bytedance.sdk.component.adexpress.dynamic.rhi.kq kqVar) {
        this.bob = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z9, wkiVar, kqVar);
        this.kq = dynamicRootView;
        this.oq = sytVar;
        this.rhi = wkiVar;
        dynamicRootView.setRenderListener(this);
        this.rhi = wkiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rhi() {
        this.rhi.csi().oq(bob());
        JSONObject jSONObjectBob = this.rhi.bob();
        if (com.bytedance.sdk.component.adexpress.kq.oq.oq.kq(jSONObjectBob)) {
            this.oq.kq(new com.bytedance.sdk.component.adexpress.dynamic.rhi.oq() { // from class: com.bytedance.sdk.component.adexpress.dynamic.kq.kq.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.rhi.oq
                public void kq(final com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
                    kq.this.syt();
                    kq.this.rhi.csi().bob(kq.this.bob());
                    kq.this.kq(sytVar);
                    kq.this.oq(sytVar);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        kq.this.bob(sytVar);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.kq.kq.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                kq.this.bob(sytVar);
                            }
                        });
                    }
                    if (kq.this.kq == null || sytVar == null) {
                        return;
                    }
                    kq.this.kq.setBgColor(sytVar.kq());
                    kq.this.kq.setBgMaterialCenterCalcColor(sytVar.oq());
                }
            });
            this.oq.kq(this.rhi);
            return;
        }
        int i10 = this.oq instanceof com.bytedance.sdk.component.adexpress.dynamic.csi.rjo ? 123 : 113;
        DynamicRootView dynamicRootView = this.kq;
        StringBuilder sb = new StringBuilder("data null is ");
        sb.append(jSONObjectBob == null);
        dynamicRootView.callBackRenderFail(i10, sb.toString());
    }

    private boolean rjo() {
        DynamicRootView dynamicRootView = this.kq;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syt() {
        try {
            ScheduledFuture<?> scheduledFuture = this.rjo;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.rjo.cancel(false);
            this.rjo = null;
        } catch (Throwable unused) {
        }
    }

    public DynamicRootView fou() {
        return this.kq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        float fRjo;
        float fRhi;
        List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> listUbx;
        if (sytVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> listUbx2 = sytVar.ubx();
        if (listUbx2 == null || listUbx2.size() <= 0) {
            fRjo = 0.0f;
        } else {
            fRjo = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar2 : listUbx2) {
                if (sytVar2.rjo() > sytVar.rjo() - sytVar2.dgq() || (listUbx = sytVar2.ubx()) == null || listUbx.size() <= 0) {
                    fRhi = 0.0f;
                } else {
                    fRhi = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar3 : listUbx) {
                        if (sytVar3.nn().oq().equals("logo-union")) {
                            fRhi = sytVar3.nn().rhi();
                            fRjo = (((-fRhi) + sytVar.rjo()) - sytVar2.rjo()) + sytVar2.nn().csi().oz();
                        }
                    }
                }
                oq(sytVar2);
                if (fRhi <= -15.0f) {
                    sytVar2.rhi(sytVar2.dgq() - fRhi);
                    sytVar2.fou(sytVar2.rjo() + fRhi);
                    for (com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar4 : sytVar2.ubx()) {
                        sytVar4.fou(sytVar4.rjo() - fRhi);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVarVvw = sytVar.vvw();
        if (sytVarVvw == null) {
            return;
        }
        float fRhi2 = sytVar.rhi() - sytVarVvw.rhi();
        float fRjo2 = sytVar.rjo() - sytVarVvw.rjo();
        sytVar.bob(fRhi2);
        sytVar.fou(fRjo2);
        if (fRjo > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            sytVar.fou(sytVar.rjo() - fRjo);
            sytVar.rhi(sytVar.dgq() + fRjo);
            for (com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar5 : sytVar.ubx()) {
                sytVar5.fou(sytVar5.rjo() + fRjo);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.fou
    public int bob() {
        return this.oq instanceof com.bytedance.sdk.component.adexpress.dynamic.csi.rjo ? 3 : 2;
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.fou
    public void kq(rjo rjoVar) {
        this.fou = rjoVar;
        int iRhi = this.rhi.rhi();
        if (iRhi < 0) {
            this.kq.callBackRenderFail(this.oq instanceof com.bytedance.sdk.component.adexpress.dynamic.csi.rjo ? 127 : 117, "time is ".concat(String.valueOf(iRhi)));
            return;
        }
        this.rjo = com.bytedance.sdk.component.adexpress.fou.fou.kq(new RunnableC0237kq(2), iRhi, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.rhi.dgq() <= 0) {
            rhi();
        } else {
            dgq.oq().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.kq.kq.1
                @Override // java.lang.Runnable
                public void run() {
                    kq.this.rhi();
                }
            }, this.rhi.dgq());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bob(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        if (sytVar == null) {
            this.kq.callBackRenderFail(this.oq instanceof com.bytedance.sdk.component.adexpress.dynamic.csi.rjo ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.rhi.csi().fou(bob());
        try {
            this.kq.render(sytVar, bob());
        } catch (Exception e10) {
            int i10 = this.oq instanceof com.bytedance.sdk.component.adexpress.dynamic.csi.rjo ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : 118;
            this.kq.callBackRenderFail(i10, "exception is " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> listUbx;
        if (sytVar == null || (listUbx = sytVar.ubx()) == null || listUbx.size() <= 0) {
            return;
        }
        Collections.sort(listUbx, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.kq.kq.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar2, com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar3) {
                rhi rhiVarCsi = sytVar2.nn().csi();
                rhi rhiVarCsi2 = sytVar3.nn().csi();
                if (rhiVarCsi == null || rhiVarCsi2 == null) {
                    return 0;
                }
                return rhiVarCsi.rul() >= rhiVarCsi2.rul() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar2 : listUbx) {
            if (sytVar2 != null) {
                kq(sytVar2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.fou
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public DynamicRootView csi() {
        return fou();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void kq(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                kq(viewGroup.getChildAt(i10));
                i10++;
            }
        }
        if (view instanceof xn) {
            ((xn) view).oq();
        }
    }

    public void kq(syt sytVar) {
        this.csi = sytVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.ubx
    public void kq(suf sufVar) {
        if (this.syt.get()) {
            return;
        }
        this.syt.set(true);
        if (sufVar.oq() && rjo()) {
            this.kq.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.fou.kq(csi(), sufVar);
            return;
        }
        this.fou.kq(sufVar.nn(), sufVar.dgq());
    }

    public void oq() {
        kq(csi());
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.ubx
    public void kq(View view, int i10, bob bobVar) {
        syt sytVar = this.csi;
        if (sytVar != null) {
            sytVar.kq(view, i10, bobVar);
        }
    }
}

package com.bytedance.sdk.component.adexpress.oq;

import android.content.Context;
import android.view.View;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class mxq implements nn {
    private syt bob;
    private ScheduledFuture<?> csi;
    private wki fou;
    private Context kq;
    private com.bytedance.sdk.component.adexpress.csi.kq oq;
    private AtomicBoolean rhi = new AtomicBoolean(false);

    private class kq implements Runnable {
        private int bob;
        nn.kq kq;

        public kq(int i10, nn.kq kqVar) {
            this.bob = i10;
            this.kq = kqVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.bob == 1) {
                mxq.this.oq.kq(true);
                mxq.this.kq(this.kq, 107, null);
            }
        }
    }

    public mxq(Context context, wki wkiVar, com.bytedance.sdk.component.adexpress.csi.kq kqVar, syt sytVar) {
        this.kq = context;
        this.fou = wkiVar;
        this.bob = sytVar;
        this.oq = kqVar;
        kqVar.kq(this.bob);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bob() {
        try {
            ScheduledFuture<?> scheduledFuture = this.csi;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.csi.cancel(false);
            this.csi = null;
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.csi.kq oq() {
        return this.oq;
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.nn
    public boolean kq(final nn.kq kqVar) {
        int iRhi = this.fou.rhi();
        if (iRhi < 0) {
            kq(kqVar, 107, "time is ".concat(String.valueOf(iRhi)));
        } else {
            this.csi = com.bytedance.sdk.component.adexpress.fou.fou.kq(new kq(1, kqVar), iRhi, TimeUnit.MILLISECONDS);
            this.oq.kq(new rjo() { // from class: com.bytedance.sdk.component.adexpress.oq.mxq.1
                @Override // com.bytedance.sdk.component.adexpress.oq.rjo
                public void kq(View view, suf sufVar) {
                    nze nzeVarOq;
                    mxq.this.bob();
                    if (kqVar.bob() || (nzeVarOq = kqVar.oq()) == null) {
                        return;
                    }
                    nzeVarOq.kq(mxq.this.oq, sufVar);
                    kqVar.kq(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.oq.rjo
                public void kq(int i10, String str) {
                    mxq.this.kq(kqVar, i10, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.nn
    public void kq() {
        this.oq.fou();
        bob();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(nn.kq kqVar, int i10, String str) {
        nze nzeVarOq;
        if (kqVar.bob() || this.rhi.get()) {
            return;
        }
        bob();
        this.fou.csi().kq(i10, str);
        if (kqVar.oq(this)) {
            kqVar.kq(this);
        } else {
            if (kqVar.bob() || (nzeVarOq = kqVar.oq()) == null) {
                return;
            }
            kqVar.kq(true);
            nzeVarOq.a_(i10);
        }
        this.rhi.getAndSet(true);
    }
}

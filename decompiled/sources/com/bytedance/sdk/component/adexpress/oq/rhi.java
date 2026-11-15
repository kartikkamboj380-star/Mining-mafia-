package com.bytedance.sdk.component.adexpress.oq;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class rhi implements nn {
    private wki bob;
    private Context kq;
    private kq oq;

    public rhi(Context context, wki wkiVar, kq kqVar) {
        this.kq = context;
        this.oq = kqVar;
        this.bob = wkiVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.nn
    public void kq() {
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.nn
    public boolean kq(final nn.kq kqVar) {
        this.bob.csi().rhi();
        this.oq.kq(new rjo() { // from class: com.bytedance.sdk.component.adexpress.oq.rhi.1
            @Override // com.bytedance.sdk.component.adexpress.oq.rjo
            public void kq(View view, suf sufVar) {
                if (kqVar.bob()) {
                    return;
                }
                nze nzeVarOq = kqVar.oq();
                if (nzeVarOq != null) {
                    nzeVarOq.kq(rhi.this.oq, sufVar);
                }
                kqVar.kq(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.oq.rjo
            public void kq(int i10, String str) {
                nze nzeVarOq = kqVar.oq();
                if (nzeVarOq != null) {
                    nzeVarOq.a_(i10);
                }
            }
        });
        return true;
    }

    public void kq(bob bobVar) {
        this.oq.kq(bobVar);
    }
}

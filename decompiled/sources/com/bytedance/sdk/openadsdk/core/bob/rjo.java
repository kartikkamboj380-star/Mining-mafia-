package com.bytedance.sdk.openadsdk.core.bob;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.mxq;

/* JADX INFO: loaded from: classes.dex */
public abstract class rjo extends bob {
    private bob bob;
    private final String kq;
    private final com.bytedance.sdk.openadsdk.core.vvw.kq oq;

    public rjo(String str, com.bytedance.sdk.openadsdk.core.vvw.kq kqVar) {
        this(str, kqVar, null);
    }

    public void kq(bob bobVar) {
        this.bob = bobVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bob.bob, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public rjo(String str, com.bytedance.sdk.openadsdk.core.vvw.kq kqVar, bob bobVar) {
        this.kq = str;
        this.oq = kqVar;
        this.bob = bobVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bob.bob
    protected void kq(View view, float f10, float f11, float f12, float f13, SparseArray<bob.kq> sparseArray, boolean z9) {
        com.bytedance.sdk.openadsdk.core.vvw.kq kqVar = this.oq;
        if (kqVar != null) {
            kqVar.csi(this.kq);
        }
        if (view != null) {
            if (view.getId() == mxq.csi) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == mxq.dgq) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.kq);
            }
        }
        bob bobVar = this.bob;
        if (bobVar != null) {
            bobVar.nb = this.nb;
            bobVar.ou = this.ou;
            bobVar.ebt = this.ebt;
            int i10 = this.ebt;
            bobVar.ibd = i10;
            bobVar.rs = i10;
            bobVar.kq(view, f10, f11, f12, f13, sparseArray, z9);
        }
    }
}

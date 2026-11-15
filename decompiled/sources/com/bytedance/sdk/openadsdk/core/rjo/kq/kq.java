package com.bytedance.sdk.openadsdk.core.rjo.kq;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.oq.ubx;
import com.bytedance.sdk.openadsdk.core.bob.bob;
import com.bytedance.sdk.openadsdk.core.model.mxq;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class kq extends bob implements com.bytedance.sdk.component.adexpress.dynamic.rhi.kq {
    protected WeakReference<View> kq;
    private ubx oq;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rhi.kq
    public void kq(ubx ubxVar) {
        this.oq = ubxVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rhi.kq
    public void kq(View view) {
        this.kq = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bob.bob
    public void kq(View view, float f10, float f11, float f12, float f13, SparseArray<bob.kq> sparseArray, boolean z9) {
        kq(view, ((Integer) view.getTag()).intValue(), f10, f11, f12, f13, sparseArray);
    }

    private void kq(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<bob.kq> sparseArray) {
        if (this.oq != null) {
            String strValueOf = "";
            try {
                int i11 = com.bytedance.sdk.component.adexpress.dynamic.kq.mq;
                if (view.getTag(i11) != null) {
                    strValueOf = String.valueOf(view.getTag(i11));
                }
            } catch (Exception unused) {
            }
            this.oq.kq(view, i10, new mxq.kq().fou(f10).bob(f11).oq(f12).kq(f13).oq(this.nb).kq(this.ou).kq(sparseArray).kq(this.fgm).kq(strValueOf).kq());
        }
    }
}

package com.bytedance.sdk.openadsdk.core.ubx.csi.kq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fou.rhi;
import com.bytedance.adsdk.ugeno.oq.bob;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kq extends com.bytedance.adsdk.ugeno.fou.oq.kq {
    public kq(bob bobVar, String str, rhi.kq kqVar) {
        super(bobVar, str, kqVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fou.oq.kq
    public void kq() {
        bob bobVar;
        bob bobVarOq;
        Map<String, String> map = this.rhi;
        if (map == null || map.isEmpty()) {
            return;
        }
        String str = this.rhi.get("id");
        if (TextUtils.isEmpty(str) || (bobVarOq = (bobVar = this.bob).oq(bobVar)) == null) {
            return;
        }
        bob bobVarCsi = bobVarOq.csi(str);
        if (bobVarCsi instanceof com.bytedance.sdk.openadsdk.core.ubx.oq.oq.kq) {
            com.bytedance.sdk.openadsdk.core.ubx.oq.oq.kq kqVar = (com.bytedance.sdk.openadsdk.core.ubx.oq.oq.kq) bobVarCsi;
            kqVar.fou();
            kqVar.kq(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.ubx.csi.kq.kq.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    kq.this.bob();
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fou.oq.kq
    public void oq() {
    }
}

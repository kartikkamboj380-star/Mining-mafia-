package com.bytedance.adsdk.ugeno.fou.oq;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fou.rhi;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class fou extends kq {
    public fou(com.bytedance.adsdk.ugeno.oq.bob bobVar, String str, rhi.kq kqVar) {
        super(bobVar, str, kqVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fou.oq.kq
    public void kq() {
        com.bytedance.adsdk.ugeno.oq.bob bobVar;
        com.bytedance.adsdk.ugeno.oq.bob bobVarOq;
        com.bytedance.adsdk.ugeno.kq.kq kqVarWki;
        Map<String, String> map = this.rhi;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.rhi.get(MediationMetaData.KEY_NAME);
        if (TextUtils.isEmpty(str) || (bobVarOq = (bobVar = this.bob).oq(bobVar)) == null || (kqVarWki = bobVarOq.syt(str).wki(str)) == null) {
            return;
        }
        kqVarWki.oq();
        kqVarWki.kq(new com.bytedance.adsdk.ugeno.kq.oq() { // from class: com.bytedance.adsdk.ugeno.fou.oq.fou.1
            @Override // com.bytedance.adsdk.ugeno.kq.oq
            public void kq() {
            }

            @Override // com.bytedance.adsdk.ugeno.kq.oq
            public void oq() {
                fou.this.bob();
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.fou.oq.kq
    public void oq() {
    }
}

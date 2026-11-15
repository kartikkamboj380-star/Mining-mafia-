package com.bytedance.sdk.component.adexpress.dynamic.csi;

import com.bytedance.sdk.component.adexpress.oq.wki;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rjo implements syt {
    private com.bytedance.sdk.component.adexpress.dynamic.rhi.oq kq;

    /* JADX INFO: Access modifiers changed from: private */
    public void oq(wki wkiVar) {
        try {
            JSONObject jSONObjectBob = wkiVar.bob();
            JSONObject jSONObject = new JSONObject(jSONObjectBob.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectBob.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVarKq = new rhi(jSONObject, jSONObjectOptJSONObject, jSONObjectBob.optJSONObject("AdSize"), new JSONObject(jSONObjectBob.optString("diff_template_Plugin"))).kq(wkiVar.oq(), wkiVar.nn(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), wkiVar);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                sytVarKq.kq(jSONObject2.optString("color"));
                sytVarKq.kq(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.kq.kq(sytVarKq);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.csi.syt
    public void kq(com.bytedance.sdk.component.adexpress.dynamic.rhi.oq oqVar) {
        this.kq = oqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.csi.syt
    public void kq(final wki wkiVar) {
        if (wkiVar.vvw() == 1) {
            oq(wkiVar);
        } else {
            com.bytedance.sdk.component.adexpress.fou.fou.kq(new com.bytedance.sdk.component.syt.syt("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.csi.rjo.1
                @Override // java.lang.Runnable
                public void run() {
                    rjo.this.oq(wkiVar);
                }
            }, 5);
        }
    }
}

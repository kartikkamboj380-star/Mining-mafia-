package com.bytedance.sdk.openadsdk.core.vvw;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq extends bob {
    private long nn;
    private long ubx;

    public oq(int i10, int i11, long j10, long j11, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq enumC0289kq, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq oqVar, String str, List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list, List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list2, String str2) {
        super(i10, i11, enumC0289kq, oqVar, str, list, list2, str2);
        this.nn = j10;
        this.ubx = j11;
        this.dgq = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.vvw.bob
    public JSONObject kq() throws JSONException {
        JSONObject jSONObjectKq = super.kq();
        if (jSONObjectKq != null) {
            jSONObjectKq.put("offset", this.nn);
            jSONObjectKq.put("duration", this.ubx);
        }
        return jSONObjectKq;
    }

    public static oq kq(JSONObject jSONObject) {
        bob bobVarOq = bob.oq(jSONObject);
        if (bobVarOq == null) {
            return null;
        }
        return new oq(bobVarOq.kq, bobVarOq.oq, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), bobVarOq.bob, bobVarOq.fou, bobVarOq.csi, bobVarOq.rhi, bobVarOq.rjo, bobVarOq.syt);
    }
}

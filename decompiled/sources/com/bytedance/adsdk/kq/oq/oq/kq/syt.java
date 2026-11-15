package com.bytedance.adsdk.kq.oq.oq.kq;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class syt extends sns {
    public syt() {
        super(com.bytedance.adsdk.kq.oq.fou.bob.LT_EQ);
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public Object kq(Map<String, JSONObject> map) {
        Object objKq;
        Object objKq2 = this.kq.kq(map);
        if (objKq2 == null || (objKq = this.oq.kq(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.kq.oq.csi.kq.bob.kq(objKq2, (Number) objKq)).booleanValue());
    }
}

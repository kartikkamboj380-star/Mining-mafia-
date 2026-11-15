package com.bytedance.adsdk.kq.oq.oq.kq;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class suf extends sns {
    public suf() {
        super(com.bytedance.adsdk.kq.oq.fou.bob.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public Object kq(Map<String, JSONObject> map) {
        Object objKq = this.kq.kq(map);
        Object objKq2 = this.oq.kq(map);
        if (objKq == null && objKq2 == null) {
            return Boolean.FALSE;
        }
        if (objKq == null && objKq2 != null) {
            return Boolean.TRUE;
        }
        if (objKq == null || objKq2 != null) {
            return ((objKq instanceof Number) && (objKq2 instanceof Number)) ? Boolean.valueOf(!com.bytedance.adsdk.kq.oq.csi.kq.oq.kq((Number) objKq, (Number) objKq2)) : Boolean.valueOf(!objKq.equals(objKq2));
        }
        return Boolean.TRUE;
    }
}

package com.bytedance.sdk.openadsdk.core.ubx.rhi.kq;

import com.bytedance.sdk.openadsdk.core.model.uml;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class oq {
    protected uml kq;

    public static class kq {
        public static oq kq(uml umlVar, com.bytedance.sdk.openadsdk.core.ubx.rhi.kq kqVar) {
            if (umlVar == null) {
                return null;
            }
            int iUc = umlVar.uc();
            if (iUc == 1) {
                return new com.bytedance.sdk.openadsdk.core.ubx.rhi.kq.kq(umlVar, kqVar);
            }
            if (iUc == 7 || iUc == 8) {
                return new bob(umlVar, kqVar);
            }
            return null;
        }
    }

    public oq(uml umlVar) {
        this.kq = umlVar;
    }

    public abstract String kq();

    public void kq(JSONObject jSONObject) {
    }

    public abstract JSONObject oq();
}

package com.bytedance.sdk.openadsdk.core.model;

import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class jhe {
    private String kq = "horizontal";
    private int oq = 1;
    private int bob = 1;
    private int fou = 0;
    private int csi = 0;
    private int rhi = 0;
    private int rjo = 0;
    private int syt = 5000;
    private int dgq = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
    private int nn = 0;

    public int bob() {
        return this.bob;
    }

    public int csi() {
        return this.csi;
    }

    public int dgq() {
        return this.dgq;
    }

    public int fou() {
        return this.fou;
    }

    public String kq() {
        return this.kq;
    }

    public int nn() {
        return this.nn;
    }

    public int oq() {
        return this.oq;
    }

    public int rhi() {
        return this.rhi;
    }

    public int rjo() {
        return this.rjo;
    }

    public int syt() {
        return this.syt;
    }

    public JSONObject ubx() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("direction", this.kq);
            jSONObject.put("auto_loop", this.oq);
            jSONObject.put("allow_manual_loop", this.bob);
            jSONObject.put("unlimited_loop", this.fou);
            jSONObject.put("left_margin", this.csi);
            jSONObject.put("right_margin", this.rhi);
            jSONObject.put("ad_margin", this.rjo);
            jSONObject.put("loop_interval_time", this.syt);
            jSONObject.put("flip_speed", this.dgq);
            jSONObject.put("stop_auto_loop", this.nn);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static jhe kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new jhe();
        }
        jhe jheVar = new jhe();
        jheVar.kq = jSONObject.optString("direction", "horizontal");
        jheVar.oq = jSONObject.optInt("auto_loop", 1);
        jheVar.bob = jSONObject.optInt("allow_manual_loop", 1);
        jheVar.fou = jSONObject.optInt("unlimited_loop", 0);
        jheVar.csi = jSONObject.optInt("left_margin", 0);
        jheVar.rhi = jSONObject.optInt("right_margin", 0);
        jheVar.rjo = jSONObject.optInt("ad_margin", 0);
        jheVar.syt = jSONObject.optInt("loop_interval_time", 5000);
        jheVar.dgq = jSONObject.optInt("flip_speed", UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        jheVar.nn = jSONObject.optInt("stop_auto_loop", 0);
        return jheVar;
    }
}

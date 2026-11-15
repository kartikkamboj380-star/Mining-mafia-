package com.bytedance.adsdk.ugeno.fou.fou;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class bob {
    protected com.bytedance.adsdk.ugeno.fou.rhi bob;
    protected Map<String, String> csi;
    protected String dgq;
    protected com.bytedance.adsdk.ugeno.fou.rhi.kq fou;
    protected com.bytedance.adsdk.ugeno.fou.ubx kq;
    protected Context nn;
    protected com.bytedance.adsdk.ugeno.oq.bob oq;
    protected String rhi;
    protected String rjo;
    protected String syt;

    public static class kq {
        public static bob kq(Context context, com.bytedance.adsdk.ugeno.oq.bob bobVar, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.fou.rhi rhiVarKq;
            com.bytedance.adsdk.ugeno.fou.rhi.kq kqVarKq;
            if (bobVar == null || jSONObject == null || (rhiVarKq = com.bytedance.adsdk.ugeno.fou.rhi.kq(jSONObject, jSONObject2)) == null || (kqVarKq = rhiVarKq.kq()) == null) {
                return null;
            }
            String strKq = kqVarKq.kq();
            if (TextUtils.equals(strKq, "custom")) {
                fou fouVar = new fou(context);
                fouVar.kq(bobVar);
                fouVar.kq(rhiVarKq);
                fouVar.bob();
                return fouVar;
            }
            com.bytedance.adsdk.ugeno.fou.rjo rjoVarKq = (TextUtils.isEmpty(strKq) || TextUtils.equals(strKq, "global")) ? com.bytedance.adsdk.ugeno.fou.nn.kq(kqVarKq.oq()) : com.bytedance.adsdk.ugeno.fou.nn.kq(kqVarKq.csi());
            if (rjoVarKq == null) {
                return null;
            }
            bob bobVarKq = rjoVarKq.kq(context);
            bobVarKq.kq(bobVar);
            bobVarKq.kq(rhiVarKq);
            bobVarKq.bob();
            return bobVarKq;
        }
    }

    public bob(Context context) {
        this.nn = context;
    }

    public void bob() {
        this.fou = this.bob.kq();
        com.bytedance.adsdk.ugeno.fou.rhi rhiVar = this.bob;
        if (rhiVar == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.fou.rhi.kq kqVarKq = rhiVar.kq();
        this.fou = kqVarKq;
        if (kqVarKq == null) {
            return;
        }
        this.csi = kqVarKq.bob();
        this.rhi = this.fou.oq();
        this.rjo = this.fou.kq();
        this.syt = this.fou.fou();
        this.dgq = this.fou.csi();
    }

    public String csi() {
        return this.syt;
    }

    public String fou() {
        return this.rhi;
    }

    public void kq(com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        this.oq = bobVar;
    }

    public abstract boolean kq(Object... objArr);

    public com.bytedance.adsdk.ugeno.fou.rhi rhi() {
        return this.bob;
    }

    public void kq(com.bytedance.adsdk.ugeno.fou.rhi rhiVar) {
        this.bob = rhiVar;
    }

    public void kq(com.bytedance.adsdk.ugeno.fou.ubx ubxVar) {
        this.kq = ubxVar;
    }
}

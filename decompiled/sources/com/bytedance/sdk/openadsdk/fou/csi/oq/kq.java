package com.bytedance.sdk.openadsdk.fou.csi.oq;

import com.bytedance.sdk.openadsdk.core.model.uml;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private JSONObject bob;
    private bob csi;
    private JSONObject fou;
    private uml kq;
    private String oq;
    private boolean rhi = false;

    public kq(uml umlVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.kq = umlVar;
        this.oq = str;
        this.bob = jSONObject;
        this.fou = jSONObject2;
    }

    public JSONObject bob() {
        if (this.bob == null) {
            this.bob = new JSONObject();
        }
        return this.bob;
    }

    public bob csi() {
        return this.csi;
    }

    public JSONObject fou() {
        if (this.fou == null) {
            this.fou = new JSONObject();
        }
        return this.fou;
    }

    public uml kq() {
        return this.kq;
    }

    public String oq() {
        return this.oq;
    }

    public boolean rhi() {
        return this.rhi;
    }

    public void rjo() {
        bob bobVar = this.csi;
        if (bobVar != null) {
            bobVar.kq(this);
        }
    }

    public void kq(bob bobVar) {
        this.csi = bobVar;
    }

    public void kq(boolean z9) {
        this.rhi = z9;
    }
}

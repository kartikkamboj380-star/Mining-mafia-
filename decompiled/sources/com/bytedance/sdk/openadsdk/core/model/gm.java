package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class gm {
    public static int kq = 1;
    public static int oq = 2;
    private int bob = 5;
    private int fou = 30;
    private int csi = 70;
    private int rhi = 1;
    private int rjo = kq;
    private int syt = 0;
    private int dgq = 0;
    private int nn = 3;

    public int bob() {
        return this.syt;
    }

    public int csi() {
        return this.fou;
    }

    public int fou() {
        return this.bob;
    }

    public int kq() {
        return this.nn;
    }

    public int oq() {
        return this.dgq;
    }

    public int rhi() {
        return this.csi;
    }

    public int rjo() {
        return this.rhi;
    }

    public int syt() {
        return this.rjo;
    }

    public void bob(int i10) {
        this.syt = i10;
    }

    public void csi(int i10) {
        this.fou = i10;
    }

    public void fou(int i10) {
        this.bob = i10;
    }

    public void kq(int i10) {
        this.nn = i10;
    }

    public void oq(int i10) {
        this.dgq = i10;
    }

    public void rhi(int i10) {
        this.csi = i10;
    }

    public void rjo(int i10) {
        this.rhi = i10;
    }

    public void syt(int i10) {
        this.rjo = i10;
    }

    public boolean kq(boolean z9) {
        if (z9) {
            int i10 = this.syt;
            return i10 == 1 || i10 == 3;
        }
        int i11 = this.syt;
        return i11 == 3 || i11 == 2;
    }

    public JSONObject kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("ceiling_time", this.bob);
            jSONObject.put("ceiling_ratio", this.fou);
            jSONObject.put("expand_ratio", this.csi);
            jSONObject.put("back_type", this.rhi);
            jSONObject.put("boc_return_type", this.rjo);
            jSONObject.put("pre_render_status", this.syt);
            jSONObject.put("pre_render_use_gecko", this.dgq);
            jSONObject.put("pre_render_add_type", this.nn);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("InteractionParams", th.getMessage());
            return jSONObject;
        }
    }
}

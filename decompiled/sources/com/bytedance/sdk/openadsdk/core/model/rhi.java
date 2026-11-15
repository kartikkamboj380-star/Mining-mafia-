package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    private int rjo;
    private String kq = "";
    private String oq = "";
    private String bob = "";
    private String fou = "";
    private double csi = -1.0d;
    private int rhi = -1;

    public String bob() {
        return this.bob;
    }

    public int csi() {
        return this.rhi;
    }

    public double fou() {
        return this.csi;
    }

    public String kq() {
        return this.kq;
    }

    public String oq() {
        return this.oq;
    }

    public int rhi() {
        return this.rjo;
    }

    public String rjo() {
        return this.fou;
    }

    public JSONObject syt() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", oq());
            jSONObject.put("app_size", rhi());
            jSONObject.put("comment_num", csi());
            jSONObject.put("download_url", kq());
            jSONObject.put("package_name", bob());
            jSONObject.put("score", fou());
            jSONObject.put("app_category", rjo());
            return jSONObject;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.fax.bob(e10.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public void bob(String str) {
        this.bob = str;
    }

    public void fou(String str) {
        this.fou = str;
    }

    public void kq(String str) {
        this.kq = str;
    }

    public void oq(String str) {
        this.oq = str;
    }

    public void kq(double d10) {
        if (d10 >= 1.0d && d10 <= 5.0d) {
            this.csi = d10;
        } else {
            this.csi = -1.0d;
        }
    }

    public void oq(int i10) {
        this.rjo = i10;
    }

    public void kq(int i10) {
        if (i10 <= 0) {
            this.rhi = -1;
        } else {
            this.rhi = i10;
        }
    }
}

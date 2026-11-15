package com.bytedance.adsdk.ugeno.core;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wki {
    private JSONObject bob;
    private wki csi;
    private wki fou;
    private com.bytedance.adsdk.ugeno.oq.bob kq;
    private int oq;

    public JSONObject bob() {
        return this.bob;
    }

    public wki fou() {
        return this.fou;
    }

    public com.bytedance.adsdk.ugeno.oq.bob kq() {
        return this.kq;
    }

    public int oq() {
        return this.oq;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.kq + ", mEventType=" + this.oq + ", mEvent=" + this.bob + '}';
    }

    public void kq(com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        this.kq = bobVar;
    }

    public void oq(wki wkiVar) {
        this.csi = wkiVar;
    }

    public void kq(int i10) {
        this.oq = i10;
    }

    public void kq(JSONObject jSONObject) {
        this.bob = jSONObject;
    }

    public void kq(wki wkiVar) {
        this.fou = wkiVar;
    }
}

package com.bytedance.sdk.openadsdk.multipro.oq;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public boolean bob;
    public long csi;
    public boolean fou;
    public boolean kq;
    public boolean oq;
    public long rhi;
    public long rjo;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.multipro.oq.kq$kq, reason: collision with other inner class name */
    public interface InterfaceC0310kq {
        kq rhi();
    }

    public kq bob(boolean z9) {
        this.oq = z9;
        return this;
    }

    public kq fou(boolean z9) {
        this.bob = z9;
        return this;
    }

    public kq kq(boolean z9) {
        this.fou = z9;
        return this;
    }

    public kq oq(boolean z9) {
        this.kq = z9;
        return this;
    }

    public kq bob(long j10) {
        this.rjo = j10;
        return this;
    }

    public kq kq(long j10) {
        this.csi = j10;
        return this;
    }

    public kq oq(long j10) {
        this.rhi = j10;
        return this;
    }

    public JSONObject kq() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.kq);
            jSONObject.put("isFromVideoDetailPage", this.oq);
            jSONObject.put("isFromDetailPage", this.bob);
            jSONObject.put("duration", this.csi);
            jSONObject.put("totalPlayDuration", this.rhi);
            jSONObject.put("currentPlayPosition", this.rjo);
            jSONObject.put("isAutoPlay", this.fou);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static kq kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        kq kqVar = new kq();
        kqVar.oq(jSONObject.optBoolean("isCompleted"));
        kqVar.bob(jSONObject.optBoolean("isFromVideoDetailPage"));
        kqVar.fou(jSONObject.optBoolean("isFromDetailPage"));
        kqVar.kq(jSONObject.optLong("duration"));
        kqVar.oq(jSONObject.optLong("totalPlayDuration"));
        kqVar.bob(jSONObject.optLong("currentPlayPosition"));
        kqVar.kq(jSONObject.optBoolean("isAutoPlay"));
        return kqVar;
    }
}

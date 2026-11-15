package com.bytedance.sdk.openadsdk.component.csi;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public static final Comparator<oq> kq = new Comparator<oq>() { // from class: com.bytedance.sdk.openadsdk.component.csi.oq.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public int compare(oq oqVar, oq oqVar2) {
            return oqVar.csi() != oqVar2.csi() ? Long.compare(oqVar2.csi(), oqVar.csi()) : Long.compare(oqVar2.bob(), oqVar.bob());
        }
    };
    private final String bob;
    private final long csi;
    private final long fou;
    private final String oq;
    private final long rhi;
    private final String rjo;

    public oq(String str, String str2, long j10, long j11, long j12, String str3) {
        this.oq = str;
        this.bob = str2;
        this.fou = j10;
        this.csi = j11;
        this.rhi = j12;
        this.rjo = str3;
    }

    public static oq kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new oq(jSONObject.optString("rit"), jSONObject.optString("material"), jSONObject.optLong("expire_time"), jSONObject.optLong("create_time"), jSONObject.optLong(InAppPurchaseMetaData.KEY_PRICE), jSONObject.optString("req_id"));
        } catch (Exception unused) {
            return null;
        }
    }

    public long bob() {
        return this.fou;
    }

    public long csi() {
        return this.rhi;
    }

    public long fou() {
        return this.csi;
    }

    public String oq() {
        return this.bob;
    }

    public String rhi() {
        return this.rjo;
    }

    public String toString() {
        return "AdCache{mRit=" + this.oq + ", mExpireTime=" + this.fou + ", mCreateTime=" + this.csi + ", mPrice=" + this.rhi + ", mReqId='" + this.rjo + '}';
    }

    public JSONObject kq() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("rit", this.oq);
            jSONObject.putOpt("material", this.bob);
            jSONObject.putOpt("expire_time", Long.valueOf(this.fou));
            jSONObject.putOpt("create_time", Long.valueOf(this.csi));
            jSONObject.putOpt(InAppPurchaseMetaData.KEY_PRICE, Long.valueOf(this.rhi));
            jSONObject.putOpt("req_id", this.rjo);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

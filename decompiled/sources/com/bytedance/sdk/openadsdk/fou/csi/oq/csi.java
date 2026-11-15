package com.bytedance.sdk.openadsdk.fou.csi.oq;

import com.bytedance.sdk.component.utils.fax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class csi extends bob {
    private long kq;
    private long oq;

    public void kq(long j10) {
        this.kq = j10;
    }

    public void oq(long j10) {
        this.oq = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.fou.csi.oq.bob
    public void kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.kq);
            jSONObject.put("total_duration", this.oq);
        } catch (Throwable th) {
            fax.bob("FeedContinueModel", th.getMessage());
        }
    }
}

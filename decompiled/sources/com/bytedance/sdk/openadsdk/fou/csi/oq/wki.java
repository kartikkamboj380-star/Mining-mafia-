package com.bytedance.sdk.openadsdk.fou.csi.oq;

import com.bytedance.sdk.component.utils.fax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wki extends bob {
    public long bob;
    public long kq;
    public int oq;

    public void kq(long j10) {
        this.kq = j10;
    }

    public void oq(long j10) {
        this.bob = j10;
    }

    public void kq(int i10) {
        this.oq = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.fou.csi.oq.bob
    public void kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.kq);
            jSONObject.put("buffers_count", this.oq);
            jSONObject.put("total_duration", this.bob);
        } catch (Throwable th) {
            fax.bob("PlayBufferModel", th.getMessage());
        }
    }
}

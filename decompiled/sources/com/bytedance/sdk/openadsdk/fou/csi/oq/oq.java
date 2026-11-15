package com.bytedance.sdk.openadsdk.fou.csi.oq;

import com.bytedance.sdk.component.utils.fax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq extends bob {
    private int bob;
    private int fou;
    private long kq;
    private long oq;

    public void kq(long j10) {
        this.kq = j10;
    }

    public void oq(long j10) {
        this.oq = j10;
    }

    public void kq(int i10) {
        this.bob = i10;
    }

    public void oq(int i10) {
        this.fou = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.fou.csi.oq.bob
    public void kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.kq);
            jSONObject.put("total_duration", this.oq);
            jSONObject.put("vbtt_skip_type", this.bob);
            jSONObject.put("skip_reason", this.fou);
        } catch (Throwable th) {
            fax.bob("EndcardSkipModel", th.getMessage());
        }
    }
}

package com.bytedance.sdk.openadsdk.fou.csi.oq;

import com.bytedance.sdk.component.utils.fax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fou extends bob {
    public int bob;
    public int fou = 0;
    public long kq;
    public long oq;

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
            jSONObject.put("total_duration", this.kq);
            jSONObject.put("buffers_time", this.oq);
            jSONObject.put("break_reason", this.bob);
            jSONObject.put("video_backup", this.fou);
        } catch (Throwable th) {
            fax.bob("FeedBreakModel", th.getMessage());
        }
    }
}

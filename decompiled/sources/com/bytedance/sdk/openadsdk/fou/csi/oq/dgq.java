package com.bytedance.sdk.openadsdk.fou.csi.oq;

import com.bytedance.sdk.component.utils.fax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends bob {
    private final String kq;
    private final long oq;

    public dgq(String str, long j10) {
        this.kq = str;
        this.oq = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.fou.csi.oq.bob
    public void kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.kq);
            jSONObject.put("preload_size", this.oq);
        } catch (Throwable th) {
            fax.bob("LoadVideoCancelModel", th.getMessage());
        }
    }
}

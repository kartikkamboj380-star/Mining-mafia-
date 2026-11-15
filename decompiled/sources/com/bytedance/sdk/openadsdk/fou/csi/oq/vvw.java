package com.bytedance.sdk.openadsdk.fou.csi.oq;

import com.bytedance.sdk.component.utils.fax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class vvw extends bob {
    private long bob;
    private long fou;
    private String kq;
    private long oq;

    public void bob(long j10) {
        this.fou = j10;
    }

    public void kq(String str) {
        this.kq = str;
    }

    public void oq(long j10) {
        this.bob = j10;
    }

    public void kq(long j10) {
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
            jSONObject.put("load_time", this.bob);
            jSONObject.put("local_cache", this.fou);
        } catch (Throwable th) {
            fax.bob("LoadVideoSuccessModel", th.getMessage());
        }
    }
}

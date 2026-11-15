package com.bytedance.sdk.openadsdk.fou.csi.oq;

import com.bytedance.sdk.component.utils.fax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nn extends bob {
    private long bob;
    private String csi;
    private int fou;
    private String kq;
    private long oq;
    private String rhi;

    public void bob(String str) {
        this.rhi = str;
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

    public void oq(String str) {
        this.csi = str;
    }

    public void kq(int i10) {
        this.fou = i10;
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
            jSONObject.put("error_code", this.fou);
            jSONObject.put("error_message", this.csi);
            jSONObject.put("error_message_server", this.rhi);
        } catch (Throwable th) {
            fax.bob("LoadVideoErrorModel", th.getMessage());
        }
    }
}

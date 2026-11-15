package com.bytedance.sdk.openadsdk.fou.csi.oq;

import com.bykv.vk.openvk.kq.kq.kq.bob.b;
import com.bytedance.sdk.component.utils.fax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class suf extends bob {
    private final int bob;
    private final String csi;
    private final int fou;
    private long kq;
    private long oq;

    public suf(b bVar) {
        this.bob = bVar.b();
        this.fou = bVar.d();
        this.csi = bVar.a();
    }

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
            jSONObject.put("error_code", this.bob);
            jSONObject.put("extra_error_code", this.fou);
            jSONObject.put("error_message", this.csi);
        } catch (Throwable th) {
            fax.bob("PlayErrorModel", th.getMessage());
        }
    }
}

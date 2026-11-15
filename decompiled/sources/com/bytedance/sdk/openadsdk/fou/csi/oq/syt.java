package com.bytedance.sdk.openadsdk.fou.csi.oq;

import G1.c;
import I1.b;
import com.bykv.vk.openvk.kq.kq.kq.bob.a;
import com.bytedance.sdk.component.utils.fax;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class syt extends bob {
    private long bob;
    private int fou;
    private final a kq;
    private long oq;

    public syt(a aVar) {
        this.kq = aVar;
    }

    public void kq(long j10) {
        this.oq = j10;
    }

    public void oq(long j10) {
        this.bob = j10;
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
            jSONObject.put("video_start_duration", this.oq);
            jSONObject.put("video_cache_size", this.bob);
            jSONObject.put("is_auto_play", this.fou);
        } catch (Throwable th) {
            fax.bob("FeedPlayModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fou.csi.oq.bob
    public void kq(kq kqVar) throws Throwable {
        if (this.kq.ebt()) {
            String strCsi = this.kq.csi();
            String strSns = this.kq.sns();
            File fileD = b.d(strCsi, strSns);
            File fileA = b.a(strCsi, strSns);
            if (fileA.exists()) {
                fileD = fileA;
            }
            try {
                kqVar.fou().put("moov_box_pos", c.a(fileD));
            } catch (JSONException unused) {
            }
        }
    }
}

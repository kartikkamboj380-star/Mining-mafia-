package com.bytedance.sdk.openadsdk.fou.csi.oq;

import G1.c;
import android.os.SystemClock;
import com.bykv.vk.openvk.kq.kq.kq.bob.a;
import com.bytedance.sdk.component.utils.fax;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends bob {
    private long bob;
    private int fou = 0;
    private final a kq;
    private long oq;

    public rhi(a aVar) {
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
            jSONObject.put("total_duration", this.oq);
            jSONObject.put("buffers_time", this.bob);
            jSONObject.put("video_backup", this.fou);
        } catch (Throwable th) {
            fax.bob("FeedOverModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fou.csi.oq.bob
    public void kq(kq kqVar) {
        super.kq(kqVar);
        JSONObject jSONObjectFou = kqVar.fou();
        if (com.bytedance.sdk.openadsdk.jhe.kq.kq("re_vi_en_le", 0) != 1) {
            return;
        }
        File file = new File(this.kq.csi(), this.kq.sns());
        if (file.exists()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                jSONObjectFou.put("level", c.b(file.getAbsolutePath()));
                jSONObjectFou.put("level_cost_time", SystemClock.elapsedRealtime() - jElapsedRealtime);
            } catch (JSONException unused) {
            }
        }
    }
}

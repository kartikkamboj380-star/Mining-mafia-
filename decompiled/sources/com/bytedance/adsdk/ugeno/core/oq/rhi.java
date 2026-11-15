package com.bytedance.adsdk.ugeno.core.oq;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.nze;
import com.bytedance.adsdk.ugeno.core.wki;
import com.bytedance.adsdk.ugeno.rjo.dgq;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi implements dgq.kq {
    private nze bob;
    private wki csi;
    private Context fou;
    private boolean kq;
    private int oq;
    private com.bytedance.adsdk.ugeno.oq.bob rhi;
    private Handler rjo = new dgq(Looper.getMainLooper(), this);

    public rhi(Context context, wki wkiVar, com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        this.fou = context;
        this.csi = wkiVar;
        this.rhi = bobVar;
    }

    public void kq(nze nzeVar) {
        this.bob = nzeVar;
    }

    public void kq() {
        wki wkiVar = this.csi;
        if (wkiVar == null) {
            return;
        }
        JSONObject jSONObjectBob = wkiVar.bob();
        try {
            this.oq = Integer.parseInt(com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObjectBob.optString("interval", "8000"), this.rhi.vvw()));
            this.kq = jSONObjectBob.optBoolean("repeat");
            this.rjo.sendEmptyMessageDelayed(BackupConstant.SCENE_RENDER_FAIL, this.oq);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.rjo.dgq.kq
    public void kq(Message message) {
        if (message.what != 1001) {
            return;
        }
        nze nzeVar = this.bob;
        if (nzeVar != null) {
            wki wkiVar = this.csi;
            com.bytedance.adsdk.ugeno.oq.bob bobVar = this.rhi;
            nzeVar.kq(wkiVar, bobVar, bobVar);
        }
        if (this.kq) {
            this.rjo.sendEmptyMessageDelayed(BackupConstant.SCENE_RENDER_FAIL, this.oq);
        } else {
            this.rjo.removeMessages(BackupConstant.SCENE_RENDER_FAIL);
        }
    }
}

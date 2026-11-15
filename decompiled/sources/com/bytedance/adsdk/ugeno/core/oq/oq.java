package com.bytedance.adsdk.ugeno.core.oq;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.nn;
import com.bytedance.adsdk.ugeno.core.nze;
import com.bytedance.adsdk.ugeno.core.wki;
import com.bytedance.adsdk.ugeno.rjo.dgq;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq implements dgq.kq {
    private Context bob;
    private com.bytedance.adsdk.ugeno.oq.bob csi;
    private wki fou;
    private int kq;
    private nze oq;
    private Handler rhi = new dgq(Looper.getMainLooper(), this);

    public oq(Context context, wki wkiVar, com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        this.bob = context;
        this.fou = wkiVar;
        this.csi = bobVar;
    }

    public void kq(nze nzeVar) {
        this.oq = nzeVar;
    }

    public void kq() {
        wki wkiVar = this.fou;
        if (wkiVar == null) {
            return;
        }
        try {
            int i10 = Integer.parseInt(com.bytedance.adsdk.ugeno.bob.oq.kq(wkiVar.bob().optString("delay"), this.csi.vvw()));
            this.kq = i10;
            this.rhi.sendEmptyMessageDelayed(BackupConstant.SCENE_RENDER_FAIL, i10);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.rjo.dgq.kq
    public void kq(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectBob = this.fou.bob();
        if (TextUtils.equals(jSONObjectBob.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE), "onAnimation")) {
            String strOptString = jSONObjectBob.optString("nodeId");
            com.bytedance.adsdk.ugeno.oq.bob bobVar = this.csi;
            com.bytedance.adsdk.ugeno.oq.bob bobVarCsi = bobVar.oq(bobVar).csi(strOptString);
            new nn(bobVarCsi.ubx(), com.bytedance.adsdk.ugeno.core.kq.kq(jSONObjectBob.optJSONObject("animatorSet"), bobVarCsi)).kq();
        } else {
            nze nzeVar = this.oq;
            if (nzeVar != null) {
                wki wkiVar = this.fou;
                com.bytedance.adsdk.ugeno.oq.bob bobVar2 = this.csi;
                nzeVar.kq(wkiVar, bobVar2, bobVar2);
            }
        }
        this.rhi.removeMessages(BackupConstant.SCENE_RENDER_FAIL);
    }
}

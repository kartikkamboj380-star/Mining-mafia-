package com.bytedance.sdk.component.csi.csi;

import android.graphics.Bitmap;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* JADX INFO: loaded from: classes.dex */
public class csi extends kq {
    private byte[] kq;
    private com.bytedance.sdk.component.csi.rhi oq;

    public csi(byte[] bArr, com.bytedance.sdk.component.csi.rhi rhiVar) {
        this.kq = bArr;
        this.oq = rhiVar;
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public void kq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        com.bytedance.sdk.component.csi.bob.rhi rhiVarWcx = bobVar.wcx();
        com.bytedance.sdk.component.csi.bob.oq.kq kqVarKq = rhiVarWcx.kq(bobVar);
        try {
            bobVar.mq();
            Bitmap bitmapKq = kqVarKq.kq(this.kq);
            if (bitmapKq == null) {
                kq(BackupConstant.SCENE_BACKUP_RENDER_FAIL, "decode failed bitmap null", null, bobVar);
                return;
            }
            bobVar.kq(new wki(bitmapKq, this.oq, false));
            rhiVarWcx.kq(bobVar.gm()).kq(bobVar.nn(), bitmapKq);
        } catch (Throwable th) {
            kq(BackupConstant.SCENE_BACKUP_RENDER_FAIL, "decode failed:" + th.getMessage(), th, bobVar);
        }
    }

    private void kq(int i10, String str, Throwable th, com.bytedance.sdk.component.csi.bob.bob bobVar) {
        if (this.oq == null) {
            bobVar.kq(new ubx());
        } else {
            bobVar.kq(new syt(i10, str, th));
        }
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public String kq() {
        return "decode";
    }
}

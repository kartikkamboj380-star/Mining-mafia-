package com.bytedance.sdk.component.csi.csi;

import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* JADX INFO: loaded from: classes.dex */
public class oq implements dgq {
    private byte[] kq;
    private com.bytedance.sdk.component.csi.rhi oq;

    public oq(byte[] bArr, com.bytedance.sdk.component.csi.rhi rhiVar) {
        this.kq = bArr;
        this.oq = rhiVar;
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public void kq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        dgq ubxVar;
        int iVvw = bobVar.vvw();
        bobVar.kq(this.kq.length);
        if (iVvw != 2) {
            if (iVvw != 3) {
                boolean zOq = com.bytedance.sdk.component.utils.rhi.oq(this.kq);
                ubxVar = (!zOq && com.bytedance.sdk.component.utils.rhi.kq(this.kq)) ? new csi(this.kq, this.oq) : new wki(this.kq, this.oq, zOq);
            } else {
                byte[] bArr = this.kq;
                ubxVar = new wki(bArr, this.oq, com.bytedance.sdk.component.utils.rhi.oq(bArr));
            }
        } else if (com.bytedance.sdk.component.utils.rhi.kq(this.kq)) {
            ubxVar = new csi(this.kq, this.oq);
        } else {
            ubxVar = this.oq == null ? new ubx() : new syt(BackupConstant.SCENE_RENDER_FAIL, "not image format", null);
        }
        bobVar.kq(ubxVar);
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public String kq() {
        return "image_type";
    }
}

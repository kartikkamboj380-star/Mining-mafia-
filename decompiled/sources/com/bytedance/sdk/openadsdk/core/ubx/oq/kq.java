package com.bytedance.sdk.openadsdk.core.ubx.oq;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.uml;

/* JADX INFO: loaded from: classes.dex */
public class kq extends com.bytedance.adsdk.ugeno.dgq.rhi.oq {
    public kq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.dgq.rhi.oq
    public void suf(String str) {
        super.suf(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String str2 = String.format(uml.kq(this.oq, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.dgq.rhi.kq) this.csi).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}

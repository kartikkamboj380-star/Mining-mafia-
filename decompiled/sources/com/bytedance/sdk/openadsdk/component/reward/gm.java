package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: loaded from: classes.dex */
class gm implements TTClientBidding {
    private final nn kq;

    gm(Context context, com.bytedance.sdk.openadsdk.core.model.kq kqVar, AdSlot adSlot) {
        this.kq = new nn(context, kqVar, adSlot);
    }

    public nn kq() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
        this.kq.loss(d10, str, str2);
    }

    public void oq() {
        this.kq.kq();
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
        this.kq.win(d10);
    }
}

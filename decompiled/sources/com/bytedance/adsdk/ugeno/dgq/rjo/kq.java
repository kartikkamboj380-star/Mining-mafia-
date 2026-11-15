package com.bytedance.adsdk.ugeno.dgq.rjo;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq extends com.bytedance.adsdk.ugeno.oq.kq<com.bytedance.adsdk.ugeno.dgq.oq.kq> {
    public kq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void kq(String str, String str2) {
        super.kq(str, str2);
        str.getClass();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                oq(str, str2);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oq.kq, com.bytedance.adsdk.ugeno.oq.bob
    public void oq() {
        super.oq();
    }
}

package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.rjo;

/* JADX INFO: loaded from: classes.dex */
public interface PAGLoadListener<Ad> extends rjo {
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.rjo
    void onError(int i10, String str);
}

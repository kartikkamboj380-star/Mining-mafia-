package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: loaded from: classes.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize kq;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.kq = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.kq;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.kq = pAGBannerSize;
    }
}

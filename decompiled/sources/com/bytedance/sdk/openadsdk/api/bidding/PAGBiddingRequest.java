package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* JADX INFO: loaded from: classes.dex */
public class PAGBiddingRequest {
    private PAGBannerSize kq = null;
    private String oq = null;
    private String bob = null;

    public String getAdxId() {
        return this.bob;
    }

    public PAGBannerSize getBannerSize() {
        return this.kq;
    }

    public String getSlotId() {
        return this.oq;
    }

    public void setAdxId(String str) {
        this.bob = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.kq = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.oq = str;
    }
}

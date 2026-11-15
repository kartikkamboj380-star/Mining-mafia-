package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: loaded from: classes.dex */
public class PAGRewardItem {
    private final int kq;
    private final String oq;

    public PAGRewardItem(int i10, String str) {
        this.kq = i10;
        this.oq = str;
    }

    public int getRewardAmount() {
        return this.kq;
    }

    public String getRewardName() {
        return this.oq;
    }
}

package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: loaded from: classes.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int kq;

    public int getTimeout() {
        return this.kq;
    }

    public void setTimeout(int i10) {
        this.kq = i10;
    }
}

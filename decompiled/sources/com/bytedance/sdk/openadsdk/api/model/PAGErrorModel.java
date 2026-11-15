package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: loaded from: classes.dex */
public class PAGErrorModel {
    private final int kq;
    private final String oq;

    public PAGErrorModel(int i10, String str) {
        this.kq = i10;
        this.oq = str;
    }

    public int getErrorCode() {
        return this.kq;
    }

    public String getErrorMessage() {
        return this.oq;
    }
}

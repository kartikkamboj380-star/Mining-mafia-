package com.bytedance.sdk.openadsdk.mq;

/* JADX INFO: loaded from: classes.dex */
public enum fou {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String syt;

    fou(String str) {
        this.syt = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.syt;
    }
}

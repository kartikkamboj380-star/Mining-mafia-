package com.bytedance.sdk.openadsdk.core.vvw.kq;

import androidx.annotation.NonNull;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;

/* JADX INFO: loaded from: classes.dex */
public enum kq {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(CommonGatewayClient.CODE_400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);

    private final int syt;

    kq(int i10) {
        this.syt = i10;
    }

    @NonNull
    public String kq() {
        return String.valueOf(this.syt);
    }
}

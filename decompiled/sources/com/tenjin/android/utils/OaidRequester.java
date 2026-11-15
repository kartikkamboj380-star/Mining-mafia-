package com.tenjin.android.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class OaidRequester {
    private static final String TAG = "OaidRequester";
    Boolean hasHuaweiOaid;
    Boolean hasMsaOaid;
    private boolean isLimitAdTrackingEnabled;
    private String oaid;

    public OaidRequester(Context context) {
        Boolean bool = Boolean.FALSE;
        this.hasMsaOaid = bool;
        this.hasHuaweiOaid = bool;
        if (context == null) {
            Log.e(TAG, "invalid input param");
        } else {
            HuaweiAdIdRequester(context);
        }
    }

    private void HuaweiAdIdRequester(Context context) {
        Boolean boolValueOf = Boolean.valueOf(Reflection.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient") != null);
        this.hasHuaweiOaid = boolValueOf;
        if (boolValueOf.booleanValue() && TextUtils.isEmpty(this.oaid)) {
            setAdIdData(context);
        }
        Log.d(TAG, "HUAWEI AdId: " + this.oaid);
        if (this.oaid == null) {
            MSAOAIDRequester(context);
        }
    }

    private void MSAOAIDRequester(Context context) {
        Boolean boolValueOf = Boolean.valueOf(Reflection.forName("com.bun.miitmdid.core.MdidSdkHelper") != null);
        this.hasMsaOaid = boolValueOf;
        if (boolValueOf.booleanValue()) {
            this.oaid = new MsaOaid(context).getOaid(3000L);
        }
        Log.d(TAG, "MSA OAID: " + this.oaid);
    }

    private void setAdIdData(Context context) {
        Object adIdWithRetry = HuaweiAdId.getAdIdWithRetry(context, 3);
        if (adIdWithRetry == null) {
            Log.d(TAG, "Huawei AdId request failed");
        } else {
            this.oaid = HuaweiAdId.getId(adIdWithRetry);
            this.isLimitAdTrackingEnabled = HuaweiAdId.isLimitAdTrackingEnabled(adIdWithRetry).booleanValue();
        }
    }

    public boolean getIsLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    public String getOaid() {
        return this.oaid;
    }
}

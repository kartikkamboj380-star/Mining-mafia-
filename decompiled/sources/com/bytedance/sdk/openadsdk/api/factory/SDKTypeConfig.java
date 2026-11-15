package com.bytedance.sdk.openadsdk.api.factory;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class SDKTypeConfig {
    private static ISDKTypeFactory kq;

    public static ISDKTypeFactory getSdkTypeFactory() {
        Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return kq;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        kq = iSDKTypeFactory;
    }
}

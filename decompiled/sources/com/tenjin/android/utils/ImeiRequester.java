package com.tenjin.android.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.tenjin.android.TenjinSDK;

/* JADX INFO: loaded from: classes3.dex */
public class ImeiRequester {
    private static final String TAG = "ImeiRequester";
    private String imei;

    @SuppressLint({"MissingPermission"})
    public ImeiRequester(Context context) {
        if (context == null) {
            Log.e(TAG, "invalid input param");
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            TenjinSDK.AppStoreType appStore = TenjinSDK.getAppStore();
            if (appStore != TenjinSDK.AppStoreType.googleplay && appStore != TenjinSDK.AppStoreType.unspecified) {
                this.imei = telephonyManager.getDeviceId();
            }
            Log.d(TAG, "IMEI " + this.imei);
        } catch (SecurityException unused) {
            Log.e(TAG, "IMEI request failed with SecurityException");
        } catch (Exception unused2) {
            Log.e(TAG, "IMEI request failed");
        }
    }

    public String getImei() {
        return this.imei;
    }
}

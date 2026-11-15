package com.tenjin.android.utils;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class HuaweiAdId {
    private static final String TAG = "HuaweiOaid";

    public static Object getAdIdWithRetry(Context context, Integer num) {
        if (num.intValue() <= 0) {
            Log.e(TAG, "Failed to retrieve OAID - giving up");
            return null;
        }
        Log.d(TAG, "Attempting OAID retrieval, will retry " + num + " more times");
        try {
            return Reflection.runStaticMethod("com.huawei.hms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context);
        } catch (Exception e10) {
            Log.d(TAG, "OAID retrieval failed " + e10.getLocalizedMessage());
            if (isRetriableException(e10)) {
                return getAdIdWithRetry(context, Integer.valueOf(num.intValue() - 1));
            }
            return null;
        }
    }

    public static String getId(Object obj) {
        return (String) Reflection.runInstanceMethod(obj, "getId", null, new Object[0]);
    }

    public static Boolean isLimitAdTrackingEnabled(Object obj) {
        return (Boolean) Reflection.runInstanceMethod(obj, "isLimitAdTrackingEnabled", null, new Object[0]);
    }

    private static boolean isRetriableException(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            return ((InvocationTargetException) exc).getTargetException() instanceof IOException;
        }
        return false;
    }
}

package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class mq {
    private static String kq;

    public static boolean kq(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), oq(context));
    }

    public static String oq(Context context) {
        if (!TextUtils.isEmpty(kq)) {
            return kq;
        }
        String strKq = kq();
        kq = strKq;
        if (!TextUtils.isEmpty(strKq)) {
            return kq;
        }
        String strOq = oq();
        kq = strOq;
        return !TextUtils.isEmpty(strOq) ? kq : kq;
    }

    private static String kq() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String oq() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}

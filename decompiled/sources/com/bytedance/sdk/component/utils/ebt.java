package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class ebt {
    private static volatile String kq;

    public static String kq() {
        if (!TextUtils.isEmpty(kq)) {
            return kq;
        }
        String str = Build.MODEL;
        kq = str;
        return str;
    }

    public static int kq(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception unused) {
            return 0;
        }
    }
}

package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class vvw {

    @SuppressLint({"StaticFieldLeak"})
    private static Context kq;

    public static void kq(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            kq = context.createConfigurationContext(oq(context, str, str2));
        } catch (Throwable th) {
            th.getMessage();
        }
        uml.kq(kq);
    }

    private static Configuration oq(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }
}

package com.bytedance.adsdk.ugeno.rjo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class fou {

    @SuppressLint({"StaticFieldLeak"})
    private static Context bob;
    private static String kq;
    private static Resources oq;

    public static void kq(String str) {
        kq = str;
    }

    public static int oq(Context context, String str) {
        return kq(context, str, "drawable");
    }

    private static String kq(Context context) {
        if (kq == null) {
            kq = context.getPackageName();
        }
        return kq;
    }

    private static int kq(Context context, String str, String str2) {
        if (oq == null) {
            oq = context.getResources();
        }
        return oq.getIdentifier(str, str2, kq(context));
    }

    public static int kq(Context context, String str) {
        return kq(context, str, "raw");
    }
}

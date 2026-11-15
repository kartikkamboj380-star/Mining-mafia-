package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class uml {
    private static Resources bob = null;
    private static boolean csi = false;
    private static String fou = null;

    @SuppressLint({"StaticFieldLeak"})
    private static Context kq = null;
    private static String oq = null;
    private static boolean rhi = false;

    public static Drawable bob(Context context, String str) {
        try {
            return oq(context).getDrawable(fou(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int csi(Context context, String str) {
        return kq(context, str, "id");
    }

    public static int dgq(Context context, String str) {
        return kq(context, str, "anim");
    }

    private static String fou(Context context) {
        if (fou == null) {
            fou = context.getPackageName();
        }
        return fou;
    }

    public static void kq(Context context) {
        kq = context;
    }

    public static int oq(Context context, String str) {
        return kq(context, str, "string");
    }

    public static int rhi(Context context, String str) {
        return kq(context, str, "style");
    }

    public static int rjo(Context context, String str) {
        return oq(context).getColor(syt(context, str));
    }

    public static int syt(Context context, String str) {
        return kq(context, str, "color");
    }

    public static void kq(String str) {
        fou = str;
    }

    public static Resources oq(Context context) {
        Resources resources = bob;
        if (resources == null) {
            resources = null;
        }
        Context context2 = kq;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static synchronized void bob(Context context) {
        try {
            if (TextUtils.isEmpty(oq)) {
                return;
            }
            csi = true;
        } catch (Throwable th) {
            Log.e("ResourceHelp", "makePluginResources failed", th);
        }
    }

    private static int kq(Context context, String str, String str2) {
        int identifier = oq(context).getIdentifier(str, str2, fou(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!csi) {
            bob(context);
            return oq(context).getIdentifier(str, str2, fou(context));
        }
        return context.getResources().getIdentifier(str, str2, fou(context));
    }

    public static int fou(Context context, String str) {
        try {
            return kq(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String kq(Context context, String str) {
        return oq(context).getString(oq(context, str));
    }
}

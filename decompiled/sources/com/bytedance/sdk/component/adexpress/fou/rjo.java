package com.bytedance.sdk.component.adexpress.fou;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.uml;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class rjo {
    public static float bob(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().oq();
        }
        return f10 * fou(context);
    }

    private static float fou(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int kq(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static int oq(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().oq();
        }
        float fFou = fou(context);
        if (fFou <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fFou = 1.0f;
        }
        return (int) ((f10 / fFou) + 0.5f);
    }

    public static float kq(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().oq();
        }
        return (f10 * fou(context)) + 0.5f;
    }

    public static String bob(@NonNull Context context) {
        String language;
        try {
            Locale locale = uml.oq(context).getConfiguration().getLocales().get(0);
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            language = "";
        }
        return kq(language);
    }

    public static int oq(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().oq();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int kq(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().oq();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String kq(String str) {
        str.getClass();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}

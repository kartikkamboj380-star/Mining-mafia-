package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f41912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f41913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f41914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f41915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f41916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f41917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f41918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f41919h;

    public static int a(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.touchscreen;
            }
            return 666666;
        } catch (Throwable unused) {
            return 666666;
        }
    }

    private static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f41917f = (int) displayMetrics.density;
            f41916e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f41918g = (int) displayMetrics.xdpi;
            f41919h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f41912a = displayMetrics.widthPixels;
            f41913b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f41914c = mode.getPhysicalWidth();
            f41915d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        int i10 = -1;
        if (context != null) {
            try {
                i10 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i10);
    }

    public static String f(Context context) {
        try {
            d(context);
            b(context);
            c(context);
        } catch (Throwable unused) {
        }
        return f41916e + "[<!>]" + f41912a + "," + f41913b + "[<!>]" + f41914c + "x" + f41915d + "[<!>]";
    }
}

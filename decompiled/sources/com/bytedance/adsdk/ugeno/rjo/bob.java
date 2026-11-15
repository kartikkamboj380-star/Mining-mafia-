package com.bytedance.adsdk.ugeno.rjo;

/* JADX INFO: loaded from: classes.dex */
public final class bob {
    public static float kq(String str, float f10) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f10;
        }
    }

    public static int kq(String str, int i10) {
        try {
            return (int) Float.parseFloat(str);
        } catch (ClassCastException | NumberFormatException unused) {
            return i10;
        }
    }

    public static long kq(String str, long j10) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static double kq(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public static boolean kq(String str, boolean z9) {
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return z9;
        }
    }
}

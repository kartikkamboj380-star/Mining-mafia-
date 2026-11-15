package com.bytedance.sdk.openadsdk.mq;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    protected static int bob = 1;
    protected static long csi = 15360;
    public static int dgq = 4;
    protected static int fou = 30;
    protected static String kq = "images";
    public static int nn = 8;
    protected static String oq = null;
    public static int rhi = 0;
    public static int rjo = 1;
    public static int syt = 2;
    public static int ubx = 16;
    public static int vvw = 32;

    protected static boolean kq(Context context, String str) {
        return false;
    }

    public static boolean oq(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    protected static Bitmap kq(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static float oq(Context context) {
        return context == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : context.getResources().getDisplayMetrics().density;
    }

    public static boolean kq(Context context, int i10) {
        boolean zKq;
        boolean zKq2;
        if (rhi == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zKq = kq(context, "android.permission.READ_MEDIA_IMAGES");
                zKq2 = true;
            } else {
                zKq = kq(context, "android.permission.READ_EXTERNAL_STORAGE");
                zKq2 = kq(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zKq3 = kq(context, "android.permission.CAMERA");
            boolean zKq4 = kq(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zKq && zKq2) {
                rhi |= rjo;
            }
            if (zKq3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                rhi |= syt;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                rhi |= dgq;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                rhi |= nn;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                rhi |= ubx;
            }
            if (zKq4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                rhi |= vvw;
            }
        }
        return (rhi & i10) != 0;
    }

    public static boolean kq(Context context) {
        boolean z9;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 33) {
            z9 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z9 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z10 = false;
            }
            return !z10 && z9;
        }
        z10 = true;
        if (z10) {
        }
    }
}

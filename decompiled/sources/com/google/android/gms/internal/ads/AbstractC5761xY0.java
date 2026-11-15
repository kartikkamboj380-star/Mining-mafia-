package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC5761xY0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f34943a;

    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f34943a;
        if (bool == null || !bool.booleanValue()) {
            return AbstractC5635wY0.a(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}

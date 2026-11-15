package com.google.android.gms.internal.ads;

import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
abstract class B0 {
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
        } catch (IllegalStateException e10) {
            YU.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}

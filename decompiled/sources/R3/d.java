package R3;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final float a(float f10, float f11) {
        float fPow;
        if (f10 < Math.abs(f11)) {
            float f12 = 1;
            fPow = f12 + ((float) Math.pow((f10 / Math.abs(f11)) - f12, 3));
        } else {
            fPow = 1.0f;
        }
        return kotlin.ranges.b.b(f10 + (f11 * fPow), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}

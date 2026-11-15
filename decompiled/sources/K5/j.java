package K5;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class j extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f2833a = -1.0f;

    @Override // K5.d
    public void a(m mVar, float f10, float f11, float f12) {
        mVar.o(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12 * f11, 180.0f, 180.0f - f10);
        float f13 = f12 * 2.0f * f11;
        mVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13, f13, 180.0f, f10);
    }
}

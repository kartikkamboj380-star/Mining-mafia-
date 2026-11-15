package com.bytedance.adsdk.oq;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
class mxq implements Interpolator {
    private final float[] kq;
    private final float[] oq;

    mxq(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i10 = (int) (length / 0.002f);
        int i11 = i10 + 1;
        this.kq = new float[i11];
        this.oq = new float[i11];
        float[] fArr = new float[2];
        for (int i12 = 0; i12 < i11; i12++) {
            pathMeasure.getPosTan((i12 * length) / i10, fArr, null);
            this.kq[i12] = fArr[0];
            this.oq[i12] = fArr[1];
        }
    }

    private static Path kq(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.kq.length - 1;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.kq[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.kq;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return this.oq[i10];
        }
        float f14 = (f10 - f12) / f13;
        float[] fArr2 = this.oq;
        float f15 = fArr2[i10];
        return f15 + (f14 * (fArr2[length] - f15));
    }

    mxq(float f10, float f11, float f12, float f13) {
        this(kq(f10, f11, f12, f13));
    }
}

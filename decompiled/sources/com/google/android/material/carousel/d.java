package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f38921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38922b;

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float c() {
        return this.f38922b;
    }

    public float d() {
        return this.f38921a;
    }

    void e(Context context) {
        float fH = this.f38921a;
        if (fH <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fH = e.h(context);
        }
        this.f38921a = fH;
        float fG = this.f38922b;
        if (fG <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fG = e.g(context);
        }
        this.f38922b = fG;
    }

    boolean f() {
        return true;
    }

    abstract f g(b bVar, View view);

    abstract boolean h(b bVar, int i10);
}

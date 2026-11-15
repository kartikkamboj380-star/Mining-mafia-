package com.bytedance.sdk.openadsdk.api.nativeAd;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class PAGImageItem {
    private final String bob;
    private float fou;
    private final int kq;
    private final int oq;

    public PAGImageItem(int i10, int i11, String str, float f10) {
        this.kq = i10;
        this.oq = i11;
        this.bob = str;
        this.fou = f10;
    }

    public float getDuration() {
        return this.fou;
    }

    public int getHeight() {
        return this.kq;
    }

    public String getImageUrl() {
        return this.bob;
    }

    public int getWidth() {
        return this.oq;
    }

    public PAGImageItem(int i10, int i11, String str) {
        this(i10, i11, str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}

package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.bob;

/* JADX INFO: loaded from: classes.dex */
public final class PAGBannerSize {
    private int bob = 1;
    private int fou;
    private int kq;
    private int oq;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i10, int i11) {
        this.kq = i10;
        this.oq = i11;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        int iKq = bob.kq(context, i10, 0);
        if (iKq == bob.kq) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, iKq);
        pAGBannerSize.bob = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iKq = bob.kq(context, 0);
        if (iKq == bob.kq) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, 0);
        pAGBannerSize.fou = iKq;
        pAGBannerSize.bob = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, 0);
        pAGBannerSize.fou = i11;
        pAGBannerSize.bob = 3;
        return pAGBannerSize;
    }

    public int getHeight() {
        return this.oq;
    }

    public int getMaxHeight() {
        return this.fou;
    }

    public int getType() {
        return this.bob;
    }

    public int getWidth() {
        return this.kq;
    }
}

package com.bytedance.sdk.openadsdk.component.dgq;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.mxq;
import com.bytedance.sdk.openadsdk.core.widget.sns;

/* JADX INFO: loaded from: classes.dex */
public abstract class bob extends com.bytedance.sdk.openadsdk.core.rhi.rjo {
    com.bytedance.sdk.openadsdk.core.rhi.fou bob;
    com.bytedance.sdk.openadsdk.core.rhi.syt csi;
    sns dgq;
    PAGLogoView fou;
    com.bytedance.sdk.openadsdk.core.rhi.fou kq;
    com.bytedance.sdk.openadsdk.core.rhi.syt nn;
    com.bytedance.sdk.openadsdk.core.rhi.bob oq;
    sns rhi;
    com.bytedance.sdk.openadsdk.core.rhi.syt rjo;
    final rjo syt;
    com.bytedance.sdk.openadsdk.core.rhi.syt ubx;
    com.bytedance.sdk.openadsdk.core.widget.bob vvw;

    public bob(Context context) {
        super(context);
        this.syt = new rjo(context);
    }

    public abstract com.bytedance.sdk.openadsdk.core.rhi.fou getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.fou;
    }

    public abstract com.bytedance.sdk.openadsdk.core.rhi.syt getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.rhi.fou getBackImage() {
        return this.kq;
    }

    public com.bytedance.sdk.openadsdk.core.rhi.syt getClickButton() {
        return this.csi;
    }

    public com.bytedance.sdk.openadsdk.core.rhi.syt getContent() {
        return this.ubx;
    }

    public com.bytedance.sdk.openadsdk.core.widget.bob getDspAdChoice() {
        return this.vvw;
    }

    public sns getHostAppIcon() {
        return this.rhi;
    }

    public com.bytedance.sdk.openadsdk.core.rhi.syt getHostAppName() {
        return this.rjo;
    }

    public sns getIconOnlyView() {
        return this.dgq;
    }

    public com.bytedance.sdk.openadsdk.core.rhi.fou getImageView() {
        return this.bob;
    }

    public com.bytedance.sdk.openadsdk.core.rhi.csi getOverlayLayout() {
        return null;
    }

    public abstract mxq getScoreBar();

    public com.bytedance.sdk.openadsdk.core.rhi.syt getTitle() {
        return this.nn;
    }

    public com.bytedance.sdk.openadsdk.core.rhi.syt getTopCountDown() {
        rjo rjoVar = this.syt;
        if (rjoVar != null) {
            return rjoVar.getTopCountDown();
        }
        return null;
    }

    public View getTopDisLike() {
        rjo rjoVar = this.syt;
        if (rjoVar != null) {
            return rjoVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.rhi.fou getTopSkip() {
        rjo rjoVar = this.syt;
        if (rjoVar != null) {
            return rjoVar.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.rhi.bob getVideoContainer() {
        return this.oq;
    }
}

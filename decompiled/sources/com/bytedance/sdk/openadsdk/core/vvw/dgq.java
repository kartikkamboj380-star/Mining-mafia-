package com.bytedance.sdk.openadsdk.core.vvw;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends rjo {

    @NonNull
    private final MediaEvents csi;
    private boolean rhi;

    public dgq(@NonNull AdSession adSession, @NonNull AdEvents adEvents, @NonNull View view, @NonNull MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.csi = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.vvw.rjo
    public void kq(boolean z9, float f10) {
        if (z9) {
            this.fou = VastProperties.createVastPropertiesForSkippableMedia(f10, true, Position.STANDALONE);
        } else {
            this.fou = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        kq(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.vvw.rjo
    public void oq(int i10) {
        if (kq()) {
            switch (i10) {
                case 0:
                    this.csi.pause();
                    break;
                case 1:
                    this.csi.resume();
                    break;
                case 2:
                case 14:
                    this.csi.skipped();
                    break;
                case 4:
                    this.csi.bufferStart();
                    break;
                case 5:
                    this.csi.bufferFinish();
                    break;
                case 6:
                    this.csi.firstQuartile();
                    break;
                case 7:
                    this.csi.midpoint();
                    break;
                case 8:
                    this.csi.thirdQuartile();
                    break;
                case 9:
                    this.csi.complete();
                    break;
                case 10:
                    this.csi.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.csi.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.csi.volumeChange(this.rhi ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
                    break;
                case 13:
                    this.csi.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vvw.rjo
    public void kq(float f10, boolean z9) {
        if (kq()) {
            this.csi.start(f10, z9 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vvw.rjo
    public void kq(boolean z9) {
        this.rhi = z9;
        oq(12);
    }
}

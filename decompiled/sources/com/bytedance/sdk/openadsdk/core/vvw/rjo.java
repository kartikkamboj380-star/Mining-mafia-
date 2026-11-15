package com.bytedance.sdk.openadsdk.core.vvw;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class rjo {
    protected String bob;
    private final AdSession csi;
    protected VastProperties fou;
    private final AdEvents rhi;
    private boolean rjo = false;
    protected boolean kq = false;
    protected int oq = 0;

    public rjo(AdSession adSession, AdEvents adEvents, View view) {
        this.csi = adSession;
        this.rhi = adEvents;
        this.bob = adSession.getAdSessionId();
        kq(view);
    }

    void bob() {
        kq(4);
    }

    public void fou() {
        kq(3);
    }

    void kq(float f10, boolean z9) {
    }

    void oq(int i10) {
    }

    public void kq(boolean z9) {
    }

    void oq() {
        kq(1);
    }

    public void kq(boolean z9, float f10) {
    }

    void kq(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.csi) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void kq(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.csi;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    boolean kq() {
        return this.kq;
    }

    public void kq(int i10) {
        int i11;
        if (this.csi == null || this.rhi == null || !csi.bob()) {
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 || (i11 = this.oq) == 0 || i11 == 4) {
                        return;
                    }
                    this.csi.finish();
                    this.kq = false;
                } else {
                    if (this.rjo) {
                        return;
                    }
                    int i12 = this.oq;
                    if (i12 != 1 && i12 != 2) {
                        return;
                    }
                    this.rhi.impressionOccurred();
                    this.rjo = true;
                }
            } else {
                if (this.oq != 0) {
                    return;
                }
                this.csi.start();
                if (this.fou == null) {
                    this.fou = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.rhi.loaded(this.fou);
                this.kq = true;
                this.fou = null;
            }
        } else {
            if (this.oq != 0) {
                return;
            }
            this.csi.start();
            this.rhi.loaded();
            this.kq = true;
        }
        this.oq = i10;
    }

    public void kq(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            kq((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}

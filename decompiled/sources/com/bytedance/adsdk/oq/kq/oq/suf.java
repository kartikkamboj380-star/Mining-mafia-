package com.bytedance.adsdk.oq.kq.oq;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class suf extends kq<PointF, PointF> {
    protected com.bytedance.adsdk.oq.rjo.oq<Float> csi;
    private final kq<Float, Float> dgq;
    protected com.bytedance.adsdk.oq.rjo.oq<Float> fou;
    private final PointF rhi;
    private final PointF rjo;
    private final kq<Float, Float> syt;

    public suf(kq<Float, Float> kqVar, kq<Float, Float> kqVar2) {
        super(Collections.EMPTY_LIST);
        this.rhi = new PointF();
        this.rjo = new PointF();
        this.syt = kqVar;
        this.dgq = kqVar2;
        kq(syt());
    }

    @Override // com.bytedance.adsdk.oq.kq.oq.kq
    /* JADX INFO: renamed from: dgq, reason: merged with bridge method [inline-methods] */
    public PointF rjo() {
        return kq(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.oq.kq.oq.kq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public PointF kq(com.bytedance.adsdk.oq.rjo.kq<PointF> kqVar, float f10) {
        if (this.fou != null && this.syt.bob() != null) {
            this.syt.csi();
            throw null;
        }
        if (this.csi != null && this.dgq.bob() != null) {
            this.dgq.csi();
            throw null;
        }
        this.rjo.set(this.rhi.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        PointF pointF = this.rjo;
        pointF.set(pointF.x, this.rhi.y);
        return this.rjo;
    }

    @Override // com.bytedance.adsdk.oq.kq.oq.kq
    public void kq(float f10) {
        this.syt.kq(f10);
        this.dgq.kq(f10);
        this.rhi.set(this.syt.rjo().floatValue(), this.dgq.rjo().floatValue());
        for (int i10 = 0; i10 < this.kq.size(); i10++) {
            this.kq.get(i10).kq();
        }
    }
}

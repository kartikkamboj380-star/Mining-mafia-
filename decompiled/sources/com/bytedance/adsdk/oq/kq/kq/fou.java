package com.bytedance.adsdk.oq.kq.kq;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fou implements csi, wki, com.bytedance.adsdk.oq.kq.oq.kq.InterfaceC0222kq {
    private final Matrix bob;
    private final RectF csi;
    private final com.bytedance.adsdk.oq.dgq dgq;
    private final Path fou;
    private final Paint kq;
    private List<wki> nn;
    private final RectF oq;
    private final String rhi;
    private final boolean rjo;
    private final List<bob> syt;
    private com.bytedance.adsdk.oq.kq.oq.mxq ubx;

    public fou(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar, com.bytedance.adsdk.oq.bob.oq.mxq mxqVar, com.bytedance.adsdk.oq.rjo rjoVar) {
        this(dgqVar, kqVar, mxqVar.kq(), mxqVar.bob(), kq(dgqVar, rjoVar, kqVar, mxqVar.oq()), kq(mxqVar.oq()));
    }

    private boolean csi() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.syt.size(); i11++) {
            if ((this.syt.get(i11) instanceof csi) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static List<bob> kq(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.rjo rjoVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar, List<com.bytedance.adsdk.oq.bob.oq.bob> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            bob bobVarKq = list.get(i10).kq(dgqVar, rjoVar, kqVar);
            if (bobVarKq != null) {
                arrayList.add(bobVarKq);
            }
        }
        return arrayList;
    }

    Matrix bob() {
        com.bytedance.adsdk.oq.kq.oq.mxq mxqVar = this.ubx;
        if (mxqVar != null) {
            return mxqVar.fou();
        }
        this.bob.reset();
        return this.bob;
    }

    @Override // com.bytedance.adsdk.oq.kq.kq.wki
    public Path fou() {
        this.bob.reset();
        com.bytedance.adsdk.oq.kq.oq.mxq mxqVar = this.ubx;
        if (mxqVar != null) {
            this.bob.set(mxqVar.fou());
        }
        this.fou.reset();
        if (this.rjo) {
            return this.fou;
        }
        for (int size = this.syt.size() - 1; size >= 0; size--) {
            bob bobVar = this.syt.get(size);
            if (bobVar instanceof wki) {
                this.fou.addPath(((wki) bobVar).fou(), this.bob);
            }
        }
        return this.fou;
    }

    List<wki> oq() {
        if (this.nn == null) {
            this.nn = new ArrayList();
            for (int i10 = 0; i10 < this.syt.size(); i10++) {
                bob bobVar = this.syt.get(i10);
                if (bobVar instanceof wki) {
                    this.nn.add((wki) bobVar);
                }
            }
        }
        return this.nn;
    }

    fou(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar, String str, boolean z9, List<bob> list, com.bytedance.adsdk.oq.bob.kq.vvw vvwVar) {
        this.kq = new com.bytedance.adsdk.oq.kq.kq();
        this.oq = new RectF();
        this.bob = new Matrix();
        this.fou = new Path();
        this.csi = new RectF();
        this.rhi = str;
        this.dgq = dgqVar;
        this.rjo = z9;
        this.syt = list;
        if (vvwVar != null) {
            com.bytedance.adsdk.oq.kq.oq.mxq mxqVarNn = vvwVar.nn();
            this.ubx = mxqVarNn;
            mxqVarNn.kq(kqVar);
            this.ubx.kq(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            bob bobVar = list.get(size);
            if (bobVar instanceof nn) {
                arrayList.add((nn) bobVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((nn) arrayList.get(size2)).kq(list.listIterator(list.size()));
        }
    }

    static com.bytedance.adsdk.oq.bob.kq.vvw kq(List<com.bytedance.adsdk.oq.bob.oq.bob> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.adsdk.oq.bob.oq.bob bobVar = list.get(i10);
            if (bobVar instanceof com.bytedance.adsdk.oq.bob.kq.vvw) {
                return (com.bytedance.adsdk.oq.bob.kq.vvw) bobVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.oq.kq.oq.kq.InterfaceC0222kq
    public void kq() {
        this.dgq.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.oq.kq.kq.bob
    public void kq(List<bob> list, List<bob> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.syt.size());
        arrayList.addAll(list);
        for (int size = this.syt.size() - 1; size >= 0; size--) {
            bob bobVar = this.syt.get(size);
            bobVar.kq(arrayList, this.syt.subList(0, size));
            arrayList.add(bobVar);
        }
    }

    @Override // com.bytedance.adsdk.oq.kq.kq.csi
    public void kq(Canvas canvas, Matrix matrix, int i10) {
        if (this.rjo) {
            return;
        }
        this.bob.set(matrix);
        com.bytedance.adsdk.oq.kq.oq.mxq mxqVar = this.ubx;
        if (mxqVar != null) {
            this.bob.preConcat(mxqVar.fou());
            i10 = (int) (((((this.ubx.kq() == null ? 100 : this.ubx.kq().rjo().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z9 = this.dgq.dgq() && csi() && i10 != 255;
        if (z9) {
            this.oq.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            kq(this.oq, this.bob, true);
            this.kq.setAlpha(i10);
            com.bytedance.adsdk.oq.rhi.rhi.kq(canvas, this.oq, this.kq);
        }
        if (z9) {
            i10 = 255;
        }
        for (int size = this.syt.size() - 1; size >= 0; size--) {
            bob bobVar = this.syt.get(size);
            if (bobVar instanceof csi) {
                ((csi) bobVar).kq(canvas, this.bob, i10);
            }
        }
        if (z9) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.oq.kq.kq.csi
    public void kq(RectF rectF, Matrix matrix, boolean z9) {
        this.bob.set(matrix);
        com.bytedance.adsdk.oq.kq.oq.mxq mxqVar = this.ubx;
        if (mxqVar != null) {
            this.bob.preConcat(mxqVar.fou());
        }
        this.csi.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        for (int size = this.syt.size() - 1; size >= 0; size--) {
            bob bobVar = this.syt.get(size);
            if (bobVar instanceof csi) {
                ((csi) bobVar).kq(this.csi, this.bob, z9);
                rectF.union(this.csi);
            }
        }
    }
}

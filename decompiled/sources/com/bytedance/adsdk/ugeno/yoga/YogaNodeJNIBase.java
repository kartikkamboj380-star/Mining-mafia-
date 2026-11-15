package com.bytedance.adsdk.ugeno.yoga;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@com.bytedance.adsdk.ugeno.yoga.kq.kq
public abstract class YogaNodeJNIBase extends nn implements Cloneable {

    @com.bytedance.adsdk.ugeno.yoga.kq.kq
    private float[] arr;
    private List<YogaNodeJNIBase> bob;
    private oq csi;
    private rjo fou;
    protected long kq;

    @com.bytedance.adsdk.ugeno.yoga.kq.kq
    private int mLayoutDirection;
    private YogaNodeJNIBase oq;
    private Object rhi;
    private boolean rjo;

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.rjo = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.kq = j10;
    }

    @com.bytedance.adsdk.ugeno.yoga.kq.kq
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List<YogaNodeJNIBase> list = this.bob;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.bob.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.oq = this;
        return yogaNodeJNIBase.kq;
    }

    @com.bytedance.adsdk.ugeno.yoga.kq.kq
    public final float baseline(float f10, float f11) {
        return this.csi.kq(this, f10, f11);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    /* JADX INFO: renamed from: bob, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase kq(int i10) {
        List<YogaNodeJNIBase> list = this.bob;
        if (list != null) {
            return list.get(i10);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void csi(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.kq, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void dgq(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.kq, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    /* JADX INFO: renamed from: fou, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase oq(int i10) {
        List<YogaNodeJNIBase> list = this.bob;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i10);
        yogaNodeJNIBaseRemove.oq = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.kq, yogaNodeJNIBaseRemove.kq);
        return yogaNodeJNIBaseRemove;
    }

    @com.bytedance.adsdk.ugeno.yoga.kq.kq
    public final long measure(float f10, int i10, float f11, int i11) {
        if (vvw()) {
            return this.fou.kq(this, f10, syt.kq(i10), f11, syt.kq(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void nn(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.kq, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void rhi(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.kq, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void rjo(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.kq, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void syt(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.kq, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    /* JADX INFO: renamed from: ubx, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase oq() {
        return this.oq;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void vvw(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.kq, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void csi() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.kq);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public float dgq() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[2] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public int kq() {
        List<YogaNodeJNIBase> list = this.bob;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public Object nn() {
        return this.rhi;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public float rhi() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[3] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public float rjo() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[4] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public float syt() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[1] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void ubx(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.kq, f10);
    }

    public boolean vvw() {
        return this.fou != null;
    }

    private void oq(nn nnVar) {
        nn();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(nn nnVar, int i10) {
        if (nnVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) nnVar;
            if (yogaNodeJNIBase.oq == null) {
                if (this.bob == null) {
                    this.bob = new ArrayList(4);
                }
                this.bob.add(i10, yogaNodeJNIBase);
                yogaNodeJNIBase.oq = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.kq, yogaNodeJNIBase.kq, i10);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void bob(kq kqVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.kq, kqVar.kq());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void oq(kq kqVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.kq, kqVar.kq());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void bob(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.kq, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void oq(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.kq, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void bob() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.kq);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void fou(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.kq, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void oq(fou fouVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.kq, fouVar.kq(), f10);
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void bob(fou fouVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.kq, fouVar.kq(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void fou() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.kq);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public int kq(nn nnVar) {
        List<YogaNodeJNIBase> list = this.bob;
        if (list == null) {
            return -1;
        }
        return list.indexOf(nnVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(float f10, float f11) {
        oq((nn) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.bob;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.oq(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].kq;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.kq, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(bob bobVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.kq, bobVar.kq());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(csi csiVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.kq, csiVar.kq());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(rhi rhiVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.kq, rhiVar.kq());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(kq kqVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.kq, kqVar.kq());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(wki wkiVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.kq, wkiVar.kq());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(suf sufVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.kq, sufVar.kq());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.kq, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(fou fouVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.kq, fouVar.kq(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(rjo rjoVar) {
        this.fou = rjoVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.kq, rjoVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(boolean z9) {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.kq, z9);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nn
    public void kq(Object obj) {
        this.rhi = obj;
    }
}

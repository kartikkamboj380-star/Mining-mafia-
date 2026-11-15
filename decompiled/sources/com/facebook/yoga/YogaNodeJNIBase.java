package com.facebook.yoga;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@p075h4.a
public abstract class YogaNodeJNIBase extends r implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private YogaNodeJNIBase f16597a;

    @p075h4.a
    private float[] arr;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f16598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f16599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f16600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f16601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected long f16602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f16603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f16604h;

    @p075h4.a
    private int mLayoutDirection;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16605a;

        static {
            int[] iArr = new int[j.values().length];
            f16605a = iArr;
            try {
                iArr[j.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16605a[j.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16605a[j.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16605a[j.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16605a[j.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16605a[j.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f16604h = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f16602f = j10;
    }

    private void r0(r rVar) {
        s0();
    }

    @p075h4.a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List list = this.f16599c;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.f16599c.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.f16597a = this;
        return yogaNodeJNIBase.f16602f;
    }

    private static YogaValue u0(long j10) {
        return new YogaValue(Float.intBitsToFloat((int) j10), (int) (j10 >> 32));
    }

    @Override // com.facebook.yoga.r
    public void A(Object obj) {
        this.f16603g = obj;
    }

    @Override // com.facebook.yoga.r
    public void B(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f16602f, hVar.e());
    }

    @Override // com.facebook.yoga.r
    public void C(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f16602f, iVar.d());
    }

    @Override // com.facebook.yoga.r
    public void D(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public void E(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public void F() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f16602f);
    }

    @Override // com.facebook.yoga.r
    public void G(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public void H(l lVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f16602f, lVar.d());
    }

    @Override // com.facebook.yoga.r
    public void I(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public void K(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public void L(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f16602f, mVar.d(), f10);
    }

    @Override // com.facebook.yoga.r
    public void M(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(this.f16602f, mVar.d(), f10);
    }

    @Override // com.facebook.yoga.r
    public void O(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public void P() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f16602f);
    }

    @Override // com.facebook.yoga.r
    public void R(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public void U(n nVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f16602f, nVar.d());
    }

    @Override // com.facebook.yoga.r
    public void V(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f16602f, jVar.e(), f10);
    }

    @Override // com.facebook.yoga.r
    public void W(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f16602f, jVar.e());
    }

    @Override // com.facebook.yoga.r
    public void X(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f16602f, jVar.e(), f10);
    }

    @Override // com.facebook.yoga.r
    public void Y(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public void Z(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public void a0(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public void b(r rVar, int i10) {
        if (rVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) rVar;
            if (yogaNodeJNIBase.f16597a != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f16599c == null) {
                this.f16599c = new ArrayList(4);
            }
            this.f16599c.add(i10, yogaNodeJNIBase);
            yogaNodeJNIBase.f16597a = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f16602f, yogaNodeJNIBase.f16602f, i10);
        }
    }

    @Override // com.facebook.yoga.r
    public void b0(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f16602f, f10);
    }

    @p075h4.a
    public final float baseline(float f10, float f11) {
        return this.f16601e.a(this, f10, f11);
    }

    @Override // com.facebook.yoga.r
    public void c(float f10, float f11) {
        r0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f16599c;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.r0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].f16602f;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f16602f, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.r
    public void c0(o oVar) {
        this.f16600d = oVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f16602f, oVar != null);
    }

    @Override // com.facebook.yoga.r
    public void d() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f16602f);
    }

    @Override // com.facebook.yoga.r
    public void d0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public YogaValue e() {
        return u0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f16602f));
    }

    @Override // com.facebook.yoga.r
    public void e0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public h f() {
        float[] fArr = this.arr;
        return h.d(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.r
    public void f0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public float g() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[2] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.facebook.yoga.r
    public void g0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public float h(j jVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f10 = fArr[0];
        if ((((int) f10) & 2) != 2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i10 = (((int) f10) & 1) != 1 ? 4 : 0;
        int i11 = 10 - i10;
        switch (a.f16605a[jVar.ordinal()]) {
            case 1:
                return this.arr[i11];
            case 2:
                return this.arr[11 - i10];
            case 3:
                return this.arr[12 - i10];
            case 4:
                return this.arr[13 - i10];
            case 5:
                return f() == h.RTL ? this.arr[12 - i10] : this.arr[i11];
            case 6:
                return f() == h.RTL ? this.arr[i11] : this.arr[12 - i10];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.r
    public void h0(u uVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f16602f, uVar.d());
    }

    @Override // com.facebook.yoga.r
    public float i() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[1] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.facebook.yoga.r
    public void i0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f16602f, jVar.e(), f10);
    }

    @Override // com.facebook.yoga.r
    public void j0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f16602f, jVar.e(), f10);
    }

    @Override // com.facebook.yoga.r
    public float k() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[3] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.facebook.yoga.r
    public void k0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f16602f, jVar.e(), f10);
    }

    @Override // com.facebook.yoga.r
    public float l() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[4] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.facebook.yoga.r
    public void l0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f16602f, jVar.e(), f10);
    }

    @Override // com.facebook.yoga.r
    public YogaValue m() {
        return u0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f16602f));
    }

    @Override // com.facebook.yoga.r
    public void m0(v vVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f16602f, vVar.d());
    }

    @p075h4.a
    public final long measure(float f10, int i10, float f11, int i11) {
        if (p()) {
            return this.f16600d.D(this, f10, p.d(i10), f11, p.d(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.r
    public boolean n() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return (((int) fArr[0]) & 16) == 16;
        }
        return this.f16604h;
    }

    @Override // com.facebook.yoga.r
    public void n0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public boolean o() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f16602f);
    }

    @Override // com.facebook.yoga.r
    public void o0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f16602f);
    }

    @Override // com.facebook.yoga.r
    public boolean p() {
        return this.f16600d != null;
    }

    @Override // com.facebook.yoga.r
    public void p0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public void q() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f16604h = false;
    }

    @Override // com.facebook.yoga.r
    public void q0(x xVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f16602f, xVar.d());
    }

    @Override // com.facebook.yoga.r
    public void s() {
        this.f16600d = null;
        this.f16601e = null;
        this.f16603g = null;
        this.arr = null;
        this.f16604h = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f16602f);
    }

    public Object s0() {
        return this.f16603g;
    }

    @Override // com.facebook.yoga.r
    public void t(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f16602f, aVar.d());
    }

    @Override // com.facebook.yoga.r
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase r(int i10) {
        List list = this.f16599c;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) list.remove(i10);
        yogaNodeJNIBase.f16597a = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f16602f, yogaNodeJNIBase.f16602f);
        return yogaNodeJNIBase;
    }

    @Override // com.facebook.yoga.r
    public void u(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f16602f, aVar.d());
    }

    @Override // com.facebook.yoga.r
    public void w(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f16602f, aVar.d());
    }

    @Override // com.facebook.yoga.r
    public void x(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f16602f, f10);
    }

    @Override // com.facebook.yoga.r
    public void y(b bVar) {
        this.f16601e = bVar;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f16602f, bVar != null);
    }

    @Override // com.facebook.yoga.r
    public void z(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f16602f, jVar.e(), f10);
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).f16623a));
        this.f16598b = cVar;
    }
}

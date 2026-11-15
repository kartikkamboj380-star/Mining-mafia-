package com.bytedance.adsdk.ugeno.yoga.oq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.adsdk.ugeno.fou;
import com.bytedance.adsdk.ugeno.kq.rjo;
import com.bytedance.adsdk.ugeno.kq.syt;
import com.bytedance.adsdk.ugeno.yoga.csi;
import com.bytedance.adsdk.ugeno.yoga.dgq;
import com.bytedance.adsdk.ugeno.yoga.nn;
import com.bytedance.adsdk.ugeno.yoga.rhi;
import com.bytedance.adsdk.ugeno.yoga.suf;
import com.bytedance.adsdk.ugeno.yoga.ubx;
import com.bytedance.adsdk.ugeno.yoga.wki;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bob extends ViewGroup implements rjo, com.bytedance.adsdk.ugeno.oq.oq {
    private fou bob;
    private syt fou;
    private final Map<View, nn> kq;
    private final nn oq;

    public bob(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        nn nnVarKq;
        this.oq.kq((com.bytedance.adsdk.ugeno.yoga.rjo) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.oq.oq) {
            throw null;
        }
        super.addView(view, i10, layoutParams);
        if (this.kq.containsKey(view)) {
            return;
        }
        if (view instanceof bob) {
            nnVarKq = ((bob) view).getYogaNode();
        } else {
            nnVarKq = this.kq.containsKey(view) ? this.kq.get(view) : ubx.kq();
            nnVarKq.kq(view);
            nnVarKq.kq((com.bytedance.adsdk.ugeno.yoga.rjo) new oq());
        }
        kq((kq) view.getLayoutParams(), nnVarKq, view);
        this.kq.put(view, nnVarKq);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.oq.kq()));
        } else {
            nn nnVar = this.oq;
            nnVar.kq(nnVarKq, nnVar.kq());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oq.oq
    public void bob(View view, int i10) {
        fou(view, i10);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kq;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        fou fouVar = this.bob;
        if (fouVar != null) {
            fouVar.oq(canvas);
        }
    }

    public void fou(View view, int i10) {
        int iKq;
        view.setVisibility(i10);
        try {
            nn nnVar = this.kq.get(view);
            Object tag = view.getTag(151060224);
            if (i10 != 0) {
                if (i10 != 8 || (iKq = this.oq.kq(nnVar)) == -1) {
                    return;
                }
                this.oq.oq(iKq);
                view.setTag(151060224, Integer.valueOf(iKq));
                kq(this.oq);
                return;
            }
            if (tag == null || this.oq.kq(nnVar) != -1) {
                return;
            }
            int iIntValue = ((Integer) tag).intValue();
            if (iIntValue < this.oq.kq()) {
                this.oq.kq(this.kq.get(view), iIntValue);
            } else {
                this.oq.kq(this.kq.get(view), this.oq.kq());
            }
            kq(this.oq);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new kq(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new kq(layoutParams);
    }

    public float getBorderRadius() {
        return this.fou.kq();
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getRipple() {
        return this.fou.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getRubIn() {
        return this.fou.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getShine() {
        return this.fou.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getStretch() {
        return this.fou.getStretch();
    }

    public nn getYogaNode() {
        return this.oq;
    }

    public nn kq(View view) {
        return this.kq.get(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fou fouVar = this.bob;
        if (fouVar != null) {
            fouVar.rjo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fou fouVar = this.bob;
        if (fouVar != null) {
            fouVar.syt();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        fou fouVar = this.bob;
        if (fouVar != null) {
            fouVar.kq(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        fou fouVar = this.bob;
        if (fouVar != null) {
            fouVar.rhi();
        }
        if (!(getParent() instanceof bob)) {
            kq(View.MeasureSpec.makeMeasureSpec(i12 - i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i13 - i11, 1073741824));
        }
        kq(this.oq, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fou fouVar2 = this.bob;
        if (fouVar2 != null) {
            fouVar2.kq(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!(getParent() instanceof bob)) {
            kq(i10, i11);
        }
        fou fouVar = this.bob;
        if (fouVar != null) {
            int[] iArrKq = fouVar.kq(i10, i11);
            setMeasuredDimension(iArrKq[0], iArrKq[1]);
        } else {
            setMeasuredDimension(Math.round(this.oq.syt()), Math.round(this.oq.dgq()));
        }
        fou fouVar2 = this.bob;
        if (fouVar2 != null) {
            fouVar2.csi();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        fou fouVar = this.bob;
        if (fouVar != null) {
            fouVar.oq(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.oq
    public void oq(int i10) {
        nn nnVar = this.oq;
        if (nnVar != null) {
            oq(nnVar, i10);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            kq(getChildAt(i10), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            kq(getChildAt(i10), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        kq(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        kq(getChildAt(i10), false);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        kq(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            kq(getChildAt(i12), false);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            kq(getChildAt(i12), true);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.fou.kq(i10);
    }

    public void setBorderRadius(float f10) {
        this.fou.kq(f10);
    }

    public void setRipple(float f10) {
        syt sytVar = this.fou;
        if (sytVar != null) {
            sytVar.oq(f10);
        }
    }

    public void setRubIn(float f10) {
        syt sytVar = this.fou;
        if (sytVar != null) {
            sytVar.csi(f10);
        }
    }

    public void setShine(float f10) {
        syt sytVar = this.fou;
        if (sytVar != null) {
            sytVar.bob(f10);
        }
    }

    public void setStretch(float f10) {
        syt sytVar = this.fou;
        if (sytVar != null) {
            sytVar.fou(f10);
        }
    }

    public bob(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.fou = new syt(this);
        nn nnVarKq = ubx.kq();
        this.oq = nnVarKq;
        this.kq = new HashMap();
        nnVarKq.kq(this);
        nnVarKq.kq((com.bytedance.adsdk.ugeno.yoga.rjo) new oq());
        kq((kq) generateDefaultLayoutParams(), nnVarKq, this);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.oq
    public void kq(int i10) {
        nn nnVar = this.oq;
        if (nnVar != null) {
            kq(nnVar, i10);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oq.oq
    public void oq(View view, int i10) {
        nn nnVarKq;
        if (view == null || (nnVarKq = kq(view)) == null) {
            return;
        }
        oq(nnVarKq, i10);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.oq.oq
    public void kq(View view, int i10) {
        nn nnVarKq;
        if (view == null || (nnVarKq = kq(view)) == null) {
            return;
        }
        kq(nnVarKq, i10);
        view.requestLayout();
    }

    private void oq(nn nnVar, int i10) {
        if (i10 == -1) {
            nnVar.rjo(100.0f);
        } else if (i10 == -2) {
            nnVar.csi();
        } else {
            nnVar.rhi(i10);
        }
    }

    private void kq(nn nnVar, int i10) {
        if (i10 == -1) {
            nnVar.csi(100.0f);
        } else if (i10 == -2) {
            nnVar.fou();
        } else {
            nnVar.fou(i10);
        }
    }

    public static class oq implements com.bytedance.adsdk.ugeno.yoga.rjo {
        @Override // com.bytedance.adsdk.ugeno.yoga.rjo
        public long kq(nn nnVar, float f10, com.bytedance.adsdk.ugeno.yoga.syt sytVar, float f11, com.bytedance.adsdk.ugeno.yoga.syt sytVar2) {
            View view = (View) nnVar.nn();
            if (view == null || (view instanceof bob)) {
                return dgq.kq(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f10, kq(sytVar)), View.MeasureSpec.makeMeasureSpec((int) f11, kq(sytVar2)));
            return dgq.kq(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int kq(com.bytedance.adsdk.ugeno.yoga.syt sytVar) {
            if (sytVar == com.bytedance.adsdk.ugeno.yoga.syt.AT_MOST) {
                return LinearLayoutManager.INVALID_OFFSET;
            }
            return sytVar == com.bytedance.adsdk.ugeno.yoga.syt.EXACTLY ? 1073741824 : 0;
        }
    }

    public static class kq extends ViewGroup.LayoutParams {
        private float bob;
        private float csi;
        private float dgq;
        private float fou;
        private float gm;
        SparseArray<Float> kq;
        private float mxq;
        private float nn;
        private float nze;
        SparseArray<String> oq;
        private float rhi;
        private float rjo;
        private float sns;
        private float suf;
        private float syt;
        private float ubx;
        private float vvw;
        private float wcx;
        private float wki;

        public kq(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof kq) {
                kq kqVar = (kq) layoutParams;
                this.kq = kqVar.kq.clone();
                this.oq = kqVar.oq.clone();
                return;
            }
            this.kq = new SparseArray<>();
            this.oq = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.kq.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.kq.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void bob(float f10) {
            this.dgq = f10;
            this.kq.put(7, Float.valueOf(f10));
        }

        public void csi(float f10) {
            this.ubx = f10;
            this.kq.put(9, Float.valueOf(f10));
        }

        public void dgq(float f10) {
            this.nze = f10;
            this.kq.put(12, Float.valueOf(f10));
        }

        public void fou(float f10) {
            this.nn = f10;
            this.kq.put(8, Float.valueOf(f10));
        }

        public void kq(float f10) {
            this.rjo = f10;
            this.kq.put(5, Float.valueOf(f10));
        }

        public void mxq(float f10) {
            this.wcx = f10;
            this.kq.put(27, Float.valueOf(f10));
        }

        public void nn(float f10) {
            this.mxq = f10;
            this.kq.put(13, Float.valueOf(f10));
        }

        public void nze(float f10) {
            this.sns = f10;
            this.kq.put(25, Float.valueOf(f10));
        }

        public void oq(float f10) {
            this.syt = f10;
            this.kq.put(6, Float.valueOf(f10));
        }

        public void rhi(float f10) {
            this.vvw = f10;
            this.kq.put(14, Float.valueOf(f10));
        }

        public void rjo(float f10) {
            this.wki = f10;
            this.kq.put(10, Float.valueOf(f10));
        }

        public void sns(float f10) {
            this.gm = f10;
            this.kq.put(28, Float.valueOf(f10));
        }

        public void suf(float f10) {
            this.rhi = f10;
            this.kq.put(20, Float.valueOf(f10));
        }

        public void syt(float f10) {
            this.suf = f10;
            this.kq.put(11, Float.valueOf(f10));
        }

        public void ubx(float f10) {
            this.bob = f10;
            this.kq.put(17, Float.valueOf(f10));
        }

        public void vvw(float f10) {
            this.fou = f10;
            this.kq.put(18, Float.valueOf(f10));
        }

        public void wki(float f10) {
            this.csi = f10;
            this.kq.put(19, Float.valueOf(f10));
        }

        public kq(int i10, int i11) {
            super(i10, i11);
            this.kq = new SparseArray<>();
            this.oq = new SparseArray<>();
            if (i10 == -2 || i10 == -1 || i10 >= 0) {
                this.kq.put(15, Float.valueOf(i10));
            }
            if (i11 == -2 || i11 == -1 || i11 >= 0) {
                this.kq.put(16, Float.valueOf(i11));
            }
        }
    }

    private void kq(nn nnVar) {
        if (nnVar.oq() != null) {
            kq(nnVar.oq());
        } else {
            nnVar.kq(Float.NaN, Float.NaN);
        }
    }

    private void kq(View view, boolean z9) {
        try {
            nn nnVar = this.kq.get(view);
            if (nnVar == null) {
                return;
            }
            nn nnVarOq = nnVar.oq();
            for (int i10 = 0; i10 < nnVarOq.kq(); i10++) {
                if (nnVarOq.kq(i10).equals(nnVar)) {
                    nnVarOq.oq(i10);
                    break;
                }
            }
            nnVar.kq((Object) null);
            this.kq.remove(view);
            if (z9) {
                this.oq.kq(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    private void kq(nn nnVar, float f10, float f11) {
        View view = (View) nnVar.nn();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(nnVar.rhi() + f10);
            int iRound2 = Math.round(nnVar.rjo() + f11);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(nnVar.syt()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(nnVar.dgq()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iKq = nnVar.kq();
        for (int i10 = 0; i10 < iKq; i10++) {
            if (equals(view)) {
                kq(nnVar.kq(i10), f10, f11);
            } else if (!(view instanceof bob)) {
                kq(nnVar.kq(i10), nnVar.rhi() + f10, nnVar.rjo() + f11);
            }
        }
    }

    private void kq(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == 1073741824) {
            this.oq.rhi(size2);
        }
        if (mode == 1073741824) {
            this.oq.fou(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.oq.ubx(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.oq.nn(size);
        }
        this.oq.kq(Float.NaN, Float.NaN);
    }

    protected static void kq(kq kqVar, nn nnVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            nnVar.kq(com.bytedance.adsdk.ugeno.yoga.bob.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                nnVar.oq(com.bytedance.adsdk.ugeno.yoga.fou.LEFT, rect.left);
                nnVar.oq(com.bytedance.adsdk.ugeno.yoga.fou.TOP, rect.top);
                nnVar.oq(com.bytedance.adsdk.ugeno.yoga.fou.RIGHT, rect.right);
                nnVar.oq(com.bytedance.adsdk.ugeno.yoga.fou.BOTTOM, rect.bottom);
            }
        }
        for (int i10 = 0; i10 < kqVar.kq.size(); i10++) {
            int iKeyAt = kqVar.kq.keyAt(i10);
            float fFloatValue = kqVar.kq.valueAt(i10).floatValue();
            if (iKeyAt == 4) {
                nnVar.bob(com.bytedance.adsdk.ugeno.yoga.kq.kq(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                nnVar.kq(com.bytedance.adsdk.ugeno.yoga.kq.kq(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                nnVar.oq(com.bytedance.adsdk.ugeno.yoga.kq.kq(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                nnVar.vvw(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    nnVar.bob();
                } else {
                    nnVar.bob(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                nnVar.kq(csi.kq(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                nnVar.kq(fFloatValue);
            } else if (iKeyAt == 7) {
                nnVar.oq(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    nnVar.rjo(100.0f);
                } else if (fFloatValue == -2.0f) {
                    nnVar.csi();
                } else {
                    nnVar.rhi(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                nnVar.kq(com.bytedance.adsdk.ugeno.yoga.fou.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                nnVar.kq(rhi.kq(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                nnVar.kq(com.bytedance.adsdk.ugeno.yoga.fou.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                nnVar.kq(com.bytedance.adsdk.ugeno.yoga.fou.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                nnVar.kq(com.bytedance.adsdk.ugeno.yoga.fou.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                nnVar.dgq(fFloatValue);
            } else if (iKeyAt == 27) {
                nnVar.syt(fFloatValue);
            } else if (iKeyAt == 22) {
                nnVar.oq(com.bytedance.adsdk.ugeno.yoga.fou.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                nnVar.oq(com.bytedance.adsdk.ugeno.yoga.fou.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                nnVar.oq(com.bytedance.adsdk.ugeno.yoga.fou.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                nnVar.oq(com.bytedance.adsdk.ugeno.yoga.fou.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                nnVar.bob(com.bytedance.adsdk.ugeno.yoga.fou.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                nnVar.bob(com.bytedance.adsdk.ugeno.yoga.fou.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                nnVar.bob(com.bytedance.adsdk.ugeno.yoga.fou.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                nnVar.bob(com.bytedance.adsdk.ugeno.yoga.fou.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                nnVar.kq(wki.kq(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    nnVar.csi(100.0f);
                } else if (fFloatValue == -2.0f) {
                    nnVar.fou();
                } else {
                    nnVar.fou(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                nnVar.kq(suf.kq(Math.round(fFloatValue)));
            }
        }
    }

    public void kq(com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        this.bob = bobVar;
    }
}

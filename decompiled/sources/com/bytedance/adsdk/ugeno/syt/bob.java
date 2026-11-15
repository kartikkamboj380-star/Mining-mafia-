package com.bytedance.adsdk.ugeno.syt;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bob extends ViewGroup {
    com.bytedance.adsdk.ugeno.syt.oq bob;
    private VelocityTracker bss;
    private final Rect dgq;
    private fou ea;
    private boolean ebt;
    private float fax;
    private int fgm;
    int fou;
    private int gm;
    private boolean ha;
    private ArrayList<View> hlh;
    private int hn;
    private int ibd;
    private int jhe;
    private boolean jq;
    private int kq;
    private int ktb;
    private boolean ls;
    private float mq;
    private int mxq;
    private boolean nb;
    private int nn;
    private float nz;
    private rhi nze;
    private boolean ou;
    private boolean oxe;
    private EdgeEffect pfu;
    private int pms;
    private fou qip;
    private final ArrayList<oq> rjo;
    private boolean rs;
    private EdgeEffect rz;
    private Drawable sns;
    private boolean suf;
    private final oq syt;
    private int syw;
    private int tvh;
    private int uaj;
    private Parcelable ubx;
    private int ui;
    private int uml;
    private ClassLoader vvw;
    private int wbn;
    private int wcx;
    private int wee;
    private float wf;
    private final Runnable wj;
    private Scroller wki;
    private int wol;
    private csi xk;
    private float xn;
    private List<fou> xp;
    private boolean ye;
    private List<Object> ysx;
    private float yyl;
    private int zfx;
    static final int[] oq = {R.attr.layout_gravity};
    private static final Comparator<oq> csi = new Comparator<oq>() { // from class: com.bytedance.adsdk.ugeno.syt.bob.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public int compare(oq oqVar, oq oqVar2) {
            return oqVar.oq - oqVar2.oq;
        }
    };
    private static final Interpolator rhi = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.syt.bob.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final syt qdf = new syt();

    public interface csi {
        void kq(View view, float f10);
    }

    public interface fou {
        void kq(int i10, float f10, int i11);

        void ubx(int i10);

        void vvw(int i10);
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface kq {
    }

    static class oq {
        boolean bob;
        float csi;
        float fou;
        Object kq;
        int oq;

        oq() {
        }
    }

    private class rhi extends DataSetObserver {
        rhi() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            bob.this.oq();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            bob.this.oq();
        }
    }

    public static class rjo extends com.bytedance.adsdk.ugeno.syt.kq {
        public static final Parcelable.Creator<rjo> CREATOR = new Parcelable.ClassLoaderCreator<rjo>() { // from class: com.bytedance.adsdk.ugeno.syt.bob.rjo.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public rjo createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new rjo(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public rjo createFromParcel(Parcel parcel) {
                return new rjo(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public rjo[] newArray(int i10) {
                return new rjo[i10];
            }
        };
        Parcelable bob;
        ClassLoader fou;
        int oq;

        public rjo(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.oq + "}";
        }

        @Override // com.bytedance.adsdk.ugeno.syt.kq, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.oq);
            parcel.writeParcelable(this.bob, i10);
        }

        rjo(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.oq = parcel.readInt();
            this.bob = parcel.readParcelable(classLoader);
            this.fou = classLoader;
        }
    }

    static class syt implements Comparator<View> {
        syt() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0233bob c0233bob = (C0233bob) view.getLayoutParams();
            C0233bob c0233bob2 = (C0233bob) view2.getLayoutParams();
            boolean z9 = c0233bob.kq;
            if (z9 != c0233bob2.kq) {
                return z9 ? 1 : -1;
            }
            return c0233bob.csi - c0233bob2.csi;
        }
    }

    public bob(Context context) {
        super(context);
        this.rjo = new ArrayList<>();
        this.syt = new oq();
        this.dgq = new Rect();
        this.nn = -1;
        this.ubx = null;
        this.vvw = null;
        this.fax = -3.4028235E38f;
        this.mq = Float.MAX_VALUE;
        this.ibd = 1;
        this.wol = -1;
        this.oxe = true;
        this.ye = false;
        this.wj = new Runnable() { // from class: com.bytedance.adsdk.ugeno.syt.bob.3
            @Override // java.lang.Runnable
            public void run() {
                bob.this.setScrollState(0);
                bob.this.bob();
            }
        };
        this.hn = 0;
        kq();
    }

    private void csi(int i10) {
        fou fouVar = this.ea;
        if (fouVar != null) {
            fouVar.ubx(i10);
        }
        List<fou> list = this.xp;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                fou fouVar2 = this.xp.get(i11);
                if (fouVar2 != null) {
                    fouVar2.ubx(i10);
                }
            }
        }
        fou fouVar3 = this.qip;
        if (fouVar3 != null) {
            fouVar3.ubx(i10);
        }
    }

    private oq dgq() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.mxq / clientWidth : 0.0f;
        int i11 = 0;
        boolean z9 = true;
        oq oqVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.rjo.size()) {
            oq oqVar2 = this.rjo.get(i11);
            if (!z9 && oqVar2.oq != (i10 = i12 + 1)) {
                oqVar2 = this.syt;
                oqVar2.csi = f10 + f12 + f11;
                oqVar2.oq = i10;
                oqVar2.fou = this.bob.kq(i10);
                i11--;
            }
            oq oqVar3 = oqVar2;
            f10 = oqVar3.csi;
            float f13 = oqVar3.fou + f10 + f11;
            if (!z9 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i11 == this.rjo.size() - 1) {
                return oqVar3;
            }
            int i13 = oqVar3.oq;
            float f14 = oqVar3.fou;
            i11++;
            i12 = i13;
            f12 = f14;
            oqVar = oqVar3;
            z9 = false;
        }
        return oqVar;
    }

    private boolean fou(int i10) {
        if (this.rjo.size() == 0) {
            if (this.oxe) {
                return false;
            }
            this.jq = false;
            kq(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            if (this.jq) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        oq oqVarDgq = dgq();
        int clientWidth = getClientWidth();
        int i11 = this.mxq;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = oqVarDgq.oq;
        float f11 = ((i10 / f10) - oqVarDgq.csi) / (oqVarDgq.fou + (i11 / f10));
        this.jq = false;
        kq(i13, f11, (int) (i12 * f11));
        if (this.jq) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void nn() {
        this.rs = false;
        this.ha = false;
        VelocityTracker velocityTracker = this.bss;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.bss = null;
        }
    }

    private void rhi() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((C0233bob) getChildAt(i10).getLayoutParams()).kq) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void rjo() {
        if (this.uaj != 0) {
            ArrayList<View> arrayList = this.hlh;
            if (arrayList == null) {
                this.hlh = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.hlh.add(getChildAt(i10));
            }
            Collections.sort(this.hlh, qdf);
        }
    }

    private void setScrollingCacheEnabled(boolean z9) {
        if (this.ou != z9) {
            this.ou = z9;
        }
    }

    private boolean syt() {
        this.wol = -1;
        nn();
        this.rz.onRelease();
        this.pfu.onRelease();
        return this.rz.isFinished() || this.pfu.isFinished();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        oq oqVarKq;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (oqVarKq = kq(childAt)) != null && oqVarKq.oq == this.fou) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        oq oqVarKq;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (oqVarKq = kq(childAt)) != null && oqVarKq.oq == this.fou) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0233bob c0233bob = (C0233bob) layoutParams;
        boolean zBob = c0233bob.kq | bob(view);
        c0233bob.kq = zBob;
        if (!this.nb) {
            super.addView(view, i10, layoutParams);
        } else {
            if (zBob) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0233bob.fou = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    void bob() {
        kq(this.fou);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.bob == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.fax));
        }
        return i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.mq));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0233bob) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.suf = true;
        if (this.wki.isFinished() || !this.wki.computeScrollOffset()) {
            kq(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.wki.getCurrX();
        int currY = this.wki.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!fou(currX)) {
                this.wki.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || kq(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        oq oqVarKq;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (oqVarKq = kq(childAt)) != null && oqVarKq.oq == this.fou && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.syt.oq oqVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (oqVar = this.bob) != null && oqVar.kq() > 1)) {
            if (!this.rz.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.fax * width);
                this.rz.setSize(height, width);
                zDraw = this.rz.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.pfu.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mq + 1.0f)) * width2);
                this.pfu.setSize(height2, width2);
                zDraw |= this.pfu.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.rz.finish();
            this.pfu.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.sns;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0233bob();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.syt.oq getAdapter() {
        return this.bob;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.uaj == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C0233bob) this.hlh.get(i11).getLayoutParams()).rhi;
    }

    public int getCurrentItem() {
        return this.fou;
    }

    public int getOffscreenPageLimit() {
        return this.ibd;
    }

    public int getPageMargin() {
        return this.mxq;
    }

    void kq() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.wki = new Scroller(context, rhi);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.ktb = viewConfiguration.getScaledPagingTouchSlop();
        this.wee = (int) (400.0f * f10);
        this.tvh = viewConfiguration.getScaledMaximumFlingVelocity();
        this.rz = new EdgeEffect(context);
        this.pfu = new EdgeEffect(context);
        this.wbn = (int) (25.0f * f10);
        this.syw = (int) (2.0f * f10);
        this.fgm = (int) (f10 * 16.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.oxe = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.wj);
        Scroller scroller = this.wki;
        if (scroller != null && !scroller.isFinished()) {
            this.wki.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.mxq <= 0 || this.sns == null || this.rjo.size() <= 0 || this.bob == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.mxq / f11;
        int i11 = 0;
        oq oqVar = this.rjo.get(0);
        float f13 = oqVar.csi;
        int size = this.rjo.size();
        int i12 = oqVar.oq;
        int i13 = this.rjo.get(size - 1).oq;
        while (i12 < i13) {
            while (true) {
                i10 = oqVar.oq;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                oqVar = this.rjo.get(i11);
            }
            if (i12 == i10) {
                float f14 = oqVar.csi;
                float f15 = oqVar.fou;
                f10 = (f14 + f15) * f11;
                f13 = f14 + f15 + f12;
            } else {
                float fKq = this.bob.kq(i12);
                f10 = (f13 + fKq) * f11;
                f13 += fKq + f12;
            }
            if (this.mxq + f10 > scrollX) {
                this.sns.setBounds(Math.round(f10), this.wcx, Math.round(this.mxq + f10), this.gm);
                this.sns.draw(canvas);
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            syt();
            return false;
        }
        if (action != 0) {
            if (this.rs) {
                return true;
            }
            if (this.ha) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.nz = x10;
            this.wf = x10;
            float y9 = motionEvent.getY();
            this.yyl = y9;
            this.xn = y9;
            this.wol = motionEvent.getPointerId(0);
            this.ha = false;
            this.suf = true;
            this.wki.computeScrollOffset();
            if (this.hn != 2 || Math.abs(this.wki.getFinalX() - this.wki.getCurrX()) <= this.syw) {
                kq(false);
                this.rs = false;
            } else {
                this.wki.abortAnimation();
                this.ebt = false;
                bob();
                this.rs = true;
                bob(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.wol;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.wf;
                float fAbs = Math.abs(f10);
                float y10 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y10 - this.yyl);
                if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !kq(this.wf, f10) && kq(this, false, (int) f10, (int) x11, (int) y10)) {
                    this.wf = x11;
                    this.xn = y10;
                    this.ha = true;
                    return false;
                }
                int i11 = this.ktb;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.rs = true;
                    bob(true);
                    setScrollState(1);
                    this.wf = f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.nz + this.ktb : this.nz - this.ktb;
                    this.xn = y10;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.ha = true;
                }
                if (this.rs && oq(x11)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            kq(motionEvent);
        }
        if (this.bss == null) {
            this.bss = VelocityTracker.obtain();
        }
        this.bss.addMovement(motionEvent);
        return this.rs;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean z10;
        oq oqVarKq;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                C0233bob c0233bob = (C0233bob) childAt.getLayoutParams();
                if (c0233bob.kq) {
                    int i18 = c0233bob.oq;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, paddingTop + childAt.getMeasuredHeight());
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, paddingTop + childAt.getMeasuredHeight());
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                C0233bob c0233bob2 = (C0233bob) childAt2.getLayoutParams();
                if (!c0233bob2.kq && (oqVarKq = kq(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (oqVarKq.csi * f10)) + paddingLeft;
                    if (c0233bob2.fou) {
                        c0233bob2.fou = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * c0233bob2.bob), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.wcx = paddingTop;
        this.gm = i15 - paddingBottom;
        this.pms = i16;
        if (this.oxe) {
            z10 = false;
            kq(this.fou, false, 0, false);
        } else {
            z10 = false;
        }
        this.oxe = z10;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        C0233bob c0233bob;
        C0233bob c0233bob2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.zfx = Math.min(measuredWidth / 10, this.fgm);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z9 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (c0233bob2 = (C0233bob) childAt.getLayoutParams()) != null && c0233bob2.kq) {
                int i15 = c0233bob2.oq;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z10 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z9 = false;
                }
                int i18 = LinearLayoutManager.INVALID_OFFSET;
                if (z10) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z9 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) c0233bob2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) c0233bob2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z9) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.jhe = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.uml = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.nb = true;
        bob();
        this.nb = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((c0233bob = (C0233bob) childAt2.getLayoutParams()) == null || !c0233bob.kq)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0233bob.bob), 1073741824), this.uml);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        oq oqVarKq;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (oqVarKq = kq(childAt)) != null && oqVarKq.oq == this.fou && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof rjo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        rjo rjoVar = (rjo) parcelable;
        super.onRestoreInstanceState(rjoVar.kq());
        if (this.bob != null) {
            kq(rjoVar.oq, false, true);
            return;
        }
        this.nn = rjoVar.oq;
        this.ubx = rjoVar.bob;
        this.vvw = rjoVar.fou;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        rjo rjoVar = new rjo(super.onSaveInstanceState());
        rjoVar.oq = this.fou;
        com.bytedance.adsdk.ugeno.syt.oq oqVar = this.bob;
        if (oqVar != null) {
            rjoVar.bob = oqVar.oq();
        }
        return rjoVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.mxq;
            kq(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.syt.oq oqVar;
        int iFindPointerIndex;
        if (this.ls) {
            return true;
        }
        boolean zSyt = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (oqVar = this.bob) == null || oqVar.kq() == 0) {
            return false;
        }
        if (this.bss == null) {
            this.bss = VelocityTracker.obtain();
        }
        this.bss.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.wki.abortAnimation();
            this.ebt = false;
            bob();
            float x10 = motionEvent.getX();
            this.nz = x10;
            this.wf = x10;
            float y9 = motionEvent.getY();
            this.yyl = y9;
            this.xn = y9;
            this.wol = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.wf = motionEvent.getX(actionIndex);
                            this.wol = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        kq(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.wol);
                        if (iFindPointerIndex2 != -1) {
                            this.wf = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.rs) {
                    kq(this.fou, true, 0, false);
                    zSyt = syt();
                }
            } else if (!this.rs) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.wol);
                if (iFindPointerIndex3 == -1) {
                    zSyt = syt();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x11 - this.wf);
                    float y10 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y10 - this.xn);
                    if (fAbs > this.ktb && fAbs > fAbs2) {
                        this.rs = true;
                        bob(true);
                        float f10 = this.nz;
                        this.wf = x11 - f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f10 + this.ktb : f10 - this.ktb;
                        this.xn = y10;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.rs) {
                        zSyt = oq(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.rs && (iFindPointerIndex = motionEvent.findPointerIndex(this.wol)) != -1) {
                zSyt = oq(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.rs) {
            VelocityTracker velocityTracker = this.bss;
            velocityTracker.computeCurrentVelocity(1000, this.tvh);
            int xVelocity = (int) velocityTracker.getXVelocity(this.wol);
            this.ebt = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            oq oqVarDgq = dgq();
            float f11 = clientWidth;
            float f12 = this.mxq / f11;
            int i10 = oqVarDgq.oq;
            float f13 = ((scrollX / f11) - oqVarDgq.csi) / (oqVarDgq.fou + f12);
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.wol);
            if (iFindPointerIndex4 != -1) {
                kq(kq(i10, f13, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.nz)), true, true, xVelocity);
                zSyt = syt();
            }
        }
        if (zSyt) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    public void oq(fou fouVar) {
        List<fou> list = this.xp;
        if (list != null) {
            list.remove(fouVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.nb) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.syt.oq oqVar) {
        com.bytedance.adsdk.ugeno.syt.oq oqVar2 = this.bob;
        if (oqVar2 != null) {
            oqVar2.kq((DataSetObserver) null);
            for (int i10 = 0; i10 < this.rjo.size(); i10++) {
                oq oqVar3 = this.rjo.get(i10);
                this.bob.kq((ViewGroup) this, oqVar3.oq, oqVar3.kq);
            }
            this.rjo.clear();
            rhi();
            this.fou = 0;
            scrollTo(0, 0);
        }
        this.bob = oqVar;
        this.kq = 0;
        if (oqVar != null) {
            if (this.nze == null) {
                this.nze = new rhi();
            }
            this.bob.kq((DataSetObserver) this.nze);
            this.ebt = false;
            boolean z9 = this.oxe;
            this.oxe = true;
            this.kq = this.bob.kq();
            int i11 = this.nn;
            if (i11 >= 0) {
                kq(i11, false, true);
                this.nn = -1;
                this.ubx = null;
                this.vvw = null;
            } else if (z9) {
                requestLayout();
            } else {
                bob();
            }
        }
        List<Object> list = this.ysx;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.ysx.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.ysx.get(i12);
        }
    }

    public void setCurrentItem(int i10) {
        this.ebt = false;
        kq(i10, !this.oxe, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.ibd) {
            this.ibd = i10;
            bob();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(fou fouVar) {
        this.ea = fouVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.mxq;
        this.mxq = i10;
        int width = getWidth();
        kq(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.sns = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i10) {
        if (this.hn == i10) {
            return;
        }
        this.hn = i10;
        if (this.xk != null) {
            oq(i10 != 0);
        }
        rhi(i10);
    }

    public void setScroller(Scroller scroller) {
        this.wki = scroller;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.sns;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.syt.bob$bob, reason: collision with other inner class name */
    public static class C0233bob extends ViewGroup.LayoutParams {
        float bob;
        int csi;
        boolean fou;
        public boolean kq;
        public int oq;
        int rhi;

        public C0233bob() {
            super(-1, -1);
            this.bob = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public C0233bob(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.bob = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bob.oq);
            this.oq = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static boolean bob(View view) {
        return view.getClass().getAnnotation(kq.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0233bob(getContext(), attributeSet);
    }

    void oq() {
        int iKq = this.bob.kq();
        this.kq = iKq;
        boolean z9 = this.rjo.size() < (this.ibd * 2) + 1 && this.rjo.size() < iKq;
        int iMax = this.fou;
        int i10 = 0;
        while (i10 < this.rjo.size()) {
            oq oqVar = this.rjo.get(i10);
            int iKq2 = this.bob.kq(oqVar.kq);
            if (iKq2 != -1) {
                if (iKq2 == -2) {
                    this.rjo.remove(i10);
                    i10--;
                    this.bob.kq((ViewGroup) this, oqVar.oq, oqVar.kq);
                    int i11 = this.fou;
                    if (i11 == oqVar.oq) {
                        iMax = Math.max(0, Math.min(i11, iKq - 1));
                    }
                } else {
                    int i12 = oqVar.oq;
                    if (i12 != iKq2) {
                        if (i12 == this.fou) {
                            iMax = iKq2;
                        }
                        oqVar.oq = iKq2;
                    }
                }
                z9 = true;
            }
            i10++;
        }
        Collections.sort(this.rjo, csi);
        if (z9) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C0233bob c0233bob = (C0233bob) getChildAt(i13).getLayoutParams();
                if (!c0233bob.kq) {
                    c0233bob.bob = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            kq(iMax, false, true);
            requestLayout();
        }
    }

    private void bob(boolean z9) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z9);
        }
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    private void rhi(int i10) {
        fou fouVar = this.ea;
        if (fouVar != null) {
            fouVar.vvw(i10);
        }
        List<fou> list = this.xp;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                fou fouVar2 = this.xp.get(i11);
                if (fouVar2 != null) {
                    fouVar2.vvw(i10);
                }
            }
        }
        fou fouVar3 = this.qip;
        if (fouVar3 != null) {
            fouVar3.vvw(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    public boolean bob(int i10) {
        boolean zFou;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i10 == 17 || i10 == 1) {
                zFou = fou();
            } else if (i10 == 66 || i10 == 2) {
                zFou = csi();
            } else {
                zFou = false;
            }
        } else if (i10 == 17) {
            int i11 = kq(this.dgq, viewFindNextFocus).left;
            int i12 = kq(this.dgq, viewFindFocus).left;
            if (viewFindFocus != null && i11 >= i12) {
                zFou = fou();
            } else {
                zFou = viewFindNextFocus.requestFocus();
            }
        } else if (i10 == 66) {
            int i13 = kq(this.dgq, viewFindNextFocus).left;
            int i14 = kq(this.dgq, viewFindFocus).left;
            if (viewFindFocus == null || i13 > i14) {
                zFou = viewFindNextFocus.requestFocus();
            } else {
                zFou = csi();
            }
        } else {
            zFou = false;
        }
        if (zFou) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zFou;
    }

    boolean csi() {
        com.bytedance.adsdk.ugeno.syt.oq oqVar = this.bob;
        if (oqVar == null || this.fou >= oqVar.kq() - 1) {
            return false;
        }
        kq(this.fou + 1, true);
        return true;
    }

    boolean fou() {
        int i10 = this.fou;
        if (i10 <= 0) {
            return false;
        }
        kq(i10 - 1, true);
        return true;
    }

    public void kq(int i10, boolean z9) {
        this.ebt = false;
        kq(i10, z9, false);
    }

    void kq(int i10, boolean z9, boolean z10) {
        kq(i10, z9, z10, 0);
    }

    void kq(int i10, boolean z9, boolean z10, int i11) {
        com.bytedance.adsdk.ugeno.syt.oq oqVar = this.bob;
        if (oqVar != null && oqVar.kq() > 0) {
            if (!z10 && this.fou == i10 && this.rjo.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.bob.kq()) {
                i10 = this.bob.kq() - 1;
            }
            int i12 = this.ibd;
            int i13 = this.fou;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.rjo.size(); i14++) {
                    this.rjo.get(i14).bob = true;
                }
            }
            boolean z11 = this.fou != i10;
            if (this.oxe) {
                this.fou = i10;
                if (z11) {
                    csi(i10);
                }
                requestLayout();
                return;
            }
            kq(i10);
            kq(i10, z9, i11, z11);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    oq oq(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return kq(view);
            }
        }
    }

    oq oq(int i10) {
        for (int i11 = 0; i11 < this.rjo.size(); i11++) {
            oq oqVar = this.rjo.get(i11);
            if (oqVar.oq == i10) {
                return oqVar;
            }
        }
        return null;
    }

    private void oq(int i10, float f10, int i11) {
        fou fouVar = this.ea;
        if (fouVar != null) {
            fouVar.kq(i10, f10, i11);
        }
        List<fou> list = this.xp;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                fou fouVar2 = this.xp.get(i12);
                if (fouVar2 != null) {
                    fouVar2.kq(i10, f10, i11);
                }
            }
        }
        fou fouVar3 = this.qip;
        if (fouVar3 != null) {
            fouVar3.kq(i10, f10, i11);
        }
    }

    private void kq(int i10, boolean z9, int i11, boolean z10) {
        oq oqVarOq = oq(i10);
        int clientWidth = oqVarOq != null ? (int) (getClientWidth() * Math.max(this.fax, Math.min(oqVarOq.csi, this.mq))) : 0;
        if (z9) {
            kq(clientWidth, 0, i11);
            if (z10) {
                csi(i10);
                return;
            }
            return;
        }
        if (z10) {
            csi(i10);
        }
        kq(false);
        scrollTo(clientWidth, 0);
        fou(clientWidth);
    }

    private void oq(boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z9 ? this.ui : 0, null);
        }
    }

    private boolean oq(float f10) {
        boolean z9;
        boolean z10;
        float f11 = this.wf - f10;
        this.wf = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.fax * clientWidth;
        float f13 = this.mq * clientWidth;
        boolean z11 = false;
        oq oqVar = this.rjo.get(0);
        ArrayList<oq> arrayList = this.rjo;
        oq oqVar2 = arrayList.get(arrayList.size() - 1);
        if (oqVar.oq != 0) {
            f12 = oqVar.csi * clientWidth;
            z9 = false;
        } else {
            z9 = true;
        }
        if (oqVar2.oq != this.bob.kq() - 1) {
            f13 = oqVar2.csi * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f12) {
            if (z9) {
                this.rz.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z10) {
                this.pfu.onPull(Math.abs(scrollX - f13) / clientWidth);
                z11 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.wf += scrollX - i10;
        scrollTo(i10, getScrollY());
        fou(i10);
        return z11;
    }

    public void kq(fou fouVar) {
        if (this.xp == null) {
            this.xp = new ArrayList();
        }
        this.xp.add(fouVar);
    }

    public void kq(boolean z9, csi csiVar) {
        kq(z9, csiVar, 2);
    }

    public void kq(boolean z9, csi csiVar, int i10) {
        boolean z10 = csiVar != null;
        boolean z11 = z10 != (this.xk != null);
        this.xk = csiVar;
        setChildrenDrawingOrderEnabled(z10);
        if (z10) {
            this.uaj = z9 ? 2 : 1;
            this.ui = i10;
        } else {
            this.uaj = 0;
        }
        if (z11) {
            bob();
        }
    }

    float kq(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    void kq(int i10, int i11, int i12) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.wki;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.suf ? this.wki.getCurrX() : this.wki.getStartX();
            this.wki.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            kq(false);
            bob();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fKq = f11 + (kq(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fKq / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i14) / ((f10 * this.bob.kq(this.fou)) + this.mxq)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.suf = false;
        this.wki.startScroll(i13, scrollY, i14, i15, iMin);
        postInvalidateOnAnimation();
    }

    oq kq(int i10, int i11) {
        oq oqVar = new oq();
        oqVar.oq = i10;
        oqVar.kq = this.bob.kq((ViewGroup) this, i10);
        oqVar.fou = this.bob.kq(i10);
        if (i11 >= 0 && i11 < this.rjo.size()) {
            this.rjo.add(i11, oqVar);
            return oqVar;
        }
        this.rjo.add(oqVar);
        return oqVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c6 A[PHI: r7 r10 r15
      0x00c6: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    void kq(int i10) {
        oq oqVarOq;
        String hexString;
        oq oqVarKq;
        oq oqVarKq2;
        oq oqVar;
        int i11 = this.fou;
        if (i11 != i10) {
            oqVarOq = oq(i11);
            this.fou = i10;
        } else {
            oqVarOq = null;
        }
        if (this.bob == null) {
            rjo();
            return;
        }
        if (this.ebt) {
            rjo();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i12 = this.ibd;
        int iMax = Math.max(0, this.fou - i12);
        int iKq = this.bob.kq();
        int iMin = Math.min(iKq - 1, this.fou + i12);
        if (iKq == this.kq) {
            int i13 = 0;
            while (true) {
                if (i13 < this.rjo.size()) {
                    oqVarKq = this.rjo.get(i13);
                    int i14 = oqVarKq.oq;
                    int i15 = this.fou;
                    if (i14 >= i15) {
                        if (i14 != i15) {
                            break;
                        } else {
                            break;
                        }
                    }
                    i13++;
                }
                oqVarKq = null;
                break;
            }
            if (oqVarKq == null && iKq > 0) {
                oqVarKq = kq(this.fou, i13);
            }
            if (oqVarKq != null) {
                int i16 = i13 - 1;
                oq oqVar2 = i16 >= 0 ? this.rjo.get(i16) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - oqVarKq.fou) + (getPaddingLeft() / clientWidth);
                float f10 = 0.0f;
                for (int i17 = this.fou - 1; i17 >= 0; i17--) {
                    if (f10 >= paddingLeft && i17 < iMax) {
                        if (oqVar2 == null) {
                            break;
                        }
                        if (i17 == oqVar2.oq && !oqVar2.bob) {
                            this.rjo.remove(i16);
                            this.bob.kq((ViewGroup) this, i17, oqVar2.kq);
                            i16--;
                            i13--;
                            if (i16 >= 0) {
                                oqVar = this.rjo.get(i16);
                            } else {
                                oqVar = null;
                            }
                            oqVar2 = oqVar;
                        }
                    } else {
                        if (oqVar2 != null && i17 == oqVar2.oq) {
                            f10 += oqVar2.fou;
                            i16--;
                            if (i16 >= 0) {
                                oqVar = this.rjo.get(i16);
                            } else {
                                oqVar = null;
                            }
                        } else {
                            f10 += kq(i17, i16 + 1).fou;
                            i13++;
                            if (i16 >= 0) {
                                oqVar = this.rjo.get(i16);
                            } else {
                                oqVar = null;
                            }
                        }
                        oqVar2 = oqVar;
                    }
                }
                float f11 = oqVarKq.fou;
                int i18 = i13 + 1;
                if (f11 < 2.0f) {
                    oq oqVar3 = i18 < this.rjo.size() ? this.rjo.get(i18) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i19 = this.fou;
                    while (true) {
                        i19++;
                        if (i19 >= iKq) {
                            break;
                        }
                        if (f11 >= paddingRight && i19 > iMin) {
                            if (oqVar3 == null) {
                                break;
                            }
                            if (i19 == oqVar3.oq && !oqVar3.bob) {
                                this.rjo.remove(i18);
                                this.bob.kq((ViewGroup) this, i19, oqVar3.kq);
                                if (i18 < this.rjo.size()) {
                                    oqVar3 = this.rjo.get(i18);
                                }
                            }
                        } else if (oqVar3 != null && i19 == oqVar3.oq) {
                            f11 += oqVar3.fou;
                            i18++;
                            if (i18 < this.rjo.size()) {
                                oqVar3 = this.rjo.get(i18);
                            }
                        } else {
                            oq oqVarKq3 = kq(i19, i18);
                            i18++;
                            f11 += oqVarKq3.fou;
                            oqVar3 = i18 < this.rjo.size() ? this.rjo.get(i18) : null;
                        }
                    }
                }
                kq(oqVarKq, i13, oqVarOq);
            }
            int childCount = getChildCount();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt = getChildAt(i20);
                C0233bob c0233bob = (C0233bob) childAt.getLayoutParams();
                c0233bob.rhi = i20;
                if (!c0233bob.kq && c0233bob.bob == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (oqVarKq2 = kq(childAt)) != null) {
                    c0233bob.bob = oqVarKq2.fou;
                    c0233bob.csi = oqVarKq2.oq;
                }
            }
            rjo();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                oq oqVarOq2 = viewFindFocus != null ? oq(viewFindFocus) : null;
                if (oqVarOq2 == null || oqVarOq2.oq != this.fou) {
                    for (int i21 = 0; i21 < getChildCount(); i21++) {
                        View childAt2 = getChildAt(i21);
                        oq oqVarKq4 = kq(childAt2);
                        if (oqVarKq4 != null && oqVarKq4.oq == this.fou && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        try {
            hexString = getResources().getResourceName(getId());
        } catch (Resources.NotFoundException unused) {
            hexString = Integer.toHexString(getId());
        }
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.kq + ", found: " + iKq + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.bob.getClass());
    }

    private void kq(oq oqVar, int i10, oq oqVar2) {
        int i11;
        int i12;
        oq oqVar3;
        oq oqVar4;
        int iKq = this.bob.kq();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.mxq / clientWidth : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (oqVar2 != null) {
            int i13 = oqVar2.oq;
            int i14 = oqVar.oq;
            if (i13 < i14) {
                float fKq = oqVar2.csi + oqVar2.fou + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= oqVar.oq && i16 < this.rjo.size()) {
                    oq oqVar5 = this.rjo.get(i16);
                    while (true) {
                        oqVar4 = oqVar5;
                        if (i15 <= oqVar4.oq || i16 >= this.rjo.size() - 1) {
                            break;
                        }
                        i16++;
                        oqVar5 = this.rjo.get(i16);
                    }
                    while (i15 < oqVar4.oq) {
                        fKq += this.bob.kq(i15) + f10;
                        i15++;
                    }
                    oqVar4.csi = fKq;
                    fKq += oqVar4.fou + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.rjo.size() - 1;
                float fKq2 = oqVar2.csi;
                while (true) {
                    i13--;
                    if (i13 < oqVar.oq || size < 0) {
                        break;
                    }
                    oq oqVar6 = this.rjo.get(size);
                    while (true) {
                        oqVar3 = oqVar6;
                        if (i13 >= oqVar3.oq || size <= 0) {
                            break;
                        }
                        size--;
                        oqVar6 = this.rjo.get(size);
                    }
                    while (i13 > oqVar3.oq) {
                        fKq2 -= this.bob.kq(i13) + f10;
                        i13--;
                    }
                    fKq2 -= oqVar3.fou + f10;
                    oqVar3.csi = fKq2;
                }
            }
        }
        int size2 = this.rjo.size();
        float fKq3 = oqVar.csi;
        int i17 = oqVar.oq;
        int i18 = i17 - 1;
        this.fax = i17 == 0 ? fKq3 : -3.4028235E38f;
        int i19 = iKq - 1;
        this.mq = i17 == i19 ? (oqVar.fou + fKq3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            oq oqVar7 = this.rjo.get(i20);
            while (true) {
                i12 = oqVar7.oq;
                if (i18 <= i12) {
                    break;
                }
                fKq3 -= this.bob.kq(i18) + f10;
                i18--;
            }
            fKq3 -= oqVar7.fou + f10;
            oqVar7.csi = fKq3;
            if (i12 == 0) {
                this.fax = fKq3;
            }
            i20--;
            i18--;
        }
        float fKq4 = oqVar.csi + oqVar.fou + f10;
        int i21 = oqVar.oq + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            oq oqVar8 = this.rjo.get(i22);
            while (true) {
                i11 = oqVar8.oq;
                if (i21 >= i11) {
                    break;
                }
                fKq4 += this.bob.kq(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.mq = (oqVar8.fou + fKq4) - 1.0f;
            }
            oqVar8.csi = fKq4;
            fKq4 += oqVar8.fou + f10;
            i22++;
            i21++;
        }
        this.ye = false;
    }

    oq kq(View view) {
        for (int i10 = 0; i10 < this.rjo.size(); i10++) {
            oq oqVar = this.rjo.get(i10);
            if (this.bob.kq(view, oqVar.kq)) {
                return oqVar;
            }
        }
        return null;
    }

    private void kq(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.rjo.isEmpty()) {
            if (!this.wki.isFinished()) {
                this.wki.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        oq oqVarOq = oq(this.fou);
        int iMin = (int) ((oqVarOq != null ? Math.min(oqVarOq.csi, this.mq) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            kq(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    protected void kq(int i10, float f10, int i11) {
        int iMax;
        int width;
        int left;
        if (this.pms > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                C0233bob c0233bob = (C0233bob) childAt.getLayoutParams();
                if (c0233bob.kq) {
                    int i13 = c0233bob.oq & 7;
                    if (i13 == 1) {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        oq(i10, f10, i11);
        if (this.xk != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!((C0233bob) childAt2.getLayoutParams()).kq) {
                    this.xk.kq(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.jq = true;
    }

    private void kq(boolean z9) {
        boolean z10 = this.hn == 2;
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.wki.isFinished()) {
                this.wki.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.wki.getCurrX();
                int currY = this.wki.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        fou(currX);
                    }
                }
            }
        }
        this.ebt = false;
        for (int i10 = 0; i10 < this.rjo.size(); i10++) {
            oq oqVar = this.rjo.get(i10);
            if (oqVar.bob) {
                oqVar.bob = false;
                z10 = true;
            }
        }
        if (z10) {
            if (z9) {
                postOnAnimation(this.wj);
            } else {
                this.wj.run();
            }
        }
    }

    private boolean kq(float f10, float f11) {
        if (f10 >= this.zfx || f11 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f10 > ((float) (getWidth() - this.zfx)) && f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    private int kq(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.wbn || Math.abs(i11) <= this.wee) {
            i10 += (int) (f10 + (i10 >= this.fou ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.rjo.size() <= 0) {
            return i10;
        }
        oq oqVar = this.rjo.get(0);
        ArrayList<oq> arrayList = this.rjo;
        return Math.max(oqVar.oq, Math.min(i10, arrayList.get(arrayList.size() - 1).oq));
    }

    private void kq(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.wol) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.wf = motionEvent.getX(i10);
            this.wol = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.bss;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    protected boolean kq(View view, boolean z9, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && kq(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z9 && view.canScrollHorizontally(-i10);
    }

    public boolean kq(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return fou();
            }
            return bob(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return csi();
            }
            return bob(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return bob(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return bob(1);
        }
        return false;
    }

    private Rect kq(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }
}

package com.bytedance.adsdk.ugeno.csi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.adsdk.ugeno.rjo.rjo;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class csi extends ViewGroup implements com.bytedance.adsdk.ugeno.csi.kq {
    private int bob;
    private int csi;
    private int dgq;
    private int fou;
    private int kq;
    private List<bob> mxq;
    private int nn;
    private fou nze;
    private int oq;
    private int rhi;
    private Drawable rjo;
    private com.bytedance.adsdk.ugeno.fou sns;
    private SparseIntArray suf;
    private Drawable syt;
    private int ubx;
    private int vvw;
    private fou.kq wcx;
    private int[] wki;

    public static class kq extends ViewGroup.MarginLayoutParams implements oq {
        public static final Parcelable.Creator<kq> CREATOR = new Parcelable.Creator<kq>() { // from class: com.bytedance.adsdk.ugeno.csi.csi.kq.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public kq createFromParcel(Parcel parcel) {
                return new kq(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public kq[] newArray(int i10) {
                return new kq[i10];
            }
        };
        private float bob;
        private float csi;
        private int dgq;
        private int fou;
        private int kq;
        private boolean nn;
        private float oq;
        private int rhi;
        private int rjo;
        private int syt;

        public kq(kq kqVar) {
            super((ViewGroup.MarginLayoutParams) kqVar);
            this.kq = 1;
            this.oq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.bob = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.fou = -1;
            this.csi = -1.0f;
            this.rhi = -1;
            this.rjo = -1;
            this.syt = 16777215;
            this.dgq = 16777215;
            this.kq = kqVar.kq;
            this.oq = kqVar.oq;
            this.bob = kqVar.bob;
            this.fou = kqVar.fou;
            this.csi = kqVar.csi;
            this.rhi = kqVar.rhi;
            this.rjo = kqVar.rjo;
            this.syt = kqVar.syt;
            this.dgq = kqVar.dgq;
            this.nn = kqVar.nn;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public int bob() {
            return this.kq;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public float csi() {
            return this.bob;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public int dgq() {
            return this.syt;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public float fou() {
            return this.oq;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public int kq() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public int mxq() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public int nn() {
            return this.dgq;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public int nze() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public int oq() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public int rhi() {
            return this.fou;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public int rjo() {
            return this.rhi;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public int suf() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public int syt() {
            return this.rjo;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public boolean ubx() {
            return this.nn;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public float vvw() {
            return this.csi;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public int wki() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.kq);
            parcel.writeFloat(this.oq);
            parcel.writeFloat(this.bob);
            parcel.writeInt(this.fou);
            parcel.writeFloat(this.csi);
            parcel.writeInt(this.rhi);
            parcel.writeInt(this.rjo);
            parcel.writeInt(this.syt);
            parcel.writeInt(this.dgq);
            parcel.writeByte(this.nn ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public void bob(int i10) {
            this.kq = i10;
        }

        public void fou(int i10) {
            this.fou = i10;
        }

        public void kq(float f10) {
            this.oq = f10;
        }

        public void oq(float f10) {
            this.bob = f10;
        }

        public void bob(float f10) {
            this.csi = f10;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public void kq(int i10) {
            this.rhi = i10;
        }

        @Override // com.bytedance.adsdk.ugeno.csi.oq
        public void oq(int i10) {
            this.rjo = i10;
        }

        public kq(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.kq = 1;
            this.oq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.bob = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.fou = -1;
            this.csi = -1.0f;
            this.rhi = -1;
            this.rjo = -1;
            this.syt = 16777215;
            this.dgq = 16777215;
        }

        public kq(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.kq = 1;
            this.oq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.bob = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.fou = -1;
            this.csi = -1.0f;
            this.rhi = -1;
            this.rjo = -1;
            this.syt = 16777215;
            this.dgq = 16777215;
        }

        public kq(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.kq = 1;
            this.oq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.bob = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.fou = -1;
            this.csi = -1.0f;
            this.rhi = -1;
            this.rjo = -1;
            this.syt = 16777215;
            this.dgq = 16777215;
        }

        protected kq(Parcel parcel) {
            super(0, 0);
            this.kq = 1;
            this.oq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.bob = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.fou = -1;
            this.csi = -1.0f;
            this.rhi = -1;
            this.rjo = -1;
            this.syt = 16777215;
            this.dgq = 16777215;
            this.kq = parcel.readInt();
            this.oq = parcel.readFloat();
            this.bob = parcel.readFloat();
            this.fou = parcel.readInt();
            this.csi = parcel.readFloat();
            this.rhi = parcel.readInt();
            this.rjo = parcel.readInt();
            this.syt = parcel.readInt();
            this.dgq = parcel.readInt();
            this.nn = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public csi(Context context) {
        super(context, null);
        this.rhi = -1;
        this.nze = new fou(this);
        this.mxq = new ArrayList();
        this.wcx = new fou.kq();
    }

    private boolean csi(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View viewBob = bob(i10 - i12);
            if (viewBob != null && viewBob.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean fou(int i10, int i11) {
        if (csi(i10, i11)) {
            if (kq()) {
                return (this.nn & 1) != 0;
            }
            return (this.dgq & 1) != 0;
        }
        if (kq()) {
            return (this.nn & 2) != 0;
        }
        return (this.dgq & 2) != 0;
    }

    private boolean rhi(int i10) {
        if (i10 >= 0 && i10 < this.mxq.size()) {
            for (int i11 = i10 + 1; i11 < this.mxq.size(); i11++) {
                if (this.mxq.get(i11).oq() > 0) {
                    return false;
                }
            }
            if (kq()) {
                return (this.dgq & 4) != 0;
            }
            if ((this.nn & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.suf == null) {
            this.suf = new SparseIntArray(getChildCount());
        }
        this.wki = this.nze.kq(view, i10, layoutParams, this.suf);
        super.addView(view, i10, layoutParams);
    }

    public View bob(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.wki;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kq;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof kq) {
            return new kq((kq) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new kq((ViewGroup.MarginLayoutParams) layoutParams) : new kq(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public int getAlignContent() {
        return this.csi;
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public int getAlignItems() {
        return this.fou;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.rjo;
    }

    public Drawable getDividerDrawableVertical() {
        return this.syt;
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public int getFlexDirection() {
        return this.kq;
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<bob> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mxq.size());
        for (bob bobVar : this.mxq) {
            if (bobVar.oq() != 0) {
                arrayList.add(bobVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public List<bob> getFlexLinesInternal() {
        return this.mxq;
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public int getFlexWrap() {
        return this.oq;
    }

    public int getJustifyContent() {
        return this.bob;
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public int getLargestMainSize() {
        Iterator<bob> it = this.mxq.iterator();
        int iMax = LinearLayoutManager.INVALID_OFFSET;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().csi);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public int getMaxLine() {
        return this.rhi;
    }

    public int getShowDividerHorizontal() {
        return this.dgq;
    }

    public int getShowDividerVertical() {
        return this.nn;
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public int getSumOfCrossSize() {
        int size = this.mxq.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            bob bobVar = this.mxq.get(i11);
            if (fou(i11)) {
                i10 += kq() ? this.ubx : this.vvw;
            }
            if (rhi(i11)) {
                i10 += kq() ? this.ubx : this.vvw;
            }
            i10 += bobVar.rjo;
        }
        return i10;
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public int kq(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.fou fouVar = this.sns;
        if (fouVar != null) {
            fouVar.rjo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.fou fouVar = this.sns;
        if (fouVar != null) {
            fouVar.syt();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.syt == null && this.rjo == null) {
            return;
        }
        if (this.dgq == 0 && this.nn == 0) {
            return;
        }
        int iKq = rjo.kq(this);
        int i10 = this.kq;
        if (i10 == 0) {
            kq(canvas, iKq == 1, this.oq == 2);
            return;
        }
        if (i10 == 1) {
            kq(canvas, iKq != 1, this.oq == 2);
            return;
        }
        if (i10 == 2) {
            boolean z9 = iKq == 1;
            if (this.oq == 2) {
                z9 = !z9;
            }
            oq(canvas, z9, false);
            return;
        }
        if (i10 != 3) {
            return;
        }
        boolean z10 = iKq == 1;
        if (this.oq == 2) {
            z10 = !z10;
        }
        oq(canvas, z10, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean z10;
        com.bytedance.adsdk.ugeno.fou fouVar = this.sns;
        if (fouVar != null) {
            fouVar.rhi();
        }
        int iKq = rjo.kq(this);
        int i14 = this.kq;
        if (i14 == 0) {
            kq(iKq == 1, i10, i11, i12, i13);
        } else if (i14 == 1) {
            kq(iKq != 1, i10, i11, i12, i13);
        } else if (i14 == 2) {
            z10 = iKq == 1;
            if (this.oq == 2) {
                z10 = !z10;
            }
            kq(z10, false, i10, i11, i12, i13);
        } else {
            if (i14 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.kq);
            }
            z10 = iKq == 1;
            if (this.oq == 2) {
                z10 = !z10;
            }
            kq(z10, true, i10, i11, i12, i13);
        }
        com.bytedance.adsdk.ugeno.fou fouVar2 = this.sns;
        if (fouVar2 != null) {
            fouVar2.kq(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.fou fouVar = this.sns;
        if (fouVar != null) {
            int[] iArrKq = fouVar.kq(i10, i11);
            kq(iArrKq[0], iArrKq[1]);
        } else {
            kq(i10, i11);
        }
        com.bytedance.adsdk.ugeno.fou fouVar2 = this.sns;
        if (fouVar2 != null) {
            fouVar2.csi();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.fou fouVar = this.sns;
        if (fouVar != null) {
            fouVar.oq(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public View oq(int i10) {
        return bob(i10);
    }

    public void setAlignContent(int i10) {
        if (this.csi != i10) {
            this.csi = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.fou != i10) {
            this.fou = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.rjo) {
            return;
        }
        this.rjo = drawable;
        if (drawable != null) {
            this.ubx = drawable.getIntrinsicHeight();
        } else {
            this.ubx = 0;
        }
        oq();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.syt) {
            return;
        }
        this.syt = drawable;
        if (drawable != null) {
            this.vvw = drawable.getIntrinsicWidth();
        } else {
            this.vvw = 0;
        }
        oq();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.kq != i10) {
            this.kq = i10;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public void setFlexLines(List<bob> list) {
        this.mxq = list;
    }

    public void setFlexWrap(int i10) {
        if (this.oq != i10) {
            this.oq = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.bob != i10) {
            this.bob = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.rhi != i10) {
            this.rhi = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.dgq) {
            this.dgq = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.nn) {
            this.nn = i10;
            requestLayout();
        }
    }

    private void kq(int i10, int i11) {
        if (this.suf == null) {
            this.suf = new SparseIntArray(getChildCount());
        }
        if (this.nze.oq(this.suf)) {
            this.wki = this.nze.kq(this.suf);
        }
        int i12 = this.kq;
        if (i12 == 0 || i12 == 1) {
            oq(i10, i11);
        } else if (i12 == 2 || i12 == 3) {
            bob(i10, i11);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.kq);
        }
    }

    private void oq(int i10, int i11) {
        this.mxq.clear();
        this.wcx.kq();
        this.nze.kq(this.wcx, i10, i11);
        this.mxq = this.wcx.kq;
        this.nze.kq(i10, i11);
        if (this.fou == 3) {
            for (bob bobVar : this.mxq) {
                int iMax = LinearLayoutManager.INVALID_OFFSET;
                for (int i12 = 0; i12 < bobVar.syt; i12++) {
                    View viewBob = bob(bobVar.nze + i12);
                    if (viewBob != null && viewBob.getVisibility() != 8) {
                        kq kqVar = (kq) viewBob.getLayoutParams();
                        iMax = this.oq != 2 ? Math.max(iMax, viewBob.getMeasuredHeight() + Math.max(bobVar.vvw - viewBob.getBaseline(), ((ViewGroup.MarginLayoutParams) kqVar).topMargin) + ((ViewGroup.MarginLayoutParams) kqVar).bottomMargin) : Math.max(iMax, viewBob.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) kqVar).topMargin + Math.max((bobVar.vvw - viewBob.getMeasuredHeight()) + viewBob.getBaseline(), ((ViewGroup.MarginLayoutParams) kqVar).bottomMargin));
                    }
                }
                bobVar.rjo = iMax;
            }
        }
        this.nze.oq(i10, i11, getPaddingTop() + getPaddingBottom());
        this.nze.kq();
        kq(this.kq, i10, i11, this.wcx.oq);
    }

    private void bob(int i10, int i11) {
        this.mxq.clear();
        this.wcx.kq();
        this.nze.oq(this.wcx, i10, i11);
        this.mxq = this.wcx.kq;
        this.nze.kq(i10, i11);
        this.nze.oq(i10, i11, getPaddingLeft() + getPaddingRight());
        this.nze.kq();
        kq(this.kq, i10, i11, this.wcx.oq);
    }

    private boolean csi(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.mxq.get(i11).oq() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean fou(int i10) {
        if (i10 >= 0 && i10 < this.mxq.size()) {
            if (csi(i10)) {
                if (kq()) {
                    return (this.dgq & 1) != 0;
                }
                return (this.nn & 1) != 0;
            }
            if (kq()) {
                return (this.dgq & 2) != 0;
            }
            if ((this.nn & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public View kq(int i10) {
        return getChildAt(i10);
    }

    private void kq(int i10, int i11, int i12, int i13) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i10)));
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i12, i13);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void oq(Canvas canvas, boolean z9, boolean z10) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.mxq.size();
        for (int i12 = 0; i12 < size; i12++) {
            bob bobVar = this.mxq.get(i12);
            for (int i13 = 0; i13 < bobVar.syt; i13++) {
                int i14 = bobVar.nze + i13;
                View viewBob = bob(i14);
                if (viewBob != null && viewBob.getVisibility() != 8) {
                    kq kqVar = (kq) viewBob.getLayoutParams();
                    if (fou(i14, i13)) {
                        if (z10) {
                            top = viewBob.getBottom() + ((ViewGroup.MarginLayoutParams) kqVar).bottomMargin;
                        } else {
                            top = (viewBob.getTop() - ((ViewGroup.MarginLayoutParams) kqVar).topMargin) - this.ubx;
                        }
                        oq(canvas, bobVar.kq, top, bobVar.rjo);
                    }
                    if (i13 == bobVar.syt - 1 && (this.dgq & 4) > 0) {
                        if (z10) {
                            bottom = (viewBob.getTop() - ((ViewGroup.MarginLayoutParams) kqVar).topMargin) - this.ubx;
                        } else {
                            bottom = viewBob.getBottom() + ((ViewGroup.MarginLayoutParams) kqVar).bottomMargin;
                        }
                        oq(canvas, bobVar.kq, bottom, bobVar.rjo);
                    }
                }
            }
            if (fou(i12)) {
                if (z9) {
                    i11 = bobVar.bob;
                } else {
                    i11 = bobVar.kq - this.vvw;
                }
                kq(canvas, i11, paddingTop, iMax);
            }
            if (rhi(i12) && (this.nn & 4) > 0) {
                if (z9) {
                    i10 = bobVar.kq - this.vvw;
                } else {
                    i10 = bobVar.bob;
                }
                kq(canvas, i10, paddingTop, iMax);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public boolean kq() {
        int i10 = this.kq;
        return i10 == 0 || i10 == 1;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0170  */
    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0198  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f1  */
    private void kq(boolean z9, int i10, int i11, int i12, int i13) {
        float measuredWidth;
        float f10;
        float f11;
        float fMax;
        int i14;
        int i15;
        View viewBob;
        boolean z10;
        int i16;
        int i17;
        float f12;
        float f13;
        int i18;
        float f14;
        int i19;
        View view;
        bob bobVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i20 = i12 - i10;
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.mxq.size();
        for (int i21 = 0; i21 < size; i21++) {
            bob bobVar2 = this.mxq.get(i21);
            if (fou(i21)) {
                int i22 = this.ubx;
                paddingBottom -= i22;
                paddingTop += i22;
            }
            int i23 = paddingBottom;
            int i24 = this.bob;
            char c10 = 4;
            int i25 = 2;
            boolean z11 = true;
            if (i24 == 0) {
                measuredWidth = paddingLeft;
                f10 = i20 - paddingRight;
            } else if (i24 == 1) {
                int i26 = bobVar2.csi;
                f10 = i26 - paddingLeft;
                measuredWidth = (i20 - i26) + paddingRight;
            } else {
                if (i24 == 2) {
                    int i27 = bobVar2.csi;
                    measuredWidth = paddingLeft + ((i20 - i27) / 2.0f);
                    f10 = (i20 - paddingRight) - ((i20 - i27) / 2.0f);
                } else if (i24 == 3) {
                    measuredWidth = paddingLeft;
                    int iOq = bobVar2.oq();
                    f11 = (i20 - bobVar2.csi) / (iOq != 1 ? iOq - 1 : 1.0f);
                    f10 = i20 - paddingRight;
                } else if (i24 == 4) {
                    int iOq2 = bobVar2.oq();
                    float f15 = iOq2 != 0 ? (i20 - bobVar2.csi) / iOq2 : 0.0f;
                    float f16 = f15 / 2.0f;
                    measuredWidth = paddingLeft + f16;
                    float f17 = (i20 - paddingRight) - f16;
                    f11 = f15;
                    f10 = f17;
                } else if (i24 == 5) {
                    int iOq3 = bobVar2.oq();
                    f11 = iOq3 != 0 ? (i20 - bobVar2.csi) / (iOq3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f11;
                    f10 = (i20 - paddingRight) - f11;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.bob);
                }
                fMax = Math.max(f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i14 = 0;
                while (i14 < bobVar2.syt) {
                    i15 = bobVar2.nze + i14;
                    viewBob = bob(i15);
                    char c11 = c10;
                    if (viewBob != null) {
                        z10 = z11;
                        if (viewBob.getVisibility() != 8) {
                            kq kqVar = (kq) viewBob.getLayoutParams();
                            f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) kqVar).leftMargin;
                            f13 = f10 - ((ViewGroup.MarginLayoutParams) kqVar).rightMargin;
                            if (fou(i15, i14)) {
                                int i28 = this.vvw;
                                float f18 = i28;
                                f12 += f18;
                                f13 -= f18;
                                i18 = i28;
                            } else {
                                i18 = 0;
                            }
                            f14 = f13;
                            if (i14 == bobVar2.syt - 1 || (this.nn & 4) <= 0) {
                                i19 = 0;
                            } else {
                                i19 = this.vvw;
                            }
                            if (this.oq == i25) {
                                if (z9) {
                                    i16 = i25;
                                    view = viewBob;
                                    this.nze.kq(view, bobVar2, Math.round(f14) - viewBob.getMeasuredWidth(), i23 - viewBob.getMeasuredHeight(), Math.round(f14), i23);
                                } else {
                                    view = viewBob;
                                    i16 = i25;
                                    this.nze.kq(view, bobVar2, Math.round(f12), i23 - view.getMeasuredHeight(), Math.round(f12) + view.getMeasuredWidth(), i23);
                                }
                                i17 = i23;
                            } else {
                                i14 = i14;
                                view = viewBob;
                                z10 = z10;
                                i16 = i25;
                                i17 = i23;
                                if (z9) {
                                    this.nze.kq(view, bobVar2, Math.round(f14) - view.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + view.getMeasuredHeight());
                                } else {
                                    int i29 = paddingTop;
                                    this.nze.kq(view, bobVar2, Math.round(f12), i29, view.getMeasuredWidth() + Math.round(f12), i29 + view.getMeasuredHeight());
                                    paddingTop = i29;
                                }
                            }
                            measuredWidth = f12 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) kqVar).rightMargin;
                            float measuredWidth2 = f14 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) kqVar).leftMargin);
                            if (z9) {
                                bobVar = bobVar2;
                                bobVar.kq(view, i19, 0, i18, 0);
                            } else {
                                bobVar = bobVar2;
                                bobVar.kq(view, i18, 0, i19, 0);
                            }
                            bobVar2 = bobVar;
                            f10 = measuredWidth2;
                        } else {
                            z10 = z10;
                        }
                        i14++;
                        c10 = c11;
                        i25 = i16;
                        z11 = z10;
                        i23 = i17;
                    } else {
                        z10 = z11;
                    }
                    i16 = i25;
                    i14 = i14;
                    i17 = i23;
                    i14++;
                    c10 = c11;
                    i25 = i16;
                    z11 = z10;
                    i23 = i17;
                }
                int i30 = bobVar2.rjo;
                paddingTop += i30;
                paddingBottom = i23 - i30;
            }
            f11 = 0.0f;
            fMax = Math.max(f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i14 = 0;
            while (i14 < bobVar2.syt) {
                i15 = bobVar2.nze + i14;
                viewBob = bob(i15);
                char c12 = c10;
                if (viewBob != null) {
                    z10 = z11;
                    if (viewBob.getVisibility() != 8) {
                        kq kqVar2 = (kq) viewBob.getLayoutParams();
                        f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) kqVar2).leftMargin;
                        f13 = f10 - ((ViewGroup.MarginLayoutParams) kqVar2).rightMargin;
                        if (fou(i15, i14)) {
                            int i210 = this.vvw;
                            float f19 = i210;
                            f12 += f19;
                            f13 -= f19;
                            i18 = i210;
                        } else {
                            i18 = 0;
                        }
                        f14 = f13;
                        if (i14 == bobVar2.syt - 1) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                        }
                        if (this.oq == i25) {
                            if (z9) {
                                i16 = i25;
                                view = viewBob;
                                this.nze.kq(view, bobVar2, Math.round(f14) - viewBob.getMeasuredWidth(), i23 - viewBob.getMeasuredHeight(), Math.round(f14), i23);
                            } else {
                                view = viewBob;
                                i16 = i25;
                                this.nze.kq(view, bobVar2, Math.round(f12), i23 - view.getMeasuredHeight(), Math.round(f12) + view.getMeasuredWidth(), i23);
                            }
                            i17 = i23;
                        } else {
                            i14 = i14;
                            view = viewBob;
                            z10 = z10;
                            i16 = i25;
                            i17 = i23;
                            if (z9) {
                                this.nze.kq(view, bobVar2, Math.round(f14) - view.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + view.getMeasuredHeight());
                            } else {
                                int i211 = paddingTop;
                                this.nze.kq(view, bobVar2, Math.round(f12), i211, view.getMeasuredWidth() + Math.round(f12), i211 + view.getMeasuredHeight());
                                paddingTop = i211;
                            }
                        }
                        measuredWidth = f12 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) kqVar2).rightMargin;
                        float measuredWidth3 = f14 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) kqVar2).leftMargin);
                        if (z9) {
                            bobVar = bobVar2;
                            bobVar.kq(view, i19, 0, i18, 0);
                        } else {
                            bobVar = bobVar2;
                            bobVar.kq(view, i18, 0, i19, 0);
                        }
                        bobVar2 = bobVar;
                        f10 = measuredWidth3;
                    } else {
                        z10 = z10;
                    }
                    i14++;
                    c10 = c12;
                    i25 = i16;
                    z11 = z10;
                    i23 = i17;
                } else {
                    z10 = z11;
                }
                i16 = i25;
                i14 = i14;
                i17 = i23;
                i14++;
                c10 = c12;
                i25 = i16;
                z11 = z10;
                i23 = i17;
            }
            int i31 = bobVar2.rjo;
            paddingTop += i31;
            paddingBottom = i23 - i31;
        }
    }

    private void oq(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.rjo;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.ubx + i11);
        this.rjo.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public int oq(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    private void oq() {
        if (this.rjo == null && this.syt == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142  */
    /* JADX WARN: Code duplicated, block: B:61:0x0161  */
    /* JADX WARN: Code duplicated, block: B:63:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01db  */
    private void kq(boolean z9, boolean z10, int i10, int i11, int i12, int i13) {
        float measuredHeight;
        float f10;
        float f11;
        float fMax;
        int i14;
        int i15;
        int i16;
        View viewBob;
        char c10;
        int i17;
        int i18;
        float f12;
        float f13;
        int i19;
        float f14;
        int i20;
        bob bobVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i21 = i13 - i11;
        int i22 = (i12 - i10) - paddingRight;
        int size = this.mxq.size();
        for (int i23 = 0; i23 < size; i23++) {
            bob bobVar2 = this.mxq.get(i23);
            if (fou(i23)) {
                int i24 = this.vvw;
                paddingLeft += i24;
                i22 -= i24;
            }
            int i25 = i22;
            int i26 = this.bob;
            char c11 = 4;
            int i27 = 1;
            if (i26 == 0) {
                measuredHeight = paddingTop;
                f10 = i21 - paddingBottom;
            } else if (i26 == 1) {
                int i28 = bobVar2.csi;
                f10 = i28 - paddingTop;
                measuredHeight = (i21 - i28) + paddingBottom;
            } else {
                if (i26 == 2) {
                    int i29 = bobVar2.csi;
                    measuredHeight = paddingTop + ((i21 - i29) / 2.0f);
                    f10 = (i21 - paddingBottom) - ((i21 - i29) / 2.0f);
                } else if (i26 == 3) {
                    measuredHeight = paddingTop;
                    int iOq = bobVar2.oq();
                    f11 = (i21 - bobVar2.csi) / (iOq != 1 ? iOq - 1 : 1.0f);
                    f10 = i21 - paddingBottom;
                } else if (i26 == 4) {
                    int iOq2 = bobVar2.oq();
                    f11 = iOq2 != 0 ? (i21 - bobVar2.csi) / iOq2 : 0.0f;
                    float f15 = f11 / 2.0f;
                    measuredHeight = paddingTop + f15;
                    f10 = (i21 - paddingBottom) - f15;
                } else if (i26 == 5) {
                    int iOq3 = bobVar2.oq();
                    f11 = iOq3 != 0 ? (i21 - bobVar2.csi) / (iOq3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f11;
                    f10 = (i21 - paddingBottom) - f11;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.bob);
                }
                fMax = Math.max(f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i14 = 0;
                while (i14 < bobVar2.syt) {
                    i15 = bobVar2.nze + i14;
                    i16 = i27;
                    viewBob = bob(i15);
                    if (viewBob != null) {
                        c10 = c11;
                        if (viewBob.getVisibility() != 8) {
                            kq kqVar = (kq) viewBob.getLayoutParams();
                            f12 = measuredHeight + ((ViewGroup.MarginLayoutParams) kqVar).topMargin;
                            f13 = f10 - ((ViewGroup.MarginLayoutParams) kqVar).bottomMargin;
                            if (fou(i15, i14)) {
                                i19 = this.ubx;
                                float f16 = i19;
                                f12 += f16;
                                f13 -= f16;
                            } else {
                                i19 = 0;
                            }
                            f14 = f13;
                            if (i14 == bobVar2.syt - i16 || (this.dgq & 4) <= 0) {
                                i20 = 0;
                            } else {
                                i20 = this.ubx;
                            }
                            if (z9) {
                                if (z10) {
                                    i17 = i14;
                                    this.nze.kq(viewBob, bobVar2, true, i25 - viewBob.getMeasuredWidth(), Math.round(f14) - viewBob.getMeasuredHeight(), i25, Math.round(f14));
                                } else {
                                    i17 = i14;
                                    this.nze.kq(viewBob, bobVar2, true, i25 - viewBob.getMeasuredWidth(), Math.round(f12), i25, Math.round(f12) + viewBob.getMeasuredHeight());
                                }
                                i18 = i25;
                            } else {
                                i17 = i14;
                                i16 = i16;
                                i18 = i25;
                                if (z10) {
                                    this.nze.kq(viewBob, bobVar2, false, paddingLeft, Math.round(f14) - viewBob.getMeasuredHeight(), paddingLeft + viewBob.getMeasuredWidth(), Math.round(f14));
                                } else {
                                    int i30 = paddingLeft;
                                    this.nze.kq(viewBob, bobVar2, false, i30, Math.round(f12), i30 + viewBob.getMeasuredWidth(), Math.round(f12) + viewBob.getMeasuredHeight());
                                    paddingLeft = i30;
                                }
                            }
                            measuredHeight = f12 + viewBob.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) kqVar).bottomMargin;
                            float measuredHeight2 = f14 - ((viewBob.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) kqVar).topMargin);
                            if (z10) {
                                bobVar = bobVar2;
                                bobVar.kq(viewBob, 0, i20, 0, i19);
                            } else {
                                bobVar = bobVar2;
                                bobVar.kq(viewBob, 0, i19, 0, i20);
                            }
                            bobVar2 = bobVar;
                            f10 = measuredHeight2;
                        }
                        i14 = i17 + 1;
                        c11 = c10;
                        i27 = i16;
                        i25 = i18;
                    } else {
                        c10 = c11;
                    }
                    i17 = i14;
                    i16 = i16;
                    i18 = i25;
                    i14 = i17 + 1;
                    c11 = c10;
                    i27 = i16;
                    i25 = i18;
                }
                int i31 = bobVar2.rjo;
                paddingLeft += i31;
                i22 = i25 - i31;
            }
            f11 = 0.0f;
            fMax = Math.max(f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i14 = 0;
            while (i14 < bobVar2.syt) {
                i15 = bobVar2.nze + i14;
                i16 = i27;
                viewBob = bob(i15);
                if (viewBob != null) {
                    c10 = c11;
                    if (viewBob.getVisibility() != 8) {
                        kq kqVar2 = (kq) viewBob.getLayoutParams();
                        f12 = measuredHeight + ((ViewGroup.MarginLayoutParams) kqVar2).topMargin;
                        f13 = f10 - ((ViewGroup.MarginLayoutParams) kqVar2).bottomMargin;
                        if (fou(i15, i14)) {
                            i19 = this.ubx;
                            float f17 = i19;
                            f12 += f17;
                            f13 -= f17;
                        } else {
                            i19 = 0;
                        }
                        f14 = f13;
                        if (i14 == bobVar2.syt - i16) {
                            i20 = 0;
                        } else {
                            i20 = 0;
                        }
                        if (z9) {
                            if (z10) {
                                i17 = i14;
                                this.nze.kq(viewBob, bobVar2, true, i25 - viewBob.getMeasuredWidth(), Math.round(f14) - viewBob.getMeasuredHeight(), i25, Math.round(f14));
                            } else {
                                i17 = i14;
                                this.nze.kq(viewBob, bobVar2, true, i25 - viewBob.getMeasuredWidth(), Math.round(f12), i25, Math.round(f12) + viewBob.getMeasuredHeight());
                            }
                            i18 = i25;
                        } else {
                            i17 = i14;
                            i16 = i16;
                            i18 = i25;
                            if (z10) {
                                this.nze.kq(viewBob, bobVar2, false, paddingLeft, Math.round(f14) - viewBob.getMeasuredHeight(), paddingLeft + viewBob.getMeasuredWidth(), Math.round(f14));
                            } else {
                                int i32 = paddingLeft;
                                this.nze.kq(viewBob, bobVar2, false, i32, Math.round(f12), i32 + viewBob.getMeasuredWidth(), Math.round(f12) + viewBob.getMeasuredHeight());
                                paddingLeft = i32;
                            }
                        }
                        measuredHeight = f12 + viewBob.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) kqVar2).bottomMargin;
                        float measuredHeight3 = f14 - ((viewBob.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) kqVar2).topMargin);
                        if (z10) {
                            bobVar = bobVar2;
                            bobVar.kq(viewBob, 0, i20, 0, i19);
                        } else {
                            bobVar = bobVar2;
                            bobVar.kq(viewBob, 0, i19, 0, i20);
                        }
                        bobVar2 = bobVar;
                        f10 = measuredHeight3;
                    }
                    i14 = i17 + 1;
                    c11 = c10;
                    i27 = i16;
                    i25 = i18;
                } else {
                    c10 = c11;
                }
                i17 = i14;
                i16 = i16;
                i18 = i25;
                i14 = i17 + 1;
                c11 = c10;
                i27 = i16;
                i25 = i18;
            }
            int i33 = bobVar2.rjo;
            paddingLeft += i33;
            i22 = i25 - i33;
        }
    }

    private void kq(Canvas canvas, boolean z9, boolean z10) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.mxq.size();
        for (int i12 = 0; i12 < size; i12++) {
            bob bobVar = this.mxq.get(i12);
            for (int i13 = 0; i13 < bobVar.syt; i13++) {
                int i14 = bobVar.nze + i13;
                View viewBob = bob(i14);
                if (viewBob != null && viewBob.getVisibility() != 8) {
                    kq kqVar = (kq) viewBob.getLayoutParams();
                    if (fou(i14, i13)) {
                        if (z9) {
                            left = viewBob.getRight() + ((ViewGroup.MarginLayoutParams) kqVar).rightMargin;
                        } else {
                            left = (viewBob.getLeft() - ((ViewGroup.MarginLayoutParams) kqVar).leftMargin) - this.vvw;
                        }
                        kq(canvas, left, bobVar.oq, bobVar.rjo);
                    }
                    if (i13 == bobVar.syt - 1 && (this.nn & 4) > 0) {
                        if (z9) {
                            right = (viewBob.getLeft() - ((ViewGroup.MarginLayoutParams) kqVar).leftMargin) - this.vvw;
                        } else {
                            right = viewBob.getRight() + ((ViewGroup.MarginLayoutParams) kqVar).rightMargin;
                        }
                        kq(canvas, right, bobVar.oq, bobVar.rjo);
                    }
                }
            }
            if (fou(i12)) {
                if (z10) {
                    i11 = bobVar.fou;
                } else {
                    i11 = bobVar.oq - this.ubx;
                }
                oq(canvas, paddingLeft, i11, iMax);
            }
            if (rhi(i12) && (this.dgq & 4) > 0) {
                if (z10) {
                    i10 = bobVar.oq - this.ubx;
                } else {
                    i10 = bobVar.fou;
                }
                oq(canvas, paddingLeft, i10, iMax);
            }
        }
    }

    private void kq(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.syt;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.vvw + i10, i12 + i11);
        this.syt.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public int kq(View view, int i10, int i11) {
        int i12;
        int i13;
        if (kq()) {
            i12 = fou(i10, i11) ? this.vvw : 0;
            if ((this.nn & 4) <= 0) {
                return i12;
            }
            i13 = this.vvw;
        } else {
            i12 = fou(i10, i11) ? this.ubx : 0;
            if ((this.dgq & 4) <= 0) {
                return i12;
            }
            i13 = this.ubx;
        }
        return i12 + i13;
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public void kq(bob bobVar) {
        if (kq()) {
            if ((this.nn & 4) > 0) {
                int i10 = bobVar.csi;
                int i11 = this.vvw;
                bobVar.csi = i10 + i11;
                bobVar.rhi += i11;
                return;
            }
            return;
        }
        if ((this.dgq & 4) > 0) {
            int i12 = bobVar.csi;
            int i13 = this.ubx;
            bobVar.csi = i12 + i13;
            bobVar.rhi += i13;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public int kq(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.bytedance.adsdk.ugeno.csi.kq
    public void kq(View view, int i10, int i11, bob bobVar) {
        if (fou(i10, i11)) {
            if (kq()) {
                int i12 = bobVar.csi;
                int i13 = this.vvw;
                bobVar.csi = i12 + i13;
                bobVar.rhi += i13;
                return;
            }
            int i14 = bobVar.csi;
            int i15 = this.ubx;
            bobVar.csi = i14 + i15;
            bobVar.rhi += i15;
        }
    }

    public void kq(com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        this.sns = bobVar;
    }
}

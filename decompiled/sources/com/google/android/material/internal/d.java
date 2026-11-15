package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.T;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends T {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Drawable f39293G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Rect f39294H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Rect f39295I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f39296J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected boolean f39297K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    boolean f39298L;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39294H = new Rect();
        this.f39295I = new Rect();
        this.f39296J = 119;
        this.f39297K = true;
        this.f39298L = false;
        TypedArray typedArrayI = m.i(context, attributeSet, p186s5.k.f49205m2, i10, 0, new int[0]);
        this.f39296J = typedArrayI.getInt(p186s5.k.f49223o2, this.f39296J);
        Drawable drawable = typedArrayI.getDrawable(p186s5.k.f49214n2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f39297K = typedArrayI.getBoolean(p186s5.k.f49232p2, true);
        typedArrayI.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f39293G;
        if (drawable != null) {
            if (this.f39298L) {
                this.f39298L = false;
                Rect rect = this.f39294H;
                Rect rect2 = this.f39295I;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f39297K) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f39296J, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f39293G;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f39293G;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f39293G.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f39293G;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f39296J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f39293G;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        this.f39298L = z9 | this.f39298L;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f39298L = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f39293G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f39293G);
            }
            this.f39293G = drawable;
            this.f39298L = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f39296J == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f39296J != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f39296J = i10;
            if (i10 == 119 && this.f39293G != null) {
                this.f39293G.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f39293G;
    }
}

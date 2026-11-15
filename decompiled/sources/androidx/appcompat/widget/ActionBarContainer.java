package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f7774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f7775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f7776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f7777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f7778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f7779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f7780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f7781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7782j;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1081b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p060g.j.f44150a);
        this.f7777e = typedArrayObtainStyledAttributes.getDrawable(p060g.j.f44155b);
        this.f7778f = typedArrayObtainStyledAttributes.getDrawable(p060g.j.f44165d);
        this.f7782j = typedArrayObtainStyledAttributes.getDimensionPixelSize(p060g.j.f44195j, -1);
        boolean z9 = true;
        if (getId() == p060g.f.f43955H) {
            this.f7780h = true;
            this.f7779g = typedArrayObtainStyledAttributes.getDrawable(p060g.j.f44160c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f7780h ? this.f7777e != null || this.f7778f != null : this.f7779g != null) {
            z9 = false;
        }
        setWillNotDraw(z9);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7777e;
        if (drawable != null && drawable.isStateful()) {
            this.f7777e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f7778f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f7778f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f7779g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f7779g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f7774b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7777e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f7778f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f7779g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7775c = findViewById(p060g.f.f43964a);
        this.f7776d = findViewById(p060g.f.f43969f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f7773a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z9, i10, i11, i12, i13);
        View view = this.f7774b;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f7780h) {
            Drawable drawable2 = this.f7779g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = z11;
            }
        } else {
            if (this.f7777e != null) {
                if (this.f7775c.getVisibility() == 0) {
                    this.f7777e.setBounds(this.f7775c.getLeft(), this.f7775c.getTop(), this.f7775c.getRight(), this.f7775c.getBottom());
                } else {
                    View view2 = this.f7776d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f7777e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f7777e.setBounds(this.f7776d.getLeft(), this.f7776d.getTop(), this.f7776d.getRight(), this.f7776d.getBottom());
                    }
                }
                z11 = true;
            }
            this.f7781i = z12;
            if (!z12 || (drawable = this.f7778f) == null) {
                z10 = z11;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f7775c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f7782j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i10, i11);
        if (this.f7775c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f7774b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f7775c)) {
            iA = !b(this.f7776d) ? a(this.f7776d) : 0;
        } else {
            iA = a(this.f7775c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f7774b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f7777e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f7777e);
        }
        this.f7777e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f7775c;
            if (view != null) {
                this.f7777e.setBounds(view.getLeft(), this.f7775c.getTop(), this.f7775c.getRight(), this.f7775c.getBottom());
            }
        }
        boolean z9 = false;
        if (!this.f7780h ? !(this.f7777e != null || this.f7778f != null) : this.f7779g == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f7779g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f7779g);
        }
        this.f7779g = drawable;
        boolean z9 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f7780h && (drawable2 = this.f7779g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f7780h ? !(this.f7777e != null || this.f7778f != null) : this.f7779g == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f7778f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f7778f);
        }
        this.f7778f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f7781i && (drawable2 = this.f7778f) != null) {
                drawable2.setBounds(this.f7774b.getLeft(), this.f7774b.getTop(), this.f7774b.getRight(), this.f7774b.getBottom());
            }
        }
        boolean z9 = false;
        if (!this.f7780h ? !(this.f7777e != null || this.f7778f != null) : this.f7779g == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(a0 a0Var) {
        View view = this.f7774b;
        if (view != null) {
            removeView(view);
        }
        this.f7774b = a0Var;
    }

    public void setTransitioning(boolean z9) {
        this.f7773a = z9;
        setDescendantFocusability(z9 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.f7777e;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
        Drawable drawable2 = this.f7778f;
        if (drawable2 != null) {
            drawable2.setVisible(z9, false);
        }
        Drawable drawable3 = this.f7779g;
        if (drawable3 != null) {
            drawable3.setVisible(z9, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f7777e && !this.f7780h) {
            return true;
        }
        if (drawable == this.f7778f && this.f7781i) {
            return true;
        }
        return (drawable == this.f7779g && this.f7780h) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}

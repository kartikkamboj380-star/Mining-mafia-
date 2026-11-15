package androidx.appcompat.widget;

import O.AbstractC0845c0;
import O.C0861k0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC1080a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private TextView f7783G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f7784H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f7785I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f7786J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f7787K;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f7788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f7789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f7790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f7791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f7792m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private LinearLayout f7793v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f7794w;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p120m.b f7795a;

        a(p120m.b bVar) {
            this.f7795a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f7795a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f7793v == null) {
            LayoutInflater.from(getContext()).inflate(p060g.g.f43990a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f7793v = linearLayout;
            this.f7794w = (TextView) linearLayout.findViewById(p060g.f.f43968e);
            this.f7783G = (TextView) this.f7793v.findViewById(p060g.f.f43967d);
            if (this.f7784H != 0) {
                this.f7794w.setTextAppearance(getContext(), this.f7784H);
            }
            if (this.f7785I != 0) {
                this.f7783G.setTextAppearance(getContext(), this.f7785I);
            }
        }
        this.f7794w.setText(this.f7788i);
        this.f7783G.setText(this.f7789j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f7788i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f7789j);
        this.f7783G.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f7793v.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f7793v.getParent() == null) {
            addView(this.f7793v);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1080a
    public /* bridge */ /* synthetic */ C0861k0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f7790k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC1080a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC1080a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f7789j;
    }

    public CharSequence getTitle() {
        return this.f7788i;
    }

    public void h(p120m.b bVar) {
        View view = this.f7790k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f7787K, (ViewGroup) this, false);
            this.f7790k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f7790k);
        }
        View viewFindViewById = this.f7790k.findViewById(p060g.f.f43972i);
        this.f7791l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        C1082c c1082c = this.f8176d;
        if (c1082c != null) {
            c1082c.A();
        }
        C1082c c1082c2 = new C1082c(getContext());
        this.f8176d = c1082c2;
        c1082c2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f8176d, this.f8174b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f8176d.q(this);
        this.f8175c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f8175c, layoutParams);
    }

    public boolean j() {
        return this.f7786J;
    }

    public void k() {
        removeAllViews();
        this.f7792m = null;
        this.f8175c = null;
        this.f8176d = null;
        View view = this.f7791l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        C1082c c1082c = this.f8176d;
        if (c1082c != null) {
            return c1082c.M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1082c c1082c = this.f8176d;
        if (c1082c != null) {
            c1082c.D();
            this.f8176d.E();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1080a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean zB = s0.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f7790k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7790k.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC1080a.d(paddingRight, i14, zB);
            paddingRight = AbstractC1080a.d(iD + e(this.f7790k, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f7793v;
        if (linearLayout != null && this.f7792m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f7793v, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f7792m;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f8175c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f8177e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, LinearLayoutManager.INVALID_OFFSET);
        View view = this.f7790k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7790k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f8175c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f8175c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f7793v;
        if (linearLayout != null && this.f7792m == null) {
            if (this.f7786J) {
                this.f7793v.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f7793v.getMeasuredWidth();
                boolean z9 = measuredWidth <= paddingLeft;
                if (z9) {
                    paddingLeft -= measuredWidth;
                }
                this.f7793v.setVisibility(z9 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f7792m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f7792m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f8177e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbstractC1080a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC1080a
    public void setContentHeight(int i10) {
        this.f8177e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f7792m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f7792m = view;
        if (view != null && (linearLayout = this.f7793v) != null) {
            removeView(linearLayout);
            this.f7793v = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f7789j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f7788i = charSequence;
        i();
        AbstractC0845c0.p0(this, charSequence);
    }

    public void setTitleOptional(boolean z9) {
        if (z9 != this.f7786J) {
            requestLayout();
        }
        this.f7786J = z9;
    }

    @Override // androidx.appcompat.widget.AbstractC1080a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p060g.a.f43861g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        h0 h0VarV = h0.v(context, attributeSet, p060g.j.f44270y, i10, 0);
        setBackground(h0VarV.g(p060g.j.f44275z));
        this.f7784H = h0VarV.n(p060g.j.f44043D, 0);
        this.f7785I = h0VarV.n(p060g.j.f44038C, 0);
        this.f8177e = h0VarV.m(p060g.j.f44033B, 0);
        this.f7787K = h0VarV.n(p060g.j.f44028A, p060g.g.f43993d);
        h0VarV.x();
    }
}

package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.S;
import androidx.appcompat.widget.m0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends D implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f7545G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f7546H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f7547I;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    g f7548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f7549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f7550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    e.b f7551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private S f7552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    b f7553m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f7554v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f7555w;

    private class a extends S {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.S
        public p130n.e e() {
            b bVar = ActionMenuItemView.this.f7553m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.S
        protected boolean f() {
            p130n.e eVarE;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f7551k;
            return bVar != null && bVar.b(actionMenuItemView.f7548h) && (eVarE = e()) != null && eVarE.a();
        }
    }

    public static abstract class b {
        public abstract p130n.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean x() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    private void y() {
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(this.f7549i);
        if (this.f7550j != null && (!this.f7548h.B() || (!this.f7554v && !this.f7555w))) {
            z9 = false;
        }
        boolean z11 = z10 & z9;
        setText(z11 ? this.f7549i : null);
        CharSequence contentDescription = this.f7548h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z11 ? null : this.f7548h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f7548h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            m0.a(this, z11 ? null : this.f7548h.getTitle());
        } else {
            m0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return w();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean e() {
        return w() && this.f7548h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void f(g gVar, int i10) {
        this.f7548h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f7552l == null) {
            this.f7552l = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean g() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f7548h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f7551k;
        if (bVar != null) {
            bVar.b(this.f7548h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7554v = x();
        y();
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zW = w();
        if (zW && (i12 = this.f7546H) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f7545G) : this.f7545G;
        if (mode != 1073741824 && this.f7545G > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zW || this.f7550j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f7550j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        S s10;
        if (this.f7548h.hasSubMenu() && (s10 = this.f7552l) != null && s10.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z9) {
    }

    public void setChecked(boolean z9) {
    }

    public void setExpandedFormat(boolean z9) {
        if (this.f7555w != z9) {
            this.f7555w = z9;
            g gVar = this.f7548h;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f7550j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f7547I;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        y();
    }

    public void setItemInvoker(e.b bVar) {
        this.f7551k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f7546H = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f7553m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f7549i = charSequence;
        y();
    }

    public boolean w() {
        return !TextUtils.isEmpty(getText());
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f7554v = x();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p060g.j.f44255v, i10, 0);
        this.f7545G = typedArrayObtainStyledAttributes.getDimensionPixelSize(p060g.j.f44260w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f7547I = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f7546H = -1;
        setSaveEnabled(false);
    }
}

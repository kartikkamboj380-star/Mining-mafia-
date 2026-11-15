package com.google.android.material.snackbar;

import K5.g;
import K5.k;
import O.AbstractC0845c0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.p;
import p070h.w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTransientBottomBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeInterpolator f39460a = p196t5.a.f49671b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TimeInterpolator f39461b = p196t5.a.f49670a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final TimeInterpolator f39462c = p196t5.a.f49673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f39464e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f39465f = {p186s5.a.f48608U};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f39466g = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Handler f39463d = new Handler(Looper.getMainLooper(), new a());

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final b f39467k = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.f39467k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f39467k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                w.a(message.obj);
                throw null;
            }
            if (i10 != 1) {
                return false;
            }
            w.a(message.obj);
            throw null;
        }
    }

    public static class b {
        public b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof c;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    protected static class c extends FrameLayout {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final View.OnTouchListener f39468k = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        k f39469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f39470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f39471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f39472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f39473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f39474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ColorStateList f39475g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private PorterDuff.Mode f39476h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Rect f39477i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f39478j;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected c(Context context, AttributeSet attributeSet) {
            super(N5.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p186s5.k.f48978N5);
            if (typedArrayObtainStyledAttributes.hasValue(p186s5.k.f49041U5)) {
                AbstractC0845c0.u0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(p186s5.k.f49041U5, 0));
            }
            this.f39470b = typedArrayObtainStyledAttributes.getInt(p186s5.k.f49005Q5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(p186s5.k.f49059W5) || typedArrayObtainStyledAttributes.hasValue(p186s5.k.f49068X5)) {
                this.f39469a = k.e(context2, attributeSet, 0, 0).m();
            }
            this.f39471c = typedArrayObtainStyledAttributes.getFloat(p186s5.k.f49014R5, 1.0f);
            setBackgroundTintList(H5.c.a(context2, typedArrayObtainStyledAttributes, p186s5.k.f49023S5));
            setBackgroundTintMode(p.h(typedArrayObtainStyledAttributes.getInt(p186s5.k.f49032T5, -1), PorterDuff.Mode.SRC_IN));
            this.f39472d = typedArrayObtainStyledAttributes.getFloat(p186s5.k.f48996P5, 1.0f);
            this.f39473e = typedArrayObtainStyledAttributes.getDimensionPixelSize(p186s5.k.f48987O5, -1);
            this.f39474f = typedArrayObtainStyledAttributes.getDimensionPixelSize(p186s5.k.f49050V5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f39468k);
            setFocusable(true);
            if (getBackground() == null) {
                AbstractC0845c0.q0(this, a());
            }
        }

        private Drawable a() {
            int iK = p256z5.a.k(this, p186s5.a.f48637s, p186s5.a.f48631m, getBackgroundOverlayColorAlpha());
            k kVar = this.f39469a;
            Drawable drawableD = kVar != null ? BaseTransientBottomBar.d(iK, kVar) : BaseTransientBottomBar.c(iK, getResources());
            if (this.f39475g == null) {
                return G.a.r(drawableD);
            }
            Drawable drawableR = G.a.r(drawableD);
            G.a.o(drawableR, this.f39475g);
            return drawableR;
        }

        private void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f39477i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        float getActionTextColorAlpha() {
            return this.f39472d;
        }

        int getAnimationMode() {
            return this.f39470b;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f39471c;
        }

        int getMaxInlineActionWidth() {
            return this.f39474f;
        }

        int getMaxWidth() {
            return this.f39473e;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            AbstractC0845c0.j0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
            super.onLayout(z9, i10, i11, i12, i13);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f39473e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f39473e;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f39470b = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f39475g != null) {
                drawable = G.a.r(drawable.mutate());
                G.a.o(drawable, this.f39475g);
                G.a.p(drawable, this.f39476h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f39475g = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = G.a.r(getBackground().mutate());
                G.a.o(drawableR, colorStateList);
                G.a.p(drawableR, this.f39476h);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f39476h = mode;
            if (getBackground() != null) {
                Drawable drawableR = G.a.r(getBackground().mutate());
                G.a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f39478j || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f39468k);
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable c(int i10, Resources resources) {
        float dimension = resources.getDimension(p186s5.c.f48701l0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g d(int i10, k kVar) {
        g gVar = new g(kVar);
        gVar.W(ColorStateList.valueOf(i10));
        return gVar;
    }
}

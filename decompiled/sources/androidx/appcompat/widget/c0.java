package androidx.appcompat.widget;

import O.AbstractC0845c0;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends CompoundButton {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Property f8234m0 = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int[] f8235n0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private CharSequence f8236G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private CharSequence f8237H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private CharSequence f8238I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f8239J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f8240K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f8241L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float f8242M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f8243N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private VelocityTracker f8244O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f8245P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    float f8246Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f8247R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f8248S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f8249T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f8250U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f8251V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f8252W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f8253a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f8254a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f8255b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f8256b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f8257c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final TextPaint f8258c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8259d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private ColorStateList f8260d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8261e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Layout f8262e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f8263f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Layout f8264f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f8265g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private TransformationMethod f8266g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PorterDuff.Mode f8267h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    ObjectAnimator f8268h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8269i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final C f8270i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8271j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private C1093n f8272j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8273k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private b f8274k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8275l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final Rect f8276l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8277m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8278v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f8279w;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(c0 c0Var) {
            return Float.valueOf(c0Var.f8246Q);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c0 c0Var, Float f10) {
            c0Var.setThumbPosition(f10.floatValue());
        }
    }

    static class b extends androidx.emoji2.text.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f8280a;

        b(c0 c0Var) {
            this.f8280a = new WeakReference(c0Var);
        }

        @Override // androidx.emoji2.text.e.f
        public void a(Throwable th) {
            c0 c0Var = (c0) this.f8280a.get();
            if (c0Var != null) {
                c0Var.j();
            }
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            c0 c0Var = (c0) this.f8280a.get();
            if (c0Var != null) {
                c0Var.j();
            }
        }
    }

    public c0(Context context) {
        this(context, null);
    }

    private void a(boolean z9) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<c0, Float>) f8234m0, z9 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f8268h0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f8268h0.setAutoCancel(true);
        this.f8268h0.start();
    }

    private void b() {
        Drawable drawable = this.f8253a;
        if (drawable != null) {
            if (this.f8259d || this.f8261e) {
                Drawable drawableMutate = G.a.r(drawable).mutate();
                this.f8253a = drawableMutate;
                if (this.f8259d) {
                    G.a.o(drawableMutate, this.f8255b);
                }
                if (this.f8261e) {
                    G.a.p(this.f8253a, this.f8257c);
                }
                if (this.f8253a.isStateful()) {
                    this.f8253a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f8263f;
        if (drawable != null) {
            if (this.f8269i || this.f8271j) {
                Drawable drawableMutate = G.a.r(drawable).mutate();
                this.f8263f = drawableMutate;
                if (this.f8269i) {
                    G.a.o(drawableMutate, this.f8265g);
                }
                if (this.f8271j) {
                    G.a.p(this.f8263f, this.f8267h);
                }
                if (this.f8263f.isStateful()) {
                    this.f8263f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f8268h0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.f8266g0);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    @NonNull
    private C1093n getEmojiTextViewHelper() {
        if (this.f8272j0 == null) {
            this.f8272j0 = new C1093n(this);
        }
        return this.f8272j0;
    }

    private boolean getTargetCheckedState() {
        return this.f8246Q > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((s0.b(this) ? 1.0f - this.f8246Q : this.f8246Q) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f8263f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f8276l0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f8253a;
        Rect rectD = drawable2 != null ? O.d(drawable2) : O.f7919c;
        return ((((this.f8247R - this.f8249T) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f8253a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f8253a.getPadding(this.f8276l0);
        int i10 = this.f8251V;
        int i11 = this.f8241L;
        int i12 = i10 - i11;
        int i13 = (this.f8250U + thumbOffset) - i11;
        int i14 = this.f8249T + i13;
        Rect rect = this.f8276l0;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f8254a0 + i11));
    }

    private Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.f8258c0;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f8237H;
            if (string == null) {
                string = getResources().getString(p060g.h.f44011b);
            }
            AbstractC0845c0.F0(this, string);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f8279w;
            if (string == null) {
                string = getResources().getString(p060g.h.f44012c);
            }
            AbstractC0845c0.F0(this, string);
        }
    }

    private void o(int i10, int i11) {
        Typeface typeface;
        if (i10 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i10 != 2) {
            typeface = i10 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        n(typeface, i11);
    }

    private void p() {
        if (this.f8274k0 == null && this.f8272j0.b() && androidx.emoji2.text.e.i()) {
            androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
            int iE = eVarC.e();
            if (iE == 3 || iE == 0) {
                b bVar = new b(this);
                this.f8274k0 = bVar;
                eVarC.t(bVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.f8240K = 0;
        boolean targetCheckedState = true;
        boolean z9 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z9) {
            this.f8244O.computeCurrentVelocity(1000);
            float xVelocity = this.f8244O.getXVelocity();
            if (Math.abs(xVelocity) <= this.f8245P) {
                targetCheckedState = getTargetCheckedState();
            } else if (!s0.b(this) ? xVelocity <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : xVelocity >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f8237H = charSequence;
        this.f8238I = g(charSequence);
        this.f8264f0 = null;
        if (this.f8239J) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f8279w = charSequence;
        this.f8236G = g(charSequence);
        this.f8262e0 = null;
        if (this.f8239J) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f8276l0;
        int i12 = this.f8250U;
        int i13 = this.f8251V;
        int i14 = this.f8252W;
        int i15 = this.f8254a0;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f8253a;
        Rect rectD = drawable != null ? O.d(drawable) : O.f7919c;
        Drawable drawable2 = this.f8263f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectD != null) {
                int i17 = rectD.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectD.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectD.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectD.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f8263f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f8263f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f8253a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f8249T + rect.right;
            this.f8253a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                G.a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f8253a;
        if (drawable != null) {
            G.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f8263f;
        if (drawable2 != null) {
            G.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8253a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f8263f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!s0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f8247R;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f8277m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (s0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f8247R;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f8277m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f8239J;
    }

    public boolean getSplitTrack() {
        return this.f8278v;
    }

    public int getSwitchMinWidth() {
        return this.f8275l;
    }

    public int getSwitchPadding() {
        return this.f8277m;
    }

    public CharSequence getTextOff() {
        return this.f8237H;
    }

    public CharSequence getTextOn() {
        return this.f8279w;
    }

    public Drawable getThumbDrawable() {
        return this.f8253a;
    }

    protected final float getThumbPosition() {
        return this.f8246Q;
    }

    public int getThumbTextPadding() {
        return this.f8273k;
    }

    public ColorStateList getThumbTintList() {
        return this.f8255b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f8257c;
    }

    public Drawable getTrackDrawable() {
        return this.f8263f;
    }

    public ColorStateList getTrackTintList() {
        return this.f8265g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f8267h;
    }

    void j() {
        setTextOnInternal(this.f8279w);
        setTextOffInternal(this.f8237H);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8253a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f8263f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f8268h0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f8268h0.end();
        this.f8268h0 = null;
    }

    public void m(Context context, int i10) {
        h0 h0VarT = h0.t(context, i10, p060g.j.f44121S2);
        ColorStateList colorStateListC = h0VarT.c(p060g.j.f44137W2);
        if (colorStateListC != null) {
            this.f8260d0 = colorStateListC;
        } else {
            this.f8260d0 = getTextColors();
        }
        int iF = h0VarT.f(p060g.j.f44125T2, 0);
        if (iF != 0) {
            float f10 = iF;
            if (f10 != this.f8258c0.getTextSize()) {
                this.f8258c0.setTextSize(f10);
                requestLayout();
            }
        }
        o(h0VarT.k(p060g.j.f44129U2, -1), h0VarT.k(p060g.j.f44133V2, -1));
        if (h0VarT.a(p060g.j.f44159b3, false)) {
            this.f8266g0 = new p110l.a(getContext());
        } else {
            this.f8266g0 = null;
        }
        setTextOnInternal(this.f8279w);
        setTextOffInternal(this.f8237H);
        h0VarT.x();
    }

    public void n(Typeface typeface, int i10) {
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i10 <= 0) {
            this.f8258c0.setFakeBoldText(false);
            this.f8258c0.setTextSkewX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            setSwitchTypeface(typeface);
            return;
        }
        Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
        setSwitchTypeface(typefaceDefaultFromStyle);
        int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
        this.f8258c0.setFakeBoldText((i11 & 1) != 0);
        TextPaint textPaint = this.f8258c0;
        if ((i11 & 2) != 0) {
            f10 = -0.25f;
        }
        textPaint.setTextSkewX(f10);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f8235n0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f8276l0;
        Drawable drawable = this.f8263f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f8251V;
        int i11 = this.f8254a0;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f8253a;
        if (drawable != null) {
            if (!this.f8278v || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = O.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f8262e0 : this.f8264f0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f8260d0;
            if (colorStateList != null) {
                this.f8258c0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f8258c0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f8279w : this.f8237H;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z9, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f8253a != null) {
            Rect rect = this.f8276l0;
            Drawable drawable = this.f8263f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = O.d(this.f8253a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (s0.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f8247R + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f8247R) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i14 = this.f8248S;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f8248S;
            }
            this.f8250U = paddingLeft;
            this.f8251V = paddingTop;
            this.f8254a0 = height;
            this.f8252W = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i14 = this.f8248S;
        paddingTop = paddingTop2 - (i14 / 2);
        height = i14 + paddingTop;
        this.f8250U = paddingLeft;
        this.f8251V = paddingTop;
        this.f8254a0 = height;
        this.f8252W = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f8239J) {
            if (this.f8262e0 == null) {
                this.f8262e0 = i(this.f8236G);
            }
            if (this.f8264f0 == null) {
                this.f8264f0 = i(this.f8238I);
            }
        }
        Rect rect = this.f8276l0;
        Drawable drawable = this.f8253a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f8253a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f8253a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f8249T = Math.max(this.f8239J ? Math.max(this.f8262e0.getWidth(), this.f8264f0.getWidth()) + (this.f8273k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f8263f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f8263f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f8253a;
        if (drawable3 != null) {
            Rect rectD = O.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.f8256b0 ? Math.max(this.f8275l, (this.f8249T * 2) + iMax + iMax2) : this.f8275l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f8247R = iMax3;
        this.f8248S = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f8279w : this.f8237H;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        this.f8244O.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            if (isEnabled() && h(x10, y9)) {
                this.f8240K = 1;
                this.f8242M = x10;
                this.f8243N = y9;
            }
        } else if (actionMasked == 1) {
            if (this.f8240K == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f8240K = 0;
            this.f8244O.clear();
        } else if (actionMasked == 2) {
            int i10 = this.f8240K;
            if (i10 == 1) {
                float x11 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x11 - this.f8242M) > this.f8241L || Math.abs(y10 - this.f8243N) > this.f8241L) {
                    this.f8240K = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f8242M = x11;
                    this.f8243N = y10;
                    return true;
                }
            } else if (i10 == 2) {
                float x12 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f11 = x12 - this.f8242M;
                if (thumbScrollRange != 0) {
                    f10 = f11 / thumbScrollRange;
                } else {
                    f10 = f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f : -1.0f;
                }
                if (s0.b(this)) {
                    f10 = -f10;
                }
                float f12 = f(this.f8246Q + f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                if (f12 != this.f8246Q) {
                    this.f8242M = x12;
                    setThumbPosition(f12);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f8240K == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f8240K = 0;
            this.f8244O.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        super.setChecked(z9);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
        setTextOnInternal(this.f8279w);
        setTextOffInternal(this.f8237H);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z9) {
        this.f8256b0 = z9;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z9) {
        if (this.f8239J != z9) {
            this.f8239J = z9;
            requestLayout();
            if (z9) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z9) {
        this.f8278v = z9;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f8275l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f8277m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f8258c0.getTypeface() == null || this.f8258c0.getTypeface().equals(typeface)) && (this.f8258c0.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f8258c0.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8253a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8253a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f8246Q = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(p080i.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f8273k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f8255b = colorStateList;
        this.f8259d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f8257c = mode;
        this.f8261e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8263f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8263f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(p080i.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f8265g = colorStateList;
        this.f8269i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f8267h = mode;
        this.f8271j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8253a || drawable == this.f8263f;
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p060g.a.f43851J);
    }

    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8255b = null;
        this.f8257c = null;
        this.f8259d = false;
        this.f8261e = false;
        this.f8265g = null;
        this.f8267h = null;
        this.f8269i = false;
        this.f8271j = false;
        this.f8244O = VelocityTracker.obtain();
        this.f8256b0 = true;
        this.f8276l0 = new Rect();
        d0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f8258c0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        h0 h0VarV = h0.v(context, attributeSet, p060g.j.f44046D2, i10, 0);
        AbstractC0845c0.k0(this, context, p060g.j.f44046D2, attributeSet, h0VarV.r(), i10, 0);
        Drawable drawableG = h0VarV.g(p060g.j.f44061G2);
        this.f8253a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = h0VarV.g(p060g.j.f44106P2);
        this.f8263f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(h0VarV.p(p060g.j.f44051E2));
        setTextOffInternal(h0VarV.p(p060g.j.f44056F2));
        this.f8239J = h0VarV.a(p060g.j.f44066H2, true);
        this.f8273k = h0VarV.f(p060g.j.f44091M2, 0);
        this.f8275l = h0VarV.f(p060g.j.f44076J2, 0);
        this.f8277m = h0VarV.f(p060g.j.f44081K2, 0);
        this.f8278v = h0VarV.a(p060g.j.f44071I2, false);
        ColorStateList colorStateListC = h0VarV.c(p060g.j.f44096N2);
        if (colorStateListC != null) {
            this.f8255b = colorStateListC;
            this.f8259d = true;
        }
        PorterDuff.Mode modeE = O.e(h0VarV.k(p060g.j.f44101O2, -1), null);
        if (this.f8257c != modeE) {
            this.f8257c = modeE;
            this.f8261e = true;
        }
        if (this.f8259d || this.f8261e) {
            b();
        }
        ColorStateList colorStateListC2 = h0VarV.c(p060g.j.f44111Q2);
        if (colorStateListC2 != null) {
            this.f8265g = colorStateListC2;
            this.f8269i = true;
        }
        PorterDuff.Mode modeE2 = O.e(h0VarV.k(p060g.j.f44116R2, -1), null);
        if (this.f8267h != modeE2) {
            this.f8267h = modeE2;
            this.f8271j = true;
        }
        if (this.f8269i || this.f8271j) {
            c();
        }
        int iN = h0VarV.n(p060g.j.f44086L2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        C c10 = new C(this);
        this.f8270i0 = c10;
        c10.m(attributeSet, i10);
        h0VarV.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8241L = viewConfiguration.getScaledTouchSlop();
        this.f8245P = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}

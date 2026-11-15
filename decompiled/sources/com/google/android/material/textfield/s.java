package com.google.android.material.textfield;

import O.AbstractC0845c0;
import O.AbstractC0881v;
import P.AbstractC0921c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.h0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
class s extends LinearLayout {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private CharSequence f39628G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final TextView f39629H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f39630I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private EditText f39631J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final AccessibilityManager f39632K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private AbstractC0921c.a f39633L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final TextWatcher f39634M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final TextInputLayout.f f39635N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f39636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FrameLayout f39637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CheckableImageButton f39638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f39639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f39640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View.OnLongClickListener f39641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CheckableImageButton f39642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f39643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashSet f39645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f39646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f39647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f39648m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ImageView.ScaleType f39649v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View.OnLongClickListener f39650w;

    class a extends com.google.android.material.internal.l {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            s.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            s.this.m().b(charSequence, i10, i11, i12);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            if (s.this.f39631J == textInputLayout.getEditText()) {
                return;
            }
            if (s.this.f39631J != null) {
                s.this.f39631J.removeTextChangedListener(s.this.f39634M);
                if (s.this.f39631J.getOnFocusChangeListener() == s.this.m().e()) {
                    s.this.f39631J.setOnFocusChangeListener(null);
                }
            }
            s.this.f39631J = textInputLayout.getEditText();
            if (s.this.f39631J != null) {
                s.this.f39631J.addTextChangedListener(s.this.f39634M);
            }
            s.this.m().n(s.this.f39631J);
            s sVar = s.this;
            sVar.h0(sVar.m());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            s.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            s.this.M();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f39654a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f39655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f39656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f39657d;

        d(s sVar, h0 h0Var) {
            this.f39655b = sVar;
            this.f39656c = h0Var.n(p186s5.k.f49097a7, 0);
            this.f39657d = h0Var.n(p186s5.k.f49318y7, 0);
        }

        private t b(int i10) {
            if (i10 == -1) {
                return new C6684g(this.f39655b);
            }
            if (i10 == 0) {
                return new x(this.f39655b);
            }
            if (i10 == 1) {
                return new z(this.f39655b, this.f39657d);
            }
            if (i10 == 2) {
                return new C6683f(this.f39655b);
            }
            if (i10 == 3) {
                return new q(this.f39655b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        t c(int i10) {
            t tVar = (t) this.f39654a.get(i10);
            if (tVar != null) {
                return tVar;
            }
            t tVarB = b(i10);
            this.f39654a.append(i10, tVarB);
            return tVarB;
        }
    }

    s(TextInputLayout textInputLayout, h0 h0Var) {
        super(textInputLayout.getContext());
        this.f39644i = 0;
        this.f39645j = new LinkedHashSet();
        this.f39634M = new a();
        b bVar = new b();
        this.f39635N = bVar;
        this.f39632K = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f39636a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f39637b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, p186s5.e.f48746P);
        this.f39638c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, p186s5.e.f48745O);
        this.f39642g = checkableImageButtonI2;
        this.f39643h = new d(this, h0Var);
        androidx.appcompat.widget.D d10 = new androidx.appcompat.widget.D(getContext());
        this.f39629H = d10;
        C(h0Var);
        B(h0Var);
        D(h0Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(d10);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(h0 h0Var) {
        if (!h0Var.s(p186s5.k.f49327z7)) {
            if (h0Var.s(p186s5.k.f49137e7)) {
                this.f39646k = H5.c.b(getContext(), h0Var, p186s5.k.f49137e7);
            }
            if (h0Var.s(p186s5.k.f49147f7)) {
                this.f39647l = com.google.android.material.internal.p.h(h0Var.k(p186s5.k.f49147f7, -1), null);
            }
        }
        if (h0Var.s(p186s5.k.f49117c7)) {
            U(h0Var.k(p186s5.k.f49117c7, 0));
            if (h0Var.s(p186s5.k.f49087Z6)) {
                Q(h0Var.p(p186s5.k.f49087Z6));
            }
            O(h0Var.a(p186s5.k.f49078Y6, true));
        } else if (h0Var.s(p186s5.k.f49327z7)) {
            if (h0Var.s(p186s5.k.f48863A7)) {
                this.f39646k = H5.c.b(getContext(), h0Var, p186s5.k.f48863A7);
            }
            if (h0Var.s(p186s5.k.f48872B7)) {
                this.f39647l = com.google.android.material.internal.p.h(h0Var.k(p186s5.k.f48872B7, -1), null);
            }
            U(h0Var.a(p186s5.k.f49327z7, false) ? 1 : 0);
            Q(h0Var.p(p186s5.k.f49309x7));
        }
        T(h0Var.f(p186s5.k.f49107b7, getResources().getDimensionPixelSize(p186s5.c.f48693h0)));
        if (h0Var.s(p186s5.k.f49127d7)) {
            X(u.b(h0Var.k(p186s5.k.f49127d7, -1)));
        }
    }

    private void C(h0 h0Var) {
        if (h0Var.s(p186s5.k.f49192k7)) {
            this.f39639d = H5.c.b(getContext(), h0Var, p186s5.k.f49192k7);
        }
        if (h0Var.s(p186s5.k.f49201l7)) {
            this.f39640e = com.google.android.material.internal.p.h(h0Var.k(p186s5.k.f49201l7, -1), null);
        }
        if (h0Var.s(p186s5.k.f49183j7)) {
            c0(h0Var.g(p186s5.k.f49183j7));
        }
        this.f39638c.setContentDescription(getResources().getText(p186s5.i.f48810f));
        AbstractC0845c0.v0(this.f39638c, 2);
        this.f39638c.setClickable(false);
        this.f39638c.setPressable(false);
        this.f39638c.setFocusable(false);
    }

    private void D(h0 h0Var) {
        this.f39629H.setVisibility(8);
        this.f39629H.setId(p186s5.e.f48752V);
        this.f39629H.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        AbstractC0845c0.o0(this.f39629H, 1);
        q0(h0Var.n(p186s5.k.f49007Q7, 0));
        if (h0Var.s(p186s5.k.f49016R7)) {
            r0(h0Var.c(p186s5.k.f49016R7));
        }
        p0(h0Var.p(p186s5.k.f48998P7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        AbstractC0921c.a aVar = this.f39633L;
        if (aVar == null || (accessibilityManager = this.f39632K) == null) {
            return;
        }
        AbstractC0921c.b(accessibilityManager, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f39633L == null || this.f39632K == null || !AbstractC0845c0.Q(this)) {
            return;
        }
        AbstractC0921c.a(this.f39632K, this.f39633L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(t tVar) {
        if (this.f39631J == null) {
            return;
        }
        if (tVar.e() != null) {
            this.f39631J.setOnFocusChangeListener(tVar.e());
        }
        if (tVar.g() != null) {
            this.f39642g.setOnFocusChangeListener(tVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(p186s5.g.f48785c, viewGroup, false);
        checkableImageButton.setId(i10);
        u.e(checkableImageButton);
        if (H5.c.j(getContext())) {
            AbstractC0881v.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator it = this.f39645j.iterator();
        if (it.hasNext()) {
            p070h.w.a(it.next());
            throw null;
        }
    }

    private void s0(t tVar) {
        tVar.s();
        this.f39633L = tVar.h();
        g();
    }

    private int t(t tVar) {
        int i10 = this.f39643h.f39656c;
        return i10 == 0 ? tVar.d() : i10;
    }

    private void t0(t tVar) {
        M();
        this.f39633L = null;
        tVar.u();
    }

    private void u0(boolean z9) {
        if (!z9 || n() == null) {
            u.a(this.f39636a, this.f39642g, this.f39646k, this.f39647l);
            return;
        }
        Drawable drawableMutate = G.a.r(n()).mutate();
        G.a.n(drawableMutate, this.f39636a.getErrorCurrentTextColors());
        this.f39642g.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f39637b.setVisibility((this.f39642g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.f39628G == null || this.f39630I) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void w0() {
        this.f39638c.setVisibility(s() != null && this.f39636a.N() && this.f39636a.b0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f39636a.m0();
    }

    private void y0() {
        int visibility = this.f39629H.getVisibility();
        int i10 = (this.f39628G == null || this.f39630I) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f39629H.setVisibility(i10);
        this.f39636a.m0();
    }

    boolean A() {
        return this.f39644i != 0;
    }

    boolean E() {
        return A() && this.f39642g.isChecked();
    }

    boolean F() {
        return this.f39637b.getVisibility() == 0 && this.f39642g.getVisibility() == 0;
    }

    boolean G() {
        return this.f39638c.getVisibility() == 0;
    }

    void H(boolean z9) {
        this.f39630I = z9;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f39636a.b0());
        }
    }

    void J() {
        u.d(this.f39636a, this.f39642g, this.f39646k);
    }

    void K() {
        u.d(this.f39636a, this.f39638c, this.f39639d);
    }

    void L(boolean z9) {
        boolean z10;
        boolean zIsActivated;
        boolean zIsChecked;
        t tVarM = m();
        boolean z11 = true;
        if (!tVarM.l() || (zIsChecked = this.f39642g.isChecked()) == tVarM.m()) {
            z10 = false;
        } else {
            this.f39642g.setChecked(!zIsChecked);
            z10 = true;
        }
        if (!tVarM.j() || (zIsActivated = this.f39642g.isActivated()) == tVarM.k()) {
            z11 = z10;
        } else {
            N(!zIsActivated);
        }
        if (z9 || z11) {
            J();
        }
    }

    void N(boolean z9) {
        this.f39642g.setActivated(z9);
    }

    void O(boolean z9) {
        this.f39642g.setCheckable(z9);
    }

    void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f39642g.setContentDescription(charSequence);
        }
    }

    void R(int i10) {
        S(i10 != 0 ? p080i.a.b(getContext(), i10) : null);
    }

    void S(Drawable drawable) {
        this.f39642g.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f39636a, this.f39642g, this.f39646k, this.f39647l);
            J();
        }
    }

    void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f39648m) {
            this.f39648m = i10;
            u.g(this.f39642g, i10);
            u.g(this.f39638c, i10);
        }
    }

    void U(int i10) {
        if (this.f39644i == i10) {
            return;
        }
        t0(m());
        int i11 = this.f39644i;
        this.f39644i = i10;
        j(i11);
        a0(i10 != 0);
        t tVarM = m();
        R(t(tVarM));
        P(tVarM.c());
        O(tVarM.l());
        if (!tVarM.i(this.f39636a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f39636a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(tVarM);
        V(tVarM.f());
        EditText editText = this.f39631J;
        if (editText != null) {
            tVarM.n(editText);
            h0(tVarM);
        }
        u.a(this.f39636a, this.f39642g, this.f39646k, this.f39647l);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        u.h(this.f39642g, onClickListener, this.f39650w);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f39650w = onLongClickListener;
        u.i(this.f39642g, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f39649v = scaleType;
        u.j(this.f39642g, scaleType);
        u.j(this.f39638c, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f39646k != colorStateList) {
            this.f39646k = colorStateList;
            u.a(this.f39636a, this.f39642g, colorStateList, this.f39647l);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f39647l != mode) {
            this.f39647l = mode;
            u.a(this.f39636a, this.f39642g, this.f39646k, mode);
        }
    }

    void a0(boolean z9) {
        if (F() != z9) {
            this.f39642g.setVisibility(z9 ? 0 : 8);
            v0();
            x0();
            this.f39636a.m0();
        }
    }

    void b0(int i10) {
        c0(i10 != 0 ? p080i.a.b(getContext(), i10) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f39638c.setImageDrawable(drawable);
        w0();
        u.a(this.f39636a, this.f39638c, this.f39639d, this.f39640e);
    }

    void d0(View.OnClickListener onClickListener) {
        u.h(this.f39638c, onClickListener, this.f39641f);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f39641f = onLongClickListener;
        u.i(this.f39638c, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f39639d != colorStateList) {
            this.f39639d = colorStateList;
            u.a(this.f39636a, this.f39638c, colorStateList, this.f39640e);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f39640e != mode) {
            this.f39640e = mode;
            u.a(this.f39636a, this.f39638c, this.f39639d, mode);
        }
    }

    void h() {
        this.f39642g.performClick();
        this.f39642g.jumpDrawablesToCurrentState();
    }

    void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    void j0(CharSequence charSequence) {
        this.f39642g.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f39638c;
        }
        if (A() && F()) {
            return this.f39642g;
        }
        return null;
    }

    void k0(int i10) {
        l0(i10 != 0 ? p080i.a.b(getContext(), i10) : null);
    }

    CharSequence l() {
        return this.f39642g.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f39642g.setImageDrawable(drawable);
    }

    t m() {
        return this.f39643h.c(this.f39644i);
    }

    void m0(boolean z9) {
        if (z9 && this.f39644i != 1) {
            U(1);
        } else {
            if (z9) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f39642g.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f39646k = colorStateList;
        u.a(this.f39636a, this.f39642g, colorStateList, this.f39647l);
    }

    int o() {
        return this.f39648m;
    }

    void o0(PorterDuff.Mode mode) {
        this.f39647l = mode;
        u.a(this.f39636a, this.f39642g, this.f39646k, mode);
    }

    int p() {
        return this.f39644i;
    }

    void p0(CharSequence charSequence) {
        this.f39628G = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f39629H.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.f39649v;
    }

    void q0(int i10) {
        androidx.core.widget.i.o(this.f39629H, i10);
    }

    CheckableImageButton r() {
        return this.f39642g;
    }

    void r0(ColorStateList colorStateList) {
        this.f39629H.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f39638c.getDrawable();
    }

    CharSequence u() {
        return this.f39642g.getContentDescription();
    }

    Drawable v() {
        return this.f39642g.getDrawable();
    }

    CharSequence w() {
        return this.f39628G;
    }

    ColorStateList x() {
        return this.f39629H.getTextColors();
    }

    void x0() {
        if (this.f39636a.f39544d == null) {
            return;
        }
        AbstractC0845c0.B0(this.f39629H, getContext().getResources().getDimensionPixelSize(p186s5.c.f48666O), this.f39636a.f39544d.getPaddingTop(), (F() || G()) ? 0 : AbstractC0845c0.D(this.f39636a.f39544d), this.f39636a.f39544d.getPaddingBottom());
    }

    int y() {
        return AbstractC0845c0.D(this) + AbstractC0845c0.D(this.f39629H) + ((F() || G()) ? this.f39642g.getMeasuredWidth() + AbstractC0881v.b((ViewGroup.MarginLayoutParams) this.f39642g.getLayoutParams()) : 0);
    }

    TextView z() {
        return this.f39629H;
    }
}

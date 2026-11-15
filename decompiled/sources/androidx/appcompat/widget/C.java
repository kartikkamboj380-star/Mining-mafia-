package androidx.appcompat.widget;

import O.AbstractC0845c0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f7860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0 f7861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f0 f7862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f7863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f0 f7864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f0 f7865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f0 f7866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f0 f7867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final E f7868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7869j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7870k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f7871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7872m;

    class a extends E.h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f7875c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f7873a = i10;
            this.f7874b = i11;
            this.f7875c = weakReference;
        }

        @Override // E.h.e
        public void f(int i10) {
        }

        @Override // E.h.e
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f7873a) != -1) {
                typeface = e.a(typeface, i10, (this.f7874b & 2) != 0);
            }
            C.this.n(this.f7875c, typeface);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f7877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f7878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7879c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f7877a = textView;
            this.f7878b = typeface;
            this.f7879c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7877a.setTypeface(this.f7878b, this.f7879c);
        }
    }

    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class e {
        static Typeface a(Typeface typeface, int i10, boolean z9) {
            return Typeface.create(typeface, i10, z9);
        }
    }

    C(TextView textView) {
        this.f7860a = textView;
        this.f7868i = new E(textView);
    }

    private void B(int i10, float f10) {
        this.f7868i.t(i10, f10);
    }

    private void C(Context context, h0 h0Var) {
        String strO;
        this.f7869j = h0Var.k(p060g.j.f44133V2, this.f7869j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = h0Var.k(p060g.j.f44145Y2, -1);
            this.f7870k = iK;
            if (iK != -1) {
                this.f7869j &= 2;
            }
        }
        if (!h0Var.s(p060g.j.f44141X2) && !h0Var.s(p060g.j.f44149Z2)) {
            if (h0Var.s(p060g.j.f44129U2)) {
                this.f7872m = false;
                int iK2 = h0Var.k(p060g.j.f44129U2, 1);
                if (iK2 == 1) {
                    this.f7871l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f7871l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f7871l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f7871l = null;
        int i11 = h0Var.s(p060g.j.f44149Z2) ? p060g.j.f44149Z2 : p060g.j.f44141X2;
        int i12 = this.f7870k;
        int i13 = this.f7869j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = h0Var.j(i11, this.f7869j, new a(i12, i13, new WeakReference(this.f7860a)));
                if (typefaceJ != null) {
                    if (i10 < 28 || this.f7870k == -1) {
                        this.f7871l = typefaceJ;
                    } else {
                        this.f7871l = e.a(Typeface.create(typefaceJ, 0), this.f7870k, (this.f7869j & 2) != 0);
                    }
                }
                this.f7872m = this.f7871l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f7871l != null || (strO = h0Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f7870k == -1) {
            this.f7871l = Typeface.create(strO, this.f7869j);
        } else {
            this.f7871l = e.a(Typeface.create(strO, 0), this.f7870k, (this.f7869j & 2) != 0);
        }
    }

    private void a(Drawable drawable, f0 f0Var) {
        if (drawable == null || f0Var == null) {
            return;
        }
        C1090k.i(drawable, f0Var, this.f7860a.getDrawableState());
    }

    private static f0 d(Context context, C1090k c1090k, int i10) {
        ColorStateList colorStateListF = c1090k.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        f0 f0Var = new f0();
        f0Var.f8311d = true;
        f0Var.f8308a = colorStateListF;
        return f0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f7860a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f7860a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f7860a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f7860a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f7860a.getCompoundDrawables();
        TextView textView2 = this.f7860a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        f0 f0Var = this.f7867h;
        this.f7861b = f0Var;
        this.f7862c = f0Var;
        this.f7863d = f0Var;
        this.f7864e = f0Var;
        this.f7865f = f0Var;
        this.f7866g = f0Var;
    }

    void A(int i10, float f10) {
        if (s0.f8421c || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f7861b != null || this.f7862c != null || this.f7863d != null || this.f7864e != null) {
            Drawable[] compoundDrawables = this.f7860a.getCompoundDrawables();
            a(compoundDrawables[0], this.f7861b);
            a(compoundDrawables[1], this.f7862c);
            a(compoundDrawables[2], this.f7863d);
            a(compoundDrawables[3], this.f7864e);
        }
        if (this.f7865f == null && this.f7866g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f7860a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f7865f);
        a(compoundDrawablesRelative[2], this.f7866g);
    }

    void c() {
        this.f7868i.a();
    }

    int e() {
        return this.f7868i.f();
    }

    int f() {
        return this.f7868i.g();
    }

    int g() {
        return this.f7868i.h();
    }

    int[] h() {
        return this.f7868i.i();
    }

    int i() {
        return this.f7868i.j();
    }

    ColorStateList j() {
        f0 f0Var = this.f7867h;
        if (f0Var != null) {
            return f0Var.f8308a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        f0 f0Var = this.f7867h;
        if (f0Var != null) {
            return f0Var.f8309b;
        }
        return null;
    }

    boolean l() {
        return this.f7868i.n();
    }

    void m(AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z9;
        String strO;
        String strO2;
        boolean z10;
        int iA;
        float f10;
        Context context = this.f7860a.getContext();
        C1090k c1090kB = C1090k.b();
        h0 h0VarV = h0.v(context, attributeSet, p060g.j.f44142Y, i10, 0);
        TextView textView = this.f7860a;
        AbstractC0845c0.k0(textView, textView.getContext(), p060g.j.f44142Y, attributeSet, h0VarV.r(), i10, 0);
        int iN = h0VarV.n(p060g.j.f44146Z, -1);
        if (h0VarV.s(p060g.j.f44161c0)) {
            this.f7861b = d(context, c1090kB, h0VarV.n(p060g.j.f44161c0, 0));
        }
        if (h0VarV.s(p060g.j.f44151a0)) {
            this.f7862c = d(context, c1090kB, h0VarV.n(p060g.j.f44151a0, 0));
        }
        if (h0VarV.s(p060g.j.f44166d0)) {
            this.f7863d = d(context, c1090kB, h0VarV.n(p060g.j.f44166d0, 0));
        }
        if (h0VarV.s(p060g.j.f44156b0)) {
            this.f7864e = d(context, c1090kB, h0VarV.n(p060g.j.f44156b0, 0));
        }
        if (h0VarV.s(p060g.j.f44171e0)) {
            this.f7865f = d(context, c1090kB, h0VarV.n(p060g.j.f44171e0, 0));
        }
        if (h0VarV.s(p060g.j.f44176f0)) {
            this.f7866g = d(context, c1090kB, h0VarV.n(p060g.j.f44176f0, 0));
        }
        h0VarV.x();
        boolean z11 = this.f7860a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iN != -1) {
            h0 h0VarT = h0.t(context, iN, p060g.j.f44121S2);
            if (z11 || !h0VarT.s(p060g.j.f44159b3)) {
                zA = false;
                z9 = false;
            } else {
                zA = h0VarT.a(p060g.j.f44159b3, false);
                z9 = true;
            }
            C(context, h0VarT);
            int i11 = Build.VERSION.SDK_INT;
            strO2 = h0VarT.s(p060g.j.f44164c3) ? h0VarT.o(p060g.j.f44164c3) : null;
            strO = (i11 < 26 || !h0VarT.s(p060g.j.f44154a3)) ? null : h0VarT.o(p060g.j.f44154a3);
            h0VarT.x();
        } else {
            zA = false;
            z9 = false;
            strO = null;
            strO2 = null;
        }
        h0 h0VarV2 = h0.v(context, attributeSet, p060g.j.f44121S2, i10, 0);
        if (z11 || !h0VarV2.s(p060g.j.f44159b3)) {
            z10 = z9;
        } else {
            zA = h0VarV2.a(p060g.j.f44159b3, false);
            z10 = true;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (h0VarV2.s(p060g.j.f44164c3)) {
            strO2 = h0VarV2.o(p060g.j.f44164c3);
        }
        if (i12 >= 26 && h0VarV2.s(p060g.j.f44154a3)) {
            strO = h0VarV2.o(p060g.j.f44154a3);
        }
        if (i12 >= 28 && h0VarV2.s(p060g.j.f44125T2) && h0VarV2.f(p060g.j.f44125T2, -1) == 0) {
            this.f7860a.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        C(context, h0VarV2);
        h0VarV2.x();
        if (!z11 && z10) {
            s(zA);
        }
        Typeface typeface = this.f7871l;
        if (typeface != null) {
            if (this.f7870k == -1) {
                this.f7860a.setTypeface(typeface, this.f7869j);
            } else {
                this.f7860a.setTypeface(typeface);
            }
        }
        if (strO != null) {
            d.d(this.f7860a, strO);
        }
        if (strO2 != null) {
            c.b(this.f7860a, c.a(strO2));
        }
        this.f7868i.o(attributeSet, i10);
        if (s0.f8421c && this.f7868i.j() != 0) {
            int[] iArrI = this.f7868i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f7860a) != -1.0f) {
                    d.b(this.f7860a, this.f7868i.g(), this.f7868i.f(), this.f7868i.h(), 0);
                } else {
                    d.c(this.f7860a, iArrI, 0);
                }
            }
        }
        h0 h0VarU = h0.u(context, attributeSet, p060g.j.f44181g0);
        int iN2 = h0VarU.n(p060g.j.f44221o0, -1);
        Drawable drawableC = iN2 != -1 ? c1090kB.c(context, iN2) : null;
        int iN3 = h0VarU.n(p060g.j.f44246t0, -1);
        Drawable drawableC2 = iN3 != -1 ? c1090kB.c(context, iN3) : null;
        int iN4 = h0VarU.n(p060g.j.f44226p0, -1);
        Drawable drawableC3 = iN4 != -1 ? c1090kB.c(context, iN4) : null;
        int iN5 = h0VarU.n(p060g.j.f44211m0, -1);
        Drawable drawableC4 = iN5 != -1 ? c1090kB.c(context, iN5) : null;
        int iN6 = h0VarU.n(p060g.j.f44231q0, -1);
        Drawable drawableC5 = iN6 != -1 ? c1090kB.c(context, iN6) : null;
        int iN7 = h0VarU.n(p060g.j.f44216n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? c1090kB.c(context, iN7) : null);
        if (h0VarU.s(p060g.j.f44236r0)) {
            androidx.core.widget.i.g(this.f7860a, h0VarU.c(p060g.j.f44236r0));
        }
        if (h0VarU.s(p060g.j.f44241s0)) {
            androidx.core.widget.i.h(this.f7860a, O.e(h0VarU.k(p060g.j.f44241s0, -1), null));
        }
        int iF = h0VarU.f(p060g.j.f44256v0, -1);
        int iF2 = h0VarU.f(p060g.j.f44261w0, -1);
        if (h0VarU.s(p060g.j.f44266x0)) {
            TypedValue typedValueW = h0VarU.w(p060g.j.f44266x0);
            if (typedValueW == null || typedValueW.type != 5) {
                f10 = h0VarU.f(p060g.j.f44266x0, -1);
                iA = -1;
            } else {
                iA = N.i.a(typedValueW.data);
                f10 = TypedValue.complexToFloat(typedValueW.data);
            }
        } else {
            iA = -1;
            f10 = -1.0f;
        }
        h0VarU.x();
        if (iF != -1) {
            androidx.core.widget.i.j(this.f7860a, iF);
        }
        if (iF2 != -1) {
            androidx.core.widget.i.k(this.f7860a, iF2);
        }
        if (f10 != -1.0f) {
            if (iA == -1) {
                androidx.core.widget.i.l(this.f7860a, (int) f10);
            } else {
                androidx.core.widget.i.m(this.f7860a, iA, f10);
            }
        }
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f7872m) {
            this.f7871l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f7869j));
                } else {
                    textView.setTypeface(typeface, this.f7869j);
                }
            }
        }
    }

    void o(boolean z9, int i10, int i11, int i12, int i13) {
        if (s0.f8421c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String strO;
        h0 h0VarT = h0.t(context, i10, p060g.j.f44121S2);
        if (h0VarT.s(p060g.j.f44159b3)) {
            s(h0VarT.a(p060g.j.f44159b3, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (h0VarT.s(p060g.j.f44125T2) && h0VarT.f(p060g.j.f44125T2, -1) == 0) {
            this.f7860a.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        C(context, h0VarT);
        if (i11 >= 26 && h0VarT.s(p060g.j.f44154a3) && (strO = h0VarT.o(p060g.j.f44154a3)) != null) {
            d.d(this.f7860a, strO);
        }
        h0VarT.x();
        Typeface typeface = this.f7871l;
        if (typeface != null) {
            this.f7860a.setTypeface(typeface, this.f7869j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        R.c.f(editorInfo, textView.getText());
    }

    void s(boolean z9) {
        this.f7860a.setAllCaps(z9);
    }

    void t(int i10, int i11, int i12, int i13) {
        this.f7868i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) {
        this.f7868i.q(iArr, i10);
    }

    void v(int i10) {
        this.f7868i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f7867h == null) {
            this.f7867h = new f0();
        }
        f0 f0Var = this.f7867h;
        f0Var.f8308a = colorStateList;
        f0Var.f8311d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f7867h == null) {
            this.f7867h = new f0();
        }
        f0 f0Var = this.f7867h;
        f0Var.f8309b = mode;
        f0Var.f8310c = mode != null;
        z();
    }
}

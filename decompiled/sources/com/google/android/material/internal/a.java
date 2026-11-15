package com.google.android.material.internal;

import O.AbstractC0845c0;
import O.AbstractC0875s;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final boolean f39217t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Paint f39218u0 = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Typeface f39219A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Typeface f39220B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Typeface f39221C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private H5.a f39222D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private H5.a f39223E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private CharSequence f39225G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private CharSequence f39226H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f39227I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f39229K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Bitmap f39230L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Paint f39231M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f39232N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f39233O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f39234P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f39235Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f39236R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f39237S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int[] f39238T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f39239U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final TextPaint f39240V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final TextPaint f39241W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private TimeInterpolator f39242X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private TimeInterpolator f39243Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f39244Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f39245a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f39246a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f39247b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f39248b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39249c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ColorStateList f39250c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f39251d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f39252d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f39253e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f39254e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39255f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private float f39256f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f39257g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private ColorStateList f39258g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f39259h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f39260h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f39261i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f39262i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f39264j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private StaticLayout f39266k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f39268l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f39270m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f39271n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f39272n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f39273o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private CharSequence f39274o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f39275p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f39277q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f39279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f39281s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f39283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f39284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f39285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Typeface f39286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Typeface f39287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Typeface f39288y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Typeface f39289z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39263j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f39265k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f39267l = 15.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f39269m = 15.0f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private TextUtils.TruncateAt f39224F = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f39228J = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f39276p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f39278q0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f39280r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f39282s0 = h.f39299n;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0361a implements H5.a.InterfaceC0027a {
        C0361a() {
        }

        @Override // H5.a.InterfaceC0027a
        public void a(Typeface typeface) {
            a.this.T(typeface);
        }
    }

    public a(View view) {
        this.f39245a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f39240V = textPaint;
        this.f39241W = new TextPaint(textPaint);
        this.f39259h = new Rect();
        this.f39257g = new Rect();
        this.f39261i = new RectF();
        this.f39253e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f39267l);
        textPaint.setTypeface(this.f39289z);
        textPaint.setLetterSpacing(this.f39262i0);
    }

    private void B(float f10) {
        if (this.f39249c) {
            this.f39261i.set(f10 < this.f39253e ? this.f39257g : this.f39259h);
            return;
        }
        this.f39261i.left = G(this.f39257g.left, this.f39259h.left, f10, this.f39242X);
        this.f39261i.top = G(this.f39277q, this.f39279r, f10, this.f39242X);
        this.f39261i.right = G(this.f39257g.right, this.f39259h.right, f10, this.f39242X);
        this.f39261i.bottom = G(this.f39257g.bottom, this.f39259h.bottom, f10, this.f39242X);
    }

    private static boolean C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean D() {
        return AbstractC0845c0.z(this.f39245a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z9) {
        return (z9 ? M.o.f3446d : M.o.f3445c).isRtl(charSequence, 0, charSequence.length());
    }

    private static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return p196t5.a.a(f10, f11, f12);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean L(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void Q(float f10) {
        this.f39270m0 = f10;
        AbstractC0845c0.d0(this.f39245a);
    }

    private boolean U(Typeface typeface) {
        H5.a aVar = this.f39223E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f39288y == typeface) {
            return false;
        }
        this.f39288y = typeface;
        Typeface typefaceB = H5.i.b(this.f39245a.getContext().getResources().getConfiguration(), typeface);
        this.f39287x = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f39288y;
        }
        this.f39286w = typefaceB;
        return true;
    }

    private void Y(float f10) {
        this.f39272n0 = f10;
        AbstractC0845c0.d0(this.f39245a);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z9) {
        StaticLayout staticLayout;
        i(1.0f, z9);
        CharSequence charSequence = this.f39226H;
        if (charSequence != null && (staticLayout = this.f39266k0) != null) {
            this.f39274o0 = TextUtils.ellipsize(charSequence, this.f39240V, staticLayout.getWidth(), this.f39224F);
        }
        CharSequence charSequence2 = this.f39274o0;
        float fI = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (charSequence2 != null) {
            this.f39268l0 = I(this.f39240V, charSequence2);
        } else {
            this.f39268l0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int iB = AbstractC0875s.b(this.f39265k, this.f39227I ? 1 : 0);
        int i10 = iB & 112;
        if (i10 == 48) {
            this.f39279r = this.f39259h.top;
        } else if (i10 != 80) {
            this.f39279r = this.f39259h.centerY() - ((this.f39240V.descent() - this.f39240V.ascent()) / 2.0f);
        } else {
            this.f39279r = this.f39259h.bottom + this.f39240V.ascent();
        }
        int i11 = iB & 8388615;
        if (i11 == 1) {
            this.f39283t = this.f39259h.centerX() - (this.f39268l0 / 2.0f);
        } else if (i11 != 5) {
            this.f39283t = this.f39259h.left;
        } else {
            this.f39283t = this.f39259h.right - this.f39268l0;
        }
        i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z9);
        StaticLayout staticLayout2 = this.f39266k0;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f39266k0;
        if (staticLayout3 == null || this.f39276p0 <= 1) {
            CharSequence charSequence3 = this.f39226H;
            if (charSequence3 != null) {
                fI = I(this.f39240V, charSequence3);
            }
        } else {
            fI = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f39266k0;
        this.f39275p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int iB2 = AbstractC0875s.b(this.f39263j, this.f39227I ? 1 : 0);
        int i12 = iB2 & 112;
        if (i12 == 48) {
            this.f39277q = this.f39257g.top;
        } else if (i12 != 80) {
            this.f39277q = this.f39257g.centerY() - (height / 2.0f);
        } else {
            this.f39277q = (this.f39257g.bottom - height) + this.f39240V.descent();
        }
        int i13 = iB2 & 8388615;
        if (i13 == 1) {
            this.f39281s = this.f39257g.centerX() - (fI / 2.0f);
        } else if (i13 != 5) {
            this.f39281s = this.f39257g.left;
        } else {
            this.f39281s = this.f39257g.right - fI;
        }
        j();
        d0(this.f39247b);
    }

    private boolean b0(Typeface typeface) {
        H5.a aVar = this.f39222D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f39220B == typeface) {
            return false;
        }
        this.f39220B = typeface;
        Typeface typefaceB = H5.i.b(this.f39245a.getContext().getResources().getConfiguration(), typeface);
        this.f39219A = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f39220B;
        }
        this.f39289z = typefaceB;
        return true;
    }

    private void c() {
        g(this.f39247b);
    }

    private float d(float f10) {
        float f11 = this.f39253e;
        return f10 <= f11 ? p196t5.a.b(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f39251d, f11, f10) : p196t5.a.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f11, 1.0f, f10);
    }

    private void d0(float f10) {
        h(f10);
        boolean z9 = f39217t0 && this.f39232N != 1.0f;
        this.f39229K = z9;
        if (z9) {
            n();
        }
        AbstractC0845c0.d0(this.f39245a);
    }

    private float e() {
        float f10 = this.f39251d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean zD = D();
        return this.f39228J ? F(charSequence, zD) : zD;
    }

    private void g(float f10) {
        float f11;
        B(f10);
        if (!this.f39249c) {
            this.f39284u = G(this.f39281s, this.f39283t, f10, this.f39242X);
            this.f39285v = G(this.f39277q, this.f39279r, f10, this.f39242X);
            d0(f10);
            f11 = f10;
        } else if (f10 < this.f39253e) {
            this.f39284u = this.f39281s;
            this.f39285v = this.f39277q;
            d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            f11 = 0.0f;
        } else {
            this.f39284u = this.f39283t;
            this.f39285v = this.f39279r - Math.max(0, this.f39255f);
            d0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = p196t5.a.f49671b;
        Q(1.0f - G(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, timeInterpolator));
        if (this.f39273o != this.f39271n) {
            this.f39240V.setColor(a(v(), t(), f11));
        } else {
            this.f39240V.setColor(t());
        }
        int i10 = Build.VERSION.SDK_INT;
        float f12 = this.f39260h0;
        float f13 = this.f39262i0;
        if (f12 != f13) {
            this.f39240V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
        } else {
            this.f39240V.setLetterSpacing(f12);
        }
        this.f39234P = G(this.f39252d0, this.f39244Z, f10, null);
        this.f39235Q = G(this.f39254e0, this.f39246a0, f10, null);
        this.f39236R = G(this.f39256f0, this.f39248b0, f10, null);
        int iA = a(u(this.f39258g0), u(this.f39250c0), f10);
        this.f39237S = iA;
        this.f39240V.setShadowLayer(this.f39234P, this.f39235Q, this.f39236R, iA);
        if (this.f39249c) {
            this.f39240V.setAlpha((int) (d(f10) * this.f39240V.getAlpha()));
            if (i10 >= 31) {
                TextPaint textPaint = this.f39240V;
                textPaint.setShadowLayer(this.f39234P, this.f39235Q, this.f39236R, p256z5.a.a(this.f39237S, textPaint.getAlpha()));
            }
        }
        AbstractC0845c0.d0(this.f39245a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z9) {
        float f11;
        float f12;
        Typeface typeface;
        if (this.f39225G == null) {
            return;
        }
        float fWidth = this.f39259h.width();
        float fWidth2 = this.f39257g.width();
        if (C(f10, 1.0f)) {
            f11 = this.f39269m;
            f12 = this.f39260h0;
            this.f39232N = 1.0f;
            typeface = this.f39286w;
        } else {
            float f13 = this.f39267l;
            float f14 = this.f39262i0;
            Typeface typeface2 = this.f39289z;
            if (C(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                this.f39232N = 1.0f;
            } else {
                this.f39232N = G(this.f39267l, this.f39269m, f10, this.f39243Y) / this.f39267l;
            }
            float f15 = this.f39269m / this.f39267l;
            fWidth = (z9 || this.f39249c || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        boolean z10 = false;
        if (fWidth > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            boolean z11 = this.f39233O != f11;
            boolean z12 = this.f39264j0 != f12;
            boolean z13 = this.f39221C != typeface;
            StaticLayout staticLayout = this.f39266k0;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.f39239U;
            this.f39233O = f11;
            this.f39264j0 = f12;
            this.f39221C = typeface;
            this.f39239U = false;
            this.f39240V.setLinearText(this.f39232N != 1.0f);
            z10 = z14;
        }
        if (this.f39226H == null || z10) {
            this.f39240V.setTextSize(this.f39233O);
            this.f39240V.setTypeface(this.f39221C);
            this.f39240V.setLetterSpacing(this.f39264j0);
            this.f39227I = f(this.f39225G);
            StaticLayout staticLayoutK = k(j0() ? this.f39276p0 : 1, fWidth, this.f39227I);
            this.f39266k0 = staticLayoutK;
            this.f39226H = staticLayoutK.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.f39230L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f39230L = null;
        }
    }

    private boolean j0() {
        if (this.f39276p0 > 1) {
            return (!this.f39227I || this.f39249c) && !this.f39229K;
        }
        return false;
    }

    private StaticLayout k(int i10, float f10, boolean z9) {
        return (StaticLayout) N.f.g(h.b(this.f39225G, this.f39240V, (int) f10).d(this.f39224F).g(z9).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i10).h(this.f39278q0, this.f39280r0).e(this.f39282s0).j(null).a());
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.f39240V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f39249c) {
            this.f39240V.setAlpha((int) (this.f39272n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f39240V;
                textPaint.setShadowLayer(this.f39234P, this.f39235Q, this.f39236R, p256z5.a.a(this.f39237S, textPaint.getAlpha()));
            }
            this.f39266k0.draw(canvas);
        }
        if (!this.f39249c) {
            this.f39240V.setAlpha((int) (this.f39270m0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.f39240V;
            textPaint2.setShadowLayer(this.f39234P, this.f39235Q, this.f39236R, p256z5.a.a(this.f39237S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f39266k0.getLineBaseline(0);
        CharSequence charSequence = this.f39274o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, this.f39240V);
        if (i10 >= 31) {
            this.f39240V.setShadowLayer(this.f39234P, this.f39235Q, this.f39236R, this.f39237S);
        }
        if (this.f39249c) {
            return;
        }
        String strTrim = this.f39274o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f39240V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f39266k0.getLineEnd(0), str.length()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, (Paint) this.f39240V);
    }

    private void n() {
        if (this.f39230L != null || this.f39257g.isEmpty() || TextUtils.isEmpty(this.f39226H)) {
            return;
        }
        g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int width = this.f39266k0.getWidth();
        int height = this.f39266k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f39230L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f39266k0.draw(new Canvas(this.f39230L));
        if (this.f39231M == null) {
            this.f39231M = new Paint(3);
        }
    }

    private float r(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) - (this.f39268l0 / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            return this.f39227I ? this.f39259h.left : this.f39259h.right - this.f39268l0;
        }
        return this.f39227I ? this.f39259h.right - this.f39268l0 : this.f39259h.left;
    }

    private float s(RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) + (this.f39268l0 / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            return this.f39227I ? rectF.left + this.f39268l0 : this.f39259h.right;
        }
        return this.f39227I ? this.f39259h.right : rectF.left + this.f39268l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f39238T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f39271n);
    }

    private Layout.Alignment y() {
        int iB = AbstractC0875s.b(this.f39263j, this.f39227I ? 1 : 0) & 7;
        if (iB == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (iB != 5) {
            return this.f39227I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.f39227I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f39269m);
        textPaint.setTypeface(this.f39286w);
        textPaint.setLetterSpacing(this.f39260h0);
    }

    public final boolean E() {
        ColorStateList colorStateList = this.f39273o;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f39271n;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f39288y;
            if (typeface != null) {
                this.f39287x = H5.i.b(configuration, typeface);
            }
            Typeface typeface2 = this.f39220B;
            if (typeface2 != null) {
                this.f39219A = H5.i.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f39287x;
            if (typeface3 == null) {
                typeface3 = this.f39288y;
            }
            this.f39286w = typeface3;
            Typeface typeface4 = this.f39219A;
            if (typeface4 == null) {
                typeface4 = this.f39220B;
            }
            this.f39289z = typeface4;
            K(true);
        }
    }

    public void J() {
        K(false);
    }

    public void K(boolean z9) {
        if ((this.f39245a.getHeight() <= 0 || this.f39245a.getWidth() <= 0) && !z9) {
            return;
        }
        b(z9);
        c();
    }

    public void M(ColorStateList colorStateList) {
        if (this.f39273o == colorStateList && this.f39271n == colorStateList) {
            return;
        }
        this.f39273o = colorStateList;
        this.f39271n = colorStateList;
        J();
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (L(this.f39259h, i10, i11, i12, i13)) {
            return;
        }
        this.f39259h.set(i10, i11, i12, i13);
        this.f39239U = true;
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        H5.d dVar = new H5.d(this.f39245a.getContext(), i10);
        if (dVar.i() != null) {
            this.f39273o = dVar.i();
        }
        if (dVar.j() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f39269m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f1483c;
        if (colorStateList != null) {
            this.f39250c0 = colorStateList;
        }
        this.f39246a0 = dVar.f1488h;
        this.f39248b0 = dVar.f1489i;
        this.f39244Z = dVar.f1490j;
        this.f39260h0 = dVar.f1492l;
        H5.a aVar = this.f39223E;
        if (aVar != null) {
            aVar.c();
        }
        this.f39223E = new H5.a(new C0361a(), dVar.e());
        dVar.g(this.f39245a.getContext(), this.f39223E);
        J();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f39273o != colorStateList) {
            this.f39273o = colorStateList;
            J();
        }
    }

    public void S(int i10) {
        if (this.f39265k != i10) {
            this.f39265k = i10;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (L(this.f39257g, i10, i11, i12, i13)) {
            return;
        }
        this.f39257g.set(i10, i11, i12, i13);
        this.f39239U = true;
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f39262i0 != f10) {
            this.f39262i0 = f10;
            J();
        }
    }

    public void Z(int i10) {
        if (this.f39263j != i10) {
            this.f39263j = i10;
            J();
        }
    }

    public void a0(float f10) {
        if (this.f39267l != f10) {
            this.f39267l = f10;
            J();
        }
    }

    public void c0(float f10) {
        float fA = I.a.a(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (fA != this.f39247b) {
            this.f39247b = fA;
            c();
        }
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.f39242X = timeInterpolator;
        J();
    }

    public final boolean f0(int[] iArr) {
        this.f39238T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f39225G, charSequence)) {
            this.f39225G = charSequence;
            this.f39226H = null;
            j();
            J();
        }
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.f39243Y = timeInterpolator;
        J();
    }

    public void i0(Typeface typeface) {
        boolean zU = U(typeface);
        boolean zB0 = b0(typeface);
        if (zU || zB0) {
            J();
        }
    }

    public void l(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f39226H == null || this.f39261i.width() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.f39261i.height() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.f39240V.setTextSize(this.f39233O);
        float f10 = this.f39284u;
        float f11 = this.f39285v;
        boolean z9 = this.f39229K && this.f39230L != null;
        float f12 = this.f39232N;
        if (f12 != 1.0f && !this.f39249c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z9) {
            canvas.drawBitmap(this.f39230L, f10, f11, this.f39231M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!j0() || (this.f39249c && this.f39247b <= this.f39253e)) {
            canvas.translate(f10, f11);
            this.f39266k0.draw(canvas);
        } else {
            m(canvas, this.f39284u - this.f39266k0.getLineStart(0), f11);
        }
        canvas.restoreToCount(iSave);
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f39227I = f(this.f39225G);
        rectF.left = Math.max(r(i10, i11), this.f39259h.left);
        rectF.top = this.f39259h.top;
        rectF.right = Math.min(s(rectF, i10, i11), this.f39259h.right);
        rectF.bottom = this.f39259h.top + q();
    }

    public ColorStateList p() {
        return this.f39273o;
    }

    public float q() {
        z(this.f39241W);
        return -this.f39241W.ascent();
    }

    public int t() {
        return u(this.f39273o);
    }

    public float w() {
        A(this.f39241W);
        return -this.f39241W.ascent();
    }

    public float x() {
        return this.f39247b;
    }
}

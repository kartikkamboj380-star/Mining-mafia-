package K5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final K5.c f2834m = new i(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f2835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f2836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f2837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d f2838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    K5.c f2839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    K5.c f2840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    K5.c f2841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    K5.c f2842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    f f2843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    f f2844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    f f2845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    f f2846l;

    public interface c {
        K5.c a(K5.c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new K5.a(i12));
    }

    private static b d(Context context, int i10, int i11, K5.c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(p186s5.k.f49271t5);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(p186s5.k.f49280u5, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(p186s5.k.f49307x5, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(p186s5.k.f49316y5, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(p186s5.k.f49298w5, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(p186s5.k.f49289v5, i12);
            K5.c cVarM = m(typedArrayObtainStyledAttributes, p186s5.k.f49325z5, cVar);
            K5.c cVarM2 = m(typedArrayObtainStyledAttributes, p186s5.k.f48879C5, cVarM);
            K5.c cVarM3 = m(typedArrayObtainStyledAttributes, p186s5.k.f48888D5, cVarM);
            K5.c cVarM4 = m(typedArrayObtainStyledAttributes, p186s5.k.f48870B5, cVarM);
            return new b().z(i13, cVarM2).E(i14, cVarM3).u(i15, cVarM4).q(i16, m(typedArrayObtainStyledAttributes, p186s5.k.f48861A5, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new K5.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, K5.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p186s5.k.f49114c4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(p186s5.k.f49124d4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(p186s5.k.f49134e4, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static K5.c m(TypedArray typedArray, int i10, K5.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new K5.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new i(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public f h() {
        return this.f2845k;
    }

    public d i() {
        return this.f2838d;
    }

    public K5.c j() {
        return this.f2842h;
    }

    public d k() {
        return this.f2837c;
    }

    public K5.c l() {
        return this.f2841g;
    }

    public f n() {
        return this.f2846l;
    }

    public f o() {
        return this.f2844j;
    }

    public f p() {
        return this.f2843i;
    }

    public d q() {
        return this.f2835a;
    }

    public K5.c r() {
        return this.f2839e;
    }

    public d s() {
        return this.f2836b;
    }

    public K5.c t() {
        return this.f2840f;
    }

    public boolean u(RectF rectF) {
        boolean z9 = this.f2846l.getClass().equals(f.class) && this.f2844j.getClass().equals(f.class) && this.f2843i.getClass().equals(f.class) && this.f2845k.getClass().equals(f.class);
        float fA = this.f2839e.a(rectF);
        return z9 && ((this.f2840f.a(rectF) > fA ? 1 : (this.f2840f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f2842h.a(rectF) > fA ? 1 : (this.f2842h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f2841g.a(rectF) > fA ? 1 : (this.f2841g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f2836b instanceof j) && (this.f2835a instanceof j) && (this.f2837c instanceof j) && (this.f2838d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(K5.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().C(cVar.a(r())).H(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f2835a = bVar.f2847a;
        this.f2836b = bVar.f2848b;
        this.f2837c = bVar.f2849c;
        this.f2838d = bVar.f2850d;
        this.f2839e = bVar.f2851e;
        this.f2840f = bVar.f2852f;
        this.f2841g = bVar.f2853g;
        this.f2842h = bVar.f2854h;
        this.f2843i = bVar.f2855i;
        this.f2844j = bVar.f2856j;
        this.f2845k = bVar.f2857k;
        this.f2846l = bVar.f2858l;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f2847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f2848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f2849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f2850d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private K5.c f2851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private K5.c f2852f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private K5.c f2853g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private K5.c f2854h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private f f2855i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f f2856j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private f f2857k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private f f2858l;

        public b() {
            this.f2847a = h.b();
            this.f2848b = h.b();
            this.f2849c = h.b();
            this.f2850d = h.b();
            this.f2851e = new K5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f2852f = new K5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f2853g = new K5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f2854h = new K5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f2855i = h.c();
            this.f2856j = h.c();
            this.f2857k = h.c();
            this.f2858l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f2833a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f2781a;
            }
            return -1.0f;
        }

        public b A(d dVar) {
            this.f2847a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                B(fN);
            }
            return this;
        }

        public b B(float f10) {
            this.f2851e = new K5.a(f10);
            return this;
        }

        public b C(K5.c cVar) {
            this.f2851e = cVar;
            return this;
        }

        public b D(int i10, float f10) {
            return F(h.a(i10)).G(f10);
        }

        public b E(int i10, K5.c cVar) {
            return F(h.a(i10)).H(cVar);
        }

        public b F(d dVar) {
            this.f2848b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                G(fN);
            }
            return this;
        }

        public b G(float f10) {
            this.f2852f = new K5.a(f10);
            return this;
        }

        public b H(K5.c cVar) {
            this.f2852f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f10) {
            return B(f10).G(f10).w(f10).s(f10);
        }

        public b p(K5.c cVar) {
            return C(cVar).H(cVar).x(cVar).t(cVar);
        }

        public b q(int i10, K5.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        public b r(d dVar) {
            this.f2850d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f10) {
            this.f2854h = new K5.a(f10);
            return this;
        }

        public b t(K5.c cVar) {
            this.f2854h = cVar;
            return this;
        }

        public b u(int i10, K5.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        public b v(d dVar) {
            this.f2849c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f10) {
            this.f2853g = new K5.a(f10);
            return this;
        }

        public b x(K5.c cVar) {
            this.f2853g = cVar;
            return this;
        }

        public b y(int i10, float f10) {
            return A(h.a(i10)).B(f10);
        }

        public b z(int i10, K5.c cVar) {
            return A(h.a(i10)).C(cVar);
        }

        public b(k kVar) {
            this.f2847a = h.b();
            this.f2848b = h.b();
            this.f2849c = h.b();
            this.f2850d = h.b();
            this.f2851e = new K5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f2852f = new K5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f2853g = new K5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f2854h = new K5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f2855i = h.c();
            this.f2856j = h.c();
            this.f2857k = h.c();
            this.f2858l = h.c();
            this.f2847a = kVar.f2835a;
            this.f2848b = kVar.f2836b;
            this.f2849c = kVar.f2837c;
            this.f2850d = kVar.f2838d;
            this.f2851e = kVar.f2839e;
            this.f2852f = kVar.f2840f;
            this.f2853g = kVar.f2841g;
            this.f2854h = kVar.f2842h;
            this.f2855i = kVar.f2843i;
            this.f2856j = kVar.f2844j;
            this.f2857k = kVar.f2845k;
            this.f2858l = kVar.f2846l;
        }
    }

    public k() {
        this.f2835a = h.b();
        this.f2836b = h.b();
        this.f2837c = h.b();
        this.f2838d = h.b();
        this.f2839e = new K5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f2840f = new K5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f2841g = new K5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f2842h = new K5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f2843i = h.c();
        this.f2844j = h.c();
        this.f2845k = h.c();
        this.f2846l = h.c();
    }
}

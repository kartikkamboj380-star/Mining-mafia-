package com.google.android.material.internal;

import O.AbstractC0845c0;
import O.C0;
import O.J;
import O.d1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    class a implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f39328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f39329b;

        a(c cVar, d dVar) {
            this.f39328a = cVar;
            this.f39329b = dVar;
        }

        @Override // O.J
        public C0 a(View view, C0 c10) {
            return this.f39328a.a(view, c10, new d(this.f39329b));
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            AbstractC0845c0.j0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        C0 a(View view, C0 c10, d dVar);
    }

    public static void b(View view, c cVar) {
        AbstractC0845c0.A0(view, new a(cVar, new d(AbstractC0845c0.E(view), view.getPaddingTop(), AbstractC0845c0.D(view), view.getPaddingBottom())));
        i(view);
    }

    public static float c(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList colorStateListF = B5.d.f(view.getBackground());
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) C.b.i(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float fU = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fU += AbstractC0845c0.u((View) parent);
        }
        return fU;
    }

    public static boolean g(View view) {
        return AbstractC0845c0.z(view) == 1;
    }

    public static PorterDuff.Mode h(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void i(View view) {
        if (AbstractC0845c0.Q(view)) {
            AbstractC0845c0.j0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void j(final View view, final boolean z9) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.o
            @Override // java.lang.Runnable
            public final void run() {
                p.k(view, z9);
            }
        });
    }

    public static void k(View view, boolean z9) {
        d1 d1VarJ;
        if (!z9 || (d1VarJ = AbstractC0845c0.J(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            d1VarJ.f(C0.l.b());
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f39332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f39333d;

        public d(int i10, int i11, int i12, int i13) {
            this.f39330a = i10;
            this.f39331b = i11;
            this.f39332c = i12;
            this.f39333d = i13;
        }

        public void a(View view) {
            AbstractC0845c0.B0(view, this.f39330a, this.f39331b, this.f39332c, this.f39333d);
        }

        public d(d dVar) {
            this.f39330a = dVar.f39330a;
            this.f39331b = dVar.f39331b;
            this.f39332c = dVar.f39332c;
            this.f39333d = dVar.f39333d;
        }
    }
}

package p203u2;

import V2.b;
import Z1.a;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.unity3d.services.UnityAdsConstants;
import p193t2.InterfaceC7131c;
import p193t2.g;
import p193t2.i;
import p193t2.j;
import p193t2.k;
import p193t2.l;
import p193t2.n;
import p193t2.o;
import p193t2.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Drawable f49833a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, d dVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            j jVar = new j(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), dVar.i());
            b(jVar, dVar);
            return jVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            n nVar = new n((NinePatchDrawable) drawable);
            b(nVar, dVar);
            return nVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            a.K("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        k kVarA = k.a((ColorDrawable) drawable);
        b(kVarA, dVar);
        return kVarA;
    }

    static void b(i iVar, d dVar) {
        iVar.d(dVar.j());
        iVar.t(dVar.d());
        iVar.b(dVar.b(), dVar.c());
        iVar.i(dVar.g());
        iVar.o(dVar.l());
        iVar.n(dVar.h());
        iVar.k(dVar.i());
    }

    static InterfaceC7131c c(InterfaceC7131c interfaceC7131c) {
        while (true) {
            Object objS = interfaceC7131c.s();
            if (objS == interfaceC7131c || !(objS instanceof InterfaceC7131c)) {
                break;
            }
            interfaceC7131c = (InterfaceC7131c) objS;
        }
        return interfaceC7131c;
    }

    static Drawable d(Drawable drawable, d dVar, Resources resources) {
        try {
            if (b.d()) {
                b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && dVar != null && dVar.k() == d.a.BITMAP_ONLY) {
                if (!(drawable instanceof g)) {
                    return a(drawable, dVar, resources);
                }
                InterfaceC7131c interfaceC7131cC = c((g) drawable);
                interfaceC7131cC.h(a(interfaceC7131cC.h(f49833a), dVar, resources));
                return drawable;
            }
            return drawable;
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    static Drawable e(Drawable drawable, d dVar) {
        try {
            if (b.d()) {
                b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && dVar != null && dVar.k() == d.a.OVERLAY_COLOR) {
                l lVar = new l(drawable);
                b(lVar, dVar);
                lVar.y(dVar.f());
                return lVar;
            }
            return drawable;
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    static Drawable f(Drawable drawable, q qVar) {
        return g(drawable, qVar, null);
    }

    static Drawable g(Drawable drawable, q qVar, PointF pointF) {
        if (b.d()) {
            b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || qVar == null) {
            if (b.d()) {
                b.b();
            }
            return drawable;
        }
        o oVar = new o(drawable, qVar);
        if (pointF != null) {
            oVar.B(pointF);
        }
        if (b.d()) {
            b.b();
        }
        return oVar;
    }

    static void h(i iVar) {
        iVar.d(false);
        iVar.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        iVar.b(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        iVar.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        iVar.o(false);
        iVar.n(false);
        iVar.k(j.m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void i(InterfaceC7131c interfaceC7131c, d dVar, Resources resources) {
        InterfaceC7131c interfaceC7131cC = c(interfaceC7131c);
        Drawable drawableS = interfaceC7131cC.s();
        if (dVar == null || dVar.k() != d.a.BITMAP_ONLY) {
            if (drawableS instanceof i) {
                h((i) drawableS);
            }
        } else if (drawableS instanceof i) {
            b((i) drawableS, dVar);
        } else if (drawableS != 0) {
            interfaceC7131cC.h(f49833a);
            interfaceC7131cC.h(a(drawableS, dVar, resources));
        }
    }

    static void j(InterfaceC7131c interfaceC7131c, d dVar) {
        Drawable drawableS = interfaceC7131c.s();
        if (dVar == null || dVar.k() != d.a.OVERLAY_COLOR) {
            if (drawableS instanceof l) {
                Drawable drawable = f49833a;
                interfaceC7131c.h(((l) drawableS).v(drawable));
                drawable.setCallback(null);
                return;
            }
            return;
        }
        if (!(drawableS instanceof l)) {
            interfaceC7131c.h(e(interfaceC7131c.h(f49833a), dVar));
            return;
        }
        l lVar = (l) drawableS;
        b(lVar, dVar);
        lVar.y(dVar.f());
    }

    static o k(InterfaceC7131c interfaceC7131c, q qVar) {
        Drawable drawableF = f(interfaceC7131c.h(f49833a), qVar);
        interfaceC7131c.h(drawableF);
        Y1.k.h(drawableF, "Parent has no child drawable!");
        return (o) drawableF;
    }
}

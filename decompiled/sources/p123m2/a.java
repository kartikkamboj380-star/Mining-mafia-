package p123m2;

import O2.d;
import O2.e;
import V2.b;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p193t2.h;

/* JADX INFO: loaded from: classes.dex */
public class a implements N2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f46358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N2.a f46359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N2.a f46360c;

    public a(Resources resources, N2.a aVar, N2.a aVar2) {
        this.f46358a = resources;
        this.f46359b = aVar;
        this.f46360c = aVar2;
    }

    private static boolean c(e eVar) {
        return (eVar.n0() == 1 || eVar.n0() == 0) ? false : true;
    }

    private static boolean d(e eVar) {
        return (eVar.y0() == 0 || eVar.y0() == -1) ? false : true;
    }

    @Override // N2.a
    public boolean a(d dVar) {
        return true;
    }

    @Override // N2.a
    public Drawable b(d dVar) {
        try {
            if (b.d()) {
                b.a("DefaultDrawableFactory#createDrawable");
            }
            if (dVar instanceof e) {
                e eVar = (e) dVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f46358a, eVar.Q0());
                if (!d(eVar) && !c(eVar)) {
                    if (b.d()) {
                        b.b();
                    }
                    return bitmapDrawable;
                }
                h hVar = new h(bitmapDrawable, eVar.y0(), eVar.n0());
                if (b.d()) {
                    b.b();
                }
                return hVar;
            }
            N2.a aVar = this.f46359b;
            if (aVar != null && aVar.a(dVar)) {
                Drawable drawableB = this.f46359b.b(dVar);
                if (b.d()) {
                    b.b();
                }
                return drawableB;
            }
            N2.a aVar2 = this.f46360c;
            if (aVar2 == null || !aVar2.a(dVar)) {
                if (b.d()) {
                    b.b();
                }
                return null;
            }
            Drawable drawableB2 = this.f46360c.b(dVar);
            if (b.d()) {
                b.b();
            }
            return drawableB2;
        } catch (Throwable th) {
            if (b.d()) {
                b.b();
            }
            throw th;
        }
    }
}

package F;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p190t.j f660b;

    public static class a extends L.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private E.h.e f661a;

        public a(E.h.e eVar) {
            this.f661a = eVar;
        }

        @Override // L.g.c
        public void a(int i10) {
            E.h.e eVar = this.f661a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // L.g.c
        public void b(Typeface typeface) {
            E.h.e eVar = this.f661a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f659a = new j();
        } else if (i10 >= 28) {
            f659a = new i();
        } else if (i10 >= 26) {
            f659a = new h();
        } else if (g.j()) {
            f659a = new g();
        } else {
            f659a = new f();
        }
        f660b = new p190t.j(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, L.g.b[] bVarArr, int i10) {
        return f659a.b(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, E.e.b bVar, Resources resources, int i10, String str, int i11, int i12, E.h.e eVar, Handler handler, boolean z9) {
        Typeface typefaceA;
        if (bVar instanceof E.e.C0019e) {
            E.e.C0019e c0019e = (E.e.C0019e) bVar;
            Typeface typefaceG = g(c0019e.c());
            if (typefaceG != null) {
                if (eVar != null) {
                    eVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            typefaceA = L.g.c(context, c0019e.b(), i12, !z9 ? eVar != null : c0019e.a() != 0, z9 ? c0019e.d() : -1, E.h.e.e(handler), new a(eVar));
        } else {
            typefaceA = f659a.a(context, (E.e.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f660b.d(e(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceD = f659a.d(context, resources, i10, str, i12);
        if (typefaceD != null) {
            f660b.d(e(resources, i10, str, i11, i12), typefaceD);
        }
        return typefaceD;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f660b.c(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }
}

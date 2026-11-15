package p203u2;

import V2.b;
import Y1.k;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import p193t2.C7134f;
import p193t2.InterfaceC7131c;
import p193t2.g;
import p193t2.o;
import p193t2.q;
import p223w2.c;

/* JADX INFO: loaded from: classes.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f49791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f49792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f49793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f49794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C7134f f49795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f49796f;

    a(b bVar) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f49791a = colorDrawable;
        if (b.d()) {
            b.a("GenericDraweeHierarchy()");
        }
        this.f49792b = bVar.o();
        this.f49793c = bVar.r();
        g gVar = new g(colorDrawable);
        this.f49796f = gVar;
        int i10 = 1;
        int size = bVar.i() != null ? bVar.i().size() : 1;
        int i11 = (size == 0 ? 1 : size) + (bVar.l() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i11 + 6];
        drawableArr[0] = h(bVar.e(), null);
        drawableArr[1] = h(bVar.j(), bVar.k());
        drawableArr[2] = g(gVar, bVar.d(), bVar.c(), bVar.b());
        drawableArr[3] = h(bVar.m(), bVar.n());
        drawableArr[4] = h(bVar.p(), bVar.q());
        drawableArr[5] = h(bVar.g(), bVar.h());
        if (i11 > 0) {
            if (bVar.i() != null) {
                Iterator it = bVar.i().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    drawableArr[i10 + 6] = h((Drawable) it.next(), null);
                    i10++;
                }
            }
            if (bVar.l() != null) {
                drawableArr[i10 + 6] = h(bVar.l(), null);
            }
        }
        C7134f c7134f = new C7134f(drawableArr, false, 2);
        this.f49795e = c7134f;
        c7134f.u(bVar.f());
        c cVar = new c(e.e(c7134f, this.f49793c));
        this.f49794d = cVar;
        cVar.mutate();
        s();
        if (b.d()) {
            b.b();
        }
    }

    private Drawable g(Drawable drawable, q qVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return e.g(drawable, qVar, pointF);
    }

    private Drawable h(Drawable drawable, q qVar) {
        return e.f(e.d(drawable, this.f49793c, this.f49792b), qVar);
    }

    private void i(int i10) {
        if (i10 >= 0) {
            this.f49795e.l(i10);
        }
    }

    private void j() {
        k(1);
        k(2);
        k(3);
        k(4);
        k(5);
    }

    private void k(int i10) {
        if (i10 >= 0) {
            this.f49795e.m(i10);
        }
    }

    private InterfaceC7131c n(int i10) {
        InterfaceC7131c interfaceC7131cD = this.f49795e.d(i10);
        interfaceC7131cD.s();
        return interfaceC7131cD.s() instanceof o ? (o) interfaceC7131cD.s() : interfaceC7131cD;
    }

    private o p(int i10) {
        InterfaceC7131c interfaceC7131cN = n(i10);
        return interfaceC7131cN instanceof o ? (o) interfaceC7131cN : e.k(interfaceC7131cN, q.f49648a);
    }

    private boolean q(int i10) {
        return n(i10) instanceof o;
    }

    private void r() {
        this.f49796f.h(this.f49791a);
    }

    private void s() {
        C7134f c7134f = this.f49795e;
        if (c7134f != null) {
            c7134f.h();
            this.f49795e.k();
            j();
            i(1);
            this.f49795e.n();
            this.f49795e.j();
        }
    }

    private void u(int i10, Drawable drawable) {
        if (drawable == null) {
            this.f49795e.g(i10, null);
        } else {
            n(i10).h(e.d(drawable, this.f49793c, this.f49792b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x(float f10) {
        Drawable drawableB = this.f49795e.b(3);
        if (drawableB == 0) {
            return;
        }
        if (f10 >= 0.999f) {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).stop();
            }
            k(3);
        } else {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).start();
            }
            i(3);
        }
        drawableB.setLevel(Math.round(f10 * 10000.0f));
    }

    @Override // p223w2.c
    public void a(Throwable th) {
        this.f49795e.h();
        j();
        if (this.f49795e.b(4) != null) {
            i(4);
        } else {
            i(1);
        }
        this.f49795e.j();
    }

    @Override // p223w2.c
    public void b(Throwable th) {
        this.f49795e.h();
        j();
        if (this.f49795e.b(5) != null) {
            i(5);
        } else {
            i(1);
        }
        this.f49795e.j();
    }

    @Override // p223w2.c
    public void c(float f10, boolean z9) {
        if (this.f49795e.b(3) == null) {
            return;
        }
        this.f49795e.h();
        x(f10);
        if (z9) {
            this.f49795e.n();
        }
        this.f49795e.j();
    }

    @Override // p223w2.b
    public Drawable d() {
        return this.f49794d;
    }

    @Override // p223w2.c
    public void e(Drawable drawable, float f10, boolean z9) {
        Drawable drawableD = e.d(drawable, this.f49793c, this.f49792b);
        drawableD.mutate();
        this.f49796f.h(drawableD);
        this.f49795e.h();
        j();
        i(2);
        x(f10);
        if (z9) {
            this.f49795e.n();
        }
        this.f49795e.j();
    }

    @Override // p223w2.c
    public void f(Drawable drawable) {
        this.f49794d.x(drawable);
    }

    @Override // p223w2.b
    public Rect getBounds() {
        return this.f49794d.getBounds();
    }

    public PointF l() {
        if (q(2)) {
            return p(2).z();
        }
        return null;
    }

    public q m() {
        if (q(2)) {
            return p(2).A();
        }
        return null;
    }

    public d o() {
        return this.f49793c;
    }

    @Override // p223w2.c
    public void reset() {
        r();
        s();
    }

    public void t(q qVar) {
        k.g(qVar);
        p(2).C(qVar);
    }

    public void v(int i10) {
        this.f49795e.u(i10);
    }

    public void w(Drawable drawable, q qVar) {
        u(1, drawable);
        p(1).C(qVar);
    }

    public void y(Drawable drawable) {
        u(3, drawable);
    }

    public void z(d dVar) {
        this.f49793c = dVar;
        e.j(this.f49794d, dVar);
        for (int i10 = 0; i10 < this.f49795e.f(); i10++) {
            e.i(n(i10), this.f49793c, this.f49792b);
        }
    }
}

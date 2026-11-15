package p233x2;

import Y1.i;
import Y1.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import p153p2.c;
import p193t2.E;
import p193t2.F;
import p223w2.a;

/* JADX INFO: loaded from: classes.dex */
public class b implements F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p223w2.b f50520d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50517a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50518b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50519c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f50521e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f50522f = c.a();

    public b(p223w2.b bVar) {
        if (bVar != null) {
            p(bVar);
        }
    }

    private void a() {
        if (this.f50517a) {
            return;
        }
        this.f50522f.b(c.a.ON_ATTACH_CONTROLLER);
        this.f50517a = true;
        a aVar = this.f50521e;
        if (aVar == null || aVar.e() == null) {
            return;
        }
        this.f50521e.c();
    }

    private void b() {
        if (this.f50518b && this.f50519c) {
            a();
        } else {
            d();
        }
    }

    public static b c(p223w2.b bVar, Context context) {
        b bVar2 = new b(bVar);
        bVar2.l(context);
        return bVar2;
    }

    private void d() {
        if (this.f50517a) {
            this.f50522f.b(c.a.ON_DETACH_CONTROLLER);
            this.f50517a = false;
            if (h()) {
                this.f50521e.d();
            }
        }
    }

    private void q(F f10) {
        Object objG = g();
        if (objG instanceof E) {
            ((E) objG).l(f10);
        }
    }

    public a e() {
        return this.f50521e;
    }

    public p223w2.b f() {
        return (p223w2.b) k.g(this.f50520d);
    }

    public Drawable g() {
        p223w2.b bVar = this.f50520d;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public boolean h() {
        a aVar = this.f50521e;
        return aVar != null && aVar.e() == this.f50520d;
    }

    public void i() {
        this.f50522f.b(c.a.ON_HOLDER_ATTACH);
        this.f50518b = true;
        b();
    }

    public void j() {
        this.f50522f.b(c.a.ON_HOLDER_DETACH);
        this.f50518b = false;
        b();
    }

    public boolean k(MotionEvent motionEvent) {
        if (h()) {
            return this.f50521e.f(motionEvent);
        }
        return false;
    }

    public void m() {
        o(null);
    }

    @Override // p193t2.F
    public void n(boolean z9) {
        if (this.f50519c == z9) {
            return;
        }
        this.f50522f.b(z9 ? c.a.ON_DRAWABLE_SHOW : c.a.ON_DRAWABLE_HIDE);
        this.f50519c = z9;
        b();
    }

    public void o(a aVar) {
        boolean z9 = this.f50517a;
        if (z9) {
            d();
        }
        if (h()) {
            this.f50522f.b(c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f50521e.a(null);
        }
        this.f50521e = aVar;
        if (aVar != null) {
            this.f50522f.b(c.a.ON_SET_CONTROLLER);
            this.f50521e.a(this.f50520d);
        } else {
            this.f50522f.b(c.a.ON_CLEAR_CONTROLLER);
        }
        if (z9) {
            a();
        }
    }

    @Override // p193t2.F
    public void onDraw() {
        if (this.f50517a) {
            return;
        }
        Z1.a.G(c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f50521e)), toString());
        this.f50518b = true;
        this.f50519c = true;
        b();
    }

    public void p(p223w2.b bVar) {
        this.f50522f.b(c.a.ON_SET_HIERARCHY);
        boolean zH = h();
        q(null);
        p223w2.b bVar2 = (p223w2.b) k.g(bVar);
        this.f50520d = bVar2;
        Drawable drawableD = bVar2.d();
        n(drawableD == null || drawableD.isVisible());
        q(this);
        if (zH) {
            this.f50521e.a(bVar);
        }
    }

    public String toString() {
        return i.b(this).c("controllerAttached", this.f50517a).c("holderAttached", this.f50518b).c("drawableVisible", this.f50519c).b("events", this.f50522f.toString()).toString();
    }

    public void l(Context context) {
    }
}

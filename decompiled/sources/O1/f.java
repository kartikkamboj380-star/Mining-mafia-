package O1;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b.r f4026a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f4027b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f4028c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g.C0892b f4029d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f4030e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    g.C0892b f4031f = null;

    public f a(String str) {
        this.f4026a = new b(b.u.RenderOptions).d(str);
        return this;
    }

    public boolean b() {
        b.r rVar = this.f4026a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean c() {
        return this.f4027b != null;
    }

    public boolean d() {
        return this.f4028c != null;
    }

    public boolean e() {
        return this.f4030e != null;
    }

    public boolean f() {
        return this.f4029d != null;
    }

    public boolean g() {
        return this.f4031f != null;
    }

    public f h(float f10, float f11, float f12, float f13) {
        this.f4031f = new g.C0892b(f10, f11, f12, f13);
        return this;
    }
}

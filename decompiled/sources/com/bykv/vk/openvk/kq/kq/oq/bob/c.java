package com.bykv.vk.openvk.kq.kq.oq.bob;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.b f13380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.e f13381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a.d f13382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a.f f13383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a.g f13384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a.InterfaceC0216a f13385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a.c f13386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f13387h = false;

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public final void a(a.d dVar) {
        this.f13382c = dVar;
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public final void b(a.b bVar) {
        this.f13380a = bVar;
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public final void d(a.InterfaceC0216a interfaceC0216a) {
        this.f13385f = interfaceC0216a;
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public final void f(a.g gVar) {
        this.f13384e = gVar;
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public final void g(a.c cVar) {
        this.f13386g = cVar;
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public final void h(a.f fVar) {
        this.f13383d = fVar;
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public final void j(a.e eVar) {
        this.f13381b = eVar;
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void kq(boolean z9) {
        this.f13387h = z9;
    }

    protected final void l() {
        try {
            a.e eVar = this.f13381b;
            if (eVar != null) {
                eVar.kq(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void m() {
        try {
            a.f fVar = this.f13383d;
            if (fVar != null) {
                fVar.bob(this);
            }
        } catch (Throwable unused) {
        }
    }

    public void n() {
        this.f13380a = null;
        this.f13382c = null;
        this.f13381b = null;
        this.f13383d = null;
        this.f13384e = null;
        this.f13385f = null;
        this.f13386g = null;
    }

    protected final void o(int i10) {
        try {
            a.d dVar = this.f13382c;
            if (dVar != null) {
                dVar.kq(this, i10);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void p(int i10, int i11, int i12, int i13) {
        try {
            a.g gVar = this.f13384e;
            if (gVar != null) {
                gVar.kq(this, i10, i11, i12, i13);
            }
        } catch (Throwable unused) {
        }
    }

    protected final boolean q(int i10, int i11) {
        try {
            a.InterfaceC0216a interfaceC0216a = this.f13385f;
            return interfaceC0216a != null && interfaceC0216a.kq(this, i10, i11);
        } catch (Throwable unused) {
        }
    }

    protected final void r() {
        try {
            a.b bVar = this.f13380a;
            if (bVar != null) {
                bVar.oq(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final boolean s(int i10, int i11) {
        try {
            a.c cVar = this.f13386g;
            return cVar != null && cVar.oq(this, i10, i11);
        } catch (Throwable unused) {
        }
    }
}

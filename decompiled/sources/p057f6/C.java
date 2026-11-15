package p057f6;

import G6.a;
import G6.b;

/* JADX INFO: loaded from: classes2.dex */
class C implements b, a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC0026a f43661c = new a.InterfaceC0026a() { // from class: f6.z
        @Override // G6.a.InterfaceC0026a
        public final void a(b bVar) {
            C.d(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f43662d = new b() { // from class: f6.A
        @Override // G6.b
        public final Object get() {
            return C.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.InterfaceC0026a f43663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f43664b;

    private C(a.InterfaceC0026a interfaceC0026a, b bVar) {
        this.f43663a = interfaceC0026a;
        this.f43664b = bVar;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(a.InterfaceC0026a interfaceC0026a, a.InterfaceC0026a interfaceC0026a2, b bVar) {
        interfaceC0026a.a(bVar);
        interfaceC0026a2.a(bVar);
    }

    public static /* synthetic */ void d(b bVar) {
    }

    static C e() {
        return new C(f43661c, f43662d);
    }

    static C f(b bVar) {
        return new C(null, bVar);
    }

    @Override // G6.a
    public void a(final a.InterfaceC0026a interfaceC0026a) {
        b bVar;
        b bVar2;
        b bVar3 = this.f43664b;
        b bVar4 = f43662d;
        if (bVar3 != bVar4) {
            interfaceC0026a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f43664b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0026a interfaceC0026a2 = this.f43663a;
                this.f43663a = new a.InterfaceC0026a() { // from class: f6.B
                    @Override // G6.a.InterfaceC0026a
                    public final void a(b bVar5) {
                        C.c(interfaceC0026a2, interfaceC0026a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0026a.a(bVar);
        }
    }

    void g(b bVar) {
        a.InterfaceC0026a interfaceC0026a;
        if (this.f43664b != f43662d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0026a = this.f43663a;
            this.f43663a = null;
            this.f43664b = bVar;
        }
        interfaceC0026a.a(bVar);
    }

    @Override // G6.b
    public Object get() {
        return this.f43664b.get();
    }
}

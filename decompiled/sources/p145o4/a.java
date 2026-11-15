package p145o4;

import p070h.w;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements A6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A6.a f47179a = new a();

    /* JADX INFO: renamed from: o4.a$a, reason: collision with other inner class name */
    private static final class C0489a implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0489a f47180a = new C0489a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p257z6.c f47181b = p257z6.c.a("window").b(C6.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final p257z6.c f47182c = p257z6.c.a("logSourceMetrics").b(C6.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final p257z6.c f47183d = p257z6.c.a("globalMetrics").b(C6.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final p257z6.c f47184e = p257z6.c.a("appNamespace").b(C6.a.b().c(4).a()).a();

        private C0489a() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p175r4.a aVar, p257z6.e eVar) {
            eVar.b(f47181b, aVar.d());
            eVar.b(f47182c, aVar.c());
            eVar.b(f47183d, aVar.b());
            eVar.b(f47184e, aVar.a());
        }
    }

    private static final class b implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f47185a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p257z6.c f47186b = p257z6.c.a("storageMetrics").b(C6.a.b().c(1).a()).a();

        private b() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p175r4.b bVar, p257z6.e eVar) {
            eVar.b(f47186b, bVar.a());
        }
    }

    private static final class c implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f47187a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p257z6.c f47188b = p257z6.c.a("eventsDroppedCount").b(C6.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final p257z6.c f47189c = p257z6.c.a("reason").b(C6.a.b().c(3).a()).a();

        private c() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p175r4.c cVar, p257z6.e eVar) {
            eVar.e(f47188b, cVar.a());
            eVar.b(f47189c, cVar.b());
        }
    }

    private static final class d implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f47190a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p257z6.c f47191b = p257z6.c.a("logSource").b(C6.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final p257z6.c f47192c = p257z6.c.a("logEventDropped").b(C6.a.b().c(2).a()).a();

        private d() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p175r4.d dVar, p257z6.e eVar) {
            eVar.b(f47191b, dVar.b());
            eVar.b(f47192c, dVar.a());
        }
    }

    private static final class e implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f47193a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p257z6.c f47194b = p257z6.c.d("clientMetrics");

        private e() {
        }

        @Override // p257z6.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            w.a(obj);
            b(null, (p257z6.e) obj2);
        }

        public void b(m mVar, p257z6.e eVar) {
            throw null;
        }
    }

    private static final class f implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f47195a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p257z6.c f47196b = p257z6.c.a("currentCacheSizeBytes").b(C6.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final p257z6.c f47197c = p257z6.c.a("maxCacheSizeBytes").b(C6.a.b().c(2).a()).a();

        private f() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p175r4.e eVar, p257z6.e eVar2) {
            eVar2.e(f47196b, eVar.a());
            eVar2.e(f47197c, eVar.b());
        }
    }

    private static final class g implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f47198a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p257z6.c f47199b = p257z6.c.a("startMs").b(C6.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final p257z6.c f47200c = p257z6.c.a("endMs").b(C6.a.b().c(2).a()).a();

        private g() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p175r4.f fVar, p257z6.e eVar) {
            eVar.e(f47199b, fVar.b());
            eVar.e(f47200c, fVar.a());
        }
    }

    private a() {
    }

    @Override // A6.a
    public void a(A6.b bVar) {
        bVar.a(m.class, e.f47193a);
        bVar.a(p175r4.a.class, C0489a.f47180a);
        bVar.a(p175r4.f.class, g.f47198a);
        bVar.a(p175r4.d.class, d.f47190a);
        bVar.a(p175r4.c.class, c.f47187a);
        bVar.a(p175r4.b.class, b.f47185a);
        bVar.a(p175r4.e.class, f.f47195a);
    }
}

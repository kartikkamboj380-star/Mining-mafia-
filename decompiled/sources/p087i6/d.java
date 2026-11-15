package p087i6;

import G6.b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p147o6.F;
import p147o6.G;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p087i6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f45081c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G6.a f45082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f45083b = new AtomicReference(null);

    private static final class b implements h {
        private b() {
        }

        @Override // p087i6.h
        public File a() {
            return null;
        }

        @Override // p087i6.h
        public F.a b() {
            return null;
        }

        @Override // p087i6.h
        public File c() {
            return null;
        }

        @Override // p087i6.h
        public File d() {
            return null;
        }

        @Override // p087i6.h
        public File e() {
            return null;
        }

        @Override // p087i6.h
        public File f() {
            return null;
        }

        @Override // p087i6.h
        public File g() {
            return null;
        }
    }

    public d(G6.a aVar) {
        this.f45082a = aVar;
        aVar.a(new G6.a.InterfaceC0026a() { // from class: i6.b
            @Override // G6.a.InterfaceC0026a
            public final void a(G6.b bVar) {
                d.f(this.f45076a, bVar);
            }
        });
    }

    public static /* synthetic */ void f(d dVar, G6.b bVar) {
        dVar.getClass();
        g.f().b("Crashlytics native component now available.");
        dVar.f45083b.set((p087i6.a) bVar.get());
    }

    @Override // p087i6.a
    public h a(String str) {
        p087i6.a aVar = (p087i6.a) this.f45083b.get();
        return aVar == null ? f45081c : aVar.a(str);
    }

    @Override // p087i6.a
    public boolean b() {
        p087i6.a aVar = (p087i6.a) this.f45083b.get();
        return aVar != null && aVar.b();
    }

    @Override // p087i6.a
    public boolean c(String str) {
        p087i6.a aVar = (p087i6.a) this.f45083b.get();
        return aVar != null && aVar.c(str);
    }

    @Override // p087i6.a
    public void d(final String str, final String str2, final long j10, final G g10) {
        g.f().i("Deferring native open session: " + str);
        this.f45082a.a(new G6.a.InterfaceC0026a() { // from class: i6.c
            @Override // G6.a.InterfaceC0026a
            public final void a(b bVar) {
                ((a) bVar.get()).d(str, str2, j10, g10);
            }
        });
    }
}

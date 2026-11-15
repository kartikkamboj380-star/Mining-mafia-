package p082i1;

import java.util.Map;
import p012b1.n;
import p192t1.t;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f45018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f45019b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f45020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f45021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f45022c;

        public a(n nVar, Map map, long j10) {
            this.f45020a = nVar;
            this.f45021b = map;
            this.f45022c = j10;
        }

        public final Map a() {
            return this.f45021b;
        }

        public final n b() {
            return this.f45020a;
        }

        public final long c() {
            return this.f45022c;
        }
    }

    public static final class b extends t {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f45023d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, h hVar) {
            super(j10);
            this.f45023d = hVar;
        }

        @Override // p192t1.t
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void b(d.b bVar, a aVar, a aVar2) {
            this.f45023d.f45018a.e(bVar, aVar.b(), aVar.a(), aVar.c());
        }

        @Override // p192t1.t
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public long j(d.b bVar, a aVar) {
            return aVar.c();
        }
    }

    public h(long j10, k kVar) {
        this.f45018a = kVar;
        this.f45019b = new b(j10, this);
    }

    @Override // p082i1.j
    public long a() {
        return this.f45019b.e();
    }

    @Override // p082i1.j
    public d.c b(d.b bVar) {
        a aVar = (a) this.f45019b.c(bVar);
        if (aVar != null) {
            return new d.c(aVar.b(), aVar.a());
        }
        return null;
    }

    @Override // p082i1.j
    public boolean c(d.b bVar) {
        return this.f45019b.h(bVar) != null;
    }

    @Override // p082i1.j
    public void clear() {
        this.f45019b.a();
    }

    @Override // p082i1.j
    public void d(long j10) {
        this.f45019b.k(j10);
    }

    @Override // p082i1.j
    public void e(d.b bVar, n nVar, Map map, long j10) {
        if (j10 <= g()) {
            this.f45019b.f(bVar, new a(nVar, map, j10));
        } else {
            this.f45019b.h(bVar);
            this.f45018a.e(bVar, nVar, map, j10);
        }
    }

    public long g() {
        return this.f45019b.d();
    }
}

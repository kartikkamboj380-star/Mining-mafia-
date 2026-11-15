package W6;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final R6.a f6595d = R6.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G6.b f6597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p125m4.i f6598c;

    b(G6.b bVar, String str) {
        this.f6596a = str;
        this.f6597b = bVar;
    }

    private boolean a() {
        if (this.f6598c == null) {
            p125m4.j jVar = (p125m4.j) this.f6597b.get();
            if (jVar != null) {
                this.f6598c = jVar.a(this.f6596a, Y6.i.class, p125m4.c.b("proto"), new p125m4.h() { // from class: W6.a
                    @Override // p125m4.h
                    public final Object apply(Object obj) {
                        return ((Y6.i) obj).toByteArray();
                    }
                });
            } else {
                f6595d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f6598c != null;
    }

    public void b(Y6.i iVar) {
        if (a()) {
            this.f6598c.b(p125m4.d.f(iVar));
        } else {
            f6595d.j("Unable to dispatch event because Flg Transport is not available");
        }
    }
}

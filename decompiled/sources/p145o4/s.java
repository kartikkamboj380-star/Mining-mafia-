package p145o4;

import p125m4.c;
import p125m4.d;
import p125m4.h;
import p125m4.i;
import p125m4.k;

/* JADX INFO: loaded from: classes2.dex */
final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f47261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f47263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f47264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f47265e;

    s(p pVar, String str, c cVar, h hVar, t tVar) {
        this.f47261a = pVar;
        this.f47262b = str;
        this.f47263c = cVar;
        this.f47264d = hVar;
        this.f47265e = tVar;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // p125m4.i
    public void a(d dVar, k kVar) {
        this.f47265e.a(o.a().e(this.f47261a).c(dVar).f(this.f47262b).d(this.f47264d).b(this.f47263c).a(), kVar);
    }

    @Override // p125m4.i
    public void b(d dVar) {
        a(dVar, new k() { // from class: o4.r
            @Override // p125m4.k
            public final void a(Exception exc) {
                s.c(exc);
            }
        });
    }

    p d() {
        return this.f47261a;
    }
}

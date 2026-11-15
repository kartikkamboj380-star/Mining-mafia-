package p082i1;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f45015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f45016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f45017c = new Object();

    public g(j jVar, k kVar) {
        this.f45015a = jVar;
        this.f45016b = kVar;
    }

    @Override // p082i1.d
    public long a() {
        long jA;
        synchronized (this.f45017c) {
            jA = this.f45015a.a();
        }
        return jA;
    }

    @Override // p082i1.d
    public d.c b(d.b bVar) {
        d.c cVarB;
        synchronized (this.f45017c) {
            try {
                cVarB = this.f45015a.b(bVar);
                if (cVarB == null) {
                    cVarB = this.f45016b.b(bVar);
                }
                if (cVarB != null && !cVarB.b().b()) {
                    c(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarB;
    }

    public boolean c(d.b bVar) {
        boolean z9;
        synchronized (this.f45017c) {
            z9 = this.f45015a.c(bVar) || this.f45016b.c(bVar);
        }
        return z9;
    }

    @Override // p082i1.d
    public void clear() {
        synchronized (this.f45017c) {
            this.f45015a.clear();
            this.f45016b.clear();
            Unit unit = Unit.f45918a;
        }
    }

    @Override // p082i1.d
    public void d(long j10) {
        synchronized (this.f45017c) {
            this.f45015a.d(j10);
            Unit unit = Unit.f45918a;
        }
    }

    @Override // p082i1.d
    public void e(d.b bVar, d.c cVar) {
        synchronized (this.f45017c) {
            long jA = cVar.b().a();
            if (jA < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + jA).toString());
            }
            this.f45015a.e(bVar, cVar.b(), cVar.a(), jA);
            Unit unit = Unit.f45918a;
        }
    }
}

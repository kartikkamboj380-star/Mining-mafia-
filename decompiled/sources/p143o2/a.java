package p143o2;

import p053f2.b;
import p253z2.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends Q2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f47172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f47173b;

    public a(b bVar, j jVar) {
        this.f47172a = bVar;
        this.f47173b = jVar;
    }

    @Override // Q2.e
    public void b(U2.b bVar, Object obj, String str, boolean z9) {
        this.f47173b.K(this.f47172a.now());
        this.f47173b.I(bVar);
        this.f47173b.y(obj);
        this.f47173b.P(str);
        this.f47173b.O(z9);
    }

    @Override // Q2.e
    public void f(U2.b bVar, String str, boolean z9) {
        this.f47173b.J(this.f47172a.now());
        this.f47173b.I(bVar);
        this.f47173b.P(str);
        this.f47173b.O(z9);
    }

    @Override // Q2.e
    public void i(U2.b bVar, String str, Throwable th, boolean z9) {
        this.f47173b.J(this.f47172a.now());
        this.f47173b.I(bVar);
        this.f47173b.P(str);
        this.f47173b.O(z9);
    }

    @Override // Q2.e
    public void k(String str) {
        this.f47173b.J(this.f47172a.now());
        this.f47173b.P(str);
    }
}

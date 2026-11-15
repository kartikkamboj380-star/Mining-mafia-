package p117l6;

import p058f7.c;
import p177r6.g;

/* JADX INFO: renamed from: l6.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7052m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f46185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7051l f46186b;

    public C7052m(F f10, g gVar) {
        this.f46185a = f10;
        this.f46186b = new C7051l(gVar);
    }

    @Override // p058f7.c
    public boolean a() {
        return this.f46185a.d();
    }

    @Override // p058f7.c
    public void b(c.b bVar) {
        p087i6.g.f().b("App Quality Sessions session changed: " + bVar);
        this.f46186b.f(bVar.a());
    }

    @Override // p058f7.c
    public c.a c() {
        return c.a.CRASHLYTICS;
    }

    public String d(String str) {
        return this.f46186b.c(str);
    }

    public void e(String str) {
        this.f46186b.g(str);
    }
}

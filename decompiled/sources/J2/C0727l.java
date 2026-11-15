package J2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: J2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0727l implements InterfaceC0732q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0728m f2052a;

    public C0727l(InterfaceC0728m interfaceC0728m) {
        this.f2052a = interfaceC0728m;
    }

    private static T1.g b(T1.d dVar, T1.f fVar) {
        return c(dVar, fVar, Executors.newSingleThreadExecutor());
    }

    private static T1.g c(T1.d dVar, T1.f fVar, Executor executor) {
        return new T1.g(fVar, dVar.h(), new T1.g.c(dVar.k(), dVar.j(), dVar.f()), dVar.e(), dVar.d(), dVar.g(), executor, dVar.i());
    }

    @Override // J2.InterfaceC0732q
    public T1.k a(T1.d dVar) {
        return b(dVar, this.f2052a.a(dVar));
    }
}

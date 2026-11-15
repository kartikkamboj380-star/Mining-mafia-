package p215v4;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p155p4.e;
import p165q4.b;
import p225w4.InterfaceC7143c;
import p225w4.InterfaceC7144d;
import p245y4.a;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f50173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f50174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f50175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f50176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f50177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f50178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f50179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f50180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f50181i;

    public s(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f50173a = provider;
        this.f50174b = provider2;
        this.f50175c = provider3;
        this.f50176d = provider4;
        this.f50177e = provider5;
        this.f50178f = provider6;
        this.f50179g = provider7;
        this.f50180h = provider8;
        this.f50181i = provider9;
    }

    public static s a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new s(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static r c(Context context, e eVar, InterfaceC7144d interfaceC7144d, x xVar, Executor executor, p235x4.b bVar, a aVar, a aVar2, InterfaceC7143c interfaceC7143c) {
        return new r(context, eVar, interfaceC7144d, xVar, executor, bVar, aVar, aVar2, interfaceC7143c);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f50173a.get(), (e) this.f50174b.get(), (InterfaceC7144d) this.f50175c.get(), (x) this.f50176d.get(), (Executor) this.f50177e.get(), (p235x4.b) this.f50178f.get(), (a) this.f50179g.get(), (a) this.f50180h.get(), (InterfaceC7143c) this.f50181i.get());
    }
}

package p205u4;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import p155p4.e;
import p165q4.b;
import p215v4.x;
import p225w4.InterfaceC7144d;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f49916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f49917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f49918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f49919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f49920e;

    public d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f49916a = provider;
        this.f49917b = provider2;
        this.f49918c = provider3;
        this.f49919d = provider4;
        this.f49920e = provider5;
    }

    public static d a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new d(provider, provider2, provider3, provider4, provider5);
    }

    public static c c(Executor executor, e eVar, x xVar, InterfaceC7144d interfaceC7144d, p235x4.b bVar) {
        return new c(executor, eVar, xVar, interfaceC7144d, bVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f49916a.get(), (e) this.f49917b.get(), (x) this.f49918c.get(), (InterfaceC7144d) this.f49919d.get(), (p235x4.b) this.f49920e.get());
    }
}

package p225w4;

import javax.inject.Provider;
import p165q4.b;
import p245y4.a;

/* JADX INFO: loaded from: classes2.dex */
public final class N implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f50295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f50296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f50297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f50298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f50299e;

    public N(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f50295a = provider;
        this.f50296b = provider2;
        this.f50297c = provider3;
        this.f50298d = provider4;
        this.f50299e = provider5;
    }

    public static N a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new N(provider, provider2, provider3, provider4, provider5);
    }

    public static M c(a aVar, a aVar2, Object obj, Object obj2, Provider provider) {
        return new M(aVar, aVar2, (AbstractC7145e) obj, (W) obj2, provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((a) this.f50295a.get(), (a) this.f50296b.get(), this.f50297c.get(), this.f50298d.get(), this.f50299e);
    }
}

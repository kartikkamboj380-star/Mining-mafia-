package p078h7;

import H6.e;
import javax.inject.Provider;
import p048e7.C6956b;
import p048e7.Z;
import p068g7.b;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f44830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f44831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f44832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f44833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f44834e;

    public g(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f44830a = provider;
        this.f44831b = provider2;
        this.f44832c = provider3;
        this.f44833d = provider4;
        this.f44834e = provider5;
    }

    public static g a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new g(provider, provider2, provider3, provider4, provider5);
    }

    public static d c(Z z9, e eVar, C6956b c6956b, a aVar, l lVar) {
        return new d(z9, eVar, c6956b, aVar, lVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c((Z) this.f44830a.get(), (e) this.f44831b.get(), (C6956b) this.f44832c.get(), (a) this.f44833d.get(), (l) this.f44834e.get());
    }
}

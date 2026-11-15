package p078h7;

import javax.inject.Provider;
import p068g7.b;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f44850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f44851b;

    public k(Provider provider, Provider provider2) {
        this.f44850a = provider;
        this.f44851b = provider2;
    }

    public static k a(Provider provider, Provider provider2) {
        return new k(provider, provider2);
    }

    public static j c(o oVar, o oVar2) {
        return new j(oVar, oVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c((o) this.f44850a.get(), (o) this.f44851b.get());
    }
}

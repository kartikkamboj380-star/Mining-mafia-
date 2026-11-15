package p048e7;

import javax.inject.Provider;
import p068g7.b;

/* JADX INFO: loaded from: classes3.dex */
public final class Q implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f43353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f43354b;

    public Q(Provider provider, Provider provider2) {
        this.f43353a = provider;
        this.f43354b = provider2;
    }

    public static Q a(Provider provider, Provider provider2) {
        return new Q(provider, provider2);
    }

    public static P c(Z z9, b0 b0Var) {
        return new P(z9, b0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public P get() {
        return c((Z) this.f43353a.get(), (b0) this.f43354b.get());
    }
}

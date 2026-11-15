package p048e7;

import javax.inject.Provider;
import p068g7.b;

/* JADX INFO: loaded from: classes3.dex */
public final class I implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f43315a;

    public I(Provider provider) {
        this.f43315a = provider;
    }

    public static I a(Provider provider) {
        return new I(provider);
    }

    public static H c(P p10) {
        return new H(p10);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public H get() {
        return c((P) this.f43315a.get());
    }
}

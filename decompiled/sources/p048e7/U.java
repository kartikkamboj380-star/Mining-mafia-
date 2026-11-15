package p048e7;

import javax.inject.Provider;
import p068g7.b;

/* JADX INFO: loaded from: classes3.dex */
public final class U implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f43364a;

    public U(Provider provider) {
        this.f43364a = provider;
    }

    public static U a(Provider provider) {
        return new U(provider);
    }

    public static T c(V v10) {
        return new T(v10);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T get() {
        return c((V) this.f43364a.get());
    }
}

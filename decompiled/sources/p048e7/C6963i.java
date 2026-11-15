package p048e7;

import javax.inject.Provider;
import p068g7.b;

/* JADX INFO: renamed from: e7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6963i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f43483a;

    public C6963i(Provider provider) {
        this.f43483a = provider;
    }

    public static C6963i a(Provider provider) {
        return new C6963i(provider);
    }

    public static C6961g c(G6.b bVar) {
        return new C6961g(bVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6961g get() {
        return c((G6.b) this.f43483a.get());
    }
}

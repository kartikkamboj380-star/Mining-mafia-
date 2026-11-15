package p205u4;

import javax.inject.Provider;
import p165q4.b;
import p165q4.d;
import p215v4.f;
import p245y4.a;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f49921a;

    public g(Provider provider) {
        this.f49921a = provider;
    }

    public static f a(a aVar) {
        return (f) d.d(f.a(aVar));
    }

    public static g b(Provider provider) {
        return new g(provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public f get() {
        return a((a) this.f49921a.get());
    }
}

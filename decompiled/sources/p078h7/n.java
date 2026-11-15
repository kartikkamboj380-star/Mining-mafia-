package p078h7;

import W.InterfaceC0984i;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import p048e7.Z;
import p068g7.b;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f44866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f44867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f44868c;

    public n(Provider provider, Provider provider2, Provider provider3) {
        this.f44866a = provider;
        this.f44867b = provider2;
        this.f44868c = provider3;
    }

    public static n a(Provider provider, Provider provider2, Provider provider3) {
        return new n(provider, provider2, provider3);
    }

    public static m c(CoroutineContext coroutineContext, Z z9, InterfaceC0984i interfaceC0984i) {
        return new m(coroutineContext, z9, interfaceC0984i);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c((CoroutineContext) this.f44866a.get(), (Z) this.f44867b.get(), (InterfaceC0984i) this.f44868c.get());
    }
}

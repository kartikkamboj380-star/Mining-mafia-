package p145o4;

import javax.inject.Provider;
import p165q4.b;
import p205u4.e;
import p215v4.r;
import p215v4.v;
import p245y4.a;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f47271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f47272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f47273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f47274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f47275e;

    public w(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f47271a = provider;
        this.f47272b = provider2;
        this.f47273c = provider3;
        this.f47274d = provider4;
        this.f47275e = provider5;
    }

    public static w a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new w(provider, provider2, provider3, provider4, provider5);
    }

    public static u c(a aVar, a aVar2, e eVar, r rVar, v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((a) this.f47271a.get(), (a) this.f47272b.get(), (e) this.f47273c.get(), (r) this.f47274d.get(), (v) this.f47275e.get());
    }
}

package p215v4;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import p165q4.b;
import p225w4.InterfaceC7144d;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f50188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f50189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f50190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f50191d;

    public w(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f50188a = provider;
        this.f50189b = provider2;
        this.f50190c = provider3;
        this.f50191d = provider4;
    }

    public static w a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new w(provider, provider2, provider3, provider4);
    }

    public static v c(Executor executor, InterfaceC7144d interfaceC7144d, x xVar, p235x4.b bVar) {
        return new v(executor, interfaceC7144d, xVar, bVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f50188a.get(), (InterfaceC7144d) this.f50189b.get(), (x) this.f50190c.get(), (p235x4.b) this.f50191d.get());
    }
}

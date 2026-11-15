package p078h7;

import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import p048e7.C6956b;
import p068g7.b;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f44828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f44829b;

    public f(Provider provider, Provider provider2) {
        this.f44828a = provider;
        this.f44829b = provider2;
    }

    public static f a(Provider provider, Provider provider2) {
        return new f(provider, provider2);
    }

    public static e c(C6956b c6956b, CoroutineContext coroutineContext) {
        return new e(c6956b, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c((C6956b) this.f44828a.get(), (CoroutineContext) this.f44829b.get());
    }
}

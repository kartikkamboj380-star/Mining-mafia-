package p155p4;

import android.content.Context;
import javax.inject.Provider;
import p165q4.b;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f47885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f47886b;

    public l(Provider provider, Provider provider2) {
        this.f47885a = provider;
        this.f47886b = provider2;
    }

    public static l a(Provider provider, Provider provider2) {
        return new l(provider, provider2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f47885a.get(), this.f47886b.get());
    }
}

package p155p4;

import android.content.Context;
import javax.inject.Provider;
import p165q4.b;
import p245y4.a;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f47877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f47878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f47879c;

    public j(Provider provider, Provider provider2, Provider provider3) {
        this.f47877a = provider;
        this.f47878b = provider2;
        this.f47879c = provider3;
    }

    public static j a(Provider provider, Provider provider2, Provider provider3) {
        return new j(provider, provider2, provider3);
    }

    public static i c(Context context, a aVar, a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f47877a.get(), (a) this.f47878b.get(), (a) this.f47879c.get());
    }
}

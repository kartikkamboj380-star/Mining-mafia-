package p048e7;

import android.content.Context;
import javax.inject.Provider;
import p068g7.b;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f43302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f43303b;

    public D(Provider provider, Provider provider2) {
        this.f43302a = provider;
        this.f43303b = provider2;
    }

    public static D a(Provider provider, Provider provider2) {
        return new D(provider, provider2);
    }

    public static C c(Context context, b0 b0Var) {
        return new C(context, b0Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C get() {
        return c((Context) this.f43302a.get(), (b0) this.f43303b.get());
    }
}

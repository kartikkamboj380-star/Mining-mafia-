package p078h7;

import android.content.Context;
import javax.inject.Provider;
import p068g7.b;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f44800a;

    public c(Provider provider) {
        this.f44800a = provider;
    }

    public static c a(Provider provider) {
        return new c(provider);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c((Context) this.f44800a.get());
    }
}

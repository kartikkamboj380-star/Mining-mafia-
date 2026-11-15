package p225w4;

import android.content.Context;
import javax.inject.Provider;
import p165q4.b;

/* JADX INFO: loaded from: classes2.dex */
public final class X implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f50312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f50313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f50314c;

    public X(Provider provider, Provider provider2, Provider provider3) {
        this.f50312a = provider;
        this.f50313b = provider2;
        this.f50314c = provider3;
    }

    public static X a(Provider provider, Provider provider2, Provider provider3) {
        return new X(provider, provider2, provider3);
    }

    public static W c(Context context, String str, int i10) {
        return new W(context, str, i10);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c((Context) this.f50312a.get(), (String) this.f50313b.get(), ((Integer) this.f50314c.get()).intValue());
    }
}

package p205u4;

import android.content.Context;
import javax.inject.Provider;
import p165q4.b;
import p165q4.d;
import p215v4.f;
import p215v4.x;
import p225w4.InterfaceC7144d;
import p245y4.a;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f49922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f49923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f49924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f49925d;

    public i(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f49922a = provider;
        this.f49923b = provider2;
        this.f49924c = provider3;
        this.f49925d = provider4;
    }

    public static i a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static x c(Context context, InterfaceC7144d interfaceC7144d, f fVar, a aVar) {
        return (x) d.d(h.a(context, interfaceC7144d, fVar, aVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f49922a.get(), (InterfaceC7144d) this.f49923b.get(), (f) this.f49924c.get(), (a) this.f49925d.get());
    }
}

package p225w4;

import android.content.Context;
import javax.inject.Provider;
import p165q4.b;
import p165q4.d;

/* JADX INFO: renamed from: w4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7148h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f50330a;

    public C7148h(Provider provider) {
        this.f50330a = provider;
    }

    public static C7148h a(Provider provider) {
        return new C7148h(provider);
    }

    public static String c(Context context) {
        return (String) d.d(AbstractC7146f.b(context));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f50330a.get());
    }
}

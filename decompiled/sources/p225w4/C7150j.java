package p225w4;

import p165q4.b;
import p165q4.d;

/* JADX INFO: renamed from: w4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7150j implements b {

    /* JADX INFO: renamed from: w4.j$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C7150j f50332a = new C7150j();
    }

    public static C7150j a() {
        return a.f50332a;
    }

    public static AbstractC7145e c() {
        return (AbstractC7145e) d.d(AbstractC7146f.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC7145e get() {
        return c();
    }
}

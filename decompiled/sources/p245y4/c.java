package p245y4;

import p165q4.b;
import p165q4.d;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f50801a = new c();
    }

    public static c a() {
        return a.f50801a;
    }

    public static p245y4.a b() {
        return (p245y4.a) d.d(b.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p245y4.a get() {
        return b();
    }
}

package p245y4;

import p165q4.b;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f50802a = new d();
    }

    public static d a() {
        return a.f50802a;
    }

    public static p245y4.a c() {
        return (p245y4.a) p165q4.d.d(b.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p245y4.a get() {
        return c();
    }
}

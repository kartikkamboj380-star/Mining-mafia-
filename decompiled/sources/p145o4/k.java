package p145o4;

import java.util.concurrent.Executor;
import p165q4.b;
import p165q4.d;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f47254a = new k();
    }

    public static k a() {
        return a.f47254a;
    }

    public static Executor b() {
        return (Executor) d.d(j.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}

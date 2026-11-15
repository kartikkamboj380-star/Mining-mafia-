package V2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f6075a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6076b = new C0095b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f6077c;

    public interface a {
    }

    /* JADX INFO: renamed from: V2.b$b, reason: collision with other inner class name */
    private static final class C0095b implements a {
    }

    public interface c {
        void a(String str);

        void b();

        boolean isTracing();
    }

    private b() {
    }

    public static final void a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        f6075a.c().a(name);
    }

    public static final void b() {
        f6075a.c().b();
    }

    private final c c() {
        V2.a aVar;
        c cVar = f6077c;
        if (cVar != null) {
            return cVar;
        }
        synchronized (b.class) {
            aVar = new V2.a();
            f6077c = aVar;
        }
        return aVar;
    }

    public static final boolean d() {
        return f6075a.c().isTracing();
    }
}

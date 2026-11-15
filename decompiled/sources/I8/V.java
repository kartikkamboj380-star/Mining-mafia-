package I8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f1748a = N8.E.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Y f1749b = b();

    public static final Y a() {
        return f1749b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Y b() {
        if (!f1748a) {
            return U.f1746h;
        }
        L0 l0C = C0666e0.c();
        return (N8.t.c(l0C) || !(l0C instanceof Y)) ? U.f1746h : (Y) l0C;
    }
}

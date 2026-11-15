package S1;

/* JADX INFO: loaded from: classes.dex */
public class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f5470a;

    private g() {
    }

    public static synchronized g b() {
        try {
            if (f5470a == null) {
                f5470a = new g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5470a;
    }

    @Override // S1.a
    public void a(a.EnumC0079a enumC0079a, Class cls, String str, Throwable th) {
    }
}

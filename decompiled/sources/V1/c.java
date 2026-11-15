package V1;

/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f6074a;

    private c() {
    }

    public static synchronized c b() {
        try {
            if (f6074a == null) {
                f6074a = new c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6074a;
    }

    @Override // V1.b
    public void a(a aVar) {
    }
}

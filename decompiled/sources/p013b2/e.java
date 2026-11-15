package p013b2;

/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f11580a;

    public static synchronized e b() {
        try {
            if (f11580a == null) {
                f11580a = new e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11580a;
    }

    @Override // p013b2.d
    public void a(c cVar) {
    }
}

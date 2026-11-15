package R2;

/* JADX INFO: loaded from: classes.dex */
public class A implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static A f5087a;

    private A() {
    }

    public static synchronized A h() {
        try {
            if (f5087a == null) {
                f5087a = new A();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5087a;
    }

    @Override // R2.G
    public void a() {
    }

    @Override // R2.G
    public void g() {
    }

    @Override // R2.G
    public void b(int i10) {
    }

    @Override // R2.G
    public void c(int i10) {
    }

    @Override // R2.G
    public void d(int i10) {
    }

    @Override // R2.G
    public void e(int i10) {
    }

    @Override // R2.G
    public void f(com.facebook.imagepipeline.memory.a aVar) {
    }
}

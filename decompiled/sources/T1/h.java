package T1;

import Y1.n;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class h implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f5686f = h.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f5688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S1.a f5690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile a f5691e = new a(null, null);

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f5692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f5693b;

        a(File file, f fVar) {
            this.f5692a = fVar;
            this.f5693b = file;
        }
    }

    public h(int i10, n nVar, String str, S1.a aVar) {
        this.f5687a = i10;
        this.f5690d = aVar;
        this.f5688b = nVar;
        this.f5689c = str;
    }

    private void j() throws X1.c.a {
        File file = new File((File) this.f5688b.get(), this.f5689c);
        i(file);
        this.f5691e = new a(file, new T1.a(file, this.f5687a, this.f5690d));
    }

    private boolean m() {
        File file;
        a aVar = this.f5691e;
        return aVar.f5692a == null || (file = aVar.f5693b) == null || !file.exists();
    }

    @Override // T1.f
    public void a() {
        l().a();
    }

    @Override // T1.f
    public void b() {
        try {
            l().b();
        } catch (IOException e10) {
            Z1.a.j(f5686f, "purgeUnexpectedResources", e10);
        }
    }

    @Override // T1.f
    public boolean c(String str, Object obj) {
        return l().c(str, obj);
    }

    @Override // T1.f
    public f.b d(String str, Object obj) {
        return l().d(str, obj);
    }

    @Override // T1.f
    public long e(f.a aVar) {
        return l().e(aVar);
    }

    @Override // T1.f
    public boolean f(String str, Object obj) {
        return l().f(str, obj);
    }

    @Override // T1.f
    public R1.a g(String str, Object obj) {
        return l().g(str, obj);
    }

    @Override // T1.f
    public Collection h() {
        return l().h();
    }

    void i(File file) throws X1.c.a {
        try {
            X1.c.a(file);
            Z1.a.a(f5686f, "Created cache directory %s", file.getAbsolutePath());
        } catch (X1.c.a e10) {
            this.f5690d.a(S1.a.EnumC0079a.WRITE_CREATE_DIR, f5686f, "createRootDirectoryIfNecessary", e10);
            throw e10;
        }
    }

    @Override // T1.f
    public boolean isExternal() {
        try {
            return l().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    void k() {
        if (this.f5691e.f5692a == null || this.f5691e.f5693b == null) {
            return;
        }
        X1.a.b(this.f5691e.f5693b);
    }

    synchronized f l() {
        try {
            if (m()) {
                k();
                j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (f) Y1.k.g(this.f5691e.f5692a);
    }

    @Override // T1.f
    public long remove(String str) {
        return l().remove(str);
    }
}

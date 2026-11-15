package p137n6;

import java.io.File;
import p177r6.g;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f46929c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f46930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f46931b;

    public f(g gVar) {
        this.f46930a = gVar;
        this.f46931b = f46929c;
    }

    private File d(String str) {
        return this.f46930a.q(str, "userlog");
    }

    public void a() {
        this.f46931b.d();
    }

    public byte[] b() {
        return this.f46931b.c();
    }

    public String c() {
        return this.f46931b.b();
    }

    public final void e(String str) {
        this.f46931b.a();
        this.f46931b = f46929c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i10) {
        this.f46931b = new i(file, i10);
    }

    public void g(long j10, String str) {
        this.f46931b.e(j10, str);
    }

    public f(g gVar, String str) {
        this(gVar);
        e(str);
    }

    private static final class b implements d {
        private b() {
        }

        @Override // p137n6.d
        public String b() {
            return null;
        }

        @Override // p137n6.d
        public byte[] c() {
            return null;
        }

        @Override // p137n6.d
        public void a() {
        }

        @Override // p137n6.d
        public void d() {
        }

        @Override // p137n6.d
        public void e(long j10, String str) {
        }
    }
}

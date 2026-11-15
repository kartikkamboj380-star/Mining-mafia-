package R6;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f5291c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f5292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5293b;

    public a(c cVar) {
        this.f5293b = false;
        this.f5292a = cVar == null ? c.c() : cVar;
    }

    public static a e() {
        if (f5291c == null) {
            synchronized (a.class) {
                try {
                    if (f5291c == null) {
                        f5291c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5291c;
    }

    public void a(String str) {
        if (this.f5293b) {
            this.f5292a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f5293b) {
            this.f5292a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f5293b) {
            this.f5292a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f5293b) {
            this.f5292a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f5293b) {
            this.f5292a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f5293b) {
            this.f5292a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f5293b;
    }

    public void i(boolean z9) {
        this.f5293b = z9;
    }

    public void j(String str) {
        if (this.f5293b) {
            this.f5292a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f5293b) {
            this.f5292a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private a() {
        this(null);
    }
}

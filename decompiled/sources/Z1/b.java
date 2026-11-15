package Z1;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7137c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7138a = "unknown";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7139b = 5;

    private b() {
    }

    public static b j() {
        return f7137c;
    }

    private static String k(String str, Throwable th) {
        return str + '\n' + l(th);
    }

    private static String l(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }

    private String m(String str) {
        if (this.f7138a == null) {
            return str;
        }
        return this.f7138a + ":" + str;
    }

    private void n(int i10, String str, String str2) {
        Log.println(i10, m(str), str2);
    }

    private void o(int i10, String str, String str2, Throwable th) {
        Log.println(i10, m(str), k(str2, th));
    }

    @Override // Z1.c
    public void a(String str, String str2) {
        n(6, str, str2);
    }

    @Override // Z1.c
    public void b(String str, String str2) {
        n(2, str, str2);
    }

    @Override // Z1.c
    public void c(String str, String str2) {
        n(6, str, str2);
    }

    @Override // Z1.c
    public void d(String str, String str2) {
        n(3, str, str2);
    }

    @Override // Z1.c
    public void e(String str, String str2, Throwable th) {
        o(6, str, str2, th);
    }

    @Override // Z1.c
    public void f(String str, String str2, Throwable th) {
        o(3, str, str2, th);
    }

    @Override // Z1.c
    public void g(String str, String str2, Throwable th) {
        o(6, str, str2, th);
    }

    @Override // Z1.c
    public boolean h(int i10) {
        return this.f7139b <= i10;
    }

    @Override // Z1.c
    public void i(String str, String str2) {
        n(4, str, str2);
    }

    @Override // Z1.c
    public void w(String str, String str2) {
        n(5, str, str2);
    }

    @Override // Z1.c
    public void w(String str, String str2, Throwable th) {
        o(5, str, str2, th);
    }
}

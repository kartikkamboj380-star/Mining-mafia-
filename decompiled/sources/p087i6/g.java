package p087i6;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final g f45090c = new g("FirebaseCrashlytics");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45092b = 4;

    public g(String str) {
        this.f45091a = str;
    }

    private boolean a(int i10) {
        return this.f45092b <= i10 || Log.isLoggable(this.f45091a, i10);
    }

    public static g f() {
        return f45090c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f45091a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f45091a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f45091a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f45091a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f45091a, str, th);
        }
    }
}

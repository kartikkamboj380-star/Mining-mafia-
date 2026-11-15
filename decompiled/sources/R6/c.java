package R6;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f5294a;

    private c() {
    }

    public static synchronized c c() {
        try {
            if (f5294a == null) {
                f5294a = new c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5294a;
    }

    void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    void e(String str) {
        Log.w("FirebasePerformance", str);
    }
}

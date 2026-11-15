package androidx.work;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f11413a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile q f11414b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f11415c = 20;

    public static class a extends q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f11416d;

        public a(int i10) {
            super(i10);
            this.f11416d = i10;
        }

        @Override // androidx.work.q
        public void a(String str, String str2) {
            if (this.f11416d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.q
        public void b(String str, String str2, Throwable th) {
            if (this.f11416d <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // androidx.work.q
        public void c(String str, String str2) {
            if (this.f11416d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.q
        public void d(String str, String str2, Throwable th) {
            if (this.f11416d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // androidx.work.q
        public void f(String str, String str2) {
            if (this.f11416d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.q
        public void g(String str, String str2, Throwable th) {
            if (this.f11416d <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // androidx.work.q
        public void j(String str, String str2) {
            if (this.f11416d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // androidx.work.q
        public void k(String str, String str2) {
            if (this.f11416d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.q
        public void l(String str, String str2, Throwable th) {
            if (this.f11416d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public q(int i10) {
    }

    public static q e() {
        q qVar;
        synchronized (f11413a) {
            try {
                if (f11414b == null) {
                    f11414b = new a(3);
                }
                qVar = f11414b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public static void h(q qVar) {
        synchronized (f11413a) {
            f11414b = qVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i10 = f11415c;
        if (length >= i10) {
            sb.append(str.substring(0, i10));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}

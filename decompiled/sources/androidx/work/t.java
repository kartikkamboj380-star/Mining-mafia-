package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public interface t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f11425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.C0187b f11426b;

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f11427a;

            public a(Throwable th) {
                this.f11427a = th;
            }

            public Throwable a() {
                return this.f11427a;
            }

            public String toString() {
                return "FAILURE (" + this.f11427a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: androidx.work.t$b$b, reason: collision with other inner class name */
        public static final class C0187b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0187b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f11425a = new b.c();
        f11426b = new b.C0187b();
    }
}

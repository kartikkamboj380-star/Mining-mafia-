package p142o1;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: o1.a$a, reason: collision with other inner class name */
    public static final class C0488a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f47154a;

        private /* synthetic */ C0488a(int i10) {
            this.f47154a = i10;
        }

        public static final /* synthetic */ C0488a a(int i10) {
            return new C0488a(i10);
        }

        public static int b(int i10) {
            if (i10 > 0) {
                return i10;
            }
            throw new IllegalArgumentException("px must be > 0.");
        }

        public static boolean c(int i10, Object obj) {
            return (obj instanceof C0488a) && i10 == ((C0488a) obj).f();
        }

        public static int d(int i10) {
            return Integer.hashCode(i10);
        }

        public static String e(int i10) {
            return "Pixels(px=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f47154a, obj);
        }

        public final /* synthetic */ int f() {
            return this.f47154a;
        }

        public int hashCode() {
            return d(this.f47154a);
        }

        public String toString() {
            return e(this.f47154a);
        }
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47155a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -2093724603;
        }

        public String toString() {
            return "Undefined";
        }
    }
}

package Y1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0116a f6860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0116a f6861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6862d;

        /* JADX INFO: renamed from: Y1.i$a$a, reason: collision with other inner class name */
        private static final class C0116a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f6863a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f6864b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            C0116a f6865c;

            private C0116a() {
            }
        }

        private C0116a d() {
            C0116a c0116a = new C0116a();
            this.f6861c.f6865c = c0116a;
            this.f6861c = c0116a;
            return c0116a;
        }

        private a e(String str, Object obj) {
            C0116a c0116aD = d();
            c0116aD.f6864b = obj;
            c0116aD.f6863a = (String) k.g(str);
            return this;
        }

        public a a(String str, int i10) {
            return e(str, String.valueOf(i10));
        }

        public a b(String str, Object obj) {
            return e(str, obj);
        }

        public a c(String str, boolean z9) {
            return e(str, String.valueOf(z9));
        }

        public String toString() {
            boolean z9 = this.f6862d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f6859a);
            sb.append('{');
            String str = "";
            for (C0116a c0116a = this.f6860b.f6865c; c0116a != null; c0116a = c0116a.f6865c) {
                Object obj = c0116a.f6864b;
                if (!z9 || obj != null) {
                    sb.append(str);
                    String str2 = c0116a.f6863a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private a(String str) {
            C0116a c0116a = new C0116a();
            this.f6860b = c0116a;
            this.f6861c = c0116a;
            this.f6862d = false;
            this.f6859a = (String) k.g(str);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static a b(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}

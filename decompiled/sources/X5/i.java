package X5;

/* JADX INFO: loaded from: classes2.dex */
abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f6717a = b();

    private static final class b implements h {
        private b() {
        }
    }

    static String a(String str) {
        if (c(str)) {
            return null;
        }
        return str;
    }

    private static h b() {
        return new b();
    }

    static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}

package N8;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f3681a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f3681a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}

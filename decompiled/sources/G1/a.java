package G1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f922a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f923b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f924c = "";

    public static void a() {
        f922a = true;
        b(3);
    }

    public static void b(int i10) {
        f923b = i10;
    }

    public static void c(String str) {
        f924c = str;
    }

    public static void d() {
        f922a = false;
        b(7);
    }
}

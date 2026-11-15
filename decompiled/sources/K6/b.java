package K6;

/* JADX INFO: loaded from: classes3.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f2905a;

    private b() {
    }

    public static b a() {
        if (f2905a == null) {
            f2905a = new b();
        }
        return f2905a;
    }

    @Override // K6.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}

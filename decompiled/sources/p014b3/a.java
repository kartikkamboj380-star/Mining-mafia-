package p014b3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11592a = new a();

    private a() {
    }

    public static final int a(int i10, Object obj) {
        return (i10 * 31) + (obj != null ? obj.hashCode() : 0);
    }
}

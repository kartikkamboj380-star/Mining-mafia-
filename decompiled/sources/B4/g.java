package B4;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f246c;

    private g(int i10, String str, long j10) {
        this.f244a = i10;
        this.f245b = str;
        this.f246c = j10;
    }

    public static g d(int i10, String str, long j10) {
        return new g(i10, str, j10);
    }

    public String a() {
        return this.f245b;
    }

    public int b() {
        return this.f244a;
    }

    public long c() {
        return this.f246c;
    }
}

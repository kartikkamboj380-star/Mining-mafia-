package p016b5;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11596a = 1;

    public b a(Object obj) {
        this.f11596a = (this.f11596a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f11596a;
    }

    public final b c(boolean z9) {
        this.f11596a = (this.f11596a * 31) + (z9 ? 1 : 0);
        return this;
    }
}

package B4;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f277c;

    public v(int i10, int i11, int i12) {
        this.f275a = i10;
        this.f276b = i11;
        this.f277c = i12;
    }

    public int a() {
        return this.f275a;
    }

    public int b() {
        return this.f277c;
    }

    public int c() {
        return this.f276b;
    }

    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(this.f275a), Integer.valueOf(this.f276b), Integer.valueOf(this.f277c));
    }
}

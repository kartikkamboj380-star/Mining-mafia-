package U3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5947d;

    public h(int i10, int i11, int i12, int i13) {
        this.f5944a = i10;
        this.f5945b = i11;
        this.f5946c = i12;
        this.f5947d = i13;
    }

    public final int a() {
        return this.f5947d;
    }

    public final int b() {
        return this.f5944a;
    }

    public final int c() {
        return this.f5946c;
    }

    public final int d() {
        return this.f5945b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f5944a == hVar.f5944a && this.f5945b == hVar.f5945b && this.f5946c == hVar.f5946c && this.f5947d == hVar.f5947d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f5944a) * 31) + Integer.hashCode(this.f5945b)) * 31) + Integer.hashCode(this.f5946c)) * 31) + Integer.hashCode(this.f5947d);
    }

    public String toString() {
        return "ColorEdges(left=" + this.f5944a + ", top=" + this.f5945b + ", right=" + this.f5946c + ", bottom=" + this.f5947d + ")";
    }

    public /* synthetic */ h(int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? -16777216 : i10, (i14 & 2) != 0 ? -16777216 : i11, (i14 & 4) != 0 ? -16777216 : i12, (i14 & 8) != 0 ? -16777216 : i13);
    }
}

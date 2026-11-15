package p048e7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f43307d;

    public E(String processName, int i10, int i11, boolean z9) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.f43304a = processName;
        this.f43305b = i10;
        this.f43306c = i11;
        this.f43307d = z9;
    }

    public final int a() {
        return this.f43306c;
    }

    public final int b() {
        return this.f43305b;
    }

    public final String c() {
        return this.f43304a;
    }

    public final boolean d() {
        return this.f43307d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return Intrinsics.b(this.f43304a, e10.f43304a) && this.f43305b == e10.f43305b && this.f43306c == e10.f43306c && this.f43307d == e10.f43307d;
    }

    public int hashCode() {
        return (((((this.f43304a.hashCode() * 31) + Integer.hashCode(this.f43305b)) * 31) + Integer.hashCode(this.f43306c)) * 31) + Boolean.hashCode(this.f43307d);
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f43304a + ", pid=" + this.f43305b + ", importance=" + this.f43306c + ", isDefaultProcess=" + this.f43307d + ')';
    }
}

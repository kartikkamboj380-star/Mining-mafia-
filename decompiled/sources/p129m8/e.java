package p129m8;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f46437e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f46438f = f.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f46442d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(int i10, int i11, int i12) {
        this.f46439a = i10;
        this.f46440b = i11;
        this.f46441c = i12;
        this.f46442d = d(i10, i11, i12);
    }

    private final int d(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(e other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f46442d - other.f46442d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.f46442d == eVar.f46442d;
    }

    public int hashCode() {
        return this.f46442d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f46439a);
        sb.append('.');
        sb.append(this.f46440b);
        sb.append('.');
        sb.append(this.f46441c);
        return sb.toString();
    }
}

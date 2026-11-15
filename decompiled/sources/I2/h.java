package I2;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1620c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f1621d = new h(-1, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h f1622e = new h(-2, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f1623f = new h(-1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1625b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f1621d;
        }

        public final h b() {
            return h.f1622e;
        }

        private a() {
        }
    }

    private h(int i10, boolean z9) {
        this.f1624a = i10;
        this.f1625b = z9;
    }

    public static final h c() {
        return f1620c.a();
    }

    public static final h e() {
        return f1620c.b();
    }

    public final boolean d() {
        return this.f1625b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f1624a == hVar.f1624a && this.f1625b == hVar.f1625b;
    }

    public final int f() {
        if (h()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return this.f1624a;
    }

    public final boolean g() {
        return this.f1624a != -2;
    }

    public final boolean h() {
        return this.f1624a == -1;
    }

    public int hashCode() {
        return p063g2.b.b(Integer.valueOf(this.f1624a), Boolean.valueOf(this.f1625b));
    }

    public String toString() {
        H h10 = H.f45976a;
        String str = String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.f1624a), Boolean.valueOf(this.f1625b)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}

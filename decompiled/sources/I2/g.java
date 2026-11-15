package I2;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1615e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1619d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(int i10, int i11, float f10, float f11) {
        this.f1616a = i10;
        this.f1617b = i11;
        this.f1618c = f10;
        this.f1619d = f11;
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1616a == gVar.f1616a && this.f1617b == gVar.f1617b;
    }

    public int hashCode() {
        return p063g2.b.a(this.f1616a, this.f1617b);
    }

    public String toString() {
        H h10 = H.f45976a;
        String str = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f1616a), Integer.valueOf(this.f1617b)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public /* synthetic */ g(int i10, int i11, float f10, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? 2048.0f : f10, (i12 & 8) != 0 ? 0.6666667f : f11);
    }
}

package U3;

import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.W;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f5956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f5957b;

    public l(float f10, float f11) {
        this.f5956a = f10;
        this.f5957b = f11;
    }

    public final float a() {
        return this.f5956a;
    }

    public final float b() {
        return this.f5957b;
    }

    public final l c() {
        return new l(C1356f0.i(this.f5956a), C1356f0.i(this.f5957b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f5956a, lVar.f5956a) == 0 && Float.compare(this.f5957b, lVar.f5957b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f5956a) * 31) + Float.hashCode(this.f5957b);
    }

    public String toString() {
        return "CornerRadii(horizontal=" + this.f5956a + ", vertical=" + this.f5957b + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(W length, float f10, float f11) {
        this(length.b(f10), length.b(f11));
        Intrinsics.checkNotNullParameter(length, "length");
    }
}

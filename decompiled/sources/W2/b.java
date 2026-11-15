package W2;

import java.util.Arrays;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6549a;

    public b(int i10) {
        this.f6549a = i10;
    }

    public final int a() {
        return this.f6549a;
    }

    public String toString() {
        H h10 = H.f45976a;
        String str = String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f6549a)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}

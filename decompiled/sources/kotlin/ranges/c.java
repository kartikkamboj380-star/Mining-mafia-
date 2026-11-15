package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
class c {
    public static final void a(boolean z9, Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (z9) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}

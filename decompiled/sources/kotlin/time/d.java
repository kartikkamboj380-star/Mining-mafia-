package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
class d {
    public static final double a(double d10, H8.b sourceUnit, H8.b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.d().convert(1L, sourceUnit.d());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.d().convert(1L, targetUnit.d());
    }

    public static final long b(long j10, H8.b sourceUnit, H8.b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.d().convert(j10, sourceUnit.d());
    }

    public static final long c(long j10, H8.b sourceUnit, H8.b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.d().convert(j10, sourceUnit.d());
    }
}

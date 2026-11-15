package s9;

import kotlin.jvm.internal.Intrinsics;
import r9.Z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(Z z9, int i10) {
        Intrinsics.checkNotNullParameter(z9, "<this>");
        int iA = a(z9.M(), i10 + 1, 0, z9.N().length);
        return iA >= 0 ? iA : ~iA;
    }
}

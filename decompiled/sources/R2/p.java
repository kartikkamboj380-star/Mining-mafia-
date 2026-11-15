package R2;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f5156a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f5157b = Runtime.getRuntime().availableProcessors();

    private p() {
    }

    public static final SparseIntArray a(int i10, int i11, int i12) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i10 <= i11) {
            sparseIntArray.put(i10, i12);
            i10 *= 2;
        }
        return sparseIntArray;
    }

    public static final F b() {
        int i10 = f5157b;
        return new F(4194304, i10 * 4194304, a(131072, 4194304, i10), 131072, 4194304, i10);
    }
}

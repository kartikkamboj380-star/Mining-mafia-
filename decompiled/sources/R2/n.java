package R2;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f5153a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f5154b = new SparseIntArray(0);

    private n() {
    }

    public static final F a() {
        return new F(0, f5153a.b(), f5154b);
    }

    private final int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}

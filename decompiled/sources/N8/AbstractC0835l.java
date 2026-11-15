package N8;

/* JADX INFO: renamed from: N8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0835l {
    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    public static final I8.K b(I8.K k10, String str) {
        return str != null ? new v(k10, str) : k10;
    }
}

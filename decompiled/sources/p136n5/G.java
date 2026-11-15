package p136n5;

/* JADX INFO: loaded from: classes2.dex */
public enum G {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46882a;

    G(int i10) {
        this.f46882a = i10;
    }

    public static G c(int i10) {
        for (G g10 : values()) {
            if (g10.f46882a == i10) {
                return g10;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.f46882a;
    }
}

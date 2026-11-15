package B4;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f225a;

    b(int i10) {
        this.f225a = i10;
    }

    public static b c(int i10) {
        for (b bVar : values()) {
            if (bVar.d() == i10) {
                return bVar;
            }
        }
        return null;
    }

    public int d() {
        return this.f225a;
    }
}

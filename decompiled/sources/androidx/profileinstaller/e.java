package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
enum e {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f10310a;

    e(long j10) {
        this.f10310a = j10;
    }

    public long d() {
        return this.f10310a;
    }
}

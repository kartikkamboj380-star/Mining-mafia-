package p158p7;

/* JADX INFO: loaded from: classes3.dex */
public enum j {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47954a;

    j(String str) {
        this.f47954a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f47954a;
    }
}

package p117l6;

/* JADX INFO: loaded from: classes3.dex */
public enum G {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46103a;

    G(int i10) {
        this.f46103a = i10;
    }

    public static G d(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int e() {
        return this.f46103a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f46103a);
    }
}

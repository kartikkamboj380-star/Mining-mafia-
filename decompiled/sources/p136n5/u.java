package p136n5;

/* JADX INFO: loaded from: classes2.dex */
public enum u {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46894a;

    u(String str) {
        this.f46894a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f46894a;
    }
}

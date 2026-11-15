package X5;

/* JADX INFO: loaded from: classes2.dex */
final class k extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6718a;

    k(Object obj) {
        this.f6718a = obj;
    }

    @Override // X5.g
    public Object b() {
        return this.f6718a;
    }

    @Override // X5.g
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f6718a.equals(((k) obj).f6718a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6718a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f6718a + ")";
    }
}

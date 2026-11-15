package V5;

/* JADX INFO: loaded from: classes2.dex */
final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6127b;

    s(int i10, long j10) {
        this.f6126a = i10;
        this.f6127b = j10;
    }

    @Override // V5.t
    public final int a() {
        return this.f6126a;
    }

    @Override // V5.t
    public final long b() {
        return this.f6127b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f6126a == tVar.a() && this.f6127b == tVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6127b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f6126a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f6126a + ", eventTimestamp=" + this.f6127b + "}";
    }
}

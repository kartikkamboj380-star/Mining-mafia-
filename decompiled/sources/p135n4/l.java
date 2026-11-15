package p135n4;

/* JADX INFO: loaded from: classes2.dex */
final class l extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f46800a;

    l(long j10) {
        this.f46800a = j10;
    }

    @Override // p135n4.v
    public long c() {
        return this.f46800a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f46800a == ((v) obj).c();
    }

    public int hashCode() {
        long j10 = this.f46800a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f46800a + "}";
    }
}

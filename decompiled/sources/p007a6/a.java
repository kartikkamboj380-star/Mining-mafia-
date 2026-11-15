package p007a6;

/* JADX INFO: loaded from: classes.dex */
final class a extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7284c;

    a(long j10, long j11, long j12) {
        this.f7282a = j10;
        this.f7283b = j11;
        this.f7284c = j12;
    }

    @Override // p007a6.o
    public long b() {
        return this.f7283b;
    }

    @Override // p007a6.o
    public long c() {
        return this.f7282a;
    }

    @Override // p007a6.o
    public long d() {
        return this.f7284c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f7282a == oVar.c() && this.f7283b == oVar.b() && this.f7284c == oVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f7282a;
        long j11 = this.f7283b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f7284c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f7282a + ", elapsedRealtime=" + this.f7283b + ", uptimeMillis=" + this.f7284c + "}";
    }
}

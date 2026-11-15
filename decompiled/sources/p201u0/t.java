package p201u0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f49766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f49767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49768c;

    public t(long j10, long j11, int i10) {
        this.f49766a = j10;
        this.f49767b = j11;
        this.f49768c = i10;
    }

    public final long a() {
        return this.f49767b;
    }

    public final long b() {
        return this.f49766a;
    }

    public final int c() {
        return this.f49768c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f49766a == tVar.f49766a && this.f49767b == tVar.f49767b && this.f49768c == tVar.f49768c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f49766a) * 31) + Long.hashCode(this.f49767b)) * 31) + Integer.hashCode(this.f49768c);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f49766a + ", ModelVersion=" + this.f49767b + ", TopicCode=" + this.f49768c + " }");
    }
}

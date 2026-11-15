package p137n6;

/* JADX INFO: loaded from: classes3.dex */
final class b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f46920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f46921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f46922f;

    b(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f46918b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f46919c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f46920d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f46921e = str4;
        this.f46922f = j10;
    }

    @Override // p137n6.j
    public String c() {
        return this.f46919c;
    }

    @Override // p137n6.j
    public String d() {
        return this.f46920d;
    }

    @Override // p137n6.j
    public String e() {
        return this.f46918b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f46918b.equals(jVar.e()) && this.f46919c.equals(jVar.c()) && this.f46920d.equals(jVar.d()) && this.f46921e.equals(jVar.g()) && this.f46922f == jVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // p137n6.j
    public long f() {
        return this.f46922f;
    }

    @Override // p137n6.j
    public String g() {
        return this.f46921e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f46918b.hashCode() ^ 1000003) * 1000003) ^ this.f46919c.hashCode()) * 1000003) ^ this.f46920d.hashCode()) * 1000003) ^ this.f46921e.hashCode()) * 1000003;
        long j10 = this.f46922f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f46918b + ", parameterKey=" + this.f46919c + ", parameterValue=" + this.f46920d + ", variantId=" + this.f46921e + ", templateVersion=" + this.f46922f + "}";
    }
}

package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class D extends G.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f47292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f47293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f47294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f47295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f47296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f47297i;

    D(int i10, String str, int i11, long j10, long j11, boolean z9, int i12, String str2, String str3) {
        this.f47289a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f47290b = str;
        this.f47291c = i11;
        this.f47292d = j10;
        this.f47293e = j11;
        this.f47294f = z9;
        this.f47295g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f47296h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f47297i = str3;
    }

    @Override // o6.G.b
    public int a() {
        return this.f47289a;
    }

    @Override // o6.G.b
    public int b() {
        return this.f47291c;
    }

    @Override // o6.G.b
    public long d() {
        return this.f47293e;
    }

    @Override // o6.G.b
    public boolean e() {
        return this.f47294f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G.b) {
            G.b bVar = (G.b) obj;
            if (this.f47289a == bVar.a() && this.f47290b.equals(bVar.g()) && this.f47291c == bVar.b() && this.f47292d == bVar.j() && this.f47293e == bVar.d() && this.f47294f == bVar.e() && this.f47295g == bVar.i() && this.f47296h.equals(bVar.f()) && this.f47297i.equals(bVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // o6.G.b
    public String f() {
        return this.f47296h;
    }

    @Override // o6.G.b
    public String g() {
        return this.f47290b;
    }

    @Override // o6.G.b
    public String h() {
        return this.f47297i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f47289a ^ 1000003) * 1000003) ^ this.f47290b.hashCode()) * 1000003) ^ this.f47291c) * 1000003;
        long j10 = this.f47292d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f47293e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f47294f ? 1231 : 1237)) * 1000003) ^ this.f47295g) * 1000003) ^ this.f47296h.hashCode()) * 1000003) ^ this.f47297i.hashCode();
    }

    @Override // o6.G.b
    public int i() {
        return this.f47295g;
    }

    @Override // o6.G.b
    public long j() {
        return this.f47292d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f47289a + ", model=" + this.f47290b + ", availableProcessors=" + this.f47291c + ", totalRam=" + this.f47292d + ", diskSpace=" + this.f47293e + ", isEmulator=" + this.f47294f + ", state=" + this.f47295g + ", manufacturer=" + this.f47296h + ", modelClass=" + this.f47297i + "}";
    }
}

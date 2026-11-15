package p147o6;

import p087i6.f;

/* JADX INFO: loaded from: classes3.dex */
final class C extends G.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f47286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f47287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f47288f;

    C(String str, String str2, String str3, String str4, int i10, f fVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f47283a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f47284b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f47285c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f47286d = str4;
        this.f47287e = i10;
        if (fVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f47288f = fVar;
    }

    @Override // o6.G.a
    public String a() {
        return this.f47283a;
    }

    @Override // o6.G.a
    public int c() {
        return this.f47287e;
    }

    @Override // o6.G.a
    public f d() {
        return this.f47288f;
    }

    @Override // o6.G.a
    public String e() {
        return this.f47286d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G.a) {
            G.a aVar = (G.a) obj;
            if (this.f47283a.equals(aVar.a()) && this.f47284b.equals(aVar.f()) && this.f47285c.equals(aVar.g()) && this.f47286d.equals(aVar.e()) && this.f47287e == aVar.c() && this.f47288f.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // o6.G.a
    public String f() {
        return this.f47284b;
    }

    @Override // o6.G.a
    public String g() {
        return this.f47285c;
    }

    public int hashCode() {
        return ((((((((((this.f47283a.hashCode() ^ 1000003) * 1000003) ^ this.f47284b.hashCode()) * 1000003) ^ this.f47285c.hashCode()) * 1000003) ^ this.f47286d.hashCode()) * 1000003) ^ this.f47287e) * 1000003) ^ this.f47288f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f47283a + ", versionCode=" + this.f47284b + ", versionName=" + this.f47285c + ", installUuid=" + this.f47286d + ", deliveryMechanism=" + this.f47287e + ", developmentPlatformProvider=" + this.f47288f + "}";
    }
}

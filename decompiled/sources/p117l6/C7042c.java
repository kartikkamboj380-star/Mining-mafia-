package p117l6;

/* JADX INFO: renamed from: l6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C7042c extends L.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46153c;

    C7042c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f46151a = str;
        this.f46152b = str2;
        this.f46153c = str3;
    }

    @Override // l6.L.a
    public String c() {
        return this.f46151a;
    }

    @Override // l6.L.a
    public String d() {
        return this.f46153c;
    }

    @Override // l6.L.a
    public String e() {
        return this.f46152b;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof L.a) {
            L.a aVar = (L.a) obj;
            if (this.f46151a.equals(aVar.c()) && ((str = this.f46152b) != null ? str.equals(aVar.e()) : aVar.e() == null) && ((str2 = this.f46153c) != null ? str2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f46151a.hashCode() ^ 1000003) * 1000003;
        String str = this.f46152b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f46153c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f46151a + ", firebaseInstallationId=" + this.f46152b + ", firebaseAuthenticationToken=" + this.f46153c + "}";
    }
}

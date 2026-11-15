package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class E extends G.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f47300c;

    E(String str, String str2, boolean z9) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f47298a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f47299b = str2;
        this.f47300c = z9;
    }

    @Override // o6.G.c
    public boolean b() {
        return this.f47300c;
    }

    @Override // o6.G.c
    public String c() {
        return this.f47299b;
    }

    @Override // o6.G.c
    public String d() {
        return this.f47298a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G.c) {
            G.c cVar = (G.c) obj;
            if (this.f47298a.equals(cVar.d()) && this.f47299b.equals(cVar.c()) && this.f47300c == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f47298a.hashCode() ^ 1000003) * 1000003) ^ this.f47299b.hashCode()) * 1000003) ^ (this.f47300c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f47298a + ", osCodeName=" + this.f47299b + ", isRooted=" + this.f47300c + "}";
    }
}

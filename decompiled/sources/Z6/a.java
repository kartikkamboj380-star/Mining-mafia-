package Z6;

/* JADX INFO: loaded from: classes3.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7163b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f7162a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f7163b = str2;
    }

    @Override // Z6.f
    public String b() {
        return this.f7162a;
    }

    @Override // Z6.f
    public String c() {
        return this.f7163b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f7162a.equals(fVar.b()) && this.f7163b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f7162a.hashCode() ^ 1000003) * 1000003) ^ this.f7163b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f7162a + ", version=" + this.f7163b + "}";
    }
}

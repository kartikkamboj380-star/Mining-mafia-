package p147o6;

import java.util.List;

/* JADX INFO: renamed from: o6.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C7082f extends F.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f47503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47504b;

    /* JADX INFO: renamed from: o6.f$b */
    static final class b extends F.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f47505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47506b;

        b() {
        }

        @Override // o6.F.d.a
        public F.d a() {
            List list = this.f47505a;
            if (list != null) {
                return new C7082f(list, this.f47506b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // o6.F.d.a
        public F.d.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f47505a = list;
            return this;
        }

        @Override // o6.F.d.a
        public F.d.a c(String str) {
            this.f47506b = str;
            return this;
        }
    }

    @Override // o6.F.d
    public List b() {
        return this.f47503a;
    }

    @Override // o6.F.d
    public String c() {
        return this.f47504b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.d) {
            F.d dVar = (F.d) obj;
            if (this.f47503a.equals(dVar.b()) && ((str = this.f47504b) != null ? str.equals(dVar.c()) : dVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f47503a.hashCode() ^ 1000003) * 1000003;
        String str = this.f47504b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f47503a + ", orgId=" + this.f47504b + "}";
    }

    private C7082f(List list, String str) {
        this.f47503a = list;
        this.f47504b = str;
    }
}

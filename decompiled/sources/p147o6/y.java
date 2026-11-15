package p147o6;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class y extends F.e.d.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f47687a;

    static final class b extends F.e.d.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f47688a;

        b() {
        }

        @Override // o6.F.e.d.f.a
        public F.e.d.f a() {
            List list = this.f47688a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // o6.F.e.d.f.a
        public F.e.d.f.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f47688a = list;
            return this;
        }
    }

    @Override // o6.F.e.d.f
    public List b() {
        return this.f47687a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.f) {
            return this.f47687a.equals(((F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f47687a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f47687a + "}";
    }

    private y(List list) {
        this.f47687a = list;
    }
}

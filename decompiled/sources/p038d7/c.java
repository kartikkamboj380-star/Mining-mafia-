package p038d7;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f43177a;

    c(Set set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f43177a = set;
    }

    @Override // p038d7.e
    public Set b() {
        return this.f43177a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f43177a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f43177a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f43177a + "}";
    }
}

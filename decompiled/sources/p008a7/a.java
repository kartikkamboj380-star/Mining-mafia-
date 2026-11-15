package p008a7;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f7319a;

    a(Set set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f7319a = set;
    }

    @Override // p008a7.b
    public Set b() {
        return this.f7319a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f7319a.equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f7319a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f7319a + "}";
    }
}

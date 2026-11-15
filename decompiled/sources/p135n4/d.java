package p135n4;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class d extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f46751a;

    d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f46751a = list;
    }

    @Override // p135n4.n
    public List c() {
        return this.f46751a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f46751a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f46751a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f46751a + "}";
    }
}

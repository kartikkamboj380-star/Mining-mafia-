package N;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3623b;

    public c(Object obj, Object obj2) {
        this.f3622a = obj;
        this.f3623b = obj2;
    }

    public static c a(Object obj, Object obj2) {
        return new c(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b.a(cVar.f3622a, this.f3622a) && b.a(cVar.f3623b, this.f3623b);
    }

    public int hashCode() {
        Object obj = this.f3622a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3623b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f3622a + " " + this.f3623b + "}";
    }
}

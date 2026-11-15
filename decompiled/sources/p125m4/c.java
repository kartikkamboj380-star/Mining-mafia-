package p125m4;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46411a;

    private c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f46411a = str;
    }

    public static c b(String str) {
        return new c(str);
    }

    public String a() {
        return this.f46411a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f46411a.equals(((c) obj).f46411a);
        }
        return false;
    }

    public int hashCode() {
        return this.f46411a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f46411a + "\"}";
    }
}

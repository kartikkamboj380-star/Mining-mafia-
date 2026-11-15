package p057f6;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f43722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43724c;

    private q(Class cls, int i10, int i11) {
        this(E.b(cls), i10, i11);
    }

    public static q a(Class cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 0);
    }

    public static q i(E e10) {
        return new q(e10, 0, 1);
    }

    public static q j(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q k(E e10) {
        return new q(e10, 1, 0);
    }

    public static q l(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q m(E e10) {
        return new q(e10, 1, 1);
    }

    public static q n(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q o(Class cls) {
        return new q(cls, 2, 0);
    }

    public E c() {
        return this.f43722a;
    }

    public boolean d() {
        return this.f43724c == 2;
    }

    public boolean e() {
        return this.f43724c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f43722a.equals(qVar.f43722a) && this.f43723b == qVar.f43723b && this.f43724c == qVar.f43724c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f43723b == 1;
    }

    public boolean g() {
        return this.f43723b == 2;
    }

    public int hashCode() {
        return ((((this.f43722a.hashCode() ^ 1000003) * 1000003) ^ this.f43723b) * 1000003) ^ this.f43724c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f43722a);
        sb.append(", type=");
        int i10 = this.f43723b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(b(this.f43724c));
        sb.append("}");
        return sb.toString();
    }

    private q(E e10, int i10, int i11) {
        this.f43722a = (E) D.c(e10, "Null dependency anInterface.");
        this.f43723b = i10;
        this.f43724c = i11;
    }
}

package p057f6;

/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f43665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f43666b;

    private @interface a {
    }

    public E(Class cls, Class cls2) {
        this.f43665a = cls;
        this.f43666b = cls2;
    }

    public static E a(Class cls, Class cls2) {
        return new E(cls, cls2);
    }

    public static E b(Class cls) {
        return new E(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e10 = (E) obj;
        if (this.f43666b.equals(e10.f43666b)) {
            return this.f43665a.equals(e10.f43665a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f43666b.hashCode() * 31) + this.f43665a.hashCode();
    }

    public String toString() {
        if (this.f43665a == a.class) {
            return this.f43666b.getName();
        }
        return "@" + this.f43665a.getName() + " " + this.f43666b.getName();
    }
}

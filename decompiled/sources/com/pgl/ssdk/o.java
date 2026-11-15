package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public final class o<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f42023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f42024b;

    public o(A a10, B b10) {
        this.f42023a = a10;
        this.f42024b = b10;
    }

    public static <A, B> o<A, B> a(A a10, B b10) {
        return new o<>(a10, b10);
    }

    public B b() {
        return this.f42024b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a10 = this.f42023a;
        if (a10 == null) {
            if (oVar.f42023a != null) {
                return false;
            }
        } else if (!a10.equals(oVar.f42023a)) {
            return false;
        }
        B b10 = this.f42024b;
        if (b10 == null) {
            if (oVar.f42024b != null) {
                return false;
            }
        } else if (!b10.equals(oVar.f42024b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a10 = this.f42023a;
        int iHashCode = ((a10 == null ? 0 : a10.hashCode()) + 31) * 31;
        B b10 = this.f42024b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public A a() {
        return this.f42023a;
    }
}

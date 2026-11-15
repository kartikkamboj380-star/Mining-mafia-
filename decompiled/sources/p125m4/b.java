package p125m4;

/* JADX INFO: loaded from: classes2.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f46410a;

    b(Integer num) {
        this.f46410a = num;
    }

    @Override // p125m4.g
    public Integer a() {
        return this.f46410a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Integer num = this.f46410a;
        Integer numA = ((g) obj).a();
        if (num == null) {
            return numA == null;
        }
        return num.equals(numA);
    }

    public int hashCode() {
        Integer num = this.f46410a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f46410a + "}";
    }
}

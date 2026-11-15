package p135n4;

/* JADX INFO: loaded from: classes2.dex */
final class h extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f46764a;

    static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f46765a;

        b() {
        }

        @Override // n4.r.a
        public r a() {
            return new h(this.f46765a);
        }

        @Override // n4.r.a
        public r.a b(Integer num) {
            this.f46765a = num;
            return this;
        }
    }

    @Override // p135n4.r
    public Integer b() {
        return this.f46764a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f46764a;
        Integer numB = ((r) obj).b();
        if (num == null) {
            return numB == null;
        }
        return num.equals(numB);
    }

    public int hashCode() {
        Integer num = this.f46764a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f46764a + "}";
    }

    private h(Integer num) {
        this.f46764a = num;
    }
}

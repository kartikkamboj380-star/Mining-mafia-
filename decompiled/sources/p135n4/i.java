package p135n4;

/* JADX INFO: loaded from: classes2.dex */
final class i extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f46766a;

    static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private r f46767a;

        b() {
        }

        @Override // n4.s.a
        public s a() {
            return new i(this.f46767a);
        }

        @Override // n4.s.a
        public s.a b(r rVar) {
            this.f46767a = rVar;
            return this;
        }
    }

    @Override // p135n4.s
    public r b() {
        return this.f46766a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f46766a;
        r rVarB = ((s) obj).b();
        if (rVar == null) {
            return rVarB == null;
        }
        return rVar.equals(rVarB);
    }

    public int hashCode() {
        r rVar = this.f46766a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f46766a + "}";
    }

    private i(r rVar) {
        this.f46766a = rVar;
    }
}

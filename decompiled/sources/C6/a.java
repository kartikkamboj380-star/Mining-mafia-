package C6;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.a f384b = d.a.DEFAULT;

    /* JADX INFO: renamed from: C6.a$a, reason: collision with other inner class name */
    private static final class C0014a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a f386b;

        C0014a(int i10, d.a aVar) {
            this.f385a = i10;
            this.f386b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f385a == dVar.tag() && this.f386b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f385a) + (this.f386b.hashCode() ^ 2041407134);
        }

        @Override // C6.d
        public d.a intEncoding() {
            return this.f386b;
        }

        @Override // C6.d
        public int tag() {
            return this.f385a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f385a + "intEncoding=" + this.f386b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0014a(this.f383a, this.f384b);
    }

    public a c(int i10) {
        this.f383a = i10;
        return this;
    }
}

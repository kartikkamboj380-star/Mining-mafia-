package p155p4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable f47859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f47860b;

    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable f47861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f47862b;

        b() {
        }

        @Override // p4.f.a
        public f a() {
            String str = "";
            if (this.f47861a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f47861a, this.f47862b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p4.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f47861a = iterable;
            return this;
        }

        @Override // p4.f.a
        public f.a c(byte[] bArr) {
            this.f47862b = bArr;
            return this;
        }
    }

    @Override // p155p4.f
    public Iterable b() {
        return this.f47859a;
    }

    @Override // p155p4.f
    public byte[] c() {
        return this.f47860b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f47859a.equals(fVar.b())) {
                if (Arrays.equals(this.f47860b, fVar instanceof a ? ((a) fVar).f47860b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f47859a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f47860b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f47859a + ", extras=" + Arrays.toString(this.f47860b) + "}";
    }

    private a(Iterable iterable, byte[] bArr) {
        this.f47859a = iterable;
        this.f47860b = bArr;
    }
}

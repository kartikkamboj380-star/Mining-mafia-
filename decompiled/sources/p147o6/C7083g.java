package p147o6;

import java.util.Arrays;

/* JADX INFO: renamed from: o6.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C7083g extends F.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f47508b;

    /* JADX INFO: renamed from: o6.g$b */
    static final class b extends F.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f47510b;

        b() {
        }

        @Override // o6.F.d.b.a
        public F.d.b a() {
            byte[] bArr;
            String str = this.f47509a;
            if (str != null && (bArr = this.f47510b) != null) {
                return new C7083g(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47509a == null) {
                sb.append(" filename");
            }
            if (this.f47510b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.d.b.a
        public F.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f47510b = bArr;
            return this;
        }

        @Override // o6.F.d.b.a
        public F.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f47509a = str;
            return this;
        }
    }

    @Override // o6.F.d.b
    public byte[] b() {
        return this.f47508b;
    }

    @Override // o6.F.d.b
    public String c() {
        return this.f47507a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.d.b) {
            F.d.b bVar = (F.d.b) obj;
            if (this.f47507a.equals(bVar.c())) {
                if (Arrays.equals(this.f47508b, bVar instanceof C7083g ? ((C7083g) bVar).f47508b : bVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f47507a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f47508b);
    }

    public String toString() {
        return "File{filename=" + this.f47507a + ", contents=" + Arrays.toString(this.f47508b) + "}";
    }

    private C7083g(String str, byte[] bArr) {
        this.f47507a = str;
        this.f47508b = bArr;
    }
}

package p145o4;

import java.util.Arrays;
import p125m4.f;

/* JADX INFO: loaded from: classes2.dex */
final class d extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f47232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f47233c;

    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f47235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f f47236c;

        b() {
        }

        @Override // o4.p.a
        public p a() {
            String str = "";
            if (this.f47234a == null) {
                str = " backendName";
            }
            if (this.f47236c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f47234a, this.f47235b, this.f47236c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o4.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f47234a = str;
            return this;
        }

        @Override // o4.p.a
        public p.a c(byte[] bArr) {
            this.f47235b = bArr;
            return this;
        }

        @Override // o4.p.a
        public p.a d(f fVar) {
            if (fVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f47236c = fVar;
            return this;
        }
    }

    @Override // p145o4.p
    public String b() {
        return this.f47231a;
    }

    @Override // p145o4.p
    public byte[] c() {
        return this.f47232b;
    }

    @Override // p145o4.p
    public f d() {
        return this.f47233c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f47231a.equals(pVar.b())) {
                if (Arrays.equals(this.f47232b, pVar instanceof d ? ((d) pVar).f47232b : pVar.c()) && this.f47233c.equals(pVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f47231a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f47232b)) * 1000003) ^ this.f47233c.hashCode();
    }

    private d(String str, byte[] bArr, f fVar) {
        this.f47231a = str;
        this.f47232b = bArr;
        this.f47233c = fVar;
    }
}

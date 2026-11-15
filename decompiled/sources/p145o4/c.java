package p145o4;

import p125m4.d;
import p125m4.h;

/* JADX INFO: loaded from: classes2.dex */
final class c extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f47221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f47223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f47224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p125m4.c f47225e;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f47226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f47228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h f47229d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p125m4.c f47230e;

        b() {
        }

        @Override // o4.o.a
        public o a() {
            String str = "";
            if (this.f47226a == null) {
                str = " transportContext";
            }
            if (this.f47227b == null) {
                str = str + " transportName";
            }
            if (this.f47228c == null) {
                str = str + " event";
            }
            if (this.f47229d == null) {
                str = str + " transformer";
            }
            if (this.f47230e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f47226a, this.f47227b, this.f47228c, this.f47229d, this.f47230e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o4.o.a
        o.a b(p125m4.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f47230e = cVar;
            return this;
        }

        @Override // o4.o.a
        o.a c(d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f47228c = dVar;
            return this;
        }

        @Override // o4.o.a
        o.a d(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f47229d = hVar;
            return this;
        }

        @Override // o4.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f47226a = pVar;
            return this;
        }

        @Override // o4.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f47227b = str;
            return this;
        }
    }

    @Override // p145o4.o
    public p125m4.c b() {
        return this.f47225e;
    }

    @Override // p145o4.o
    d c() {
        return this.f47223c;
    }

    @Override // p145o4.o
    h e() {
        return this.f47224d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f47221a.equals(oVar.f()) && this.f47222b.equals(oVar.g()) && this.f47223c.equals(oVar.c()) && this.f47224d.equals(oVar.e()) && this.f47225e.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p145o4.o
    public p f() {
        return this.f47221a;
    }

    @Override // p145o4.o
    public String g() {
        return this.f47222b;
    }

    public int hashCode() {
        return ((((((((this.f47221a.hashCode() ^ 1000003) * 1000003) ^ this.f47222b.hashCode()) * 1000003) ^ this.f47223c.hashCode()) * 1000003) ^ this.f47224d.hashCode()) * 1000003) ^ this.f47225e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f47221a + ", transportName=" + this.f47222b + ", event=" + this.f47223c + ", transformer=" + this.f47224d + ", encoding=" + this.f47225e + "}";
    }

    private c(p pVar, String str, d dVar, h hVar, p125m4.c cVar) {
        this.f47221a = pVar;
        this.f47222b = str;
        this.f47223c = dVar;
        this.f47224d = hVar;
        this.f47225e = cVar;
    }
}

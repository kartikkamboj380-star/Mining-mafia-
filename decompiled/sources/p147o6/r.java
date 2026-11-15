package p147o6;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class r extends F.e.d.a.b.AbstractC0501e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f47634c;

    static final class b extends F.e.d.a.b.AbstractC0501e.AbstractC0502a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f47636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f47637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f47638d;

        b() {
        }

        @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0502a
        public F.e.d.a.b.AbstractC0501e a() {
            String str;
            List list;
            if (this.f47638d == 1 && (str = this.f47635a) != null && (list = this.f47637c) != null) {
                return new r(str, this.f47636b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47635a == null) {
                sb.append(" name");
            }
            if ((1 & this.f47638d) == 0) {
                sb.append(" importance");
            }
            if (this.f47637c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0502a
        public F.e.d.a.b.AbstractC0501e.AbstractC0502a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f47637c = list;
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0502a
        public F.e.d.a.b.AbstractC0501e.AbstractC0502a c(int i10) {
            this.f47636b = i10;
            this.f47638d = (byte) (this.f47638d | 1);
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0502a
        public F.e.d.a.b.AbstractC0501e.AbstractC0502a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f47635a = str;
            return this;
        }
    }

    @Override // o6.F.e.d.a.b.AbstractC0501e
    public List b() {
        return this.f47634c;
    }

    @Override // o6.F.e.d.a.b.AbstractC0501e
    public int c() {
        return this.f47633b;
    }

    @Override // o6.F.e.d.a.b.AbstractC0501e
    public String d() {
        return this.f47632a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0501e) {
            F.e.d.a.b.AbstractC0501e abstractC0501e = (F.e.d.a.b.AbstractC0501e) obj;
            if (this.f47632a.equals(abstractC0501e.d()) && this.f47633b == abstractC0501e.c() && this.f47634c.equals(abstractC0501e.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f47632a.hashCode() ^ 1000003) * 1000003) ^ this.f47633b) * 1000003) ^ this.f47634c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f47632a + ", importance=" + this.f47633b + ", frames=" + this.f47634c + "}";
    }

    private r(String str, int i10, List list) {
        this.f47632a = str;
        this.f47633b = i10;
        this.f47634c = list;
    }
}

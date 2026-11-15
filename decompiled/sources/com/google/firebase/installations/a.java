package com.google.firebase.installations;

/* JADX INFO: loaded from: classes3.dex */
final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f40087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f40088c;

    static final class b extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f40089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f40090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f40091c;

        b() {
        }

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f40089a == null) {
                str = " token";
            }
            if (this.f40090b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f40091c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f40089a, this.f40090b.longValue(), this.f40091c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f40089a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j10) {
            this.f40091c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j10) {
            this.f40090b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f40086a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f40088c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f40087b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f40086a.equals(gVar.b()) && this.f40087b == gVar.d() && this.f40088c == gVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f40086a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f40087b;
        long j11 = this.f40088c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f40086a + ", tokenExpirationTimestamp=" + this.f40087b + ", tokenCreationTimestamp=" + this.f40088c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f40086a = str;
        this.f40087b = j10;
        this.f40088c = j11;
    }
}

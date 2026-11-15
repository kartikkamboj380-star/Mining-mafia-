package M6;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f3481p = new C0056a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f3485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f3486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f3487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f3488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f3489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f3490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f3491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f3492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f3493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f3494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f3495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f3496o;

    /* JADX INFO: renamed from: M6.a$a, reason: collision with other inner class name */
    public static final class C0056a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f3497a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3498b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3499c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f3500d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f3501e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f3502f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f3503g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f3504h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f3505i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f3506j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f3507k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private b f3508l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f3509m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f3510n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f3511o = "";

        C0056a() {
        }

        public a a() {
            return new a(this.f3497a, this.f3498b, this.f3499c, this.f3500d, this.f3501e, this.f3502f, this.f3503g, this.f3504h, this.f3505i, this.f3506j, this.f3507k, this.f3508l, this.f3509m, this.f3510n, this.f3511o);
        }

        public C0056a b(String str) {
            this.f3509m = str;
            return this;
        }

        public C0056a c(String str) {
            this.f3503g = str;
            return this;
        }

        public C0056a d(String str) {
            this.f3511o = str;
            return this;
        }

        public C0056a e(b bVar) {
            this.f3508l = bVar;
            return this;
        }

        public C0056a f(String str) {
            this.f3499c = str;
            return this;
        }

        public C0056a g(String str) {
            this.f3498b = str;
            return this;
        }

        public C0056a h(c cVar) {
            this.f3500d = cVar;
            return this;
        }

        public C0056a i(String str) {
            this.f3502f = str;
            return this;
        }

        public C0056a j(int i10) {
            this.f3504h = i10;
            return this;
        }

        public C0056a k(long j10) {
            this.f3497a = j10;
            return this;
        }

        public C0056a l(d dVar) {
            this.f3501e = dVar;
            return this;
        }

        public C0056a m(String str) {
            this.f3506j = str;
            return this;
        }

        public C0056a n(int i10) {
            this.f3505i = i10;
            return this;
        }
    }

    public enum b implements C6.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3516a;

        b(int i10) {
            this.f3516a = i10;
        }

        @Override // C6.c
        public int getNumber() {
            return this.f3516a;
        }
    }

    public enum c implements C6.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3522a;

        c(int i10) {
            this.f3522a = i10;
        }

        @Override // C6.c
        public int getNumber() {
            return this.f3522a;
        }
    }

    public enum d implements C6.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3528a;

        d(int i10) {
            this.f3528a = i10;
        }

        @Override // C6.c
        public int getNumber() {
            return this.f3528a;
        }
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f3482a = j10;
        this.f3483b = str;
        this.f3484c = str2;
        this.f3485d = cVar;
        this.f3486e = dVar;
        this.f3487f = str3;
        this.f3488g = str4;
        this.f3489h = i10;
        this.f3490i = i11;
        this.f3491j = str5;
        this.f3492k = j11;
        this.f3493l = bVar;
        this.f3494m = str6;
        this.f3495n = j12;
        this.f3496o = str7;
    }

    public static C0056a p() {
        return new C0056a();
    }

    public String a() {
        return this.f3494m;
    }

    public long b() {
        return this.f3492k;
    }

    public long c() {
        return this.f3495n;
    }

    public String d() {
        return this.f3488g;
    }

    public String e() {
        return this.f3496o;
    }

    public b f() {
        return this.f3493l;
    }

    public String g() {
        return this.f3484c;
    }

    public String h() {
        return this.f3483b;
    }

    public c i() {
        return this.f3485d;
    }

    public String j() {
        return this.f3487f;
    }

    public int k() {
        return this.f3489h;
    }

    public long l() {
        return this.f3482a;
    }

    public d m() {
        return this.f3486e;
    }

    public String n() {
        return this.f3491j;
    }

    public int o() {
        return this.f3490i;
    }
}

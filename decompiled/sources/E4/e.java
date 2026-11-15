package E4;

import B4.x;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f574g;

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private x f579e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f575a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f576b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f577c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f578d = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f580f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f581g = false;

        public e a() {
            return new e(this, null);
        }

        public a b(int i10) {
            this.f580f = i10;
            return this;
        }

        public a c(int i10) {
            this.f576b = i10;
            return this;
        }

        public a d(int i10) {
            this.f577c = i10;
            return this;
        }

        public a e(boolean z9) {
            this.f581g = z9;
            return this;
        }

        public a f(boolean z9) {
            this.f578d = z9;
            return this;
        }

        public a g(boolean z9) {
            this.f575a = z9;
            return this;
        }

        public a h(x xVar) {
            this.f579e = xVar;
            return this;
        }

        final /* synthetic */ boolean i() {
            return this.f575a;
        }

        final /* synthetic */ int j() {
            return this.f576b;
        }

        final /* synthetic */ int k() {
            return this.f577c;
        }

        final /* synthetic */ boolean l() {
            return this.f578d;
        }

        final /* synthetic */ x m() {
            return this.f579e;
        }

        final /* synthetic */ int n() {
            return this.f580f;
        }

        final /* synthetic */ boolean o() {
            return this.f581g;
        }
    }

    /* synthetic */ e(a aVar, byte[] bArr) {
        this.f568a = aVar.i();
        this.f569b = aVar.j();
        this.f570c = aVar.k();
        this.f571d = aVar.l();
        this.f572e = aVar.n();
        this.f573f = aVar.m();
        this.f574g = aVar.o();
    }

    public int a() {
        return this.f572e;
    }

    public int b() {
        return this.f569b;
    }

    public int c() {
        return this.f570c;
    }

    public x d() {
        return this.f573f;
    }

    public boolean e() {
        return this.f571d;
    }

    public boolean f() {
        return this.f568a;
    }

    public final boolean g() {
        return this.f574g;
    }
}

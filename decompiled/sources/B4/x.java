package B4;

import H4.a2;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f283c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f284a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f285b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f286c = false;

        public x a() {
            return new x(this, null);
        }

        public a b(boolean z9) {
            this.f286c = z9;
            return this;
        }

        public a c(boolean z9) {
            this.f285b = z9;
            return this;
        }

        public a d(boolean z9) {
            this.f284a = z9;
            return this;
        }

        final /* synthetic */ boolean e() {
            return this.f284a;
        }

        final /* synthetic */ boolean f() {
            return this.f285b;
        }

        final /* synthetic */ boolean g() {
            return this.f286c;
        }
    }

    /* synthetic */ x(a aVar, byte[] bArr) {
        this.f281a = aVar.e();
        this.f282b = aVar.f();
        this.f283c = aVar.g();
    }

    public boolean a() {
        return this.f283c;
    }

    public boolean b() {
        return this.f282b;
    }

    public boolean c() {
        return this.f281a;
    }

    public x(a2 a2Var) {
        this.f281a = a2Var.f1258a;
        this.f282b = a2Var.f1259b;
        this.f283c = a2Var.f1260c;
    }
}

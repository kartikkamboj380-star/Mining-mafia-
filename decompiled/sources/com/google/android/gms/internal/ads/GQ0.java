package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class GQ0 implements InterfaceC3358eS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PS0 f19041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FQ0 f19042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ES0 f19043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC3358eS0 f19044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19045e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19046f;

    public GQ0(FQ0 fq0, InterfaceC3471fM interfaceC3471fM) {
        this.f19042b = fq0;
        this.f19041a = new PS0(interfaceC3471fM);
    }

    public final void a() {
        this.f19046f = true;
        this.f19041a.a();
    }

    public final void b() {
        this.f19046f = false;
        this.f19041a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358eS0
    public final boolean c() {
        if (this.f19045e) {
            return false;
        }
        InterfaceC3358eS0 interfaceC3358eS0 = this.f19044d;
        interfaceC3358eS0.getClass();
        return interfaceC3358eS0.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358eS0
    public final C3122ca d() {
        InterfaceC3358eS0 interfaceC3358eS0 = this.f19044d;
        return interfaceC3358eS0 != null ? interfaceC3358eS0.d() : this.f19041a.d();
    }

    public final void e(long j10) {
        this.f19041a.e(j10);
    }

    public final void f(ES0 es0) throws LQ0 {
        InterfaceC3358eS0 interfaceC3358eS0;
        InterfaceC3358eS0 interfaceC3358eS0Zzd = es0.zzd();
        if (interfaceC3358eS0Zzd == null || interfaceC3358eS0Zzd == (interfaceC3358eS0 = this.f19044d)) {
            return;
        }
        if (interfaceC3358eS0 != null) {
            throw LQ0.c(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f19044d = interfaceC3358eS0Zzd;
        this.f19043c = es0;
        interfaceC3358eS0Zzd.v(this.f19041a.d());
    }

    public final void g(ES0 es0) {
        if (es0 == this.f19043c) {
            this.f19044d = null;
            this.f19043c = null;
            this.f19045e = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    public final long h(boolean z9) {
        PS0 ps0;
        C3122ca c3122caD;
        ES0 es0 = this.f19043c;
        if (es0 == null || es0.G() || ((z9 && this.f19043c.zze() != 2) || (!this.f19043c.x() && (z9 || this.f19043c.C())))) {
            this.f19045e = true;
            if (this.f19046f) {
                this.f19041a.a();
            }
        } else {
            InterfaceC3358eS0 interfaceC3358eS0 = this.f19044d;
            interfaceC3358eS0.getClass();
            long jZzg = interfaceC3358eS0.zzg();
            if (this.f19045e) {
                PS0 ps1 = this.f19041a;
                if (jZzg < ps1.zzg()) {
                    ps1.b();
                } else {
                    this.f19045e = false;
                    if (this.f19046f) {
                        ps1.a();
                    }
                    ps0 = this.f19041a;
                    ps0.e(jZzg);
                    c3122caD = interfaceC3358eS0.d();
                    if (!c3122caD.equals(ps0.d())) {
                        ps0.v(c3122caD);
                        this.f19042b.f(c3122caD);
                    }
                }
            } else {
                ps0 = this.f19041a;
                ps0.e(jZzg);
                c3122caD = interfaceC3358eS0.d();
                if (!c3122caD.equals(ps0.d())) {
                    ps0.v(c3122caD);
                    this.f19042b.f(c3122caD);
                }
            }
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358eS0
    public final void v(C3122ca c3122ca) {
        InterfaceC3358eS0 interfaceC3358eS0 = this.f19044d;
        if (interfaceC3358eS0 != null) {
            interfaceC3358eS0.v(c3122ca);
            c3122ca = this.f19044d.d();
        }
        this.f19041a.v(c3122ca);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358eS0
    public final long zzg() {
        if (this.f19045e) {
            return this.f19041a.zzg();
        }
        InterfaceC3358eS0 interfaceC3358eS0 = this.f19044d;
        interfaceC3358eS0.getClass();
        return interfaceC3358eS0.zzg();
    }
}

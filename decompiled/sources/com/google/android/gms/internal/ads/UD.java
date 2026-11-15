package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class UD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489fV f23947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6019zb0 f23948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2128Nd0 f23949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4453nA f23950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3679h00 f23951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TI f23952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C5011rb0 f23953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RV f23954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CF f23955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Executor f23956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final CV f23957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C5004rY f23958l;

    UD(C3489fV c3489fV, C6019zb0 c6019zb0, C2128Nd0 c2128Nd0, C4453nA c4453nA, C3679h00 c3679h00, TI ti, C5011rb0 c5011rb0, RV rv, CF cf, Executor executor, CV cv, C5004rY c5004rY) {
        this.f23947a = c3489fV;
        this.f23948b = c6019zb0;
        this.f23949c = c2128Nd0;
        this.f23950d = c4453nA;
        this.f23951e = c3679h00;
        this.f23952f = ti;
        this.f23953g = c5011rb0;
        this.f23954h = rv;
        this.f23955i = cf;
        this.f23956j = executor;
        this.f23957k = cv;
        this.f23958l = c5004rY;
    }

    public final com.google.common.util.concurrent.p a(com.google.common.util.concurrent.p pVar) {
        if (this.f23953g != null) {
            C2128Nd0 c2128Nd0 = this.f23949c;
            EnumC1817Hd0 enumC1817Hd0 = EnumC1817Hd0.SERVER_TRANSACTION;
            Objects.requireNonNull(c2128Nd0);
            return AbstractC5897yd0.a(AbstractC5685wx0.a(this.f23953g), enumC1817Hd0, c2128Nd0).i();
        }
        G4.t.n().b();
        C1661Ed0 c1661Ed0A = this.f23949c.a(EnumC1817Hd0.SERVER_TRANSACTION, pVar);
        final CV cv = this.f23957k;
        Objects.requireNonNull(cv);
        return c1661Ed0A.c(new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.TD
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return cv.a((C5420ur) obj);
            }
        }).i();
    }

    public final com.google.common.util.concurrent.p b() {
        C6019zb0 c6019zb0 = this.f23948b;
        if (!c6019zb0.f35813v) {
            H4.h2 h2Var = c6019zb0.f35795d;
            if (h2Var.f1286O != null || h2Var.f1281J != null) {
                C2128Nd0 c2128Nd0 = this.f23949c;
                EnumC1817Hd0 enumC1817Hd0 = EnumC1817Hd0.PRELOADED_LOADER;
                Objects.requireNonNull(c2128Nd0);
                return AbstractC5897yd0.a(this.f23947a.a(), enumC1817Hd0, c2128Nd0).i();
            }
        }
        return a(this.f23955i.b());
    }

    public final com.google.common.util.concurrent.p c(com.google.common.util.concurrent.p pVar) {
        C1661Ed0 c1661Ed0C = this.f23949c.a(EnumC1817Hd0.RENDERER, pVar).b(new InterfaceC4386md0() { // from class: com.google.android.gms.internal.ads.SD
            @Override // com.google.android.gms.internal.ads.InterfaceC4386md0
            public final /* synthetic */ Object zza(Object obj) {
                C5011rb0 c5011rb0 = (C5011rb0) obj;
                this.f23150a.i(c5011rb0);
                return c5011rb0;
            }
        }).c(this.f23951e);
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29516B6)).booleanValue()) {
            c1661Ed0C = c1661Ed0C.h(((Integer) H4.B.c().d(AbstractC3892ii.f29526C6)).intValue(), TimeUnit.SECONDS);
        }
        return c1661Ed0C.i();
    }

    public final TI d() {
        return this.f23952f;
    }

    public final com.google.common.util.concurrent.p e(final C5769xc0 c5769xc0) {
        C5393ud0 c5393ud0I = this.f23949c.a(EnumC1817Hd0.GET_CACHE_KEY, this.f23955i.b()).c(new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.RD
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f22757a.j(c5769xc0, (C5420ur) obj);
            }
        }).i();
        AbstractC5685wx0.r(c5393ud0I, new PD(this), this.f23956j);
        return c5393ud0I;
    }

    public final com.google.common.util.concurrent.p f(C5420ur c5420ur) {
        C5393ud0 c5393ud0I = this.f23949c.a(EnumC1817Hd0.NOTIFY_CACHE_HIT, this.f23954h.b(c5420ur)).i();
        AbstractC5685wx0.r(c5393ud0I, new QD(this), this.f23956j);
        return c5393ud0I;
    }

    public final H4.Z0 g(Throwable th) {
        return AbstractC3127cc0.b(th, this.f23958l);
    }

    public final void h(C5011rb0 c5011rb0) {
        this.f23953g = c5011rb0;
    }

    final /* synthetic */ C5011rb0 i(C5011rb0 c5011rb0) {
        this.f23950d.a(c5011rb0);
        return c5011rb0;
    }

    final /* synthetic */ com.google.common.util.concurrent.p j(C5769xc0 c5769xc0, C5420ur c5420ur) {
        c5420ur.f33916i = c5769xc0;
        return this.f23954h.a(c5420ur);
    }

    final /* synthetic */ TI k() {
        return this.f23952f;
    }
}

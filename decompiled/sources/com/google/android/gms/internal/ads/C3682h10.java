package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3682h10 implements InterfaceC4375mY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1618Di f28813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f28814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2128Nd0 f28815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4939r10 f28816d;

    public C3682h10(C2128Nd0 c2128Nd0, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, InterfaceC1618Di interfaceC1618Di, C4939r10 c4939r10) {
        this.f28815c = c2128Nd0;
        this.f28814b = interfaceExecutorServiceC1805Gx0;
        this.f28813a = interfaceC1618Di;
        this.f28816d = c4939r10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4375mY
    public final boolean a(C5011rb0 c5011rb0, C3502fb0 c3502fb0) {
        C4130kb0 c4130kb0;
        return (this.f28813a == null || (c4130kb0 = c3502fb0.f28431s) == null || c4130kb0.f30842a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4375mY
    public final com.google.common.util.concurrent.p b(C5011rb0 c5011rb0, C3502fb0 c3502fb0) {
        C2575Vt c2575Vt = new C2575Vt();
        C4310m10 c4310m10 = new C4310m10();
        c4310m10.b(new C3430f10(this, c2575Vt, c5011rb0, c3502fb0, c4310m10));
        C4130kb0 c4130kb0 = c3502fb0.f28431s;
        final BinderC5906yi binderC5906yi = new BinderC5906yi(c4310m10, c4130kb0.f30843b, c4130kb0.f30842a);
        EnumC1817Hd0 enumC1817Hd0 = EnumC1817Hd0.CUSTOM_RENDER_SYN;
        C2128Nd0 c2128Nd0 = this.f28815c;
        Objects.requireNonNull(c2128Nd0);
        return AbstractC5897yd0.d(new InterfaceC5267td0() { // from class: com.google.android.gms.internal.ads.g10
            @Override // com.google.android.gms.internal.ads.InterfaceC5267td0
            public final /* synthetic */ void zza() {
                this.f28543a.c(binderC5906yi);
            }
        }, this.f28814b, enumC1817Hd0, c2128Nd0).j(EnumC1817Hd0.CUSTOM_RENDER_ACK).e(c2575Vt).i();
    }

    final /* synthetic */ void c(BinderC5906yi binderC5906yi) {
        this.f28813a.W1(binderC5906yi);
    }

    final /* synthetic */ C4939r10 d() {
        return this.f28816d;
    }
}

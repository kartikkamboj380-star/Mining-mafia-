package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3053c10 implements InterfaceC4375mY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LC f26988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1618Di f26989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f26990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2128Nd0 f26991e;

    public C3053c10(Context context, LC lc, C2128Nd0 c2128Nd0, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, InterfaceC1618Di interfaceC1618Di) {
        this.f26987a = context;
        this.f26988b = lc;
        this.f26991e = c2128Nd0;
        this.f26990d = interfaceExecutorServiceC1805Gx0;
        this.f26989c = interfaceC1618Di;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4375mY
    public final boolean a(C5011rb0 c5011rb0, C3502fb0 c3502fb0) {
        C4130kb0 c4130kb0;
        return (this.f26989c == null || (c4130kb0 = c3502fb0.f28431s) == null || c4130kb0.f30842a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4375mY
    public final com.google.common.util.concurrent.p b(C5011rb0 c5011rb0, C3502fb0 c3502fb0) {
        Y00 y00 = new Y00(this, new View(this.f26987a), null, C2802a10.f26388a, (C3628gb0) c3502fb0.f28435u.get(0));
        AbstractC3451fC abstractC3451fCE = this.f26988b.e(new FD(c5011rb0, c3502fb0, null), y00);
        C2928b10 c2928b10K = abstractC3451fCE.k();
        C4130kb0 c4130kb0 = c3502fb0.f28431s;
        final BinderC5906yi binderC5906yi = new BinderC5906yi(c2928b10K, c4130kb0.f30843b, c4130kb0.f30842a);
        EnumC1817Hd0 enumC1817Hd0 = EnumC1817Hd0.CUSTOM_RENDER_SYN;
        C2128Nd0 c2128Nd0 = this.f26991e;
        Objects.requireNonNull(c2128Nd0);
        return AbstractC5897yd0.d(new InterfaceC5267td0() { // from class: com.google.android.gms.internal.ads.Z00
            @Override // com.google.android.gms.internal.ads.InterfaceC5267td0
            public final /* synthetic */ void zza() {
                this.f26069a.c(binderC5906yi);
            }
        }, this.f26990d, enumC1817Hd0, c2128Nd0).j(EnumC1817Hd0.CUSTOM_RENDER_ACK).e(AbstractC5685wx0.a(abstractC3451fCE.h())).i();
    }

    final /* synthetic */ void c(BinderC5906yi binderC5906yi) {
        this.f26989c.W1(binderC5906yi);
    }
}

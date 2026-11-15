package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3857iQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5138sc f29387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2293Qi f29388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L4.a f29389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final G4.a f29390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2703Yf f29391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DH f29392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final KX f29393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1605Db0 f29394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final QR f29395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1908Ix f29396k;

    public C3857iQ(C2633Ww c2633Ww, Context context, C5138sc c5138sc, C2293Qi c2293Qi, L4.a aVar, G4.a aVar2, C2703Yf c2703Yf, DH dh, KX kx, C1605Db0 c1605Db0, QR qr, C1908Ix c1908Ix) {
        this.f29386a = context;
        this.f29387b = c5138sc;
        this.f29388c = c2293Qi;
        this.f29389d = aVar;
        this.f29390e = aVar2;
        this.f29391f = c2703Yf;
        this.f29392g = dh;
        this.f29393h = kx;
        this.f29394i = c1605Db0;
        this.f29395j = qr;
        this.f29396k = c1908Ix;
    }

    public final InterfaceC1750Fw a(H4.m2 m2Var, C3502fb0 c3502fb0, C3880ib0 c3880ib0) throws C2581Vw {
        C2479Tx c2479TxA = C2479Tx.a(m2Var);
        String str = m2Var.f1371a;
        XP xp = new XP(this);
        C5138sc c5138sc = this.f29387b;
        KX kx = this.f29393h;
        InterfaceC1750Fw interfaceC1750FwA = C2633Ww.a(this.f29386a, c2479TxA, str, false, false, c5138sc, this.f29388c, this.f29389d, null, xp, this.f29390e, this.f29391f, c3502fb0, c3880ib0, kx, this.f29394i, this.f29395j);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Af)).booleanValue()) {
            this.f29396k.a(interfaceC1750FwA.A());
        }
        return interfaceC1750FwA;
    }

    final /* synthetic */ DH b() {
        return this.f29392g;
    }
}

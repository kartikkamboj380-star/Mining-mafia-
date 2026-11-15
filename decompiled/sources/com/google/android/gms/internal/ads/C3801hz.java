package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3801hz implements KS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4529nm f29158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2325Qy f29159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3801hz f29160d = this;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final InterfaceC4864qQ0 f29161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final InterfaceC4864qQ0 f29162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final InterfaceC4864qQ0 f29163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final InterfaceC4864qQ0 f29164h;

    C3801hz(C2325Qy c2325Qy, Context context, InterfaceC4529nm interfaceC4529nm) {
        this.f29159c = c2325Qy;
        this.f29157a = context;
        this.f29158b = interfaceC4529nm;
        InterfaceC3732hQ0 interfaceC3732hQ0A = C3858iQ0.a(this);
        this.f29161e = interfaceC3732hQ0A;
        InterfaceC3732hQ0 interfaceC3732hQ0A2 = C3858iQ0.a(interfaceC4529nm);
        this.f29162f = interfaceC3732hQ0A2;
        GS gsB = GS.b(interfaceC3732hQ0A2);
        this.f29163g = gsB;
        this.f29164h = C3606gQ0.a(IS.a(interfaceC3732hQ0A, gsB));
    }

    final FS a() {
        return GS.c(this.f29158b);
    }

    final /* synthetic */ Context b() {
        return this.f29157a;
    }

    @Override // com.google.android.gms.internal.ads.KS
    public final HS zzb() {
        return (HS) this.f29164h.zzb();
    }

    @Override // com.google.android.gms.internal.ads.KS
    public final CS zzc() {
        return new C3423ez(this.f29159c, this.f29160d, null);
    }
}

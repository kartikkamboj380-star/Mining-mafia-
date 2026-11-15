package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ML implements ZF, SJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2365Rs f20802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f20803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2521Us f20804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f20805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final EnumC3385eg f20807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3502fb0 f20808g;

    public ML(C2365Rs c2365Rs, Context context, C2521Us c2521Us, View view, EnumC3385eg enumC3385eg, C3502fb0 c3502fb0) {
        this.f20802a = c2365Rs;
        this.f20803b = context;
        this.f20804c = c2521Us;
        this.f20805d = view;
        this.f20807f = enumC3385eg;
        this.f20808g = c3502fb0;
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.SJ
    public final void c() {
        EnumC3385eg enumC3385eg = this.f20807f;
        if (enumC3385eg != EnumC3385eg.APP_OPEN && this.f20808g.f28374G0) {
            String strF = this.f20804c.f(this.f20803b);
            this.f20806e = strF;
            this.f20806e = String.valueOf(strF).concat(enumC3385eg == EnumC3385eg.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void d0() {
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void k() {
        if (this.f20808g.f28374G0) {
            this.f20802a.b(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void o() {
        if (this.f20808g.f28374G0) {
            View view = this.f20805d;
            if (view != null && this.f20806e != null) {
                this.f20804c.g(view.getContext(), this.f20806e);
            }
            this.f20802a.b(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void p(InterfaceC1896Ir interfaceC1896Ir, String str, String str2) {
        C2521Us c2521Us = this.f20804c;
        Context context = this.f20803b;
        if (c2521Us.a(context) && this.f20808g.f28374G0) {
            try {
                c2521Us.o(context, c2521Us.j(context), this.f20802a.e(), interfaceC1896Ir.zzb(), interfaceC1896Ir.zzc());
            } catch (RemoteException e10) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.g("Remote Exception to get reward item.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.SJ
    public final void zzg() {
    }
}

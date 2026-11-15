package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC3277dp extends AbstractBinderC2046Lo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N4.D f27515a;

    public BinderC3277dp(N4.D d10) {
        this.f27515a = d10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final void B4(com.google.android.gms.dynamic.a aVar) {
        this.f27515a.K((View) com.google.android.gms.dynamic.b.h0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final com.google.android.gms.dynamic.a a() {
        View viewO = this.f27515a.O();
        if (viewO == null) {
            return null;
        }
        return com.google.android.gms.dynamic.b.N0(viewO);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final List b() {
        List<E4.d> listK = this.f27515a.k();
        ArrayList arrayList = new ArrayList();
        if (listK != null) {
            for (E4.d dVar : listK) {
                arrayList.add(new BinderC1984Kj(dVar.a(), dVar.c(), dVar.b(), dVar.d(), dVar.e(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final InterfaceC2763Zj c() {
        E4.d dVarJ = this.f27515a.j();
        if (dVarJ != null) {
            return new BinderC1984Kj(dVarJ.a(), dVarJ.c(), dVarJ.b(), dVarJ.d(), dVarJ.e(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final String d() {
        return this.f27515a.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final String e() {
        return this.f27515a.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final Bundle f() {
        return this.f27515a.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final boolean g() {
        return this.f27515a.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final com.google.android.gms.dynamic.a h() {
        View viewB = this.f27515a.b();
        if (viewB == null) {
            return null;
        }
        return com.google.android.gms.dynamic.b.N0(viewB);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final void i1(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        HashMap map = (HashMap) com.google.android.gms.dynamic.b.h0(aVar2);
        HashMap map2 = (HashMap) com.google.android.gms.dynamic.b.h0(aVar3);
        this.f27515a.J((View) com.google.android.gms.dynamic.b.h0(aVar), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final com.google.android.gms.dynamic.a l() {
        Object objP = this.f27515a.P();
        if (objP == null) {
            return null;
        }
        return com.google.android.gms.dynamic.b.N0(objP);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final float m() {
        return this.f27515a.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final void q() {
        this.f27515a.t();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final float s() {
        return this.f27515a.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final float y() {
        return this.f27515a.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final void y0(com.google.android.gms.dynamic.a aVar) {
        this.f27515a.r((View) com.google.android.gms.dynamic.b.h0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final void z() {
        this.f27515a.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final String zze() {
        return this.f27515a.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final String zzg() {
        return this.f27515a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final String zzi() {
        return this.f27515a.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final double zzk() {
        N4.D d10 = this.f27515a;
        if (d10.p() != null) {
            return d10.p().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final String zzl() {
        return this.f27515a.q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final InterfaceC0591d1 zzn() {
        N4.D d10 = this.f27515a;
        if (d10.N() != null) {
            return d10.N().c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final InterfaceC2399Sj zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2097Mo
    public final boolean zzu() {
        return this.f27515a.m();
    }
}

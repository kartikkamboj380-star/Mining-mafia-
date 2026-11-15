package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class CQ0 implements InterfaceC4683p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f17872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4748pV0 f17873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ EQ0 f17874c;

    public CQ0(EQ0 eq0, C4748pV0 c4748pV0) {
        Objects.requireNonNull(eq0);
        this.f17874c = eq0;
        this.f17872a = new HashMap();
        this.f17873b = c4748pV0;
    }

    private final void c(C4431n c4431n) {
        C4748pV0 c4748pV0 = (C4748pV0) this.f17872a.remove(c4431n);
        c4748pV0.getClass();
        DQ0 dq0 = (DQ0) this.f17874c.l().get(c4748pV0);
        if (dq0 != null) {
            dq0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4683p
    public final synchronized void a(C4431n c4431n) {
        this.f17874c.k().a(c4431n);
        c(c4431n);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4683p
    public final synchronized void b(InterfaceC4557o interfaceC4557o) {
        this.f17874c.k().b(interfaceC4557o);
        while (interfaceC4557o != null) {
            c(interfaceC4557o.zzd());
            interfaceC4557o = interfaceC4557o.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4683p
    public final synchronized C4431n zza() {
        C4431n c4431nZza;
        EQ0 eq0 = this.f17874c;
        C5438v c5438vK = eq0.k();
        HashMap map = this.f17872a;
        c4431nZza = c5438vK.zza();
        C4748pV0 c4748pV0 = this.f17873b;
        map.put(c4431nZza, c4748pV0);
        DQ0 dq0 = (DQ0) eq0.l().get(c4748pV0);
        if (dq0 != null) {
            dq0.a();
        }
        return c4431nZza;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4683p
    public final synchronized void zzd() {
        this.f17874c.k().zzd();
    }
}

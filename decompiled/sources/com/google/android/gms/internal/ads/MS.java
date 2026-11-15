package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class MS implements BS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BinderC4438n20 f20835b;

    MS(long j10, Context context, FS fs, AbstractC2791Zx abstractC2791Zx, String str) {
        this.f20834a = j10;
        InterfaceC4002ja0 interfaceC4002ja0W = abstractC2791Zx.w();
        interfaceC4002ja0W.b(context);
        interfaceC4002ja0W.a(new H4.m2());
        interfaceC4002ja0W.H(str);
        BinderC4438n20 binderC4438n20Zza = interfaceC4002ja0W.zza().zza();
        this.f20835b = binderC4438n20Zza;
        binderC4438n20Zza.J4(new LS(this, fs));
    }

    @Override // com.google.android.gms.internal.ads.BS
    public final void a(H4.h2 h2Var) {
        this.f20835b.v0(h2Var);
    }

    final /* synthetic */ long b() {
        return this.f20834a;
    }

    @Override // com.google.android.gms.internal.ads.BS
    public final void zzb() {
        this.f20835b.u3(com.google.android.gms.dynamic.b.N0(null));
    }

    @Override // com.google.android.gms.internal.ads.BS
    public final void zzc() {
        this.f20835b.zzc();
    }
}

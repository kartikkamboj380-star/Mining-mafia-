package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class K90 implements V90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FF f20113a;

    @Override // com.google.android.gms.internal.ads.V90
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.p a(W90 w90, U90 u90, Object obj) {
        return c(w90, u90, null);
    }

    @Override // com.google.android.gms.internal.ads.V90
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized FF zzd() {
        return this.f20113a;
    }

    public final synchronized com.google.common.util.concurrent.p c(W90 w90, U90 u90, FF ff) {
        UD udZza;
        try {
            if (ff != null) {
                this.f20113a = ff;
            } else {
                this.f20113a = (FF) u90.a(w90.f24720b).c();
            }
            udZza = this.f20113a.zza();
        } catch (Throwable th) {
            throw th;
        }
        return udZza.c(udZza.b());
    }
}

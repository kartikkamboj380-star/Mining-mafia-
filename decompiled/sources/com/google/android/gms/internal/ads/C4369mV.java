package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4369mV implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f31525a;

    C4369mV(Context context) {
        this.f31525a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        if (((Boolean) AbstractC3015bj.f26903h.e()).booleanValue() && (th instanceof K4.A)) {
            AbstractC2447Th.e(this.f31525a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) AbstractC3015bj.f26905j.e()).booleanValue()) {
            AbstractC2447Th.e(this.f31525a);
        }
    }
}

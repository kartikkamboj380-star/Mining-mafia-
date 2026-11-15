package com.google.android.gms.internal.ads;

import H4.C0654z;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4196l70 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31198b;

    C4196l70(int i10, int i11) {
        this.f31197a = i10;
        this.f31198b = i11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        Bundle bundle = ((AF) obj).f17275a;
        int i11 = this.f31197a;
        if (i11 == -1 || (i10 = this.f31198b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i11);
        bundle.putInt("crashes_without_flags", i10);
        int i12 = C0654z.f1469h;
        if (H4.B.c().c()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}

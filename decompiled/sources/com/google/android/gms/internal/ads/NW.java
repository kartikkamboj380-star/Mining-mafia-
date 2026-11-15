package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.database.sqlite.SQLiteDatabase;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class NW implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4386md0 f21266a;

    NW(PW pw, InterfaceC4386md0 interfaceC4386md0) {
        this.f21266a = interfaceC4386md0;
        Objects.requireNonNull(pw);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        int i10 = AbstractC0786o0.f2696b;
        L4.p.c("Failed to get offline signal database: ".concat(strValueOf));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f21266a.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            int i10 = AbstractC0786o0.f2696b;
            L4.p.c("Error executing function on offline signal database: ".concat(strValueOf));
        }
    }
}

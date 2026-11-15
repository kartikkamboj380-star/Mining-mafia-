package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.database.sqlite.SQLiteDatabase;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5002rX implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4386md0 f32918a;

    C5002rX(C5884yX c5884yX, InterfaceC4386md0 interfaceC4386md0) {
        this.f32918a = interfaceC4386md0;
        Objects.requireNonNull(c5884yX);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        int i10 = AbstractC0786o0.f2696b;
        L4.p.c("Failed to get offline buffered ping database: ".concat(strValueOf));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f32918a.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            int i10 = AbstractC0786o0.f2696b;
            L4.p.c("Error executing function on offline buffered ping database: ".concat(strValueOf));
        }
    }
}

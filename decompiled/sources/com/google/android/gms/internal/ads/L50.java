package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class L50 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f20374b;

    L50(Context context, Intent intent) {
        this.f20373a = context;
        this.f20374b = intent;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        AbstractC0786o0.k("HsdpMigrationSignal.produce");
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.ne)).booleanValue()) {
            return AbstractC5685wx0.a(new M50(null));
        }
        boolean z9 = false;
        try {
            if (this.f20374b.resolveActivity(this.f20373a.getPackageManager()) != null) {
                AbstractC0786o0.k("HSDP intent is supported");
                z9 = true;
            }
        } catch (Exception e10) {
            G4.t.l().j(e10, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return AbstractC5685wx0.a(new M50(Boolean.valueOf(z9)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 60;
    }
}

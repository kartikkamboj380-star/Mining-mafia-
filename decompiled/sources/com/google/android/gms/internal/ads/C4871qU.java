package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4871qU implements IH, AK, OG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QR f32647b;

    C4871qU(Context context, QR qr) {
        this.f32646a = context;
        this.f32647b = qr;
    }

    private final void c(final Context context) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f30039z5)).booleanValue()) {
            AbstractC2315Qt.f22473a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pU
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f32398a.b(context);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void D0(C5420ur c5420ur) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29515B5)).booleanValue()) {
            c(this.f32646a);
        }
    }

    @Override // com.google.android.gms.internal.ads.AK
    public final void a(Q4.M m10) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29525C5)).booleanValue()) {
            c(this.f32646a);
        }
    }

    final /* synthetic */ void b(Context context) {
        G4.t.r().c(context, this.f32647b);
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void i(C5011rb0 c5011rb0) {
    }

    @Override // com.google.android.gms.internal.ads.AK
    public final void k(String str) {
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void zzg() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29535D5)).booleanValue()) {
            c(this.f32646a);
        }
    }
}

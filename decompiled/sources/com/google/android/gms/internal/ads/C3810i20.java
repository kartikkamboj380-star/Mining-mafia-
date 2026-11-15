package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3810i20 implements InterfaceC5096sH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f29239a = new AtomicReference();

    public final void a(H4.S0 s10) {
        this.f29239a.set(s10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5096sH
    public final void j(final H4.o2 o2Var) {
        J90.a(this.f29239a, new I90() { // from class: com.google.android.gms.internal.ads.h20
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((H4.S0) obj).a6(o2Var);
            }
        });
    }
}

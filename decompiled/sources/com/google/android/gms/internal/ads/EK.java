package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class EK extends AbstractC3214dJ {
    EK(Set set) {
        super(set);
    }

    public final synchronized void j(final String str) {
        g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.BK
            @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
            public final /* synthetic */ void zza(Object obj) {
                ((AK) obj).k(str);
            }
        });
    }

    public final synchronized void j1(final Q4.M m10) {
        g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.DK
            @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
            public final /* synthetic */ void zza(Object obj) {
                ((AK) obj).a(m10);
            }
        });
    }
}

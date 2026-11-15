package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class II extends AbstractC3214dJ implements InterfaceC3270dl {
    public II(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3270dl
    public final synchronized void I0(final String str, final String str2) {
        g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.HI
            @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
            public final /* synthetic */ void zza(Object obj) {
                ((C4.e) obj).v(str, str2);
            }
        });
    }
}

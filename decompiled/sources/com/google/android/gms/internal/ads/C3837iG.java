package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3837iG extends AbstractC3214dJ implements InterfaceC3208dG {
    public C3837iG(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208dG
    public final void H0(final H4.Z0 z9) {
        g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.hG
            @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC4717pG) obj).e(z9);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208dG
    public final void P(final GL gl) {
        g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.fG
            @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
            public final /* synthetic */ void zza(Object obj) {
                InterfaceC4717pG interfaceC4717pG = (InterfaceC4717pG) obj;
                String message = gl.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                interfaceC4717pG.e(AbstractC3127cc0.d(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208dG
    public final void zze() {
        g1(C3585gG.f28608a);
    }
}

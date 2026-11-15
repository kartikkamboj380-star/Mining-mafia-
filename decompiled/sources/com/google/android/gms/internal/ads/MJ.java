package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class MJ extends AbstractC3214dJ implements OJ {
    public MJ(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.OJ
    public final void b() {
        g1(KJ.f20167a);
    }

    @Override // com.google.android.gms.internal.ads.OJ
    public final void d0(String str) {
        final String str2 = "MalformedJson";
        g1(new InterfaceC3088cJ(str2) { // from class: com.google.android.gms.internal.ads.IJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
            public final /* synthetic */ void zza(Object obj) {
                ((OJ) obj).d0("MalformedJson");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OJ
    public final void j(final String str) {
        g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.GJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
            public final /* synthetic */ void zza(Object obj) {
                ((OJ) obj).j(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OJ
    public final void k(final String str) {
        g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.LJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
            public final /* synthetic */ void zza(Object obj) {
                ((OJ) obj).k(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OJ
    public final void o(final String str, final String str2) {
        g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.HJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
            public final /* synthetic */ void zza(Object obj) {
                ((OJ) obj).o(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.OJ
    public final void zze() {
        g1(JJ.f19824a);
    }
}

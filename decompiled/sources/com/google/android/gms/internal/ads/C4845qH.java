package com.google.android.gms.internal.ads;

import Q4.AbstractC0928c;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4845qH extends AbstractC3214dJ implements InterfaceC5220tG, InterfaceC2833aH {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3502fb0 f32607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f32608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5011rb0 f32609d;

    public C4845qH(Set set, C3502fb0 c3502fb0, C5011rb0 c5011rb0) {
        super(set);
        this.f32608c = new AtomicBoolean();
        this.f32607b = c3502fb0;
        this.f32609d = c5011rb0;
    }

    private final void k1() {
        final H4.o2 o2Var;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29780b9)).booleanValue() && this.f32608c.compareAndSet(false, true) && (o2Var = this.f32607b.f28404e0) != null && o2Var.f1409a == 3) {
            g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.pH
                @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
                public final /* synthetic */ void zza(Object obj) {
                    ((InterfaceC5096sH) obj).j(o2Var);
                }
            });
        }
    }

    public final void j1(final H4.o2 o2Var) {
        if (AbstractC0928c.a(this.f32609d) && this.f32607b.f28364B0) {
            g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.oH
                @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
                public final /* synthetic */ void zza(Object obj) {
                    ((InterfaceC5096sH) obj).j(o2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final void m() {
        int i10 = this.f32607b.f28397b;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            k1();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2833aH
    public final void zzl() {
        if (this.f32607b.f28397b == 1) {
            k1();
        }
    }
}

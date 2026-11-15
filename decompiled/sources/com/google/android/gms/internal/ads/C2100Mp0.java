package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2100Mp0 implements InterfaceC1789Gp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC5031rl0 f20927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC5031rl0 f20928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC5031rl0 f20929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC5031rl0 f20930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2978bQ0 f20931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC2978bQ0 f20932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f20933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f20934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C5043rr0 f20935i;

    C2100Mp0(AbstractC5031rl0 abstractC5031rl0, AbstractC5031rl0 abstractC5031rl1, InterfaceC2978bQ0 interfaceC2978bQ0, AbstractC5031rl0 abstractC5031rl2, AbstractC5031rl0 abstractC5031rl3, InterfaceC2978bQ0 interfaceC2978bQ1, File file, ExecutorService executorService, C5043rr0 c5043rr0) {
        this.f20927a = abstractC5031rl0;
        this.f20929c = abstractC5031rl1;
        this.f20931e = interfaceC2978bQ0;
        this.f20928b = abstractC5031rl2;
        this.f20930d = abstractC5031rl3;
        this.f20932f = interfaceC2978bQ1;
        this.f20933g = file;
        this.f20934h = executorService;
        this.f20935i = c5043rr0;
    }

    private final com.google.common.util.concurrent.p g(byte[] bArr) {
        com.google.common.util.concurrent.p pVarC = this.f20930d.c(bArr);
        this.f20935i.e(15305, pVarC);
        return pVarC;
    }

    private final com.google.common.util.concurrent.p h(C2456Tl0 c2456Tl0) {
        com.google.common.util.concurrent.p pVarC = this.f20928b.c(c2456Tl0);
        this.f20935i.e(15303, pVarC);
        return pVarC;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1737Fp0
    public final com.google.common.util.concurrent.p a(final C2456Tl0 c2456Tl0, byte[] bArr, byte[] bArr2) {
        com.google.common.util.concurrent.p pVarC = ((AbstractC5031rl0) this.f20932f.zzb()).c(bArr);
        this.f20935i.e(15307, pVarC);
        return (AbstractC4678ox0) AbstractC5685wx0.j(AbstractC4678ox0.B(AbstractC5685wx0.l(pVarC, g(bArr2))), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.Kp0
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f20282a.f(c2456Tl0, (List) obj);
            }
        }, AbstractC2272Px0.a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1737Fp0
    public final com.google.common.util.concurrent.p b(final C2456Tl0 c2456Tl0, byte[] bArr) {
        return (AbstractC4678ox0) AbstractC5685wx0.j(AbstractC4678ox0.B(g(bArr)), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.Jp0
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f20002a.e(c2456Tl0, (Void) obj);
            }
        }, AbstractC2272Px0.a());
    }

    final /* synthetic */ boolean c() {
        AbstractC5031rl0 abstractC5031rl0;
        try {
            AbstractC5031rl0 abstractC5031rl1 = this.f20928b;
            File fileA = abstractC5031rl1.a();
            if (!fileA.exists()) {
                abstractC5031rl1.a().delete();
                ((AbstractC5031rl0) this.f20932f.zzb()).a().delete();
                this.f20930d.a().delete();
                return false;
            }
            File fileA2 = ((AbstractC5031rl0) this.f20932f.zzb()).a();
            File fileA3 = ((AbstractC5031rl0) this.f20931e.zzb()).a();
            try {
                if (fileA2.exists()) {
                    File parentFile = fileA3.getParentFile();
                    if (parentFile != null) {
                        AbstractC5025ri0.e(parentFile);
                    }
                    AbstractC3670gw0.b(fileA3);
                    AbstractC3670gw0.c(fileA2, fileA3);
                }
                File fileA4 = this.f20930d.a();
                File fileA5 = this.f20929c.a();
                try {
                    if (fileA4.exists()) {
                        AbstractC3670gw0.b(fileA5);
                        AbstractC3670gw0.c(fileA4, fileA5);
                    }
                    File fileA6 = this.f20927a.a();
                    try {
                        if (fileA.exists()) {
                            AbstractC3670gw0.b(fileA6);
                            AbstractC3670gw0.c(fileA, fileA6);
                        }
                        this.f20928b.a().delete();
                        ((AbstractC5031rl0) this.f20932f.zzb()).a().delete();
                        this.f20930d.a().delete();
                        return true;
                    } catch (IOException | SecurityException e10) {
                        this.f20935i.d(15313, e10);
                        abstractC5031rl0 = this.f20928b;
                        abstractC5031rl0.a().delete();
                        ((AbstractC5031rl0) this.f20932f.zzb()).a().delete();
                        this.f20930d.a().delete();
                        return false;
                    }
                } catch (IOException | SecurityException e11) {
                    this.f20935i.d(15312, e11);
                    abstractC5031rl0 = this.f20928b;
                }
            } catch (IOException e12) {
                e = e12;
                this.f20935i.d(15311, e);
                abstractC5031rl0 = this.f20928b;
                abstractC5031rl0.a().delete();
                ((AbstractC5031rl0) this.f20932f.zzb()).a().delete();
                this.f20930d.a().delete();
                return false;
            } catch (SecurityException e13) {
                e = e13;
                this.f20935i.d(15311, e);
                abstractC5031rl0 = this.f20928b;
                abstractC5031rl0.a().delete();
                ((AbstractC5031rl0) this.f20932f.zzb()).a().delete();
                this.f20930d.a().delete();
                return false;
            }
        } catch (Throwable th) {
            this.f20928b.a().delete();
            ((AbstractC5031rl0) this.f20932f.zzb()).a().delete();
            this.f20930d.a().delete();
            throw th;
        }
    }

    final /* synthetic */ C4774pi0 d(C2456Tl0 c2456Tl0) {
        if (c2456Tl0 == null || c2456Tl0.equals(C2456Tl0.i0())) {
            return null;
        }
        C3507fe c3507feD0 = c2456Tl0.d0();
        File fileA = ((AbstractC5031rl0) this.f20931e.zzb()).a();
        AbstractC5031rl0 abstractC5031rl0 = this.f20929c;
        return new C4774pi0(c3507feD0, fileA, abstractC5031rl0.a(), this.f20933g);
    }

    final /* synthetic */ com.google.common.util.concurrent.p e(C2456Tl0 c2456Tl0, Void r10) {
        return h(c2456Tl0);
    }

    final /* synthetic */ com.google.common.util.concurrent.p f(C2456Tl0 c2456Tl0, List list) {
        return h(c2456Tl0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1737Fp0
    public final com.google.common.util.concurrent.p zza() {
        return AbstractC5685wx0.d(new Callable() { // from class: com.google.android.gms.internal.ads.Lp0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new Boolean(this.f20673a.c());
            }
        }, this.f20934h);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1737Fp0
    public final com.google.common.util.concurrent.p zzb() {
        com.google.common.util.concurrent.p pVarB = this.f20927a.b();
        this.f20935i.e(15302, pVarB);
        return pVarB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1789Gp0
    public final com.google.common.util.concurrent.p zze() {
        AbstractC4678ox0 abstractC4678ox0 = (AbstractC4678ox0) AbstractC5685wx0.k(AbstractC4678ox0.B(this.f20927a.b()), new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.Hp0
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                return this.f19403a.d((C2456Tl0) obj);
            }
        }, AbstractC2272Px0.a());
        this.f20935i.e(15314, abstractC4678ox0);
        return abstractC4678ox0;
    }
}

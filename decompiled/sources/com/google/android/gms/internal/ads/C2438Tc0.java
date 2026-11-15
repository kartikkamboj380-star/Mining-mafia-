package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2438Tc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1971Kc0 f23572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.common.util.concurrent.p f23573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23574c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23575d = false;

    public C2438Tc0(final InterfaceC4762pc0 interfaceC4762pc0, final InterfaceC1919Jc0 interfaceC1919Jc0, final InterfaceC1971Kc0 interfaceC1971Kc0) {
        this.f23572a = interfaceC1971Kc0;
        this.f23573b = AbstractC5685wx0.h(AbstractC5685wx0.j(interfaceC1919Jc0.b(interfaceC1971Kc0), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.Sc0
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f23270a.c(interfaceC1919Jc0, interfaceC4762pc0, interfaceC1971Kc0, (C6021zc0) obj);
            }
        }, interfaceC1971Kc0.zza()), Exception.class, new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.Pc0
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f22135a.d(interfaceC1919Jc0, (Exception) obj);
            }
        }, interfaceC1971Kc0.zza());
    }

    public final synchronized void a(InterfaceC5307tx0 interfaceC5307tx0) {
        InterfaceC1971Kc0 interfaceC1971Kc0 = this.f23572a;
        AbstractC5685wx0.r(AbstractC5685wx0.j(this.f23573b, C2282Qc0.f22411a, interfaceC1971Kc0.zza()), interfaceC5307tx0, interfaceC1971Kc0.zza());
    }

    public final synchronized com.google.common.util.concurrent.p b(InterfaceC1971Kc0 interfaceC1971Kc0) {
        if (!this.f23575d && !this.f23574c) {
            InterfaceC1971Kc0 interfaceC1971Kc1 = this.f23572a;
            if (interfaceC1971Kc1.zzb() != null && interfaceC1971Kc0.zzb() != null && interfaceC1971Kc1.zzb().equals(interfaceC1971Kc0.zzb())) {
                this.f23574c = true;
                return this.f23573b;
            }
        }
        return null;
    }

    final /* synthetic */ com.google.common.util.concurrent.p c(InterfaceC1919Jc0 interfaceC1919Jc0, InterfaceC4762pc0 interfaceC4762pc0, InterfaceC1971Kc0 interfaceC1971Kc0, C6021zc0 c6021zc0) {
        synchronized (this) {
            try {
                this.f23575d = true;
                interfaceC1919Jc0.a(c6021zc0);
                if (this.f23574c) {
                    return AbstractC5685wx0.a(new C1867Ic0(c6021zc0, interfaceC1971Kc0));
                }
                interfaceC4762pc0.a(interfaceC1971Kc0.zzb(), c6021zc0);
                return AbstractC5685wx0.a(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.p d(InterfaceC1919Jc0 interfaceC1919Jc0, Exception exc) {
        synchronized (this) {
            this.f23575d = true;
            throw exc;
        }
    }
}

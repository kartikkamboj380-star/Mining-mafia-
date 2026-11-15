package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class I0 extends K0 {
    /* synthetic */ I0(H0 h10) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    final void a(Object obj, long j10) {
        ((InterfaceC6472w0) H1.k(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    final void b(Object obj, Object obj2, long j10) {
        InterfaceC6472w0 interfaceC6472w0Zzd = (InterfaceC6472w0) H1.k(obj, j10);
        InterfaceC6472w0 interfaceC6472w0 = (InterfaceC6472w0) H1.k(obj2, j10);
        int size = interfaceC6472w0Zzd.size();
        int size2 = interfaceC6472w0.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC6472w0Zzd.zzc()) {
                interfaceC6472w0Zzd = interfaceC6472w0Zzd.zzd(size2 + size);
            }
            interfaceC6472w0Zzd.addAll(interfaceC6472w0);
        }
        if (size > 0) {
            interfaceC6472w0 = interfaceC6472w0Zzd;
        }
        H1.x(obj, j10, interfaceC6472w0);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4478nM0 implements InterfaceC5611wM0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5611wM0[] f31781a;

    C4478nM0(InterfaceC5611wM0... interfaceC5611wM0Arr) {
        this.f31781a = interfaceC5611wM0Arr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5611wM0
    public final boolean zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f31781a[i10].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5611wM0
    public final InterfaceC5359uM0 zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC5611wM0 interfaceC5611wM0 = this.f31781a[i10];
            if (interfaceC5611wM0.zzb(cls)) {
                return interfaceC5611wM0.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}

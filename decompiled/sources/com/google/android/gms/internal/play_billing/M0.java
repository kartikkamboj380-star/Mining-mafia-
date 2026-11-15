package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class M0 implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T0[] f37094a;

    M0(T0... t0Arr) {
        this.f37094a = t0Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final R0 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            T0 t10 = this.f37094a[i10];
            if (t10.zzc(cls)) {
                return t10.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f37094a[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}

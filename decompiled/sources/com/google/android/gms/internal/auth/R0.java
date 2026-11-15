package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class R0 implements X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X0[] f35966a;

    R0(X0... x0Arr) {
        this.f35966a = x0Arr;
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final W0 zzb(Class cls) {
        X0[] x0Arr = this.f35966a;
        for (int i10 = 0; i10 < 2; i10++) {
            X0 x10 = x0Arr[i10];
            if (x10.zzc(cls)) {
                return x10.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final boolean zzc(Class cls) {
        X0[] x0Arr = this.f35966a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (x0Arr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}

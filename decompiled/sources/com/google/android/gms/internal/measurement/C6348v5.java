package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6348v5 implements D5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D5[] f36928a;

    C6348v5(D5... d5Arr) {
        this.f36928a = d5Arr;
    }

    @Override // com.google.android.gms.internal.measurement.D5
    public final boolean zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f36928a[i10].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.D5
    public final C5 zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            D5 d10 = this.f36928a[i10];
            if (d10.zzb(cls)) {
                return d10.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}

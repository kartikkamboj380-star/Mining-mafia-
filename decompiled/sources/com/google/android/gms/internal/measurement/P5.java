package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class P5 implements C5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F5 f36459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f36461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36462d;

    P5(F5 f10, String str, Object[] objArr) {
        this.f36459a = f10;
        this.f36460b = str;
        this.f36461c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f36462d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f36462d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    final String a() {
        return this.f36460b;
    }

    final Object[] b() {
        return this.f36461c;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final boolean zza() {
        return (this.f36462d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final F5 zzb() {
        return this.f36459a;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final int zzc() {
        int i10 = this.f36462d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}

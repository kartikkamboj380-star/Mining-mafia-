package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6406f1 implements R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0 f37211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f37213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37214d;

    C6406f1(V0 v10, String str, Object[] objArr) {
        this.f37211a = v10;
        this.f37212b = str;
        this.f37213c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f37214d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f37214d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    final String a() {
        return this.f37212b;
    }

    final Object[] b() {
        return this.f37213c;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final V0 zza() {
        return this.f37211a;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final boolean zzb() {
        return (this.f37214d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final int zzc() {
        int i10 = this.f37214d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}

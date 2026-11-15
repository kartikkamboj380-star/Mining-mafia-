package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6097j1 implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z0 f36101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36102b = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f36103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36104d;

    C6097j1(Z0 z9, String str, Object[] objArr) {
        this.f36101a = z9;
        this.f36103c = objArr;
        char cCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (cCharAt < 55296) {
            this.f36104d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i11);
            if (cCharAt2 < 55296) {
                this.f36104d = (cCharAt2 << i12) | i10;
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    final String a() {
        return this.f36102b;
    }

    final Object[] b() {
        return this.f36103c;
    }

    @Override // com.google.android.gms.internal.auth.W0
    public final Z0 zza() {
        return this.f36101a;
    }

    @Override // com.google.android.gms.internal.auth.W0
    public final boolean zzb() {
        return (this.f36104d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.auth.W0
    public final int zzc() {
        return (this.f36104d & 1) != 0 ? 1 : 2;
    }
}

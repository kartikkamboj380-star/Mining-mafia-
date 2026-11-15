package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class JM0 implements InterfaceC5359uM0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5863yM0 f19872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f19874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19875d;

    JM0(InterfaceC5863yM0 interfaceC5863yM0, String str, Object[] objArr) {
        this.f19872a = interfaceC5863yM0;
        this.f19873b = str;
        this.f19874c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f19875d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f19875d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    final String a() {
        return this.f19873b;
    }

    final Object[] b() {
        return this.f19874c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5359uM0
    public final boolean zza() {
        return (this.f19875d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5359uM0
    public final InterfaceC5863yM0 zzb() {
        return this.f19872a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5359uM0
    public final int zzc() {
        int i10 = this.f19875d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}

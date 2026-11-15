package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3305e2 implements InterfaceC4311m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6006zV f27660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6006zV f27661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27662c;

    public C3305e2(long[] jArr, long[] jArr2, long j10) {
        int length = jArr.length;
        int length2 = jArr2.length;
        AbstractC2418Ss0.a(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f27660a = new C6006zV(length2);
            this.f27661b = new C6006zV(length2);
        } else {
            int i10 = length2 + 1;
            C6006zV c6006zV = new C6006zV(i10);
            this.f27660a = c6006zV;
            C6006zV c6006zV2 = new C6006zV(i10);
            this.f27661b = c6006zV2;
            c6006zV.a(0L);
            c6006zV2.a(0L);
        }
        this.f27660a.b(jArr);
        this.f27661b.b(jArr2);
        this.f27662c = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        C6006zV c6006zV = this.f27661b;
        if (c6006zV.d() == 0) {
            C4437n2 c4437n2 = C4437n2.f31650c;
            return new C4059k2(c4437n2, c4437n2);
        }
        int iJ = AbstractC4634ob0.J(c6006zV, j10, true, true);
        long jC = c6006zV.c(iJ);
        C6006zV c6006zV2 = this.f27660a;
        C4437n2 c4437n3 = new C4437n2(jC, c6006zV2.c(iJ));
        if (c4437n3.f31651a == j10 || iJ == c6006zV.d() - 1) {
            return new C4059k2(c4437n3, c4437n3);
        }
        int i10 = iJ + 1;
        return new C4059k2(c4437n3, new C4437n2(c6006zV.c(i10), c6006zV2.c(i10)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f27662c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return this.f27661b.d() > 0;
    }
}

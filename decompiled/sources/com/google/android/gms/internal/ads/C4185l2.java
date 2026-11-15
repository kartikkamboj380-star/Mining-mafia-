package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4185l2 implements InterfaceC4311m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f31166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4059k2 f31167b;

    public C4185l2(long j10, long j11) {
        this.f31166a = j10;
        C4437n2 c4437n2 = j11 == 0 ? C4437n2.f31650c : new C4437n2(0L, j11);
        this.f31167b = new C4059k2(c4437n2, c4437n2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        return this.f31167b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f31166a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return false;
    }
}

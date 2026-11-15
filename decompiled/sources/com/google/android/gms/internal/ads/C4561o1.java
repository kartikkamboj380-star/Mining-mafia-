package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4561o1 implements InterfaceC4311m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4938r1 f31924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f31926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f31927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f31928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f31929f;

    public C4561o1(InterfaceC4938r1 interfaceC4938r1, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f31924a = interfaceC4938r1;
        this.f31925b = j10;
        this.f31926c = j12;
        this.f31927d = j13;
        this.f31928e = j14;
        this.f31929f = j15;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        C4437n2 c4437n2 = new C4437n2(j10, C4813q1.a(this.f31924a.a(j10), 0L, this.f31926c, this.f31927d, this.f31928e, this.f31929f));
        return new C4059k2(c4437n2, c4437n2);
    }

    final /* synthetic */ long b() {
        return this.f31927d;
    }

    public final long d(long j10) {
        return this.f31924a.a(j10);
    }

    final /* synthetic */ long e() {
        return this.f31926c;
    }

    final /* synthetic */ long f() {
        return this.f31928e;
    }

    final /* synthetic */ long g() {
        return this.f31929f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f31925b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return true;
    }
}

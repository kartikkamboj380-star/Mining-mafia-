package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5192t2 extends X1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC4311m2 f33302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C5318u2 f33303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5192t2(C5318u2 c5318u2, InterfaceC4311m2 interfaceC4311m2, InterfaceC4311m2 interfaceC4311m3) {
        super(interfaceC4311m2);
        this.f33302b = interfaceC4311m3;
        Objects.requireNonNull(c5318u2);
        this.f33303c = c5318u2;
    }

    @Override // com.google.android.gms.internal.ads.X1, com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        C4059k2 c4059k2A = this.f33302b.a(j10);
        C4437n2 c4437n2 = c4059k2A.f30676a;
        long j11 = c4437n2.f31651a;
        C5318u2 c5318u2 = this.f33303c;
        C4437n2 c4437n3 = new C4437n2(j11, c4437n2.f31652b + c5318u2.a());
        C4437n2 c4437n4 = c4059k2A.f30677b;
        return new C4059k2(c4437n3, new C4437n2(c4437n4.f31651a, c4437n4.f31652b + c5318u2.a()));
    }
}

package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Z4 implements InterfaceC4311m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2809a5 f26104a;

    /* synthetic */ Z4(C2809a5 c2809a5, byte[] bArr) {
        Objects.requireNonNull(c2809a5);
        this.f26104a = c2809a5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        C2809a5 c2809a5 = this.f26104a;
        long jA = c2809a5.a() + BigInteger.valueOf(c2809a5.d().h(j10)).multiply(BigInteger.valueOf(c2809a5.c() - c2809a5.a())).divide(BigInteger.valueOf(c2809a5.f())).longValue();
        String str = AbstractC4634ob0.f32117a;
        C4437n2 c4437n2 = new C4437n2(j10, Math.max(c2809a5.a(), Math.min(jA - 30000, c2809a5.c() - 1)));
        return new C4059k2(c4437n2, c4437n2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        C2809a5 c2809a5 = this.f26104a;
        return c2809a5.d().g(c2809a5.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return true;
    }
}

package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3338eI0 extends AbstractC5855yI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ZH0 f27734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigInteger f27735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4096kK0 f27736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f27737d;

    /* synthetic */ C3338eI0(ZH0 zh0, BigInteger bigInteger, C4096kK0 c4096kK0, Integer num, byte[] bArr) {
        this.f27734a = zh0;
        this.f27735b = bigInteger;
        this.f27736c = c4096kK0;
        this.f27737d = num;
    }

    public static C3213dI0 d() {
        return new C3213dI0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final /* synthetic */ AbstractC1495Ay0 a() {
        return this.f27734a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final Integer b() {
        return this.f27737d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5855yI0
    public final C4096kK0 c() {
        return this.f27736c;
    }

    public final BigInteger e() {
        return this.f27735b;
    }

    public final ZH0 f() {
        return this.f27734a;
    }
}

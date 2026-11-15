package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4848qI0 extends AbstractC5855yI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4344mI0 f32612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigInteger f32613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4096kK0 f32614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f32615d;

    /* synthetic */ C4848qI0(C4344mI0 c4344mI0, BigInteger bigInteger, C4096kK0 c4096kK0, Integer num, byte[] bArr) {
        this.f32612a = c4344mI0;
        this.f32613b = bigInteger;
        this.f32614c = c4096kK0;
        this.f32615d = num;
    }

    public static C4722pI0 d() {
        return new C4722pI0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final /* synthetic */ AbstractC1495Ay0 a() {
        return this.f32612a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final Integer b() {
        return this.f32615d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5855yI0
    public final C4096kK0 c() {
        return this.f32614c;
    }

    public final BigInteger e() {
        return this.f32613b;
    }

    public final C4344mI0 f() {
        return this.f32612a;
    }
}

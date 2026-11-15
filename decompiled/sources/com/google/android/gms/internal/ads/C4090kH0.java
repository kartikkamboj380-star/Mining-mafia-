package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4090kH0 extends AbstractC5855yI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3588gH0 f30738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ECPoint f30739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4096kK0 f30740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f30741d;

    /* synthetic */ C4090kH0(C3588gH0 c3588gH0, ECPoint eCPoint, C4096kK0 c4096kK0, Integer num, byte[] bArr) {
        this.f30738a = c3588gH0;
        this.f30739b = eCPoint;
        this.f30740c = c4096kK0;
        this.f30741d = num;
    }

    public static C3964jH0 d() {
        return new C3964jH0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final /* synthetic */ AbstractC1495Ay0 a() {
        return this.f30738a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final Integer b() {
        return this.f30741d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5855yI0
    public final C4096kK0 c() {
        return this.f30740c;
    }

    public final ECPoint e() {
        return this.f30739b;
    }

    public final C3588gH0 f() {
        return this.f30738a;
    }
}

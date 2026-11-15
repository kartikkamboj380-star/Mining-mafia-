package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3579gD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DH f28599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KI f28600b;

    public C3579gD(DH dh, KI ki) {
        this.f28599a = dh;
        this.f28600b = ki;
    }

    public final DH a() {
        return this.f28599a;
    }

    final C3593gK b() {
        KI ki = this.f28600b;
        return ki != null ? new C3593gK(ki, AbstractC2315Qt.f22479g) : new C3593gK(new C3453fD(this), AbstractC2315Qt.f22479g);
    }

    final KI c() {
        return this.f28600b;
    }
}

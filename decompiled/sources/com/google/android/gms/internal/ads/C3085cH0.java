package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3085cH0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3085cH0 f27077c = new C3085cH0("NIST_P256", AbstractC3954jC0.f30346a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3085cH0 f27078d = new C3085cH0("NIST_P384", AbstractC3954jC0.f30347b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3085cH0 f27079e = new C3085cH0("NIST_P521", AbstractC3954jC0.f30348c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ECParameterSpec f27081b;

    private C3085cH0(String str, ECParameterSpec eCParameterSpec) {
        this.f27080a = str;
        this.f27081b = eCParameterSpec;
    }

    public final ECParameterSpec a() {
        return this.f27081b;
    }

    public final String toString() {
        return this.f27080a;
    }
}

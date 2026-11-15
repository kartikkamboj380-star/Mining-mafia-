package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3322eA0 extends AbstractC2430Sy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3826iA0 f27707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4096kK0 f27708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f27709c;

    private C3322eA0(C3826iA0 c3826iA0, C4096kK0 c4096kK0, Integer num) {
        this.f27707a = c3826iA0;
        this.f27708b = c4096kK0;
        this.f27709c = num;
    }

    public static C3322eA0 d(C3826iA0 c3826iA0, Integer num) throws GeneralSecurityException {
        C4096kK0 c4096kK0B;
        if (c3826iA0.c() == C3700hA0.f28857c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            c4096kK0B = AbstractC2826aD0.f26454a;
        } else {
            if (c3826iA0.c() != C3700hA0.f28856b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(c3826iA0.c())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            c4096kK0B = AbstractC2826aD0.b(num.intValue());
        }
        return new C3322eA0(c3826iA0, c4096kK0B, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final /* synthetic */ AbstractC1495Ay0 a() {
        return this.f27707a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final Integer b() {
        return this.f27709c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2430Sy0
    public final C4096kK0 c() {
        return this.f27708b;
    }

    public final C3826iA0 e() {
        return this.f27707a;
    }
}

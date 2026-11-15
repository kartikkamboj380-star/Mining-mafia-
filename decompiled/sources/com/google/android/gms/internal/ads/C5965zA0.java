package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5965zA0 extends AbstractC2430Sy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EA0 f35667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4348mK0 f35668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4096kK0 f35669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f35670d;

    private C5965zA0(EA0 ea0, C4348mK0 c4348mK0, C4096kK0 c4096kK0, Integer num) {
        this.f35667a = ea0;
        this.f35668b = c4348mK0;
        this.f35669c = c4096kK0;
        this.f35670d = num;
    }

    public static C5965zA0 d(EA0 ea0, C4348mK0 c4348mK0, Integer num) throws GeneralSecurityException {
        C4096kK0 c4096kK0B;
        DA0 da0C = ea0.c();
        DA0 da0 = DA0.f18101c;
        if (da0C != da0 && num == null) {
            String string = ea0.c().toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (ea0.c() == da0 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c4348mK0.d() != 32) {
            int iD = c4348mK0.d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 68);
            sb2.append("XAesGcmKey key must be constructed with key of length 32 bytes, not ");
            sb2.append(iD);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (ea0.c() == da0) {
            c4096kK0B = AbstractC2826aD0.f26454a;
        } else {
            if (ea0.c() != DA0.f18100b) {
                throw new IllegalStateException("Unknown Variant: ".concat(ea0.c().toString()));
            }
            c4096kK0B = AbstractC2826aD0.b(num.intValue());
        }
        return new C5965zA0(ea0, c4348mK0, c4096kK0B, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final /* synthetic */ AbstractC1495Ay0 a() {
        return this.f35667a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final Integer b() {
        return this.f35670d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2430Sy0
    public final C4096kK0 c() {
        return this.f35669c;
    }

    public final C4348mK0 e() {
        return this.f35668b;
    }

    public final EA0 f() {
        return this.f35667a;
    }
}

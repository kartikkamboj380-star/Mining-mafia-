package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class FA0 extends AbstractC2430Sy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LA0 f18708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4348mK0 f18709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4096kK0 f18710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f18711d;

    private FA0(LA0 la0, C4348mK0 c4348mK0, C4096kK0 c4096kK0, Integer num) {
        this.f18708a = la0;
        this.f18709b = c4348mK0;
        this.f18710c = c4096kK0;
        this.f18711d = num;
    }

    public static FA0 d(KA0 ka0, C4348mK0 c4348mK0, Integer num) throws GeneralSecurityException {
        C4096kK0 c4096kK0B;
        KA0 ka1 = KA0.f20117d;
        if (ka0 != ka1 && num == null) {
            String string = ka0.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (ka0 == ka1 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c4348mK0.d() != 32) {
            int iD = c4348mK0.d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 75);
            sb2.append("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iD);
            throw new GeneralSecurityException(sb2.toString());
        }
        LA0 la0B = LA0.b(ka0);
        if (la0B.c() == ka1) {
            c4096kK0B = AbstractC2826aD0.f26454a;
        } else if (la0B.c() == KA0.f20116c) {
            c4096kK0B = AbstractC2826aD0.a(num.intValue());
        } else {
            if (la0B.c() != KA0.f20115b) {
                throw new IllegalStateException("Unknown Variant: ".concat(la0B.c().toString()));
            }
            c4096kK0B = AbstractC2826aD0.b(num.intValue());
        }
        return new FA0(la0B, c4348mK0, c4096kK0B, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final /* synthetic */ AbstractC1495Ay0 a() {
        return this.f18708a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final Integer b() {
        return this.f18711d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2430Sy0
    public final C4096kK0 c() {
        return this.f18710c;
    }

    public final C4348mK0 e() {
        return this.f18709b;
    }

    public final LA0 f() {
        return this.f18708a;
    }
}

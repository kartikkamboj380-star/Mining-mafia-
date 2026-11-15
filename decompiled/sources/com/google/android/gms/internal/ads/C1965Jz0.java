package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1965Jz0 extends AbstractC2430Sy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2276Pz0 f20033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4348mK0 f20034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4096kK0 f20035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f20036d;

    private C1965Jz0(C2276Pz0 c2276Pz0, C4348mK0 c4348mK0, C4096kK0 c4096kK0, Integer num) {
        this.f20033a = c2276Pz0;
        this.f20034b = c4348mK0;
        this.f20035c = c4096kK0;
        this.f20036d = num;
    }

    public static C1965Jz0 d(C2224Oz0 c2224Oz0, C4348mK0 c4348mK0, Integer num) throws GeneralSecurityException {
        C4096kK0 c4096kK0B;
        C2224Oz0 c2224Oz1 = C2224Oz0.f21990d;
        if (c2224Oz0 != c2224Oz1 && num == null) {
            String string = c2224Oz0.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (c2224Oz0 == c2224Oz1 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c4348mK0.d() != 32) {
            int iD = c4348mK0.d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 74);
            sb2.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iD);
            throw new GeneralSecurityException(sb2.toString());
        }
        C2276Pz0 c2276Pz0B = C2276Pz0.b(c2224Oz0);
        if (c2276Pz0B.c() == c2224Oz1) {
            c4096kK0B = AbstractC2826aD0.f26454a;
        } else if (c2276Pz0B.c() == C2224Oz0.f21989c) {
            c4096kK0B = AbstractC2826aD0.a(num.intValue());
        } else {
            if (c2276Pz0B.c() != C2224Oz0.f21988b) {
                throw new IllegalStateException("Unknown Variant: ".concat(c2276Pz0B.c().toString()));
            }
            c4096kK0B = AbstractC2826aD0.b(num.intValue());
        }
        return new C1965Jz0(c2276Pz0B, c4348mK0, c4096kK0B, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final /* synthetic */ AbstractC1495Ay0 a() {
        return this.f20033a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final Integer b() {
        return this.f20036d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2430Sy0
    public final C4096kK0 c() {
        return this.f20035c;
    }

    public final C4348mK0 e() {
        return this.f20034b;
    }

    public final C2276Pz0 f() {
        return this.f20033a;
    }
}

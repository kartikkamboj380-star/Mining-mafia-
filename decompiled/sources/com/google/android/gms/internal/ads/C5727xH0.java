package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5727xH0 extends AbstractC5855yI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4846qH0 f34784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4096kK0 f34785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4096kK0 f34786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f34787d;

    private C5727xH0(C4846qH0 c4846qH0, C4096kK0 c4096kK0, C4096kK0 c4096kK1, Integer num) {
        this.f34784a = c4846qH0;
        this.f34785b = c4096kK0;
        this.f34786c = c4096kK1;
        this.f34787d = num;
    }

    public static C5727xH0 d(C4720pH0 c4720pH0, C4096kK0 c4096kK0, Integer num) throws GeneralSecurityException {
        C4096kK0 c4096kK0A;
        C4846qH0 c4846qH0B = C4846qH0.b(c4720pH0);
        C4720pH0 c4720pH1 = C4720pH0.f32354e;
        if (!c4720pH0.equals(c4720pH1) && num == null) {
            String string = c4720pH0.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (c4720pH0.equals(c4720pH1) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c4096kK0.d() != 32) {
            int iD = c4096kK0.d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 65);
            sb2.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iD);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (c4846qH0B.c() == c4720pH1) {
            c4096kK0A = AbstractC2826aD0.f26454a;
        } else if (c4846qH0B.c() == C4720pH0.f32352c || c4846qH0B.c() == C4720pH0.f32353d) {
            c4096kK0A = AbstractC2826aD0.a(num.intValue());
        } else {
            if (c4846qH0B.c() != C4720pH0.f32351b) {
                throw new IllegalStateException("Unknown Variant: ".concat(c4846qH0B.c().toString()));
            }
            c4096kK0A = AbstractC2826aD0.b(num.intValue());
        }
        return new C5727xH0(c4846qH0B, c4096kK0, c4096kK0A, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final /* synthetic */ AbstractC1495Ay0 a() {
        return this.f34784a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final Integer b() {
        return this.f34787d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5855yI0
    public final C4096kK0 c() {
        return this.f34786c;
    }

    public final C4096kK0 e() {
        return this.f34785b;
    }

    public final C4846qH0 f() {
        return this.f34784a;
    }
}

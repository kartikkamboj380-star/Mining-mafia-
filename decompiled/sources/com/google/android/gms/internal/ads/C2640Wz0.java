package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2640Wz0 extends AbstractC2430Sy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2744Yz0 f25032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4096kK0 f25033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f25034c;

    private C2640Wz0(C2744Yz0 c2744Yz0, C4096kK0 c4096kK0, Integer num) {
        this.f25032a = c2744Yz0;
        this.f25033b = c4096kK0;
        this.f25034c = num;
    }

    public static C2640Wz0 d(C2744Yz0 c2744Yz0, Integer num) throws GeneralSecurityException {
        C4096kK0 c4096kK0A;
        if (c2744Yz0.d() == C2692Xz0.f25424b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            c4096kK0A = C4096kK0.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (c2744Yz0.d() != C2692Xz0.f25425c) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(c2744Yz0.d().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            c4096kK0A = C4096kK0.a(new byte[0]);
        }
        return new C2640Wz0(c2744Yz0, c4096kK0A, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final /* synthetic */ AbstractC1495Ay0 a() {
        return this.f25032a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final Integer b() {
        return this.f25034c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2430Sy0
    public final C4096kK0 c() {
        return this.f25033b;
    }

    public final C2744Yz0 e() {
        return this.f25032a;
    }
}

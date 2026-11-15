package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4971rH0 extends AbstractC5729xI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5727xH0 f32870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4348mK0 f32871b;

    private C4971rH0(C5727xH0 c5727xH0, C4348mK0 c4348mK0) {
        this.f32870a = c5727xH0;
        this.f32871b = c4348mK0;
    }

    public static C4971rH0 d(C5727xH0 c5727xH0, C4348mK0 c4348mK0) throws GeneralSecurityException {
        if (c4348mK0.d() == 32) {
            if (Arrays.equals(c5727xH0.e().c(), AbstractC3452fC0.a(AbstractC3452fC0.b(c4348mK0.c(AbstractC3800hy0.a()))))) {
                return new C4971rH0(c5727xH0, c4348mK0);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        int iD = c4348mK0.d();
        StringBuilder sb = new StringBuilder(String.valueOf(iD).length() + 65);
        sb.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
        sb.append(iD);
        throw new GeneralSecurityException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final /* synthetic */ AbstractC1495Ay0 a() {
        return this.f32870a.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5729xI0
    public final /* synthetic */ AbstractC5855yI0 c() {
        return this.f32870a;
    }

    public final C4846qH0 e() {
        return this.f32870a.f();
    }

    public final C5727xH0 f() {
        return this.f32870a;
    }

    public final C4348mK0 g() {
        return this.f32871b;
    }
}

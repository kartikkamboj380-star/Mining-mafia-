package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class JE0 extends ME0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KE0 f19814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4348mK0 f19815b;

    private JE0(KE0 ke0, C4348mK0 c4348mK0) {
        this.f19814a = ke0;
        this.f19815b = c4348mK0;
    }

    public static JE0 c(KE0 ke0, C4348mK0 c4348mK0) throws GeneralSecurityException {
        if (ke0.c() == c4348mK0.d()) {
            return new JE0(ke0, c4348mK0);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final /* synthetic */ AbstractC1495Ay0 a() {
        return this.f19814a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final Integer b() {
        return null;
    }

    public final C4348mK0 d() {
        return this.f19815b;
    }
}

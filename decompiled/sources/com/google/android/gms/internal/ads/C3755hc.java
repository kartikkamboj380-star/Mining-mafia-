package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3755hc implements InterfaceC5655wi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1461Ah0 f29031a;

    C3755hc(C4005jc c4005jc, C1461Ah0 c1461Ah0) {
        this.f29031a = c1461Ah0;
        Objects.requireNonNull(c4005jc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5655wi0
    public final boolean a(File file) {
        try {
            return this.f29031a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}

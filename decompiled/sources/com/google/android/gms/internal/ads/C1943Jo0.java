package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1943Jo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f19994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1461Ah0 f19995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5043rr0 f19996c;

    public C1943Jo0(File file, C1461Ah0 c1461Ah0, C5043rr0 c5043rr0) {
        this.f19994a = file;
        this.f19995b = c1461Ah0;
        this.f19996c = c5043rr0;
    }

    public final boolean a(byte[] bArr) {
        boolean zA;
        try {
            File file = this.f19994a;
            AbstractC3670gw0.b(file);
            AbstractC3670gw0.a(bArr, file);
            zA = this.f19995b.a(file);
        } catch (IOException | GeneralSecurityException e10) {
            this.f19996c.d(2027, e10);
            zA = false;
        }
        try {
            this.f19994a.delete();
        } catch (SecurityException unused) {
        }
        return zA;
    }
}

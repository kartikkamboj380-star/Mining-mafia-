package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3296dy0 implements InterfaceC5687wy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f27534a;

    private C3296dy0(InputStream inputStream) {
        this.f27534a = inputStream;
    }

    public static InterfaceC5687wy0 a(byte[] bArr) {
        return new C3296dy0(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5687wy0
    public final C4088kG0 zzb() throws IOException {
        try {
            return C4088kG0.i0(this.f27534a, HL0.a());
        } finally {
            this.f27534a.close();
        }
    }
}

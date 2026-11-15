package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3594gK0 implements InterfaceC1651Dy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C4206lC0 f28621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f28622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f28623c;

    static {
        C4080kC0 c4080kC0A = C4206lC0.a();
        c4080kC0A.a(SJ0.SHA256, C4092kI0.f30743b);
        c4080kC0A.a(SJ0.SHA384, C4092kI0.f30744c);
        c4080kC0A.a(SJ0.SHA512, C4092kI0.f30745d);
        f28621a = c4080kC0A.b();
        f28622b = new byte[0];
        f28623c = new byte[]{0};
    }

    public static InterfaceC1651Dy0 b(C4848qI0 c4848qI0) {
        try {
            return C4346mJ0.e(c4848qI0);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) JJ0.f19830g.b("RSA")).generatePublic(new RSAPublicKeySpec(c4848qI0.e(), c4848qI0.f().d()));
            C4344mI0 c4344mI0F = c4848qI0.f();
            C4206lC0 c4206lC0 = f28621a;
            return new C3342eK0(rSAPublicKey, (SJ0) c4206lC0.b(c4344mI0F.f()), (SJ0) c4206lC0.b(c4344mI0F.g()), c4344mI0F.h(), c4848qI0.c().c(), c4848qI0.f().e().equals(C4218lI0.f31240d) ? f28623c : f28622b, null);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3217dK0 implements InterfaceC1599Cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f27402a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f27403b = {0};

    public static InterfaceC1599Cy0 b(C4596oI0 c4596oI0) {
        try {
            return C4220lJ0.b(c4596oI0);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) ((KeyFactory) JJ0.f19830g.b("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(c4596oI0.f().e(), c4596oI0.e().d(), c4596oI0.i().b(AbstractC3800hy0.a()), c4596oI0.g().b(AbstractC3800hy0.a()), c4596oI0.h().b(AbstractC3800hy0.a()), c4596oI0.j().b(AbstractC3800hy0.a()), c4596oI0.k().b(AbstractC3800hy0.a()), c4596oI0.l().b(AbstractC3800hy0.a())));
            C4344mI0 c4344mI0E = c4596oI0.e();
            C4206lC0 c4206lC0 = AbstractC3594gK0.f28621a;
            return new C3091cK0(rSAPrivateCrtKey, (SJ0) c4206lC0.b(c4344mI0E.f()), (SJ0) c4206lC0.b(c4344mI0E.g()), c4344mI0E.h(), c4596oI0.f().c().c(), c4596oI0.e().e().equals(C4218lI0.f31240d) ? f27403b : f27402a, null);
        }
    }
}

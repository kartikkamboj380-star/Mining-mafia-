package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2966bK0 implements InterfaceC1651Dy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f26792a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f26793b = {0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C4206lC0 f26794c;

    static {
        C4080kC0 c4080kC0A = C4206lC0.a();
        c4080kC0A.a(SJ0.SHA256, XH0.f25176b);
        c4080kC0A.a(SJ0.SHA384, XH0.f25177c);
        c4080kC0A.a(SJ0.SHA512, XH0.f25178d);
        f26794c = c4080kC0A.b();
    }

    public static InterfaceC1651Dy0 b(C3338eI0 c3338eI0) {
        try {
            return C3089cJ0.d(c3338eI0);
        } catch (NoSuchProviderException unused) {
            return new C2840aK0((RSAPublicKey) ((KeyFactory) JJ0.f19830g.b("RSA")).generatePublic(new RSAPublicKeySpec(c3338eI0.e(), c3338eI0.f().d())), (SJ0) f26794c.b(c3338eI0.f().f()), c3338eI0.c().c(), c3338eI0.f().e().equals(YH0.f25580d) ? f26793b : f26792a, null);
        }
    }
}

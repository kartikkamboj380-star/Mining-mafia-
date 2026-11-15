package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class II0 implements InterfaceC1651Dy0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f19507g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f19508h = {0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final C4206lC0 f19509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final C4206lC0 f19510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final C4206lC0 f19511k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECPublicKey f19512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BJ0 f19514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f19515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f19516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f19517f;

    static {
        C4080kC0 c4080kC0A = C4206lC0.a();
        c4080kC0A.a(SJ0.SHA256, C3211dH0.f27393b);
        c4080kC0A.a(SJ0.SHA384, C3211dH0.f27394c);
        c4080kC0A.a(SJ0.SHA512, C3211dH0.f27395d);
        f19509i = c4080kC0A.b();
        C4080kC0 c4080kC0A2 = C4206lC0.a();
        c4080kC0A2.a(BJ0.IEEE_P1363, C3336eH0.f27730b);
        c4080kC0A2.a(BJ0.DER, C3336eH0.f27731c);
        f19510j = c4080kC0A2.b();
        C4080kC0 c4080kC0A3 = C4206lC0.a();
        c4080kC0A3.a(AJ0.NIST_P256, C3085cH0.f27077c);
        c4080kC0A3.a(AJ0.NIST_P384, C3085cH0.f27078d);
        c4080kC0A3.a(AJ0.NIST_P521, C3085cH0.f27079e);
        f19511k = c4080kC0A3.b();
    }

    private II0(ECPublicKey eCPublicKey, SJ0 sj0, BJ0 bj0, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!UB0.a(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.f19513b = AbstractC3720hK0.a(sj0);
        this.f19512a = eCPublicKey;
        this.f19514c = bj0;
        this.f19515d = bArr;
        this.f19516e = bArr2;
        this.f19517f = provider;
    }

    public static InterfaceC1651Dy0 b(C4090kH0 c4090kH0, Provider provider) {
        return new II0((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) JJ0.f19830g.b("EC")).generatePublic(new ECPublicKeySpec(c4090kH0.e(), CJ0.b((AJ0) f19511k.b(c4090kH0.f().d())))), (SJ0) f19509i.b(c4090kH0.f().e()), (BJ0) f19510j.b(c4090kH0.f().c()), c4090kH0.c().c(), c4090kH0.f().f().equals(C3462fH0.f28235d) ? f19508h : f19507g, provider);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1 A[RETURN] */
    private final void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        byte b10;
        int i15;
        byte b11;
        String str;
        Provider provider;
        Signature signature;
        byte[] bArr3;
        if (this.f19514c == BJ0.IEEE_P1363) {
            EllipticCurve curve = this.f19512a.getParams().getCurve();
            int length = bArr.length;
            int iBitLength = (AbstractC3954jC0.c(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
            if (length != iBitLength + iBitLength) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = CJ0.a(bArr);
        }
        int length2 = bArr.length;
        if (length2 >= 8 && bArr[0] == 48) {
            int i16 = bArr[1] & 255;
            if (i16 == 129) {
                i16 = bArr[2] & 255;
                if (i16 >= 128) {
                    i10 = 2;
                    if (i16 == (length2 - 1) - i10 && bArr[i10 + 1] == 2 && (i14 = (i13 = (i12 = i10 + 3) + (i11 = bArr[i10 + 2] & 255)) + 1) < length2 && i11 != 0) {
                        b10 = bArr[i12];
                        if ((b10 & 255) < 128 && ((i11 <= 1 || b10 != 0 || (bArr[i10 + 4] & 255) >= 128) && bArr[i13] == 2)) {
                            i15 = bArr[i14] & 255;
                            if (i13 + 2 + i15 == length2 && i15 != 0) {
                                b11 = bArr[i10 + 5 + i11];
                                if ((b11 & 255) < 128 && (i15 <= 1 || b11 != 0 || (bArr[i10 + 6 + i11] & 255) >= 128)) {
                                    str = this.f19513b;
                                    provider = this.f19517f;
                                    if (provider != null) {
                                        signature = Signature.getInstance(str, provider);
                                    } else {
                                        signature = (Signature) JJ0.f19827d.b(str);
                                    }
                                    signature.initVerify(this.f19512a);
                                    signature.update(bArr2);
                                    bArr3 = this.f19516e;
                                    if (bArr3.length > 0) {
                                        signature.update(bArr3);
                                    }
                                    try {
                                        if (signature.verify(bArr)) {
                                            return;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    throw new GeneralSecurityException("Invalid signature");
                                }
                            }
                        }
                    }
                }
            } else if (i16 != 128 && i16 <= 129) {
                i10 = 1;
                if (i16 == (length2 - 1) - i10) {
                    b10 = bArr[i12];
                    if ((b10 & 255) < 128) {
                        i15 = bArr[i14] & 255;
                        if (i13 + 2 + i15 == length2) {
                            b11 = bArr[i10 + 5 + i11];
                            if ((b11 & 255) < 128) {
                                str = this.f19513b;
                                provider = this.f19517f;
                                if (provider != null) {
                                    signature = Signature.getInstance(str, provider);
                                } else {
                                    signature = (Signature) JJ0.f19827d.b(str);
                                }
                                signature.initVerify(this.f19512a);
                                signature.update(bArr2);
                                bArr3 = this.f19516e;
                                if (bArr3.length > 0) {
                                    signature.update(bArr3);
                                }
                                if (signature.verify(bArr)) {
                                    return;
                                }
                                throw new GeneralSecurityException("Invalid signature");
                            }
                        }
                    }
                }
            }
        }
        throw new GeneralSecurityException("Invalid signature");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1651Dy0
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f19515d;
        int length = bArr3.length;
        if (length == 0) {
            c(bArr, bArr2);
        } else {
            if (!HD0.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            c(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}

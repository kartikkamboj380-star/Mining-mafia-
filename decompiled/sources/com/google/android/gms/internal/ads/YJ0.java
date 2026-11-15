package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class YJ0 implements LE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal f25586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Key f25588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25589d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public YJ0(String str, Key key) throws GeneralSecurityException {
        byte b10;
        int i10;
        XJ0 xj0 = new XJ0(this);
        this.f25586a = xj0;
        if (!UB0.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f25587b = str;
        this.f25588c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                b10 = 0;
                break;
            case "HMACSHA224":
                b10 = 1;
                break;
            case "HMACSHA256":
                b10 = 2;
                break;
            case "HMACSHA384":
                b10 = 3;
                break;
            case "HMACSHA512":
                b10 = 4;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            i10 = 20;
        } else if (b10 == 1) {
            i10 = 28;
        } else if (b10 == 2) {
            i10 = 32;
        } else if (b10 == 3) {
            i10 = 48;
        } else {
            if (b10 != 4) {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            i10 = 64;
        }
        this.f25589d = i10;
        xj0.get();
    }

    @Override // com.google.android.gms.internal.ads.LE0
    public final byte[] a(byte[] bArr, int i10) throws InvalidAlgorithmParameterException {
        if (i10 > this.f25589d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = this.f25586a;
        ((Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i10);
    }

    final /* synthetic */ String b() {
        return this.f25587b;
    }

    final /* synthetic */ Key c() {
        return this.f25588c;
    }
}

package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3450fB0 implements InterfaceC3171cy0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f28212d = TJ0.a("7a806c");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f28213e = TJ0.a("46bb91c3c5");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f28214f = TJ0.a("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f28215g = TJ0.a("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f28216h = TJ0.a("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3324eB0 f28217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SecretKey f28218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f28219c;

    private C3450fB0(byte[] bArr, byte[] bArr2, InterfaceC3324eB0 interfaceC3324eB0) throws InvalidAlgorithmParameterException {
        this.f28219c = bArr2;
        AbstractC3846iK0.a(bArr.length);
        this.f28218b = new SecretKeySpec(bArr, "AES");
        this.f28217a = interfaceC3324eB0;
    }

    public static boolean b(Cipher cipher) {
        try {
            byte[] bArr = f28215g;
            cipher.init(2, new SecretKeySpec(f28214f, "AES"), new GCMParameterSpec(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, bArr, 0, bArr.length));
            cipher.updateAAD(f28213e);
            byte[] bArr2 = f28216h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f28212d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static InterfaceC3171cy0 c(C1549Bz0 c1549Bz0, InterfaceC3324eB0 interfaceC3324eB0) {
        if (b((Cipher) interfaceC3324eB0.zza())) {
            return new C3450fB0(c1549Bz0.e().c(AbstractC3800hy0.a()), c1549Bz0.c().c(), interfaceC3324eB0);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171cy0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f28219c;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!HD0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) this.f28217a.zza();
        cipher.init(2, this.f28218b, new GCMParameterSpec(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, bArr, length2, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}

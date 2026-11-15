package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2666Xm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Cipher f25383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f25384b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f25385c = new Object();

    private static final Cipher c() {
        Cipher cipher;
        synchronized (f25385c) {
            try {
                if (f25383a == null) {
                    f25383a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f25383a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public final byte[] a(byte[] bArr, String str) throws C2614Wm0 {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrB = AbstractC2714Yk0.b(str, false);
            int length2 = bArrB.length;
            if (length2 <= 16) {
                throw new C2614Wm0();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrB);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f25384b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new C2614Wm0(e);
        } catch (InvalidAlgorithmParameterException e11) {
            e = e11;
            throw new C2614Wm0(e);
        } catch (InvalidKeyException e12) {
            e = e12;
            throw new C2614Wm0(e);
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            throw new C2614Wm0(e);
        } catch (BadPaddingException e14) {
            e = e14;
            throw new C2614Wm0(e);
        } catch (IllegalBlockSizeException e15) {
            e = e15;
            throw new C2614Wm0(e);
        } catch (NoSuchPaddingException e16) {
            e = e16;
            throw new C2614Wm0(e);
        }
    }

    public final String b(byte[] bArr, String str) {
        return new String(a(bArr, str), "UTF-8");
    }
}

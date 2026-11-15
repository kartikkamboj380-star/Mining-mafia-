package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class YA0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f25549a = new XA0();

    public static Cipher a() {
        return (Cipher) f25549a.get();
    }

    public static SecretKey b(byte[] bArr) throws InvalidAlgorithmParameterException {
        AbstractC3846iK0.a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i10, int i11) {
        HD0.d();
        return new GCMParameterSpec(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, bArr, i10, 12);
    }
}

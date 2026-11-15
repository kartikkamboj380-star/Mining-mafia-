package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6483z implements V0 {
    protected int zza = 0;

    abstract int a(InterfaceC6410g1 interfaceC6410g1);

    public final byte[] e() {
        try {
            int iB = b();
            byte[] bArr = new byte[iB];
            Z zY = Z.y(bArr, 0, iB);
            d(zY);
            zY.z();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}

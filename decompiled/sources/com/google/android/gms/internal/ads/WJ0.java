package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WJ0 implements LE0 {
    public static LE0 b(JE0 je0) {
        LE0 le0B = PE0.b(je0);
        try {
            return new VJ0(le0B, QE0.b(je0), null);
        } catch (GeneralSecurityException unused) {
            return le0B;
        }
    }
}

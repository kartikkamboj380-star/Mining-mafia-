package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2701Ye {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static MessageDigest f25655b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f25656a = new Object();

    abstract byte[] a(String str);

    protected final MessageDigest b() {
        synchronized (this.f25656a) {
            MessageDigest messageDigest = f25655b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    f25655b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f25655b;
        }
    }
}

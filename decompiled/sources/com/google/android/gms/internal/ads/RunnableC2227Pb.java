package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2227Pb implements Runnable {
    /* synthetic */ RunnableC2227Pb(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            AbstractC2279Qb.f22406b = MessageDigest.getInstance("MD5");
            countDownLatch = AbstractC2279Qb.f22409e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = AbstractC2279Qb.f22409e;
        } catch (Throwable th) {
            AbstractC2279Qb.f22409e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}

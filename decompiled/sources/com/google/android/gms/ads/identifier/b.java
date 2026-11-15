package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class b extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f16826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f16827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final CountDownLatch f16828c;

    public b(AdvertisingIdClient advertisingIdClient, long j10) {
        super("AdIdClientAutoDisconnectThread");
        this.f16826a = new WeakReference(advertisingIdClient);
        this.f16827b = j10;
        this.f16828c = new CountDownLatch(1);
        start();
    }

    private final void a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f16826a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f16828c.await(this.f16827b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}

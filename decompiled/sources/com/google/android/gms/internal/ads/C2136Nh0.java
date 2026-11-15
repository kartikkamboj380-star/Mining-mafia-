package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2136Nh0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C3893ii0 f21319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EnumC2647Xd f21322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedBlockingQueue f21323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HandlerThread f21324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1721Fh0 f21325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f21326h;

    public C2136Nh0(Context context, int i10, EnumC2647Xd enumC2647Xd, String str, String str2, String str3, C1721Fh0 c1721Fh0) {
        this.f21320b = str;
        this.f21322d = enumC2647Xd;
        this.f21321c = str2;
        this.f21325g = c1721Fh0;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f21324f = handlerThread;
        handlerThread.start();
        this.f21326h = System.currentTimeMillis();
        C3893ii0 c3893ii0 = new C3893ii0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f21319a = c3893ii0;
        this.f21323e = new LinkedBlockingQueue();
        c3893ii0.checkAvailabilityAndConnect();
    }

    private final void d(int i10, long j10, Exception exc) {
        C1721Fh0 c1721Fh0 = this.f21325g;
        if (c1721Fh0 != null) {
            c1721Fh0.c(i10, System.currentTimeMillis() - j10, exc);
        }
    }

    public final C5403ui0 a(int i10) {
        C5403ui0 c5403ui0;
        try {
            c5403ui0 = (C5403ui0) this.f21323e.poll(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            d(2009, this.f21326h, e10);
            c5403ui0 = null;
        }
        d(3004, this.f21326h, null);
        if (c5403ui0 != null) {
            if (c5403ui0.f33886c == 7) {
                C1721Fh0.g(3);
            } else {
                C1721Fh0.g(2);
            }
        }
        return c5403ui0 == null ? new C5403ui0(null, 1) : c5403ui0;
    }

    public final void b() {
        C3893ii0 c3893ii0 = this.f21319a;
        if (c3893ii0 != null) {
            if (c3893ii0.isConnected() || c3893ii0.isConnecting()) {
                c3893ii0.disconnect();
            }
        }
    }

    protected final C4522ni0 c() {
        try {
            return this.f21319a.c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        C4522ni0 c4522ni0C = c();
        if (c4522ni0C != null) {
            try {
                C5403ui0 c5403ui0I2 = c4522ni0C.i2(new C5151si0(1, this.f21322d, this.f21320b, this.f21321c));
                d(5011, this.f21326h, null);
                this.f21323e.put(c5403ui0I2);
            } catch (Throwable th) {
                try {
                    d(2010, this.f21326h, new Exception(th));
                } finally {
                    b();
                    this.f21324f.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            d(4012, this.f21326h, null);
            this.f21323e.put(new C5403ui0(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        try {
            d(4011, this.f21326h, null);
            this.f21323e.put(new C5403ui0(null, 1));
        } catch (InterruptedException unused) {
        }
    }
}

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

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2033Lh0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C3893ii0 f20586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f20589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HandlerThread f20590e;

    public C2033Lh0(Context context, String str, String str2) {
        this.f20587b = str;
        this.f20588c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f20590e = handlerThread;
        handlerThread.start();
        C3893ii0 c3893ii0 = new C3893ii0(context, handlerThread.getLooper(), this, this, 9200000);
        this.f20586a = c3893ii0;
        this.f20589d = new LinkedBlockingQueue();
        c3893ii0.checkAvailabilityAndConnect();
    }

    static C4255lb c() {
        C1966Ka c1966KaG1 = C4255lb.g1();
        c1966KaG1.A0(32768L);
        return (C4255lb) c1966KaG1.w();
    }

    public final C4255lb a(int i10) {
        C4255lb c4255lb;
        try {
            c4255lb = (C4255lb) this.f20589d.poll(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            c4255lb = null;
        }
        return c4255lb == null ? c() : c4255lb;
    }

    public final void b() {
        C3893ii0 c3893ii0 = this.f20586a;
        if (c3893ii0 != null) {
            if (c3893ii0.isConnected() || c3893ii0.isConnecting()) {
                c3893ii0.disconnect();
            }
        }
    }

    protected final C4522ni0 d() {
        try {
            return this.f20586a.c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        C4522ni0 c4522ni0D = d();
        if (c4522ni0D != null) {
            try {
                try {
                    this.f20589d.put(c4522ni0D.H1(new C4018ji0(this.f20587b, this.f20588c)).a());
                } catch (Throwable unused) {
                    this.f20589d.put(c());
                }
            } catch (InterruptedException unused2) {
            } finally {
                b();
                this.f20590e.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.f20589d.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        try {
            this.f20589d.put(c());
        } catch (InterruptedException unused) {
        }
    }
}

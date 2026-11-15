package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.s;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class r extends GmsClientSupervisor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f17145a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f17146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Handler f17147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f17148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConnectionTracker f17149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f17150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f17151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Executor f17152h;

    r(Context context, Looper looper, Executor executor) {
        q qVar = new q(this, null);
        this.f17148d = qVar;
        this.f17146b = context.getApplicationContext();
        this.f17147c = new s(looper, qVar);
        this.f17149e = ConnectionTracker.getInstance();
        this.f17150f = ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;
        this.f17151g = 300000L;
        this.f17152h = executor;
    }

    final void a(Looper looper) {
        synchronized (this.f17145a) {
            this.f17147c = new s(looper, this.f17148d);
        }
    }

    final void b(Executor executor) {
        synchronized (this.f17145a) {
            this.f17152h = executor;
        }
    }

    final /* synthetic */ HashMap c() {
        return this.f17145a;
    }

    final /* synthetic */ Context d() {
        return this.f17146b;
    }

    final /* synthetic */ Handler e() {
        return this.f17147c;
    }

    final /* synthetic */ ConnectionTracker f() {
        return this.f17149e;
    }

    final /* synthetic */ long g() {
        return this.f17151g;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final ConnectionResult zza(zzn zznVar, ServiceConnection serviceConnection, String str, Executor executor) {
        ConnectionResult connectionResultJ;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f17145a;
        synchronized (map) {
            try {
                p pVar = (p) map.get(zznVar);
                if (executor == null) {
                    executor = this.f17152h;
                }
                if (pVar == null) {
                    pVar = new p(this, zznVar);
                    pVar.b(serviceConnection, serviceConnection, str);
                    connectionResultJ = pVar.j(str, executor);
                    map.put(zznVar, pVar);
                } else {
                    this.f17147c.removeMessages(0, zznVar);
                    if (pVar.f(serviceConnection)) {
                        String string = zznVar.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    pVar.b(serviceConnection, serviceConnection, str);
                    int iE = pVar.e();
                    if (iE == 1) {
                        serviceConnection.onServiceConnected(pVar.i(), pVar.h());
                    } else if (iE == 2) {
                        connectionResultJ = pVar.j(str, executor);
                    }
                    connectionResultJ = null;
                }
                if (pVar.d()) {
                    return ConnectionResult.RESULT_SUCCESS;
                }
                if (connectionResultJ == null) {
                    connectionResultJ = new ConnectionResult(-1);
                }
                return connectionResultJ;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zzc(zzn zznVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f17145a;
        synchronized (map) {
            try {
                p pVar = (p) map.get(zznVar);
                if (pVar == null) {
                    String string = zznVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!pVar.f(serviceConnection)) {
                    String string2 = zznVar.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                pVar.c(serviceConnection, str);
                if (pVar.g()) {
                    this.f17147c.sendMessageDelayed(this.f17147c.obtainMessage(0, zznVar), this.f17150f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

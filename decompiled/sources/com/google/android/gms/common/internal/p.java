package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class p implements ServiceConnection, zzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f17137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IBinder f17140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zzn f17141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ComponentName f17142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ r f17143g;

    public p(r rVar, zzn zznVar) {
        java.util.Objects.requireNonNull(rVar);
        this.f17143g = rVar;
        this.f17141e = zznVar;
        this.f17137a = new HashMap();
        this.f17138b = 2;
    }

    public final void a(String str) {
        zzn zznVar = this.f17141e;
        r rVar = this.f17143g;
        rVar.e().removeMessages(1, zznVar);
        rVar.f().unbindService(rVar.d(), this);
        this.f17139c = false;
        this.f17138b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f17137a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.f17137a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.f17139c;
    }

    public final int e() {
        return this.f17138b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f17137a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.f17137a.isEmpty();
    }

    public final IBinder h() {
        return this.f17140d;
    }

    public final ComponentName i() {
        return this.f17142f;
    }

    final /* synthetic */ ConnectionResult j(String str, Executor executor) throws Throwable {
        try {
            Intent intentZza = zzah.zza(this.f17143g.d(), this.f17141e);
            this.f17138b = 3;
            StrictMode.VmPolicy vmPolicyZza = com.google.android.gms.common.util.zzd.zza();
            try {
                r rVar = this.f17143g;
                ConnectionTracker connectionTrackerF = rVar.f();
                Context contextD = rVar.d();
                zzn zznVar = this.f17141e;
                try {
                    boolean zZza = connectionTrackerF.zza(contextD, str, intentZza, this, 4225, executor);
                    this.f17139c = zZza;
                    if (zZza) {
                        rVar.e().sendMessageDelayed(rVar.e().obtainMessage(1, zznVar), rVar.g());
                        ConnectionResult connectionResult = ConnectionResult.RESULT_SUCCESS;
                        StrictMode.setVmPolicy(vmPolicyZza);
                        return connectionResult;
                    }
                    this.f17138b = 2;
                    try {
                        rVar.f().unbindService(rVar.d(), this);
                    } catch (IllegalArgumentException unused) {
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(16);
                    StrictMode.setVmPolicy(vmPolicyZza);
                    return connectionResult2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicyZza);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (zzaf e10) {
            return e10.zza;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        r rVar = this.f17143g;
        synchronized (rVar.c()) {
            try {
                rVar.e().removeMessages(1, this.f17141e);
                this.f17140d = iBinder;
                this.f17142f = componentName;
                Iterator it = this.f17137a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f17138b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        r rVar = this.f17143g;
        synchronized (rVar.c()) {
            try {
                rVar.e().removeMessages(1, this.f17141e);
                this.f17140d = null;
                this.f17142f = componentName;
                Iterator it = this.f17137a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f17138b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

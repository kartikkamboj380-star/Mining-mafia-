package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.D5;
import p136n5.I;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D5 f37362a;

    private final D5 d() {
        if (this.f37362a == null) {
            this.f37362a = new D5(this);
        }
        return this.f37362a;
    }

    @Override // p136n5.I
    public final boolean a(int i10) {
        return stopSelfResult(i10);
    }

    @Override // p136n5.I
    public final void b(Intent intent) {
        p101k0.a.b(intent);
    }

    @Override // p136n5.I
    public final void c(JobParameters jobParameters, boolean z9) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return d().d(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        d().a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        d();
        D5.i(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        d().c(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d();
        D5.j(intent);
        return true;
    }
}

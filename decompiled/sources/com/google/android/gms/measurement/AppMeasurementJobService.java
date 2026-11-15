package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.internal.D5;
import p136n5.I;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
public final class AppMeasurementJobService extends JobService implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D5 f37360a;

    private final D5 d() {
        if (this.f37360a == null) {
            this.f37360a = new D5(this);
        }
        return this.f37360a;
    }

    @Override // p136n5.I
    public final boolean a(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p136n5.I
    public final void b(Intent intent) {
    }

    @Override // p136n5.I
    public final void c(JobParameters jobParameters, boolean z9) {
        jobFinished(jobParameters, false);
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

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        d().e(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d();
        D5.j(intent);
        return true;
    }
}

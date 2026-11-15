package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class PS0 implements InterfaceC3358eS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f22110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f22111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3122ca f22112d = C3122ca.f27149d;

    public PS0(InterfaceC3471fM interfaceC3471fM) {
    }

    public final void a() {
        if (this.f22109a) {
            return;
        }
        this.f22111c = SystemClock.elapsedRealtime();
        this.f22109a = true;
    }

    public final void b() {
        if (this.f22109a) {
            e(zzg());
            this.f22109a = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358eS0
    public final C3122ca d() {
        return this.f22112d;
    }

    public final void e(long j10) {
        this.f22110b = j10;
        if (this.f22109a) {
            this.f22111c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358eS0
    public final void v(C3122ca c3122ca) {
        if (this.f22109a) {
            e(zzg());
        }
        this.f22112d = c3122ca;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358eS0
    public final long zzg() {
        long j10 = this.f22110b;
        if (!this.f22109a) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f22111c;
        C3122ca c3122ca = this.f22112d;
        return j10 + (c3122ca.f27150a == 1.0f ? AbstractC4634ob0.M(jElapsedRealtime) : c3122ca.a(jElapsedRealtime));
    }
}

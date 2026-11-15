package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import com.google.android.gms.common.util.Clock;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class DH extends AbstractC3214dJ {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f18129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Clock f18130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QR f18131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f18132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f18133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f18134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f18135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ScheduledFuture f18137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ScheduledFuture f18138k;

    public DH(ScheduledExecutorService scheduledExecutorService, Clock clock, QR qr) {
        super(Collections.EMPTY_SET);
        this.f18132e = -1L;
        this.f18133f = -1L;
        this.f18134g = -1L;
        this.f18135h = -1L;
        this.f18136i = false;
        this.f18129b = scheduledExecutorService;
        this.f18130c = clock;
        this.f18131d = qr;
    }

    private final synchronized void m1(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.f18137j;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f18137j.cancel(false);
            }
            this.f18132e = this.f18130c.elapsedRealtime() + j10;
            this.f18137j = this.f18129b.schedule(new BH(this, null), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void n1(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.f18138k;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f18138k.cancel(false);
            }
            this.f18133f = this.f18130c.elapsedRealtime() + j10;
            this.f18138k = this.f18129b.schedule(new CH(this, null), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j1() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.f18136i) {
                if (this.f18134g > 0 && (scheduledFuture2 = this.f18137j) != null && scheduledFuture2.isCancelled()) {
                    m1(this.f18134g);
                }
                if (this.f18135h > 0 && (scheduledFuture = this.f18138k) != null && scheduledFuture.isCancelled()) {
                    n1(this.f18135h);
                }
                this.f18136i = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k1(int i10) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i10);
        AbstractC0786o0.k(sb.toString());
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.f18136i) {
                long j10 = this.f18134g;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.f18134g = millis;
                return;
            }
            long jElapsedRealtime = this.f18130c.elapsedRealtime();
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Ke)).booleanValue()) {
                long j11 = this.f18132e;
                if (jElapsedRealtime >= j11 || j11 - jElapsedRealtime > millis) {
                    m1(millis);
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.hf)).booleanValue()) {
                        PR prA = this.f18131d.a();
                        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "rtnc");
                        prA.f();
                    }
                }
            } else {
                long j12 = this.f18132e;
                if (jElapsedRealtime > j12 || j12 - jElapsedRealtime > millis) {
                    m1(millis);
                }
            }
        }
    }

    public final synchronized void l1(int i10) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i10);
        AbstractC0786o0.k(sb.toString());
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.f18136i) {
                long j10 = this.f18135h;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.f18135h = millis;
                return;
            }
            long jElapsedRealtime = this.f18130c.elapsedRealtime();
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Ke)).booleanValue()) {
                if (jElapsedRealtime == this.f18133f) {
                    AbstractC0786o0.k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j11 = this.f18133f;
                if (jElapsedRealtime >= j11 || j11 - jElapsedRealtime > millis) {
                    n1(millis);
                }
            } else {
                long j12 = this.f18133f;
                if (jElapsedRealtime > j12 || j12 - jElapsedRealtime > millis) {
                    n1(millis);
                }
            }
        }
    }

    public final synchronized void zza() {
        try {
            if (this.f18136i) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f18137j;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f18134g = -1L;
            } else {
                this.f18137j.cancel(false);
                this.f18134g = this.f18132e - this.f18130c.elapsedRealtime();
            }
            ScheduledFuture scheduledFuture2 = this.f18138k;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.f18135h = -1L;
            } else {
                this.f18138k.cancel(false);
                this.f18135h = this.f18133f - this.f18130c.elapsedRealtime();
            }
            this.f18136i = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        this.f18136i = false;
        m1(0L);
    }
}

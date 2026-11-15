package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2293Qi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MotionEvent f22429a = MotionEvent.obtain(0, 0, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MotionEvent f22430b = MotionEvent.obtain(0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f22431c;

    public C2293Qi(Context context, ScheduledExecutorService scheduledExecutorService, C2397Si c2397Si, RunnableC3886ie0 runnableC3886ie0) {
        this.f22431c = scheduledExecutorService;
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f22429a.getEventTime()) {
            this.f22429a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f22430b.getEventTime()) {
                return;
            }
            this.f22430b = MotionEvent.obtain(motionEvent);
        }
    }

    public final com.google.common.util.concurrent.p b() {
        return (AbstractC4678ox0) AbstractC5685wx0.i(AbstractC4678ox0.B(AbstractC5685wx0.a(null)), ((Long) AbstractC4019jj.f30548c.e()).longValue(), TimeUnit.MILLISECONDS, this.f22431c);
    }
}

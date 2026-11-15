package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AFb1lSDK implements Application.ActivityLifecycleCallbacks {
    private volatile boolean AFAdRevenueData;

    @NotNull
    private final Runnable areAllFieldsValid;

    @Nullable
    private ScheduledFuture<?> component1;

    @NotNull
    final AFb1bSDK.AFa1zSDK getCurrencyIso4217Code;

    @NotNull
    private final ScheduledExecutorService getMediationNetwork;

    @NotNull
    private final AFi1rSDK getMonetizationNetwork;

    @NotNull
    private final AFa1oSDK getRevenue;

    public AFb1lSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFa1oSDK aFa1oSDK, @NotNull AFi1rSDK aFi1rSDK, @NotNull AFb1bSDK.AFa1zSDK aFa1zSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        this.getMediationNetwork = scheduledExecutorService;
        this.getRevenue = aFa1oSDK;
        this.getMonetizationNetwork = aFi1rSDK;
        this.getCurrencyIso4217Code = aFa1zSDK;
        this.areAllFieldsValid = new Runnable() { // from class: com.appsflyer.internal.k
            @Override // java.lang.Runnable
            public final void run() {
                AFb1lSDK.getCurrencyIso4217Code(this.f13320a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFb1lSDK aFb1lSDK) {
        Object objB;
        Intrinsics.checkNotNullParameter(aFb1lSDK, "");
        aFb1lSDK.AFAdRevenueData = false;
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            aFb1lSDK.getCurrencyIso4217Code.getCurrencyIso4217Code();
            objB = p129m8.m.b(Unit.f45918a);
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            objB = p129m8.m.b(p129m8.n.a(th));
        }
        Throwable thD = p129m8.m.d(objB);
        if (thD != null) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", thD);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFa1oSDK aFa1oSDK = this.getRevenue;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1oSDK.AFAdRevenueData) {
            aFa1oSDK.AFAdRevenueData = intent;
        }
        this.getMonetizationNetwork.getCurrencyIso4217Code(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.AFAdRevenueData) {
            ScheduledExecutorService scheduledExecutorService = this.getMediationNetwork;
            Runnable runnable = this.areAllFieldsValid;
            AFb1bSDK.AFa1vSDK aFa1vSDK = AFb1bSDK.AFa1vSDK;
            this.component1 = scheduledExecutorService.schedule(runnable, AFb1bSDK.AFa1vSDK.getRevenue(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!this.AFAdRevenueData) {
            this.AFAdRevenueData = true;
            final AFh1oSDK aFh1oSDK = new AFh1oSDK(activity, this.getMonetizationNetwork);
            this.getMediationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.l
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1lSDK.getCurrencyIso4217Code(this.f13321a, aFh1oSDK);
                }
            });
        } else {
            ScheduledFuture<?> scheduledFuture = this.component1;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFb1lSDK aFb1lSDK, AFh1oSDK aFh1oSDK) {
        Object objB;
        Intrinsics.checkNotNullParameter(aFb1lSDK, "");
        Intrinsics.checkNotNullParameter(aFh1oSDK, "");
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            aFb1lSDK.getCurrencyIso4217Code.getMediationNetwork(aFh1oSDK);
            objB = p129m8.m.b(Unit.f45918a);
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            objB = p129m8.m.b(p129m8.n.a(th));
        }
        Throwable thD = p129m8.m.d(objB);
        if (thD != null) {
            AFLogger.afErrorLog("Listener thrown an exception: ", thD, true);
        }
    }
}

package app.notifee.core.event;

import app.notifee.core.KeepForSdk;
import app.notifee.core.interfaces.MethodCallResult;
import app.notifee.core.model.NotificationModel;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class ForegroundServiceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationModel f11468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MethodCallResult f11469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11470c = false;

    public ForegroundServiceEvent(NotificationModel notificationModel, MethodCallResult methodCallResult) {
        this.f11468a = notificationModel;
        this.f11469b = methodCallResult;
    }

    @KeepForSdk
    public NotificationModel getNotification() {
        return this.f11468a;
    }

    @KeepForSdk
    public void setCompletionResult() {
        if (this.f11470c) {
            return;
        }
        this.f11470c = true;
        this.f11469b.onComplete(null, null);
    }
}

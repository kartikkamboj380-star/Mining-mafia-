package app.notifee.core.event;

import android.os.Bundle;
import app.notifee.core.KeepForSdk;
import app.notifee.core.model.NotificationModel;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class NotificationEvent {

    @KeepForSdk
    public static final int TYPE_ACTION_PRESS = 2;

    @KeepForSdk
    public static final int TYPE_DELIVERED = 3;

    @KeepForSdk
    public static final int TYPE_DISMISSED = 0;

    @KeepForSdk
    public static final int TYPE_FG_ALREADY_EXIST = 8;

    @KeepForSdk
    public static final int TYPE_PRESS = 1;

    @KeepForSdk
    public static final int TYPE_TRIGGER_NOTIFICATION_CREATED = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f11476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotificationModel f11477c;

    public NotificationEvent(int i10, NotificationModel notificationModel) {
        this.f11475a = i10;
        this.f11477c = notificationModel;
        this.f11476b = null;
    }

    @KeepForSdk
    public Bundle getExtras() {
        return this.f11476b;
    }

    @KeepForSdk
    public NotificationModel getNotification() {
        return this.f11477c;
    }

    @KeepForSdk
    public int getType() {
        return this.f11475a;
    }

    public NotificationEvent(int i10, NotificationModel notificationModel, Bundle bundle) {
        this.f11475a = i10;
        this.f11477c = notificationModel;
        this.f11476b = bundle;
    }
}

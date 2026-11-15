package app.notifee.core;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.r;
import app.notifee.core.event.ForegroundServiceEvent;
import app.notifee.core.event.NotificationEvent;
import app.notifee.core.interfaces.MethodCallResult;
import app.notifee.core.model.NotificationModel;
import b9.f;
import b9.g;

/* JADX INFO: loaded from: classes.dex */
public class ForegroundService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f11435a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f11436b = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Exception exc, Void r10) {
        stopForeground(true);
        f11435a = null;
        f11436b = -1;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        int foregroundServiceType;
        if (intent == null || "app.notifee.core.ForegroundService.STOP".equals(intent.getAction())) {
            stopSelf();
            f11435a = null;
            f11436b = -1;
            return 0;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return 2;
        }
        int i12 = extras.getInt("hashCode");
        Notification notification = (Notification) extras.getParcelable("notification");
        Bundle bundle = extras.getBundle("notificationBundle");
        if (!(bundle != null) || !(notification != null)) {
            return 2;
        }
        NotificationModel notificationModel = new NotificationModel(bundle);
        String str = f11435a;
        if (str == null) {
            f11435a = notificationModel.c();
            if (Build.VERSION.SDK_INT >= 29) {
                int foregroundServiceType2 = notificationModel.a().getForegroundServiceType();
                startForeground(i12, notification, foregroundServiceType2);
                f11436b = foregroundServiceType2;
            } else {
                startForeground(i12, notification);
            }
            g.a(new ForegroundServiceEvent(notificationModel, new MethodCallResult() { // from class: W0.e
                @Override // app.notifee.core.interfaces.MethodCallResult
                public final void onComplete(Exception exc, Object obj) {
                    this.f6501a.b(exc, (Void) obj);
                }
            }));
            return 2;
        }
        if (!str.equals(notificationModel.c())) {
            g.a(new NotificationEvent(8, notificationModel));
            return 2;
        }
        if (Build.VERSION.SDK_INT < 29 || (foregroundServiceType = notificationModel.a().getForegroundServiceType()) == f11436b) {
            r.i(f.f11648a).o(i12, notification);
            return 2;
        }
        startForeground(i12, notification, foregroundServiceType);
        f11436b = foregroundServiceType;
        return 2;
    }
}

package androidx.work.impl.background.systemalarm;

import K0.C;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.q;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11286a = q.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        q.e().a(f11286a, "Received intent " + intent);
        try {
            C.q(context).A(goAsync());
        } catch (IllegalStateException e10) {
            q.e().d(f11286a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}

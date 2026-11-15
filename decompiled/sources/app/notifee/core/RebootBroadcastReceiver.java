package app.notifee.core;

import W0.g0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import b9.f;

/* JADX INFO: loaded from: classes.dex */
public class RebootBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.i("RebootReceiver", "Received reboot event");
        if (f.f11648a == null) {
            f.a(context.getApplicationContext());
        }
        new g0().i();
    }
}

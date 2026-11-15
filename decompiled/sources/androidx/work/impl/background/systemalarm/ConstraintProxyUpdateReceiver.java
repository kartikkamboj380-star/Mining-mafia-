package androidx.work.impl.background.systemalarm;

import K0.C;
import T0.p;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.q;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f11281a = q.i("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f11282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f11283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f11284c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f11282a = intent;
            this.f11283b = context;
            this.f11284c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f11282a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f11282a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f11282a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f11282a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                q.e().a(ConstraintProxyUpdateReceiver.f11281a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                p.a(this.f11283b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                p.a(this.f11283b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                p.a(this.f11283b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                p.a(this.f11283b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f11284c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z9, boolean z10, boolean z11, boolean z12) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z9).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z10).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z12);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C.q(context).w().c(new a(intent, context, goAsync()));
            return;
        }
        q.e().a(f11281a, "Ignoring unknown action " + action);
    }
}

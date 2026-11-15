package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.A;
import com.google.android.gms.internal.play_billing.U2;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class p extends U2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f12626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ResultReceiver f12627b;

    /* synthetic */ p(WeakReference weakReference, ResultReceiver resultReceiver, zzbr zzbrVar) {
        this.f12626a = weakReference;
        this.f12627b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.V2
    public final void r(Bundle bundle) {
        ResultReceiver resultReceiver = this.f12627b;
        if (resultReceiver == null) {
            A.k("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f12626a.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.f12627b.send(0, null);
            A.k("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", this.f12627b);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e10) {
            this.f12627b.send(0, null);
            A.l("BillingClient", "Exception caught while launching intent for in-app messaging.", e10);
        }
    }
}

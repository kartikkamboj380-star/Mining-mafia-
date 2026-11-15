package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.A;
import com.google.android.gms.internal.play_billing.AbstractC6392c;
import com.google.android.gms.internal.play_billing.L2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class m extends L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f12618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ResultReceiver f12619b;

    /* synthetic */ m(WeakReference weakReference, ResultReceiver resultReceiver, zzbl zzblVar) {
        this.f12618a = weakReference;
        this.f12619b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    public final void r(Bundle bundle) {
        if (bundle == null) {
            this.f12619b.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            A.k("BillingClient", "Response bundle doesn't contain a response code");
            this.f12619b.send(6, bundle);
            return;
        }
        int iB = A.b(bundle, "BillingClient");
        if (iB != 0) {
            A.k("BillingClient", "Unable to launch intent for external offer dialog" + iB);
            this.f12619b.send(iB, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
        if (pendingIntent == null) {
            A.k("BillingClient", "The PendingIntent for the external offer dialog is null");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            this.f12619b.send(6, bundle2);
            return;
        }
        try {
            Activity activity = (Activity) this.f12618a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("external_payment_dialog_result_receiver", this.f12619b);
            intent.putExtra("external_payment_dialog_pending_intent", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e10) {
            A.l("BillingClient", "Runtime error while launching intent for the external offer dialog.", e10);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", 98);
            bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e10.getClass().getName(), AbstractC6392c.b(e10.getMessage())));
            this.f12619b.send(6, bundle3);
        }
    }
}

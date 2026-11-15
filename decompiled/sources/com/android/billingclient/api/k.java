package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.A;
import com.google.android.gms.internal.play_billing.AbstractC6392c;
import com.google.android.gms.internal.play_billing.S1;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class k extends S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f12613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ResultReceiver f12614b;

    /* synthetic */ k(WeakReference weakReference, ResultReceiver resultReceiver, zzbh zzbhVar) {
        this.f12613a = weakReference;
        this.f12614b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6462t2
    public final void r(Bundle bundle) {
        if (bundle == null) {
            this.f12614b.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            A.k("BillingClient", "Response bundle doesn't contain a response code");
            this.f12614b.send(6, bundle);
            return;
        }
        int iB = A.b(bundle, "BillingClient");
        if (iB != 0) {
            A.k("BillingClient", "Unable to launch intent for alternative billing only dialog" + iB);
            this.f12614b.send(iB, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            A.j("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            this.f12614b.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f12613a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", this.f12614b);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e10) {
            A.l("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e10);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e10.getClass().getName(), AbstractC6392c.b(e10.getMessage())));
            this.f12614b.send(6, bundle2);
        }
    }
}

package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.A;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends androidx.activity.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p040e.c f12523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p040e.c f12524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResultReceiver f12525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ResultReceiver f12526d;

    @Override // androidx.activity.j, androidx.core.app.i, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12523a = registerForActivityResult(new p050f.d(), new p040e.b() { // from class: com.android.billingclient.api.zzcw
            @Override // p040e.b
            public final void onActivityResult(Object obj) {
                this.zza.x((p040e.a) obj);
            }
        });
        this.f12524b = registerForActivityResult(new p050f.d(), new p040e.b() { // from class: com.android.billingclient.api.zzcx
            @Override // p040e.b
            public final void onActivityResult(Object obj) {
                this.zza.y((p040e.a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f12525c = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f12526d = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        A.j("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f12525c = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f12523a.a(new e.g.a(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f12526d = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f12524b.a(new e.g.a(pendingIntent2).a());
        }
    }

    @Override // androidx.activity.j, androidx.core.app.i, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f12525c;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f12526d;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }

    final void x(p040e.a aVar) {
        Intent intentA = aVar.a();
        int responseCode = A.e(intentA, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.f12525c;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || responseCode != 0) {
            A.k("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + aVar.b() + " and billing's responseCode: " + responseCode);
        }
        finish();
    }

    final void y(p040e.a aVar) {
        Intent intentA = aVar.a();
        int responseCode = A.e(intentA, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.f12526d;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || responseCode != 0) {
            A.k("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(aVar.b()), Integer.valueOf(responseCode)));
        }
        finish();
    }
}

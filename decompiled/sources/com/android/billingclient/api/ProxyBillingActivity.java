package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.A;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
@zzm
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResultReceiver f12519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResultReceiver f12520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12522d;

    private Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        Intent intentB;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100 || i10 == 110) {
            int responseCode = A.e(intent, "ProxyBillingActivity").getResponseCode();
            if (i11 != -1) {
                A.k("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + responseCode);
            } else if (responseCode != 0) {
                i11 = -1;
                A.k("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + responseCode);
            } else {
                responseCode = 0;
            }
            ResultReceiver resultReceiver = this.f12519a;
            if (resultReceiver != null) {
                resultReceiver.send(responseCode, intent != null ? intent.getExtras() : null);
            } else {
                if (intent == null) {
                    intentB = b();
                } else if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentB = a(string);
                        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        intentB = b();
                        intentB.putExtras(intent.getExtras());
                        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    }
                } else {
                    intentB = b();
                    A.k("ProxyBillingActivity", "Got null bundle!");
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
                    builderNewBuilder.setResponseCode(6);
                    builderNewBuilder.setDebugMessage("An internal error occurred.");
                    intentB.putExtra("FAILURE_LOGGING_PAYLOAD", zzcb.zza(22, 2, builderNewBuilder.build()).e());
                    intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                if (i10 == 110) {
                    intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentB);
            }
        } else if (i10 == 101) {
            int iA = A.a(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver2 = this.f12520b;
            if (resultReceiver2 != null) {
                resultReceiver2.send(iA, intent != null ? intent.getExtras() : null);
            }
        } else {
            A.k("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
        }
        this.f12521c = false;
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i10;
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            A.j("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f12521c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f12519a = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f12520b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f12522d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            return;
        }
        A.j("ProxyBillingActivity", "Launching Play Store billing flow");
        int i11 = 100;
        try {
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.f12522d = true;
                    i11 = 110;
                }
            } else {
                if (!getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                        pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                        this.f12520b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                        i11 = 101;
                    } else {
                        i10 = 100;
                        pendingIntent = null;
                    }
                    this.f12521c = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i10, new Intent(), 0, 0, 0);
                    return;
                }
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f12519a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            }
            this.f12521c = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i10, new Intent(), 0, 0, 0);
            return;
        } catch (IntentSender.SendIntentException e10) {
            A.l("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.f12519a;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f12520b;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentB = b();
                    if (this.f12522d) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentB);
                }
            }
            this.f12521c = false;
            finish();
            return;
        }
        i10 = i11;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f12521c) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f12519a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f12520b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f12521c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f12522d);
    }
}

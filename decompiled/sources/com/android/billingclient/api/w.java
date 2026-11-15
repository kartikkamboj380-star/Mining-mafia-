package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.A;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
abstract class w {
    static v a(Bundle bundle, String str, String str2) {
        BillingResult billingResult = s.f12646j;
        if (bundle == null) {
            A.k("BillingClient", String.format("%s got null owned items list", str2));
            return new v(billingResult, 54);
        }
        int iB = A.b(bundle, "BillingClient");
        String strG = A.g(bundle, "BillingClient");
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(iB);
        builderNewBuilder.setDebugMessage(strG);
        BillingResult billingResultBuild = builderNewBuilder.build();
        if (iB != 0) {
            A.k("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iB)));
            return new v(billingResultBuild, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            A.k("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new v(billingResult, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            A.k("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new v(billingResult, 56);
        }
        if (stringArrayList2 == null) {
            A.k("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new v(billingResult, 57);
        }
        if (stringArrayList3 != null) {
            return new v(s.f12648l, 1);
        }
        A.k("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new v(billingResult, 58);
    }
}

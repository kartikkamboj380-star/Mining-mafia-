package com.dooboolab.rniap;

import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.facebook.react.bridge.Promise;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.dooboolab.rniap.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1244b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1244b f13658a = new C1244b();

    private C1244b() {
    }

    public final C1243a a(int i10) {
        C1243a c1243a;
        C1243a c1243a2;
        if (i10 != 12) {
            switch (i10) {
                case BillingClient.BillingResponseCode.FEATURE_NOT_SUPPORTED /* -2 */:
                    c1243a = new C1243a("E_SERVICE_ERROR", "This feature is not available on your device.");
                    break;
                case -1:
                    c1243a = new C1243a("E_NETWORK_ERROR", "The service is disconnected (check your internet connection.)");
                    break;
                case 0:
                    c1243a = new C1243a("OK", "");
                    break;
                case 1:
                    c1243a = new C1243a("E_USER_CANCELLED", "Payment is Cancelled.");
                    break;
                case 2:
                    c1243a = new C1243a("E_SERVICE_ERROR", "The service is unreachable. This may be your internet connection, or the Play Store may be down.");
                    break;
                case 3:
                    c1243a = new C1243a("E_SERVICE_ERROR", "Billing is unavailable. This may be a problem with your device, or the Play Store may be down.");
                    break;
                case 4:
                    c1243a2 = new C1243a("E_ITEM_UNAVAILABLE", "That item is unavailable.");
                    c1243a = c1243a2;
                    break;
                case 5:
                    c1243a = new C1243a("E_DEVELOPER_ERROR", "Google is indicating that we have some issue connecting to payment.");
                    break;
                case 6:
                    c1243a = new C1243a("E_UNKNOWN", "An unknown or unexpected error has occurred. Please try again later.");
                    break;
                case 7:
                    c1243a = new C1243a("E_ALREADY_OWNED", "You already own this item.");
                    break;
                case 8:
                    c1243a2 = new C1243a("E_ITEM_UNAVAILABLE", "Item not owned. It may have already been consumed.");
                    c1243a = c1243a2;
                    break;
                default:
                    c1243a = new C1243a("E_UNKNOWN", "Purchase failed with code: " + i10);
                    break;
            }
        } else {
            c1243a = new C1243a("E_NETWORK_ERROR", "You have problem with network connection.");
        }
        Log.e("IapPromises", "Error Code : " + i10);
        return c1243a;
    }

    public final void b(Promise promise, int i10) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        C1243a c1243aA = a(i10);
        AbstractC1246d.b(promise, c1243aA.a(), c1243aA.b());
    }

    public final void c(String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        C1243a c1243aA = a(i10);
        C1245c.f13659a.c(key, c1243aA.a(), c1243aA.b(), null);
    }
}

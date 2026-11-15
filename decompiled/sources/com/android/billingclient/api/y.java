package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PurchasesUpdatedListener f12673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zzc f12674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final UserChoiceBillingListener f12675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f12676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f12677f = new x(this, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f12678g = new x(this, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12679h;

    y(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzck zzckVar, zzc zzcVar, UserChoiceBillingListener userChoiceBillingListener, r rVar) {
        this.f12672a = context;
        this.f12673b = purchasesUpdatedListener;
        this.f12674c = zzcVar;
        this.f12675d = userChoiceBillingListener;
        this.f12676e = rVar;
    }

    final PurchasesUpdatedListener d() {
        return this.f12673b;
    }

    final void f() {
        this.f12677f.c(this.f12672a);
        this.f12678g.c(this.f12672a);
    }

    final void g(boolean z9) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f12679h = z9;
        this.f12678g.a(this.f12672a, intentFilter2);
        if (this.f12679h) {
            this.f12677f.b(this.f12672a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f12677f.a(this.f12672a, intentFilter);
        }
    }
}

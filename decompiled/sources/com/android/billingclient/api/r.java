package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC6432m;
import com.google.android.gms.internal.play_billing.EnumC6415h2;
import com.google.android.gms.internal.play_billing.F2;
import com.google.android.gms.internal.play_billing.T1;
import com.google.android.gms.internal.play_billing.X1;

/* JADX INFO: loaded from: classes.dex */
interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6432m f12630a = AbstractC6432m.c("com.android.vending.billing.PURCHASES_UPDATED", EnumC6415h2.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", EnumC6415h2.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", EnumC6415h2.ALTERNATIVE_BILLING_ACTION);

    void a(X1 x10, int i10);

    void b(X1 x10);

    void c(F2 f10);

    void d(T1 t10, int i10);

    void e(T1 t10);
}

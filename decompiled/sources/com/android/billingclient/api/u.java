package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.A;
import com.google.android.gms.internal.play_billing.C6482y2;

/* JADX INFO: loaded from: classes.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f12665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p125m4.i f12666b;

    u(Context context) {
        try {
            p145o4.u.f(context);
            this.f12666b = p145o4.u.c().g(com.google.android.datatransport.cct.a.f16790g).a("PLAY_BILLING_LIBRARY", C6482y2.class, p125m4.c.b("proto"), new p125m4.h() { // from class: com.android.billingclient.api.zzci
                @Override // p125m4.h
                public final Object apply(Object obj) {
                    return ((C6482y2) obj).e();
                }
            });
        } catch (Throwable unused) {
            this.f12665a = true;
        }
    }

    public final void a(C6482y2 c6482y2) {
        if (this.f12665a) {
            A.k("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f12666b.b(p125m4.d.f(c6482y2));
        } catch (Throwable unused) {
            A.k("BillingLogger", "logging failed.");
        }
    }
}

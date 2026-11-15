package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.A;
import com.google.android.gms.internal.play_billing.AbstractC6432m;
import com.google.android.gms.internal.play_billing.C6399d2;
import com.google.android.gms.internal.play_billing.R1;
import com.google.android.gms.internal.play_billing.T1;
import com.google.android.gms.internal.play_billing.W1;
import com.google.android.gms.internal.play_billing.X1;
import com.google.android.gms.internal.play_billing.Z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzcb {
    public static final /* synthetic */ int zza = 0;

    static {
        AbstractC6432m abstractC6432m = r.f12630a;
    }

    public static T1 zza(int i10, int i11, BillingResult billingResult) {
        try {
            R1 r1E = T1.E();
            Z1 z1E = C6399d2.E();
            z1E.o(billingResult.getResponseCode());
            z1E.n(billingResult.getDebugMessage());
            z1E.p(i10);
            r1E.m(z1E);
            r1E.o(i11);
            return (T1) r1E.g();
        } catch (Exception e10) {
            A.l("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    public static T1 zzb(int i10, int i11, BillingResult billingResult, String str) {
        try {
            Z1 z1E = C6399d2.E();
            z1E.o(billingResult.getResponseCode());
            z1E.n(billingResult.getDebugMessage());
            z1E.p(i10);
            if (str != null) {
                z1E.m(str);
            }
            R1 r1E = T1.E();
            r1E.m(z1E);
            r1E.o(i11);
            return (T1) r1E.g();
        } catch (Exception e10) {
            A.l("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    public static X1 zzc(int i10) {
        try {
            W1 w1C = X1.C();
            w1C.n(i10);
            return (X1) w1C.g();
        } catch (Exception e10) {
            A.l("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}

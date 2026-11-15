package com.android.billingclient.api;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzcz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f12688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BillingResult f12689b;

    public zzcz(BillingResult billingResult, List list) {
        this.f12688a = list;
        this.f12689b = billingResult;
    }

    public final BillingResult zza() {
        return this.f12689b;
    }

    public final List zzb() {
        return this.f12688a;
    }
}

package com.android.billingclient.api;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f12628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BillingResult f12629b;

    q(BillingResult billingResult, List list) {
        this.f12628a = list;
        this.f12629b = billingResult;
    }

    final BillingResult a() {
        return this.f12629b;
    }

    final List b() {
        return this.f12628a;
    }
}

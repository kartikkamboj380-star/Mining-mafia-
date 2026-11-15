package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public final class AccountIdentifiers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12417b;

    AccountIdentifiers(String str, String str2) {
        this.f12416a = str;
        this.f12417b = str2;
    }

    public String getObfuscatedAccountId() {
        return this.f12416a;
    }

    public String getObfuscatedProfileId() {
        return this.f12417b;
    }
}

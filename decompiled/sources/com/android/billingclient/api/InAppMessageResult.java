package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12470b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i10, String str) {
        this.f12469a = i10;
        this.f12470b = str;
    }

    public String getPurchaseToken() {
        return this.f12470b;
    }

    public int getResponseCode() {
        return this.f12469a;
    }
}

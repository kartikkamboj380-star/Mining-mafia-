package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.A;

/* JADX INFO: loaded from: classes.dex */
public final class BillingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12455b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f12457b = "";

        /* synthetic */ Builder(zzcd zzcdVar) {
        }

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.f12454a = this.f12456a;
            billingResult.f12455b = this.f12457b;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.f12457b = str;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i10) {
            this.f12456a = i10;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getDebugMessage() {
        return this.f12455b;
    }

    public int getResponseCode() {
        return this.f12454a;
    }

    @NonNull
    public String toString() {
        return "Response Code: " + A.h(this.f12454a) + ", Debug Message: " + this.f12455b;
    }
}

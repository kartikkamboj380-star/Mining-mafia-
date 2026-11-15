package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@zzk
public final class PendingPurchasesParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12472b;

    @zzk
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f12473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f12474b;

        private Builder() {
        }

        @NonNull
        public PendingPurchasesParams build() {
            if (!this.f12473a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new PendingPurchasesParams(true, this.f12474b);
        }

        @NonNull
        public Builder enableOneTimeProducts() {
            this.f12473a = true;
            return this;
        }

        @NonNull
        public Builder enablePrepaidPlans() {
            this.f12474b = true;
            return this;
        }
    }

    private PendingPurchasesParams(boolean z9, boolean z10) {
        this.f12471a = z9;
        this.f12472b = z10;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    boolean a() {
        return this.f12471a;
    }

    boolean b() {
        return this.f12472b;
    }
}

package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class AcknowledgePurchaseParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12418a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12419a;

        /* synthetic */ Builder(zza zzaVar) {
        }

        @NonNull
        public AcknowledgePurchaseParams build() {
            String str = this.f12419a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams(null);
            acknowledgePurchaseParams.f12418a = str;
            return acknowledgePurchaseParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.f12419a = str;
            return this;
        }
    }

    /* synthetic */ AcknowledgePurchaseParams(zzb zzbVar) {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getPurchaseToken() {
        return this.f12418a;
    }
}

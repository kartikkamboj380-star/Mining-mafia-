package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class ConsumeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12458a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12459a;

        /* synthetic */ Builder(zzcf zzcfVar) {
        }

        @NonNull
        public ConsumeParams build() {
            String str = this.f12459a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams(null);
            consumeParams.f12458a = str;
            return consumeParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.f12459a = str;
            return this;
        }
    }

    /* synthetic */ ConsumeParams(zzcg zzcgVar) {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getPurchaseToken() {
        return this.f12458a;
    }
}

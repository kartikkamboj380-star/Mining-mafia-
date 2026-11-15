package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class QueryPurchasesParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12546a;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12547a;

        /* synthetic */ Builder(zzdi zzdiVar) {
        }

        @NonNull
        public QueryPurchasesParams build() {
            if (this.f12547a != null) {
                return new QueryPurchasesParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.f12547a = str;
            return this;
        }
    }

    /* synthetic */ QueryPurchasesParams(Builder builder, zzdj zzdjVar) {
        this.f12546a = builder.f12547a;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public final String zza() {
        return this.f12546a;
    }
}

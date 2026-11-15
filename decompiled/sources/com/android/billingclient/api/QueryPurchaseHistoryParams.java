package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class QueryPurchaseHistoryParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12544a;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12545a;

        /* synthetic */ Builder(zzdg zzdgVar) {
        }

        @NonNull
        public QueryPurchaseHistoryParams build() {
            if (this.f12545a != null) {
                return new QueryPurchaseHistoryParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.f12545a = str;
            return this;
        }
    }

    /* synthetic */ QueryPurchaseHistoryParams(Builder builder, zzdh zzdhVar) {
        this.f12544a = builder.f12545a;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public final String zza() {
        return this.f12544a;
    }
}

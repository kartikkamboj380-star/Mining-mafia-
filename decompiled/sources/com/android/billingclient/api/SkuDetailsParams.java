package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SkuDetailsParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f12551b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f12553b;

        /* synthetic */ Builder(zzdk zzdkVar) {
        }

        @NonNull
        public SkuDetailsParams build() {
            String str = this.f12552a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f12553b == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
            skuDetailsParams.f12550a = str;
            skuDetailsParams.f12551b = this.f12553b;
            return skuDetailsParams;
        }

        @NonNull
        public Builder setSkusList(@NonNull List<String> list) {
            this.f12553b = new ArrayList(list);
            return this;
        }

        @NonNull
        public Builder setType(@NonNull String str) {
            this.f12552a = str;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getSkuType() {
        return this.f12550a;
    }

    @NonNull
    public List<String> getSkusList() {
        return this.f12551b;
    }
}

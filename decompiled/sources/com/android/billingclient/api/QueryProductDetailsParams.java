package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.AbstractC6420j;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QueryProductDetailsParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6420j f12538a;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AbstractC6420j f12539a;

        /* synthetic */ Builder(zzdc zzdcVar) {
        }

        @NonNull
        public QueryProductDetailsParams build() {
            return new QueryProductDetailsParams(this, null);
        }

        @NonNull
        public Builder setProductList(@NonNull List<Product> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f12539a = AbstractC6420j.l(list);
            return this;
        }
    }

    public static class Product {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f12541b;

        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f12542a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f12543b;

            /* synthetic */ Builder(zzdd zzddVar) {
            }

            @NonNull
            public Product build() {
                if ("first_party".equals(this.f12543b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f12542a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f12543b != null) {
                    return new Product(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            @NonNull
            public Builder setProductId(@NonNull String str) {
                this.f12542a = str;
                return this;
            }

            @NonNull
            public Builder setProductType(@NonNull String str) {
                this.f12543b = str;
                return this;
            }
        }

        /* synthetic */ Product(Builder builder, zzde zzdeVar) {
            this.f12540a = builder.f12542a;
            this.f12541b = builder.f12543b;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @NonNull
        public final String zza() {
            return this.f12540a;
        }

        @NonNull
        public final String zzb() {
            return this.f12541b;
        }
    }

    /* synthetic */ QueryProductDetailsParams(Builder builder, zzdf zzdfVar) {
        this.f12538a = builder.f12539a;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final AbstractC6420j zza() {
        return this.f12538a;
    }

    @NonNull
    public final String zzb() {
        return ((Product) this.f12538a.get(0)).zzb();
    }
}

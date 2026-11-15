package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.AbstractC6388b;
import com.google.android.gms.internal.play_billing.AbstractC6420j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BillingFlowParams {

    @NonNull
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f12430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SubscriptionUpdateParams f12433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC6420j f12434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f12435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12436g;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f12438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f12439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ArrayList f12440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f12441e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SubscriptionUpdateParams.Builder f12442f;

        /* synthetic */ Builder(zzbv zzbvVar) {
            SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.a(builderNewBuilder);
            this.f12442f = builderNewBuilder;
        }

        @NonNull
        public BillingFlowParams build() {
            ArrayList arrayList = this.f12440d;
            boolean z9 = true;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f12439c;
            boolean z11 = (list == null || list.isEmpty()) ? false : true;
            if (!z10 && !z11) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z10 && z11) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            zzca zzcaVar = null;
            if (!z10) {
                ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.f12439c.get(0);
                for (int i10 = 0; i10 < this.f12439c.size(); i10++) {
                    ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.f12439c.get(i10);
                    if (productDetailsParams2 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (i10 != 0 && !productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) && !productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                        throw new IllegalArgumentException("All products should have same ProductType.");
                    }
                }
                String strZza = productDetailsParams.zza().zza();
                for (ProductDetailsParams productDetailsParams3 : this.f12439c) {
                    if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !strZza.equals(productDetailsParams3.zza().zza())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            } else {
                if (this.f12440d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f12440d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f12440d.get(0);
                    String type = skuDetails.getType();
                    ArrayList arrayList2 = this.f12440d;
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i11);
                        if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strZzd = skuDetails.zzd();
                    ArrayList arrayList3 = this.f12440d;
                    int size2 = arrayList3.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i12);
                        if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !strZzd.equals(skuDetails3.zzd())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams(zzcaVar);
            if ((!z10 || ((SkuDetails) this.f12440d.get(0)).zzd().isEmpty()) && (!z11 || ((ProductDetailsParams) this.f12439c.get(0)).zza().zza().isEmpty())) {
                z9 = false;
            }
            billingFlowParams.f12430a = z9;
            billingFlowParams.f12431b = this.f12437a;
            billingFlowParams.f12432c = this.f12438b;
            billingFlowParams.f12433d = this.f12442f.build();
            ArrayList arrayList4 = this.f12440d;
            billingFlowParams.f12435f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            billingFlowParams.f12436g = this.f12441e;
            List list2 = this.f12439c;
            billingFlowParams.f12434e = list2 != null ? AbstractC6420j.l(list2) : AbstractC6420j.m();
            return billingFlowParams;
        }

        @NonNull
        public Builder setIsOfferPersonalized(boolean z9) {
            this.f12441e = z9;
            return this;
        }

        @NonNull
        public Builder setObfuscatedAccountId(@NonNull String str) {
            this.f12437a = str;
            return this;
        }

        @NonNull
        public Builder setObfuscatedProfileId(@NonNull String str) {
            this.f12438b = str;
            return this;
        }

        @NonNull
        public Builder setProductDetailsParamsList(@NonNull List<ProductDetailsParams> list) {
            this.f12439c = new ArrayList(list);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSkuDetails(@NonNull SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f12440d = arrayList;
            return this;
        }

        @NonNull
        public Builder setSubscriptionUpdateParams(@NonNull SubscriptionUpdateParams subscriptionUpdateParams) {
            this.f12442f = SubscriptionUpdateParams.b(subscriptionUpdateParams);
            return this;
        }
    }

    public static final class ProductDetailsParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ProductDetails f12443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f12444b;

        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private ProductDetails f12445a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f12446b;

            /* synthetic */ Builder(zzbw zzbwVar) {
            }

            @NonNull
            public ProductDetailsParams build() {
                AbstractC6388b.c(this.f12445a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f12445a.getSubscriptionOfferDetails() != null) {
                    AbstractC6388b.c(this.f12446b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new ProductDetailsParams(this, null);
            }

            @NonNull
            public Builder setOfferToken(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f12446b = str;
                return this;
            }

            @NonNull
            public Builder setProductDetails(@NonNull ProductDetails productDetails) {
                this.f12445a = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.zza() != null) {
                        this.f12446b = oneTimePurchaseOfferDetails.zza();
                    }
                }
                return this;
            }
        }

        /* synthetic */ ProductDetailsParams(Builder builder, zzbx zzbxVar) {
            this.f12443a = builder.f12445a;
            this.f12444b = builder.f12446b;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @NonNull
        public final ProductDetails zza() {
            return this.f12443a;
        }

        public final String zzb() {
            return this.f12444b;
        }
    }

    public static class SubscriptionUpdateParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f12448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12449c = 0;

        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f12450a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f12451b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f12452c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f12453d = 0;

            /* synthetic */ Builder(zzby zzbyVar) {
            }

            static /* synthetic */ Builder a(Builder builder) {
                builder.f12452c = true;
                return builder;
            }

            @NonNull
            public SubscriptionUpdateParams build() {
                boolean z9 = true;
                zzbz zzbzVar = null;
                if (TextUtils.isEmpty(this.f12450a) && TextUtils.isEmpty(null)) {
                    z9 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f12451b);
                if (z9 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f12452c && !z9 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams(zzbzVar);
                subscriptionUpdateParams.f12447a = this.f12450a;
                subscriptionUpdateParams.f12449c = this.f12453d;
                subscriptionUpdateParams.f12448b = this.f12451b;
                return subscriptionUpdateParams;
            }

            @NonNull
            public Builder setOldPurchaseToken(@NonNull String str) {
                this.f12450a = str;
                return this;
            }

            @NonNull
            @zzf
            public Builder setOriginalExternalTransactionId(@NonNull String str) {
                this.f12451b = str;
                return this;
            }

            @NonNull
            public Builder setSubscriptionReplacementMode(int i10) {
                this.f12453d = i10;
                return this;
            }

            @NonNull
            @Deprecated
            public final Builder zzb(@NonNull String str) {
                this.f12450a = str;
                return this;
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        /* synthetic */ SubscriptionUpdateParams(zzbz zzbzVar) {
        }

        static /* bridge */ /* synthetic */ Builder b(SubscriptionUpdateParams subscriptionUpdateParams) {
            Builder builderNewBuilder = newBuilder();
            builderNewBuilder.zzb(subscriptionUpdateParams.f12447a);
            builderNewBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.f12449c);
            builderNewBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.f12448b);
            return builderNewBuilder;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        final int a() {
            return this.f12449c;
        }

        final String c() {
            return this.f12447a;
        }

        final String d() {
            return this.f12448b;
        }
    }

    /* synthetic */ BillingFlowParams(zzca zzcaVar) {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    final boolean h() {
        return (this.f12431b == null && this.f12432c == null && this.f12433d.d() == null && this.f12433d.a() == 0 && !this.f12430a && !this.f12436g) ? false : true;
    }

    public final int zza() {
        return this.f12433d.a();
    }

    public final String zzb() {
        return this.f12431b;
    }

    public final String zzc() {
        return this.f12432c;
    }

    public final String zzd() {
        return this.f12433d.c();
    }

    public final String zze() {
        return this.f12433d.d();
    }

    @NonNull
    public final ArrayList zzf() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f12435f);
        return arrayList;
    }

    @NonNull
    public final List zzg() {
        return this.f12434e;
    }

    public final boolean zzo() {
        return this.f12436g;
    }
}

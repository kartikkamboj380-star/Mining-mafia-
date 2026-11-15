package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;

        @Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile PendingPurchasesParams f12421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f12422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile PurchasesUpdatedListener f12423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile UserChoiceBillingListener f12424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile boolean f12425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private volatile boolean f12426f;

        /* synthetic */ Builder(Context context, zzp zzpVar) {
            this.f12422b = context;
        }

        @NonNull
        public BillingClient build() {
            if (this.f12422b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f12423c == null) {
                if (this.f12424d != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                }
                if (this.f12425e || this.f12426f) {
                    return new a(null, this.f12422b, null, null);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f12421a == null || !this.f12421a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f12423c != null) {
                return this.f12424d == null ? new a((String) null, this.f12421a, this.f12422b, this.f12423c, (zzc) null, (r) null, (ExecutorService) null) : new a((String) null, this.f12421a, this.f12422b, this.f12423c, this.f12424d, (r) null, (ExecutorService) null);
            }
            return new a(null, this.f12421a, this.f12422b, null, null, null);
        }

        @NonNull
        @zzg
        public Builder enableAlternativeBillingOnly() {
            this.f12425e = true;
            return this;
        }

        @NonNull
        @zzh
        public Builder enableExternalOffer() {
            this.f12426f = true;
            return this;
        }

        @NonNull
        @zzk
        public Builder enablePendingPurchases(@NonNull PendingPurchasesParams pendingPurchasesParams) {
            this.f12421a = pendingPurchasesParams;
            return this;
        }

        @NonNull
        @zzl
        public Builder enableUserChoiceBilling(@NonNull UserChoiceBillingListener userChoiceBillingListener) {
            this.f12424d = userChoiceBillingListener;
            return this;
        }

        @NonNull
        public Builder setListener(@NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
            this.f12423c = purchasesUpdatedListener;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder enablePendingPurchases() {
            PendingPurchasesParams.Builder builderNewBuilder = PendingPurchasesParams.newBuilder();
            builderNewBuilder.enableOneTimeProducts();
            enablePendingPurchases(builderNewBuilder.build());
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {

        @NonNull
        @zzg
        public static final String ALTERNATIVE_BILLING_ONLY = "jjj";

        @NonNull
        @zzi
        public static final String BILLING_CONFIG = "ggg";

        @NonNull
        @zzh
        public static final String EXTERNAL_OFFER = "kkk";

        @NonNull
        public static final String IN_APP_MESSAGING = "bbb";

        @NonNull
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";

        @NonNull
        public static final String PRODUCT_DETAILS = "fff";

        @NonNull
        public static final String SUBSCRIPTIONS = "subscriptions";

        @NonNull
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {

        @NonNull
        public static final String INAPP = "inapp";

        @NonNull
        public static final String SUBS = "subs";
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface SkuType {

        @NonNull
        public static final String INAPP = "inapp";

        @NonNull
        public static final String SUBS = "subs";
    }

    @NonNull
    public static Builder newBuilder(@NonNull Context context) {
        return new Builder(context, null);
    }

    public abstract void acknowledgePurchase(@NonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @NonNull AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void consumeAsync(@NonNull ConsumeParams consumeParams, @NonNull ConsumeResponseListener consumeResponseListener);

    @zzg
    @KeepForSdk
    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(@NonNull AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    @zzh
    public abstract void createExternalOfferReportingDetailsAsync(@NonNull ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    public abstract void endConnection();

    @zzi
    public abstract void getBillingConfigAsync(@NonNull GetBillingConfigParams getBillingConfigParams, @NonNull BillingConfigResponseListener billingConfigResponseListener);

    public abstract int getConnectionState();

    @zzg
    @KeepForSdk
    public abstract void isAlternativeBillingOnlyAvailableAsync(@NonNull AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    @zzh
    public abstract void isExternalOfferAvailableAsync(@NonNull ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    @NonNull
    public abstract BillingResult isFeatureSupported(@NonNull String str);

    public abstract boolean isReady();

    @NonNull
    public abstract BillingResult launchBillingFlow(@NonNull Activity activity, @NonNull BillingFlowParams billingFlowParams);

    public abstract void queryProductDetailsAsync(@NonNull QueryProductDetailsParams queryProductDetailsParams, @NonNull ProductDetailsResponseListener productDetailsResponseListener);

    @Deprecated
    public abstract void queryPurchaseHistoryAsync(@NonNull QueryPurchaseHistoryParams queryPurchaseHistoryParams, @NonNull PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @Deprecated
    public abstract void queryPurchaseHistoryAsync(@NonNull String str, @NonNull PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    public abstract void queryPurchasesAsync(@NonNull QueryPurchasesParams queryPurchasesParams, @NonNull PurchasesResponseListener purchasesResponseListener);

    @Deprecated
    public abstract void queryPurchasesAsync(@NonNull String str, @NonNull PurchasesResponseListener purchasesResponseListener);

    @Deprecated
    public abstract void querySkuDetailsAsync(@NonNull SkuDetailsParams skuDetailsParams, @NonNull SkuDetailsResponseListener skuDetailsResponseListener);

    @NonNull
    @zzg
    public abstract BillingResult showAlternativeBillingOnlyInformationDialog(@NonNull Activity activity, @NonNull AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    @NonNull
    @zzh
    public abstract BillingResult showExternalOfferInformationDialog(@NonNull Activity activity, @NonNull ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    @NonNull
    public abstract BillingResult showInAppMessages(@NonNull Activity activity, @NonNull InAppMessageParams inAppMessageParams, @NonNull InAppMessageResponseListener inAppMessageResponseListener);

    public abstract void startConnection(@NonNull BillingClientStateListener billingClientStateListener);
}

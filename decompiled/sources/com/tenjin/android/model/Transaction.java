package com.tenjin.android.model;

import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.enums.AppStoreTypeEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class Transaction {

    @NotNull
    private AppStoreTypeEnum appStore;

    @NotNull
    private String currencyCode;

    @NotNull
    private String dataSignature;

    @NotNull
    private String productId;

    @NotNull
    private String purchaseData;
    private int quantity;

    @NotNull
    private String receiptId;
    private double unitPrice;

    @NotNull
    private String userId;

    public Transaction(@NotNull AppStoreTypeEnum appStore, @NotNull String productId, @NotNull String currencyCode, int i10, double d10, @NotNull String receiptId, @NotNull String userId, @NotNull String purchaseData, @NotNull String dataSignature) {
        Intrinsics.checkNotNullParameter(appStore, "appStore");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(receiptId, "receiptId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(purchaseData, "purchaseData");
        Intrinsics.checkNotNullParameter(dataSignature, "dataSignature");
        this.appStore = appStore;
        this.productId = productId;
        this.currencyCode = currencyCode;
        this.quantity = i10;
        this.unitPrice = d10;
        this.receiptId = receiptId;
        this.userId = userId;
        this.purchaseData = purchaseData;
        this.dataSignature = dataSignature;
    }

    @NotNull
    public final AppStoreTypeEnum getAppStore() {
        return this.appStore;
    }

    @NotNull
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final String getDataSignature() {
        return this.dataSignature;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final String getPurchaseData() {
        return this.purchaseData;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getReceiptId() {
        return this.receiptId;
    }

    public final double getUnitPrice() {
        return this.unitPrice;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final void setAppStore(@NotNull AppStoreTypeEnum appStoreTypeEnum) {
        Intrinsics.checkNotNullParameter(appStoreTypeEnum, "<set-?>");
        this.appStore = appStoreTypeEnum;
    }

    public final void setCurrencyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currencyCode = str;
    }

    public final void setDataSignature(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataSignature = str;
    }

    public final void setProductId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productId = str;
    }

    public final void setPurchaseData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purchaseData = str;
    }

    public final void setQuantity(int i10) {
        this.quantity = i10;
    }

    public final void setReceiptId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.receiptId = str;
    }

    public final void setUnitPrice(double d10) {
        this.unitPrice = d10;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    @Nullable
    public final String transactionEventName() {
        if (this.appStore == AppStoreTypeEnum.AMAZON) {
            return TenjinConsts.EVENT_NAME_TRANSACTION_AMAZON;
        }
        return !TextUtils.isEmpty(this.purchaseData) ? TenjinConsts.EVENT_NAME_TRANSACTION_DATA : TenjinConsts.EVENT_NAME_TRANSACTION;
    }

    public /* synthetic */ Transaction(AppStoreTypeEnum appStoreTypeEnum, String str, String str2, int i10, double d10, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(appStoreTypeEnum, str, str2, i10, d10, (i11 & 32) != 0 ? "" : str3, (i11 & 64) != 0 ? "" : str4, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? "" : str5, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? "" : str6);
    }
}

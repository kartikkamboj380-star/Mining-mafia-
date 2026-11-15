package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class PurchasesResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BillingResult f12536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f12537b;

    public PurchasesResult(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends Purchase> purchasesList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        this.f12536a = billingResult;
        this.f12537b = purchasesList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ PurchasesResult copy$default(@RecentlyNonNull PurchasesResult purchasesResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = purchasesResult.f12536a;
        }
        if ((i10 & 2) != 0) {
            list = purchasesResult.f12537b;
        }
        return purchasesResult.copy(billingResult, list);
    }

    @NotNull
    public final BillingResult component1() {
        return this.f12536a;
    }

    @NotNull
    public final List<Purchase> component2() {
        return this.f12537b;
    }

    @NotNull
    public final PurchasesResult copy(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends Purchase> purchasesList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        return new PurchasesResult(billingResult, purchasesList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasesResult)) {
            return false;
        }
        PurchasesResult purchasesResult = (PurchasesResult) obj;
        return Intrinsics.b(this.f12536a, purchasesResult.f12536a) && Intrinsics.b(this.f12537b, purchasesResult.f12537b);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.f12536a;
    }

    @NotNull
    public final List<Purchase> getPurchasesList() {
        return this.f12537b;
    }

    public int hashCode() {
        return (this.f12536a.hashCode() * 31) + this.f12537b.hashCode();
    }

    @NotNull
    public String toString() {
        return "PurchasesResult(billingResult=" + this.f12536a + ", purchasesList=" + this.f12537b + ")";
    }
}

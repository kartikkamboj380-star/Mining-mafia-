package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
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
public final class ProductDetailsResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BillingResult f12517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f12518b;

    public ProductDetailsResult(@RecentlyNonNull BillingResult billingResult, @Nullable List<ProductDetails> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f12517a = billingResult;
        this.f12518b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ ProductDetailsResult copy$default(@RecentlyNonNull ProductDetailsResult productDetailsResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = productDetailsResult.f12517a;
        }
        if ((i10 & 2) != 0) {
            list = productDetailsResult.f12518b;
        }
        return productDetailsResult.copy(billingResult, list);
    }

    @NotNull
    public final BillingResult component1() {
        return this.f12517a;
    }

    @RecentlyNullable
    public final List<ProductDetails> component2() {
        return this.f12518b;
    }

    @NotNull
    public final ProductDetailsResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable List<ProductDetails> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        return new ProductDetailsResult(billingResult, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsResult)) {
            return false;
        }
        ProductDetailsResult productDetailsResult = (ProductDetailsResult) obj;
        return Intrinsics.b(this.f12517a, productDetailsResult.f12517a) && Intrinsics.b(this.f12518b, productDetailsResult.f12518b);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.f12517a;
    }

    @RecentlyNullable
    public final List<ProductDetails> getProductDetailsList() {
        return this.f12518b;
    }

    public int hashCode() {
        int iHashCode = this.f12517a.hashCode() * 31;
        List list = this.f12518b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProductDetailsResult(billingResult=" + this.f12517a + ", productDetailsList=" + this.f12518b + ")";
    }
}

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
public final class SkuDetailsResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BillingResult f12554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f12555b;

    public SkuDetailsResult(@RecentlyNonNull BillingResult billingResult, @Nullable List<? extends SkuDetails> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f12554a = billingResult;
        this.f12555b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ SkuDetailsResult copy$default(@RecentlyNonNull SkuDetailsResult skuDetailsResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = skuDetailsResult.f12554a;
        }
        if ((i10 & 2) != 0) {
            list = skuDetailsResult.f12555b;
        }
        return skuDetailsResult.copy(billingResult, list);
    }

    @NotNull
    public final BillingResult component1() {
        return this.f12554a;
    }

    @RecentlyNullable
    public final List<SkuDetails> component2() {
        return this.f12555b;
    }

    @NotNull
    public final SkuDetailsResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable List<? extends SkuDetails> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        return new SkuDetailsResult(billingResult, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetailsResult)) {
            return false;
        }
        SkuDetailsResult skuDetailsResult = (SkuDetailsResult) obj;
        return Intrinsics.b(this.f12554a, skuDetailsResult.f12554a) && Intrinsics.b(this.f12555b, skuDetailsResult.f12555b);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.f12554a;
    }

    @RecentlyNullable
    public final List<SkuDetails> getSkuDetailsList() {
        return this.f12555b;
    }

    public int hashCode() {
        int iHashCode = this.f12554a.hashCode() * 31;
        List list = this.f12555b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "SkuDetailsResult(billingResult=" + this.f12554a + ", skuDetailsList=" + this.f12555b + ")";
    }
}

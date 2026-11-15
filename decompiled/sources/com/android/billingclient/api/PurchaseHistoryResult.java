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
public final class PurchaseHistoryResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BillingResult f12534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f12535b;

    public PurchaseHistoryResult(@RecentlyNonNull BillingResult billingResult, @Nullable List<? extends PurchaseHistoryRecord> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f12534a = billingResult;
        this.f12535b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ PurchaseHistoryResult copy$default(@RecentlyNonNull PurchaseHistoryResult purchaseHistoryResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = purchaseHistoryResult.f12534a;
        }
        if ((i10 & 2) != 0) {
            list = purchaseHistoryResult.f12535b;
        }
        return purchaseHistoryResult.copy(billingResult, list);
    }

    @NotNull
    public final BillingResult component1() {
        return this.f12534a;
    }

    @RecentlyNullable
    public final List<PurchaseHistoryRecord> component2() {
        return this.f12535b;
    }

    @NotNull
    public final PurchaseHistoryResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable List<? extends PurchaseHistoryRecord> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        return new PurchaseHistoryResult(billingResult, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryResult)) {
            return false;
        }
        PurchaseHistoryResult purchaseHistoryResult = (PurchaseHistoryResult) obj;
        return Intrinsics.b(this.f12534a, purchaseHistoryResult.f12534a) && Intrinsics.b(this.f12535b, purchaseHistoryResult.f12535b);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.f12534a;
    }

    @RecentlyNullable
    public final List<PurchaseHistoryRecord> getPurchaseHistoryRecordList() {
        return this.f12535b;
    }

    public int hashCode() {
        int iHashCode = this.f12534a.hashCode() * 31;
        List list = this.f12535b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "PurchaseHistoryResult(billingResult=" + this.f12534a + ", purchaseHistoryRecordList=" + this.f12535b + ")";
    }
}

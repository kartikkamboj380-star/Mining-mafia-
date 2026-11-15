package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
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
public final class CreateAlternativeBillingOnlyReportingDetailsResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BillingResult f12462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AlternativeBillingOnlyReportingDetails f12463b;

    public CreateAlternativeBillingOnlyReportingDetailsResult(@RecentlyNonNull BillingResult billingResult, @Nullable AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f12462a = billingResult;
        this.f12463b = alternativeBillingOnlyReportingDetails;
    }

    @RecentlyNonNull
    public static /* synthetic */ CreateAlternativeBillingOnlyReportingDetailsResult copy$default(@RecentlyNonNull CreateAlternativeBillingOnlyReportingDetailsResult createAlternativeBillingOnlyReportingDetailsResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = createAlternativeBillingOnlyReportingDetailsResult.f12462a;
        }
        if ((i10 & 2) != 0) {
            alternativeBillingOnlyReportingDetails = createAlternativeBillingOnlyReportingDetailsResult.f12463b;
        }
        return createAlternativeBillingOnlyReportingDetailsResult.copy(billingResult, alternativeBillingOnlyReportingDetails);
    }

    @NotNull
    public final BillingResult component1() {
        return this.f12462a;
    }

    @RecentlyNullable
    public final AlternativeBillingOnlyReportingDetails component2() {
        return this.f12463b;
    }

    @NotNull
    public final CreateAlternativeBillingOnlyReportingDetailsResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        return new CreateAlternativeBillingOnlyReportingDetailsResult(billingResult, alternativeBillingOnlyReportingDetails);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAlternativeBillingOnlyReportingDetailsResult)) {
            return false;
        }
        CreateAlternativeBillingOnlyReportingDetailsResult createAlternativeBillingOnlyReportingDetailsResult = (CreateAlternativeBillingOnlyReportingDetailsResult) obj;
        return Intrinsics.b(this.f12462a, createAlternativeBillingOnlyReportingDetailsResult.f12462a) && Intrinsics.b(this.f12463b, createAlternativeBillingOnlyReportingDetailsResult.f12463b);
    }

    @RecentlyNullable
    public final AlternativeBillingOnlyReportingDetails getAlternativeBillingOnlyReportingDetails() {
        return this.f12463b;
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.f12462a;
    }

    public int hashCode() {
        int iHashCode = this.f12462a.hashCode() * 31;
        AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails = this.f12463b;
        return iHashCode + (alternativeBillingOnlyReportingDetails == null ? 0 : alternativeBillingOnlyReportingDetails.hashCode());
    }

    @NotNull
    public String toString() {
        return "CreateAlternativeBillingOnlyReportingDetailsResult(billingResult=" + this.f12462a + ", alternativeBillingOnlyReportingDetails=" + this.f12463b + ")";
    }
}

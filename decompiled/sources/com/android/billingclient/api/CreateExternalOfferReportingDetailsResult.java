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
public final class CreateExternalOfferReportingDetailsResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BillingResult f12464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExternalOfferReportingDetails f12465b;

    public CreateExternalOfferReportingDetailsResult(@RecentlyNonNull BillingResult billingResult, @Nullable ExternalOfferReportingDetails externalOfferReportingDetails) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f12464a = billingResult;
        this.f12465b = externalOfferReportingDetails;
    }

    @RecentlyNonNull
    public static /* synthetic */ CreateExternalOfferReportingDetailsResult copy$default(@RecentlyNonNull CreateExternalOfferReportingDetailsResult createExternalOfferReportingDetailsResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull ExternalOfferReportingDetails externalOfferReportingDetails, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = createExternalOfferReportingDetailsResult.f12464a;
        }
        if ((i10 & 2) != 0) {
            externalOfferReportingDetails = createExternalOfferReportingDetailsResult.f12465b;
        }
        return createExternalOfferReportingDetailsResult.copy(billingResult, externalOfferReportingDetails);
    }

    @NotNull
    public final BillingResult component1() {
        return this.f12464a;
    }

    @RecentlyNullable
    public final ExternalOfferReportingDetails component2() {
        return this.f12465b;
    }

    @NotNull
    public final CreateExternalOfferReportingDetailsResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable ExternalOfferReportingDetails externalOfferReportingDetails) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        return new CreateExternalOfferReportingDetailsResult(billingResult, externalOfferReportingDetails);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateExternalOfferReportingDetailsResult)) {
            return false;
        }
        CreateExternalOfferReportingDetailsResult createExternalOfferReportingDetailsResult = (CreateExternalOfferReportingDetailsResult) obj;
        return Intrinsics.b(this.f12464a, createExternalOfferReportingDetailsResult.f12464a) && Intrinsics.b(this.f12465b, createExternalOfferReportingDetailsResult.f12465b);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.f12464a;
    }

    @RecentlyNullable
    public final ExternalOfferReportingDetails getExternalOfferReportingDetails() {
        return this.f12465b;
    }

    public int hashCode() {
        int iHashCode = this.f12464a.hashCode() * 31;
        ExternalOfferReportingDetails externalOfferReportingDetails = this.f12465b;
        return iHashCode + (externalOfferReportingDetails == null ? 0 : externalOfferReportingDetails.hashCode());
    }

    @NotNull
    public String toString() {
        return "CreateExternalOfferReportingDetailsResult(billingResult=" + this.f12464a + ", externalOfferReportingDetails=" + this.f12465b + ")";
    }
}

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
public final class ConsumeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BillingResult f12460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12461b;

    public ConsumeResult(@RecentlyNonNull BillingResult billingResult, @Nullable String str) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f12460a = billingResult;
        this.f12461b = str;
    }

    @RecentlyNonNull
    public static /* synthetic */ ConsumeResult copy$default(@RecentlyNonNull ConsumeResult consumeResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull String str, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = consumeResult.f12460a;
        }
        if ((i10 & 2) != 0) {
            str = consumeResult.f12461b;
        }
        return consumeResult.copy(billingResult, str);
    }

    @NotNull
    public final BillingResult component1() {
        return this.f12460a;
    }

    @RecentlyNullable
    public final String component2() {
        return this.f12461b;
    }

    @NotNull
    public final ConsumeResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable String str) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        return new ConsumeResult(billingResult, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumeResult)) {
            return false;
        }
        ConsumeResult consumeResult = (ConsumeResult) obj;
        return Intrinsics.b(this.f12460a, consumeResult.f12460a) && Intrinsics.b(this.f12461b, consumeResult.f12461b);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.f12460a;
    }

    @RecentlyNullable
    public final String getPurchaseToken() {
        return this.f12461b;
    }

    public int hashCode() {
        int iHashCode = this.f12460a.hashCode() * 31;
        String str = this.f12461b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ConsumeResult(billingResult=" + this.f12460a + ", purchaseToken=" + this.f12461b + ")";
    }
}

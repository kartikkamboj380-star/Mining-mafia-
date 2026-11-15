package com.unity3d.ads.core.domain.billing;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public abstract class ProductDetailsResult {

    @Metadata
    public static final class Failure extends ProductDetailsResult {

        @NotNull
        private final BillingResultBridge billingResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull BillingResultBridge billingResult) {
            super(null);
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            this.billingResult = billingResult;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, BillingResultBridge billingResultBridge, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                billingResultBridge = failure.billingResult;
            }
            return failure.copy(billingResultBridge);
        }

        @NotNull
        public final BillingResultBridge component1() {
            return this.billingResult;
        }

        @NotNull
        public final Failure copy(@NotNull BillingResultBridge billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            return new Failure(billingResult);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.b(this.billingResult, ((Failure) obj).billingResult);
        }

        @NotNull
        public final BillingResultBridge getBillingResult() {
            return this.billingResult;
        }

        public int hashCode() {
            return this.billingResult.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(billingResult=" + this.billingResult + ')';
        }
    }

    @Metadata
    public static final class NotFound extends ProductDetailsResult {

        @NotNull
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
            super(null);
        }
    }

    @Metadata
    public static final class Success extends ProductDetailsResult {

        @NotNull
        private final String productDetailsJson;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String productDetailsJson) {
            super(null);
            Intrinsics.checkNotNullParameter(productDetailsJson, "productDetailsJson");
            this.productDetailsJson = productDetailsJson;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.productDetailsJson;
            }
            return success.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.productDetailsJson;
        }

        @NotNull
        public final Success copy(@NotNull String productDetailsJson) {
            Intrinsics.checkNotNullParameter(productDetailsJson, "productDetailsJson");
            return new Success(productDetailsJson);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.b(this.productDetailsJson, ((Success) obj).productDetailsJson);
        }

        @NotNull
        public final String getProductDetailsJson() {
            return this.productDetailsJson;
        }

        public int hashCode() {
            return this.productDetailsJson.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(productDetailsJson=" + this.productDetailsJson + ')';
        }
    }

    public /* synthetic */ ProductDetailsResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProductDetailsResult() {
    }
}

package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFa1mSDK {
    private final boolean AFAdRevenueData;

    @Nullable
    public final DeepLink getCurrencyIso4217Code;

    public AFa1mSDK(boolean z9, @Nullable DeepLink deepLink) {
        this.AFAdRevenueData = z9;
        this.getCurrencyIso4217Code = deepLink;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFa1mSDK)) {
            return false;
        }
        AFa1mSDK aFa1mSDK = (AFa1mSDK) obj;
        return this.AFAdRevenueData == aFa1mSDK.AFAdRevenueData && Intrinsics.b(this.getCurrencyIso4217Code, aFa1mSDK.getCurrencyIso4217Code);
    }

    public final boolean getMonetizationNetwork() {
        return this.AFAdRevenueData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z9 = this.AFAdRevenueData;
        ?? r10 = z9;
        if (z9) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        DeepLink deepLink = this.getCurrencyIso4217Code;
        return i10 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @NotNull
    public final String toString() {
        return "DdlResponse(secondPing=" + this.AFAdRevenueData + ", deepLink=" + this.getCurrencyIso4217Code + ")";
    }

    public /* synthetic */ AFa1mSDK(boolean z9, DeepLink deepLink, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z9, (i10 & 2) != 0 ? null : deepLink);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AFa1mSDK() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}

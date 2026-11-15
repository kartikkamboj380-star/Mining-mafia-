package com.appsflyer.internal;

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
public final class AFe1zSDK {

    @Nullable
    public final String getCurrencyIso4217Code;

    @NotNull
    public final AFe1sSDK getMonetizationNetwork;

    @NotNull
    public final String getRevenue;

    public AFe1zSDK(@NotNull String str, @Nullable String str2, @NotNull AFe1sSDK aFe1sSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1sSDK, "");
        this.getRevenue = str;
        this.getCurrencyIso4217Code = str2;
        this.getMonetizationNetwork = aFe1sSDK;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1zSDK)) {
            return false;
        }
        AFe1zSDK aFe1zSDK = (AFe1zSDK) obj;
        return Intrinsics.b(this.getRevenue, aFe1zSDK.getRevenue) && Intrinsics.b(this.getCurrencyIso4217Code, aFe1zSDK.getCurrencyIso4217Code) && this.getMonetizationNetwork == aFe1zSDK.getMonetizationNetwork;
    }

    public final int hashCode() {
        int iHashCode = this.getRevenue.hashCode() * 31;
        String str = this.getCurrencyIso4217Code;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.getMonetizationNetwork.hashCode();
    }

    @NotNull
    public final String toString() {
        return "HostMeta(name=" + this.getRevenue + ", prefix=" + this.getCurrencyIso4217Code + ", method=" + this.getMonetizationNetwork + ")";
    }
}

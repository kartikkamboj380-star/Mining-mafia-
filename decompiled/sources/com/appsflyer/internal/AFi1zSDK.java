package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
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
public final class AFi1zSDK {

    @NotNull
    public final String AFAdRevenueData;

    @NotNull
    public final String component3;
    public final float getCurrencyIso4217Code;

    @NotNull
    public List<String> getMediationNetwork;
    public long getMonetizationNetwork;
    public final int getRevenue;

    public AFi1zSDK(long j10, float f10, @NotNull List<String> list, int i10, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getMonetizationNetwork = j10;
        this.getCurrencyIso4217Code = f10;
        this.getMediationNetwork = list;
        this.getRevenue = i10;
        this.AFAdRevenueData = str;
        this.component3 = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(AFi1zSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "");
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        return this.getMonetizationNetwork == aFi1zSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFi1zSDK.getCurrencyIso4217Code && Intrinsics.b(this.getMediationNetwork, aFi1zSDK.getMediationNetwork) && this.getRevenue == aFi1zSDK.getRevenue && Intrinsics.b(this.AFAdRevenueData, aFi1zSDK.AFAdRevenueData) && Intrinsics.b(this.component3, aFi1zSDK.component3);
    }

    public final boolean getMonetizationNetwork() {
        return TimeUnit.SECONDS.toMillis(this.getMonetizationNetwork) > AFa1tSDK.getMediationNetwork().getRevenue().areAllFieldsValid().getCurrencyIso4217Code();
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.getMonetizationNetwork) * 31) + Float.hashCode(this.getCurrencyIso4217Code)) * 31) + this.getMediationNetwork.hashCode()) * 31) + this.getRevenue) * 31) + this.AFAdRevenueData.hashCode()) * 31) + this.component3.hashCode();
    }
}

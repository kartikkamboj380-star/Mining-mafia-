package com.appsflyer;

import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFg1hSDK;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
public final class AFAdRevenueData {

    @NotNull
    private final String currencyIso4217Code;

    @NotNull
    private final MediationNetwork mediationNetwork;

    @NotNull
    private final String monetizationNetwork;
    private final double revenue;

    public AFAdRevenueData(@NotNull String str, @NotNull MediationNetwork mediationNetwork, @NotNull String str2, double d10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mediationNetwork, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.monetizationNetwork = str;
        this.mediationNetwork = mediationNetwork;
        this.currencyIso4217Code = str2;
        this.revenue = d10;
    }

    private final boolean AFAdRevenueData() {
        try {
            Currency.getInstance(this.currencyIso4217Code);
            return true;
        } catch (Throwable unused) {
            AFg1hSDK.w$default(AFLogger.INSTANCE, AFg1cSDK.AD_REVENUE, "Currency is not ISO 4217 currency code", false, 4, null);
            return false;
        }
    }

    public static /* synthetic */ AFAdRevenueData copy$default(AFAdRevenueData aFAdRevenueData, String str, MediationNetwork mediationNetwork, String str2, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aFAdRevenueData.monetizationNetwork;
        }
        if ((i10 & 2) != 0) {
            mediationNetwork = aFAdRevenueData.mediationNetwork;
        }
        if ((i10 & 4) != 0) {
            str2 = aFAdRevenueData.currencyIso4217Code;
        }
        if ((i10 & 8) != 0) {
            d10 = aFAdRevenueData.revenue;
        }
        String str3 = str2;
        return aFAdRevenueData.copy(str, mediationNetwork, str3, d10);
    }

    public final boolean areAllFieldsValid() {
        return !StringsKt.b0(this.monetizationNetwork) && AFAdRevenueData();
    }

    @NotNull
    public final String component1() {
        return this.monetizationNetwork;
    }

    @NotNull
    public final MediationNetwork component2() {
        return this.mediationNetwork;
    }

    @NotNull
    public final String component3() {
        return this.currencyIso4217Code;
    }

    public final double component4() {
        return this.revenue;
    }

    @NotNull
    public final AFAdRevenueData copy(@NotNull String str, @NotNull MediationNetwork mediationNetwork, @NotNull String str2, double d10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mediationNetwork, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AFAdRevenueData(str, mediationNetwork, str2, d10);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFAdRevenueData)) {
            return false;
        }
        AFAdRevenueData aFAdRevenueData = (AFAdRevenueData) obj;
        return Intrinsics.b(this.monetizationNetwork, aFAdRevenueData.monetizationNetwork) && this.mediationNetwork == aFAdRevenueData.mediationNetwork && Intrinsics.b(this.currencyIso4217Code, aFAdRevenueData.currencyIso4217Code) && Double.compare(this.revenue, aFAdRevenueData.revenue) == 0;
    }

    @NotNull
    public final String getCurrencyIso4217Code() {
        return this.currencyIso4217Code;
    }

    @NotNull
    public final MediationNetwork getMediationNetwork() {
        return this.mediationNetwork;
    }

    @NotNull
    public final String getMonetizationNetwork() {
        return this.monetizationNetwork;
    }

    public final double getRevenue() {
        return this.revenue;
    }

    public final int hashCode() {
        return (((((this.monetizationNetwork.hashCode() * 31) + this.mediationNetwork.hashCode()) * 31) + this.currencyIso4217Code.hashCode()) * 31) + Double.hashCode(this.revenue);
    }

    @NotNull
    public final String toString() {
        return "AFAdRevenueData(monetizationNetwork=" + this.monetizationNetwork + ", mediationNetwork=" + this.mediationNetwork + ", currencyIso4217Code=" + this.currencyIso4217Code + ", revenue=" + this.revenue + ")";
    }
}

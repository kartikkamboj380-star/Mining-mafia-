package com.appsflyer.internal;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashMap;
import java.util.Map;
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
public final class AFh1rSDK {

    @Nullable
    public Boolean AFAdRevenueData;

    @NotNull
    public Map<String, Object> areAllFieldsValid;

    @Nullable
    public Boolean component1;

    @Nullable
    public String component3;

    @Nullable
    public Boolean getCurrencyIso4217Code;

    @Nullable
    public Boolean getMediationNetwork;

    @Nullable
    public String getMonetizationNetwork;

    @Nullable
    public Boolean getRevenue;

    private AFh1rSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str2, @Nullable Boolean bool5, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getMonetizationNetwork = str;
        this.AFAdRevenueData = bool;
        this.getMediationNetwork = bool2;
        this.getCurrencyIso4217Code = bool3;
        this.getRevenue = bool4;
        this.component3 = str2;
        this.component1 = bool5;
        this.areAllFieldsValid = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFh1rSDK)) {
            return false;
        }
        AFh1rSDK aFh1rSDK = (AFh1rSDK) obj;
        return Intrinsics.b(this.getMonetizationNetwork, aFh1rSDK.getMonetizationNetwork) && Intrinsics.b(this.AFAdRevenueData, aFh1rSDK.AFAdRevenueData) && Intrinsics.b(this.getMediationNetwork, aFh1rSDK.getMediationNetwork) && Intrinsics.b(this.getCurrencyIso4217Code, aFh1rSDK.getCurrencyIso4217Code) && Intrinsics.b(this.getRevenue, aFh1rSDK.getRevenue) && Intrinsics.b(this.component3, aFh1rSDK.component3) && Intrinsics.b(this.component1, aFh1rSDK.component1) && Intrinsics.b(this.areAllFieldsValid, aFh1rSDK.areAllFieldsValid);
    }

    public final int hashCode() {
        String str = this.getMonetizationNetwork;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.AFAdRevenueData;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.getMediationNetwork;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getCurrencyIso4217Code;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.getRevenue;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.component3;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.component1;
        return ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + this.areAllFieldsValid.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.getMonetizationNetwork + ", isLimited=" + this.AFAdRevenueData + ", isEnabled=" + this.getMediationNetwork + ", isGaidWithGps=" + this.getCurrencyIso4217Code + ", isGaidWithSamsungCloudDev=" + this.getRevenue + ", gaidError=" + this.component3 + ", retry=" + this.component1 + ", metadata=" + this.areAllFieldsValid + ")";
    }

    public /* synthetic */ AFh1rSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : bool2, (i10 & 8) != 0 ? null : bool3, (i10 & 16) != 0 ? null : bool4, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : bool5, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new HashMap() : map);
    }

    public AFh1rSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}

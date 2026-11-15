package com.unity3d.ads.adplayer;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class AndroidShowOptions implements ShowOptions {
    private final boolean isOfferwallAd;
    private final boolean isScarAd;

    @Nullable
    private final String offerwallPlacementName;

    @Nullable
    private final String placementId;

    @Nullable
    private final String scarAdString;

    @Nullable
    private final String scarAdUnitId;

    @Nullable
    private final String scarQueryId;

    @Nullable
    private final Map<String, Object> unityAdsShowOptions;

    public AndroidShowOptions(@Nullable Map<String, ? extends Object> map, @Nullable String str, boolean z9, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z10, @Nullable String str5) {
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isScarAd = z9;
        this.scarQueryId = str2;
        this.scarAdString = str3;
        this.scarAdUnitId = str4;
        this.isOfferwallAd = z10;
        this.offerwallPlacementName = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Map map, String str, boolean z9, String str2, String str3, String str4, boolean z10, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        if ((i10 & 2) != 0) {
            str = androidShowOptions.placementId;
        }
        if ((i10 & 4) != 0) {
            z9 = androidShowOptions.isScarAd;
        }
        if ((i10 & 8) != 0) {
            str2 = androidShowOptions.scarQueryId;
        }
        if ((i10 & 16) != 0) {
            str3 = androidShowOptions.scarAdString;
        }
        if ((i10 & 32) != 0) {
            str4 = androidShowOptions.scarAdUnitId;
        }
        if ((i10 & 64) != 0) {
            z10 = androidShowOptions.isOfferwallAd;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str5 = androidShowOptions.offerwallPlacementName;
        }
        boolean z11 = z10;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return androidShowOptions.copy(map, str, z9, str2, str7, str8, z11, str6);
    }

    @Nullable
    public final Map<String, Object> component1() {
        return this.unityAdsShowOptions;
    }

    @Nullable
    public final String component2() {
        return this.placementId;
    }

    public final boolean component3() {
        return this.isScarAd;
    }

    @Nullable
    public final String component4() {
        return this.scarQueryId;
    }

    @Nullable
    public final String component5() {
        return this.scarAdString;
    }

    @Nullable
    public final String component6() {
        return this.scarAdUnitId;
    }

    public final boolean component7() {
        return this.isOfferwallAd;
    }

    @Nullable
    public final String component8() {
        return this.offerwallPlacementName;
    }

    @NotNull
    public final AndroidShowOptions copy(@Nullable Map<String, ? extends Object> map, @Nullable String str, boolean z9, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z10, @Nullable String str5) {
        return new AndroidShowOptions(map, str, z9, str2, str3, str4, z10, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
        return Intrinsics.b(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && Intrinsics.b(this.placementId, androidShowOptions.placementId) && this.isScarAd == androidShowOptions.isScarAd && Intrinsics.b(this.scarQueryId, androidShowOptions.scarQueryId) && Intrinsics.b(this.scarAdString, androidShowOptions.scarAdString) && Intrinsics.b(this.scarAdUnitId, androidShowOptions.scarAdUnitId) && this.isOfferwallAd == androidShowOptions.isOfferwallAd && Intrinsics.b(this.offerwallPlacementName, androidShowOptions.offerwallPlacementName);
    }

    @Nullable
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final String getScarAdString() {
        return this.scarAdString;
    }

    @Nullable
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    @Nullable
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    @Nullable
    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        Map<String, Object> map = this.unityAdsShowOptions;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.placementId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z9 = this.isScarAd;
        ?? r10 = z9;
        if (z9) {
            r10 = 1;
        }
        int i10 = (iHashCode2 + r10) * 31;
        String str2 = this.scarQueryId;
        int iHashCode3 = (i10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scarAdUnitId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z10 = this.isOfferwallAd;
        int i11 = (iHashCode5 + (z10 ? 1 : z10)) * 31;
        String str5 = this.offerwallPlacementName;
        return i11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    @NotNull
    public String toString() {
        return "AndroidShowOptions(unityAdsShowOptions=" + this.unityAdsShowOptions + ", placementId=" + this.placementId + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdString=" + this.scarAdString + ", scarAdUnitId=" + this.scarAdUnitId + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ')';
    }

    public /* synthetic */ AndroidShowOptions(Map map, String str, boolean z9, String str2, String str3, String str4, boolean z10, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z9, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? false : z10, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str5);
    }
}

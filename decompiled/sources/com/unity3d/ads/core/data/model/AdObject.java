package com.unity3d.ads.core.data.model;

import L8.M;
import L8.x;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
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
public final class AdObject {

    @Nullable
    private final AdPlayer adPlayer;

    @NotNull
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;

    @NotNull
    private final UnityAdsLoadOptions loadOptions;

    @Nullable
    private String offerwallPlacementName;

    @NotNull
    private final ByteString opportunityId;

    @NotNull
    private final String placementId;

    @Nullable
    private String playerServerId;

    @Nullable
    private String scarAdString;

    @Nullable
    private String scarAdUnitId;

    @Nullable
    private String scarQueryId;

    @NotNull
    private x state;

    @NotNull
    private ByteString trackingToken;

    @NotNull
    private x ttl;

    public AdObject(@NotNull ByteString opportunityId, @NotNull String placementId, @NotNull ByteString trackingToken, boolean z9, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @Nullable String str4, @Nullable AdPlayer adPlayer, @Nullable String str5, @NotNull UnityAdsLoadOptions loadOptions, boolean z11, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType adType, @NotNull x ttl, @NotNull x state) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(ttl, "ttl");
        Intrinsics.checkNotNullParameter(state, "state");
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z9;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.isOfferwallAd = z10;
        this.offerwallPlacementName = str4;
        this.adPlayer = adPlayer;
        this.playerServerId = str5;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z11;
        this.adType = adType;
        this.ttl = ttl;
        this.state = state;
    }

    @NotNull
    public final ByteString component1() {
        return this.opportunityId;
    }

    @Nullable
    public final AdPlayer component10() {
        return this.adPlayer;
    }

    @Nullable
    public final String component11() {
        return this.playerServerId;
    }

    @NotNull
    public final UnityAdsLoadOptions component12() {
        return this.loadOptions;
    }

    public final boolean component13() {
        return this.isHeaderBidding;
    }

    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component14() {
        return this.adType;
    }

    @NotNull
    public final x component15() {
        return this.ttl;
    }

    @NotNull
    public final x component16() {
        return this.state;
    }

    @NotNull
    public final String component2() {
        return this.placementId;
    }

    @NotNull
    public final ByteString component3() {
        return this.trackingToken;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    @Nullable
    public final String component5() {
        return this.scarQueryId;
    }

    @Nullable
    public final String component6() {
        return this.scarAdUnitId;
    }

    @Nullable
    public final String component7() {
        return this.scarAdString;
    }

    public final boolean component8() {
        return this.isOfferwallAd;
    }

    @Nullable
    public final String component9() {
        return this.offerwallPlacementName;
    }

    @NotNull
    public final AdObject copy(@NotNull ByteString opportunityId, @NotNull String placementId, @NotNull ByteString trackingToken, boolean z9, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @Nullable String str4, @Nullable AdPlayer adPlayer, @Nullable String str5, @NotNull UnityAdsLoadOptions loadOptions, boolean z11, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType adType, @NotNull x ttl, @NotNull x state) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(ttl, "ttl");
        Intrinsics.checkNotNullParameter(state, "state");
        return new AdObject(opportunityId, placementId, trackingToken, z9, str, str2, str3, z10, str4, adPlayer, str5, loadOptions, z11, adType, ttl, state);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        return Intrinsics.b(this.opportunityId, adObject.opportunityId) && Intrinsics.b(this.placementId, adObject.placementId) && Intrinsics.b(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && Intrinsics.b(this.scarQueryId, adObject.scarQueryId) && Intrinsics.b(this.scarAdUnitId, adObject.scarAdUnitId) && Intrinsics.b(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && Intrinsics.b(this.offerwallPlacementName, adObject.offerwallPlacementName) && Intrinsics.b(this.adPlayer, adObject.adPlayer) && Intrinsics.b(this.playerServerId, adObject.playerServerId) && Intrinsics.b(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && Intrinsics.b(this.ttl, adObject.ttl) && Intrinsics.b(this.state, adObject.state);
    }

    @Nullable
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    @NotNull
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    @Nullable
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @NotNull
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final String getPlayerServerId() {
        return this.playerServerId;
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

    @NotNull
    public final x getState() {
        return this.state;
    }

    @NotNull
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    @NotNull
    public final x getTtl() {
        return this.ttl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.opportunityId.hashCode() * 31) + this.placementId.hashCode()) * 31) + this.trackingToken.hashCode()) * 31;
        boolean z9 = this.isScarAd;
        ?? r10 = z9;
        if (z9) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        String str = this.scarQueryId;
        int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z10 = this.isOfferwallAd;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i11 = (iHashCode4 + r11) * 31;
        String str4 = this.offerwallPlacementName;
        int iHashCode5 = (i11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int iHashCode6 = (iHashCode5 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str5 = this.playerServerId;
        int iHashCode7 = (((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.loadOptions.hashCode()) * 31;
        boolean z11 = this.isHeaderBidding;
        return ((((((iHashCode7 + (z11 ? 1 : z11)) * 31) + this.adType.hashCode()) * 31) + this.ttl.hashCode()) * 31) + this.state.hashCode();
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setOfferwallAd(boolean z9) {
        this.isOfferwallAd = z9;
    }

    public final void setOfferwallPlacementName(@Nullable String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(@Nullable String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z9) {
        this.isScarAd = z9;
    }

    public final void setScarAdString(@Nullable String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(@Nullable String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(@Nullable String str) {
        this.scarQueryId = str;
    }

    public final void setState(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.state = xVar;
    }

    public final void setTrackingToken(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final void setTtl(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.ttl = xVar;
    }

    @NotNull
    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ')';
    }

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, boolean z9, String str2, String str3, String str4, boolean z10, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z11, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, x xVar, x xVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteString, str, byteString2, (i10 & 8) != 0 ? false : z9, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : z10, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str5, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : adPlayer, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str6, unityAdsLoadOptions, z11, diagnosticAdType, (i10 & 16384) != 0 ? M.a(null) : xVar, (i10 & 32768) != 0 ? M.a(AdObjectState.INIT) : xVar2);
    }
}

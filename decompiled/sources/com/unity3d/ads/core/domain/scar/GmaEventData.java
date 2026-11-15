package com.unity3d.ads.core.domain.scar;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.banners.bridge.BannerBridge;
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
public final class GmaEventData {

    @Nullable
    private final BannerBridge.BannerEvent bannerEvent;

    @Nullable
    private final Integer errorCode;

    @Nullable
    private final String errorMessage;

    @NotNull
    private final c gmaEvent;

    @Nullable
    private final String opportunityId;

    @Nullable
    private final String placementId;

    @Nullable
    private final String queryId;

    public GmaEventData(@NotNull c gmaEvent, @Nullable BannerBridge.BannerEvent bannerEvent, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(gmaEvent, "gmaEvent");
        this.gmaEvent = gmaEvent;
        this.bannerEvent = bannerEvent;
        this.opportunityId = str;
        this.placementId = str2;
        this.queryId = str3;
        this.errorMessage = str4;
        this.errorCode = num;
    }

    public static /* synthetic */ GmaEventData copy$default(GmaEventData gmaEventData, c cVar, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = gmaEventData.gmaEvent;
        }
        if ((i10 & 2) != 0) {
            bannerEvent = gmaEventData.bannerEvent;
        }
        if ((i10 & 4) != 0) {
            str = gmaEventData.opportunityId;
        }
        if ((i10 & 8) != 0) {
            str2 = gmaEventData.placementId;
        }
        if ((i10 & 16) != 0) {
            str3 = gmaEventData.queryId;
        }
        if ((i10 & 32) != 0) {
            str4 = gmaEventData.errorMessage;
        }
        if ((i10 & 64) != 0) {
            num = gmaEventData.errorCode;
        }
        String str5 = str4;
        Integer num2 = num;
        String str6 = str3;
        String str7 = str;
        return gmaEventData.copy(cVar, bannerEvent, str7, str2, str6, str5, num2);
    }

    @NotNull
    public final c component1() {
        return this.gmaEvent;
    }

    @Nullable
    public final BannerBridge.BannerEvent component2() {
        return this.bannerEvent;
    }

    @Nullable
    public final String component3() {
        return this.opportunityId;
    }

    @Nullable
    public final String component4() {
        return this.placementId;
    }

    @Nullable
    public final String component5() {
        return this.queryId;
    }

    @Nullable
    public final String component6() {
        return this.errorMessage;
    }

    @Nullable
    public final Integer component7() {
        return this.errorCode;
    }

    @NotNull
    public final GmaEventData copy(@NotNull c gmaEvent, @Nullable BannerBridge.BannerEvent bannerEvent, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(gmaEvent, "gmaEvent");
        return new GmaEventData(gmaEvent, bannerEvent, str, str2, str3, str4, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GmaEventData)) {
            return false;
        }
        GmaEventData gmaEventData = (GmaEventData) obj;
        return this.gmaEvent == gmaEventData.gmaEvent && this.bannerEvent == gmaEventData.bannerEvent && Intrinsics.b(this.opportunityId, gmaEventData.opportunityId) && Intrinsics.b(this.placementId, gmaEventData.placementId) && Intrinsics.b(this.queryId, gmaEventData.queryId) && Intrinsics.b(this.errorMessage, gmaEventData.errorMessage) && Intrinsics.b(this.errorCode, gmaEventData.errorCode);
    }

    @Nullable
    public final BannerBridge.BannerEvent getBannerEvent() {
        return this.bannerEvent;
    }

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final c getGmaEvent() {
        return this.gmaEvent;
    }

    @Nullable
    public final String getOpportunityId() {
        return this.opportunityId;
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final String getQueryId() {
        return this.queryId;
    }

    public int hashCode() {
        int iHashCode = this.gmaEvent.hashCode() * 31;
        BannerBridge.BannerEvent bannerEvent = this.bannerEvent;
        int iHashCode2 = (iHashCode + (bannerEvent == null ? 0 : bannerEvent.hashCode())) * 31;
        String str = this.opportunityId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placementId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.queryId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMessage;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.errorCode;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GmaEventData(gmaEvent=" + this.gmaEvent + ", bannerEvent=" + this.bannerEvent + ", opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", queryId=" + this.queryId + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ')';
    }

    public /* synthetic */ GmaEventData(c cVar, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i10 & 2) != 0 ? null : bannerEvent, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : num);
    }
}

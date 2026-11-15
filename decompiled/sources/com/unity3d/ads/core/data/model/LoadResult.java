package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
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
public abstract class LoadResult {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";

    @NotNull
    public static final String MSG_AD_OBJECT = "[UnityAds] Ad not found";

    @NotNull
    public static final String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";

    @NotNull
    public static final String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";

    @NotNull
    public static final String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";

    @NotNull
    public static final String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";

    @NotNull
    public static final String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";

    @NotNull
    public static final String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";

    @NotNull
    public static final String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";

    @NotNull
    public static final String MSG_NO_FILL = "[UnityAds] No fill";

    @NotNull
    public static final String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";

    @NotNull
    public static final String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";

    @NotNull
    public static final String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class Failure extends LoadResult {

        @NotNull
        private final UnityAds.UnityAdsLoadError error;
        private final boolean isScarAd;

        @Nullable
        private final String message;

        @NotNull
        private final String reason;

        @Nullable
        private final String reasonDebug;

        @Nullable
        private final Throwable throwable;

        public /* synthetic */ Failure(UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(unityAdsLoadError, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : th, str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z9);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, boolean z9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                unityAdsLoadError = failure.error;
            }
            if ((i10 & 2) != 0) {
                str = failure.message;
            }
            if ((i10 & 4) != 0) {
                th = failure.throwable;
            }
            if ((i10 & 8) != 0) {
                str2 = failure.reason;
            }
            if ((i10 & 16) != 0) {
                str3 = failure.reasonDebug;
            }
            if ((i10 & 32) != 0) {
                z9 = failure.isScarAd;
            }
            String str4 = str3;
            boolean z10 = z9;
            return failure.copy(unityAdsLoadError, str, th, str2, str4, z10);
        }

        @NotNull
        public final UnityAds.UnityAdsLoadError component1() {
            return this.error;
        }

        @Nullable
        public final String component2() {
            return this.message;
        }

        @Nullable
        public final Throwable component3() {
            return this.throwable;
        }

        @NotNull
        public final String component4() {
            return this.reason;
        }

        @Nullable
        public final String component5() {
            return this.reasonDebug;
        }

        public final boolean component6() {
            return this.isScarAd;
        }

        @NotNull
        public final Failure copy(@NotNull UnityAds.UnityAdsLoadError error, @Nullable String str, @Nullable Throwable th, @NotNull String reason, @Nullable String str2, boolean z9) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Failure(error, str, th, reason, str2, z9);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && Intrinsics.b(this.message, failure.message) && Intrinsics.b(this.throwable, failure.throwable) && Intrinsics.b(this.reason, failure.reason) && Intrinsics.b(this.reasonDebug, failure.reasonDebug) && this.isScarAd == failure.isScarAd;
        }

        @NotNull
        public final UnityAds.UnityAdsLoadError getError() {
            return this.error;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        @Nullable
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v14 */
        public int hashCode() {
            int iHashCode = this.error.hashCode() * 31;
            String str = this.message;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.throwable;
            int iHashCode3 = (((iHashCode2 + (th == null ? 0 : th.hashCode())) * 31) + this.reason.hashCode()) * 31;
            String str2 = this.reasonDebug;
            int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z9 = this.isScarAd;
            ?? r10 = z9;
            if (z9) {
                r10 = 1;
            }
            return iHashCode4 + r10;
        }

        public final boolean isScarAd() {
            return this.isScarAd;
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.error + ", message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", isScarAd=" + this.isScarAd + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull UnityAds.UnityAdsLoadError error, @Nullable String str, @Nullable Throwable th, @NotNull String reason, @Nullable String str2, boolean z9) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.error = error;
            this.message = str;
            this.throwable = th;
            this.reason = reason;
            this.reasonDebug = str2;
            this.isScarAd = z9;
        }
    }

    @Metadata
    public static final class Success extends LoadResult {

        @NotNull
        private final AdObject adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull AdObject adObject) {
            super(null);
            Intrinsics.checkNotNullParameter(adObject, "adObject");
            this.adObject = adObject;
        }

        public static /* synthetic */ Success copy$default(Success success, AdObject adObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adObject = success.adObject;
            }
            return success.copy(adObject);
        }

        @NotNull
        public final AdObject component1() {
            return this.adObject;
        }

        @NotNull
        public final Success copy(@NotNull AdObject adObject) {
            Intrinsics.checkNotNullParameter(adObject, "adObject");
            return new Success(adObject);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.b(this.adObject, ((Success) obj).adObject);
        }

        @NotNull
        public final AdObject getAdObject() {
            return this.adObject;
        }

        public int hashCode() {
            return this.adObject.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }
    }

    public /* synthetic */ LoadResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LoadResult() {
    }
}

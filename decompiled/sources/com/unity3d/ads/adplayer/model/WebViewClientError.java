package com.unity3d.ads.adplayer.model;

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
public final class WebViewClientError {

    @NotNull
    private final ErrorReason reason;

    @Nullable
    private final Integer statusCode;

    @Nullable
    private final String url;

    public WebViewClientError(@Nullable String str, @NotNull ErrorReason reason, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.url = str;
        this.reason = reason;
        this.statusCode = num;
    }

    public static /* synthetic */ WebViewClientError copy$default(WebViewClientError webViewClientError, String str, ErrorReason errorReason, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webViewClientError.url;
        }
        if ((i10 & 2) != 0) {
            errorReason = webViewClientError.reason;
        }
        if ((i10 & 4) != 0) {
            num = webViewClientError.statusCode;
        }
        return webViewClientError.copy(str, errorReason, num);
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @NotNull
    public final ErrorReason component2() {
        return this.reason;
    }

    @Nullable
    public final Integer component3() {
        return this.statusCode;
    }

    @NotNull
    public final WebViewClientError copy(@Nullable String str, @NotNull ErrorReason reason, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new WebViewClientError(str, reason, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewClientError)) {
            return false;
        }
        WebViewClientError webViewClientError = (WebViewClientError) obj;
        return Intrinsics.b(this.url, webViewClientError.url) && this.reason == webViewClientError.reason && Intrinsics.b(this.statusCode, webViewClientError.statusCode);
    }

    @NotNull
    public final ErrorReason getReason() {
        return this.reason;
    }

    @Nullable
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.reason.hashCode()) * 31;
        Integer num = this.statusCode;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WebViewClientError(url=" + this.url + ", reason=" + this.reason + ", statusCode=" + this.statusCode + ')';
    }

    public /* synthetic */ WebViewClientError(String str, ErrorReason errorReason, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, errorReason, (i10 & 4) != 0 ? null : num);
    }
}

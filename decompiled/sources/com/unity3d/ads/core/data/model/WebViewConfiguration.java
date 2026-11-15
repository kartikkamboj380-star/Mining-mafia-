package com.unity3d.ads.core.data.model;

import java.util.List;
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class WebViewConfiguration {

    @NotNull
    private final List<String> additionalFiles;

    @NotNull
    private final String entryPoint;

    @NotNull
    private final String type;
    private final int version;

    public WebViewConfiguration(int i10, @NotNull String entryPoint, @NotNull List<String> additionalFiles, @NotNull String type) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(additionalFiles, "additionalFiles");
        Intrinsics.checkNotNullParameter(type, "type");
        this.version = i10;
        this.entryPoint = entryPoint;
        this.additionalFiles = additionalFiles;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i10, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = webViewConfiguration.version;
        }
        if ((i11 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i11 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        if ((i11 & 8) != 0) {
            str2 = webViewConfiguration.type;
        }
        return webViewConfiguration.copy(i10, str, list, str2);
    }

    public final int component1() {
        return this.version;
    }

    @NotNull
    public final String component2() {
        return this.entryPoint;
    }

    @NotNull
    public final List<String> component3() {
        return this.additionalFiles;
    }

    @NotNull
    public final String component4() {
        return this.type;
    }

    @NotNull
    public final WebViewConfiguration copy(int i10, @NotNull String entryPoint, @NotNull List<String> additionalFiles, @NotNull String type) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(additionalFiles, "additionalFiles");
        Intrinsics.checkNotNullParameter(type, "type");
        return new WebViewConfiguration(i10, entryPoint, additionalFiles, type);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        return this.version == webViewConfiguration.version && Intrinsics.b(this.entryPoint, webViewConfiguration.entryPoint) && Intrinsics.b(this.additionalFiles, webViewConfiguration.additionalFiles) && Intrinsics.b(this.type, webViewConfiguration.type);
    }

    @NotNull
    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    @NotNull
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.version) * 31) + this.entryPoint.hashCode()) * 31) + this.additionalFiles.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "WebViewConfiguration(version=" + this.version + ", entryPoint=" + this.entryPoint + ", additionalFiles=" + this.additionalFiles + ", type=" + this.type + ')';
    }
}

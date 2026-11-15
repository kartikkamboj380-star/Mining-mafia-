package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

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
public interface Listeners {

    @Metadata
    public static final class DefaultImpls {
        public static void onClick(@NotNull Listeners listeners, @NotNull String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
        }

        public static void onComplete(@NotNull Listeners listeners, @NotNull String placementId, @NotNull UnityAds.UnityAdsShowCompletionState state) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            Intrinsics.checkNotNullParameter(state, "state");
        }

        public static void onError(@NotNull Listeners listeners, @NotNull String placementId, @NotNull UnityAds.UnityAdsShowError error, @NotNull String message) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(message, "message");
        }

        public static void onLeftApplication(@NotNull Listeners listeners, @NotNull String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
        }

        public static void onStart(@NotNull Listeners listeners, @NotNull String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
        }
    }

    void onClick(@NotNull String str);

    void onComplete(@NotNull String str, @NotNull UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(@NotNull String str, @NotNull UnityAds.UnityAdsShowError unityAdsShowError, @NotNull String str2);

    void onLeftApplication(@NotNull String str);

    void onStart(@NotNull String str);
}

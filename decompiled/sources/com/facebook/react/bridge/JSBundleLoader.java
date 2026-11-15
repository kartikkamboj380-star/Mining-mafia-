package com.facebook.react.bridge;

import android.content.Context;
import android.content.res.AssetManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public abstract class JSBundleLoader {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JSBundleLoader createAssetLoader(@NotNull final Context context, @NotNull final String assetUrl, final boolean z9) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
            return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader$Companion$createAssetLoader$1
                @Override // com.facebook.react.bridge.JSBundleLoader
                public String loadScript(JSBundleLoaderDelegate delegate) {
                    Intrinsics.checkNotNullParameter(delegate, "delegate");
                    AssetManager assets = context.getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                    delegate.loadScriptFromAssets(assets, assetUrl, z9);
                    return assetUrl;
                }
            };
        }

        @NotNull
        public final JSBundleLoader createCachedBundleFromNetworkLoader(@NotNull final String sourceURL, @NotNull final String cachedFileLocation) {
            Intrinsics.checkNotNullParameter(sourceURL, "sourceURL");
            Intrinsics.checkNotNullParameter(cachedFileLocation, "cachedFileLocation");
            return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader$Companion$createCachedBundleFromNetworkLoader$1
                @Override // com.facebook.react.bridge.JSBundleLoader
                public String loadScript(JSBundleLoaderDelegate delegate) {
                    Intrinsics.checkNotNullParameter(delegate, "delegate");
                    try {
                        delegate.loadScriptFromFile(cachedFileLocation, sourceURL, false);
                        return sourceURL;
                    } catch (Exception e10) {
                        e3.c.a aVar = p044e3.c.f43270b;
                        String str = sourceURL;
                        String message = e10.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        throw aVar.b(str, message, e10);
                    }
                }
            };
        }

        @NotNull
        public final JSBundleLoader createCachedSplitBundleFromNetworkLoader(@NotNull final String sourceURL, @NotNull final String cachedFileLocation) {
            Intrinsics.checkNotNullParameter(sourceURL, "sourceURL");
            Intrinsics.checkNotNullParameter(cachedFileLocation, "cachedFileLocation");
            return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader$Companion$createCachedSplitBundleFromNetworkLoader$1
                @Override // com.facebook.react.bridge.JSBundleLoader
                public String loadScript(JSBundleLoaderDelegate delegate) {
                    Intrinsics.checkNotNullParameter(delegate, "delegate");
                    try {
                        delegate.loadSplitBundleFromFile(cachedFileLocation, sourceURL);
                        return sourceURL;
                    } catch (Exception e10) {
                        e3.c.a aVar = p044e3.c.f43270b;
                        String str = sourceURL;
                        String message = e10.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        throw aVar.b(str, message, e10);
                    }
                }
            };
        }

        @NotNull
        public final JSBundleLoader createFileLoader(@NotNull String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return createFileLoader(fileName, fileName, false);
        }

        private Companion() {
        }

        @NotNull
        public final JSBundleLoader createFileLoader(@NotNull final String fileName, @NotNull final String assetUrl, final boolean z9) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
            return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader$Companion$createFileLoader$1
                @Override // com.facebook.react.bridge.JSBundleLoader
                public String loadScript(JSBundleLoaderDelegate delegate) {
                    Intrinsics.checkNotNullParameter(delegate, "delegate");
                    delegate.loadScriptFromFile(fileName, assetUrl, z9);
                    return fileName;
                }
            };
        }
    }

    @NotNull
    public static final JSBundleLoader createAssetLoader(@NotNull Context context, @NotNull String str, boolean z9) {
        return Companion.createAssetLoader(context, str, z9);
    }

    @NotNull
    public static final JSBundleLoader createCachedBundleFromNetworkLoader(@NotNull String str, @NotNull String str2) {
        return Companion.createCachedBundleFromNetworkLoader(str, str2);
    }

    @NotNull
    public static final JSBundleLoader createCachedSplitBundleFromNetworkLoader(@NotNull String str, @NotNull String str2) {
        return Companion.createCachedSplitBundleFromNetworkLoader(str, str2);
    }

    @NotNull
    public static final JSBundleLoader createFileLoader(@NotNull String str) {
        return Companion.createFileLoader(str);
    }

    @NotNull
    public abstract String loadScript(@NotNull JSBundleLoaderDelegate jSBundleLoaderDelegate);

    @NotNull
    public static final JSBundleLoader createFileLoader(@NotNull String str, @NotNull String str2, boolean z9) {
        return Companion.createFileLoader(str, str2, z9);
    }
}

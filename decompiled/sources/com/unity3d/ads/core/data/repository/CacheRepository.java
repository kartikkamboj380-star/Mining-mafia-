package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CachedFile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p169q8.b;

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
public interface CacheRepository {

    @Metadata
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i10, b bVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i11 & 2) != 0) {
                jSONArray = null;
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return cacheRepository.getFile(str, jSONArray, i10, bVar);
        }
    }

    @Nullable
    Object clearCache(@NotNull b bVar);

    @Nullable
    Object doesFileExist(@NotNull String str, @NotNull b bVar);

    @Nullable
    Object getCacheSize(@NotNull b bVar);

    @Nullable
    Object getFile(@NotNull String str, @Nullable JSONArray jSONArray, int i10, @NotNull b bVar);

    @Nullable
    Object getWebviewFile(@NotNull String str, @NotNull String str2, @NotNull b bVar);

    boolean removeFile(@NotNull CachedFile cachedFile);

    @Nullable
    Object retrieveFile(@NotNull String str, @NotNull b bVar);
}

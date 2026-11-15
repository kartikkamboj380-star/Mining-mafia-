package com.facebook.react.bridge;

import kotlin.Metadata;
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
public interface Promise {
    void reject(@NotNull String str);

    void reject(@NotNull String str, @NotNull WritableMap writableMap);

    void reject(@NotNull String str, @Nullable String str2);

    void reject(@NotNull String str, @Nullable String str2, @NotNull WritableMap writableMap);

    void reject(@NotNull String str, @Nullable String str2, @Nullable Throwable th);

    void reject(@Nullable String str, @Nullable String str2, @Nullable Throwable th, @Nullable WritableMap writableMap);

    void reject(@NotNull String str, @Nullable Throwable th);

    void reject(@NotNull String str, @Nullable Throwable th, @NotNull WritableMap writableMap);

    void reject(@NotNull Throwable th);

    void reject(@NotNull Throwable th, @NotNull WritableMap writableMap);

    void resolve(@Nullable Object obj);
}

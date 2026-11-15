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
public interface WritableMap extends ReadableMap {
    @NotNull
    WritableMap copy();

    void merge(@NotNull ReadableMap readableMap);

    void putArray(@NotNull String str, @Nullable ReadableArray readableArray);

    void putBoolean(@NotNull String str, boolean z9);

    void putDouble(@NotNull String str, double d10);

    void putInt(@NotNull String str, int i10);

    void putLong(@NotNull String str, long j10);

    void putMap(@NotNull String str, @Nullable ReadableMap readableMap);

    void putNull(@NotNull String str);

    void putString(@NotNull String str, @Nullable String str2);
}

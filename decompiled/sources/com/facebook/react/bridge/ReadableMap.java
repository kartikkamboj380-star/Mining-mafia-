package com.facebook.react.bridge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
public interface ReadableMap {
    @Nullable
    ReadableArray getArray(@NotNull String str);

    boolean getBoolean(@NotNull String str);

    double getDouble(@NotNull String str);

    @NotNull
    Dynamic getDynamic(@NotNull String str);

    @NotNull
    Iterator<Map.Entry<String, Object>> getEntryIterator();

    int getInt(@NotNull String str);

    long getLong(@NotNull String str);

    @Nullable
    ReadableMap getMap(@NotNull String str);

    @Nullable
    String getString(@NotNull String str);

    @NotNull
    ReadableType getType(@NotNull String str);

    boolean hasKey(@NotNull String str);

    boolean isNull(@NotNull String str);

    @NotNull
    ReadableMapKeySetIterator keySetIterator();

    @NotNull
    HashMap<String, Object> toHashMap();
}

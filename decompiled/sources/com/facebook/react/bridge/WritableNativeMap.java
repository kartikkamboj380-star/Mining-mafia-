package com.facebook.react.bridge;

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
/* JADX INFO: loaded from: classes.dex */
@p024c3.a
@Metadata
public final class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    public WritableNativeMap() {
        initHybrid();
    }

    private final native void initHybrid();

    private final native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private final native void putNativeArray(String str, ReadableNativeArray readableNativeArray);

    private final native void putNativeMap(String str, ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.WritableMap
    @NotNull
    public WritableMap copy() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(this);
        return writableNativeMap;
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(@NotNull ReadableMap source) {
        Intrinsics.checkNotNullParameter(source, "source");
        p004a3.a.b(source instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) source);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(@NotNull String key, @Nullable ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(key, "key");
        p004a3.a.b(readableArray == null || (readableArray instanceof ReadableNativeArray), "Illegal type provided");
        putNativeArray(key, (ReadableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putBoolean(@NotNull String str, boolean z9);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putDouble(@NotNull String str, double d10);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putInt(@NotNull String str, int i10);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putLong(@NotNull String str, long j10);

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(@NotNull String key, @Nullable ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(key, "key");
        p004a3.a.b(readableMap == null || (readableMap instanceof ReadableNativeMap), "Illegal type provided");
        putNativeMap(key, (ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putNull(@NotNull String str);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putString(@NotNull String str, @Nullable String str2);
}

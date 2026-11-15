package com.facebook.react.bridge;

import kotlin.Metadata;
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
public final class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    public WritableNativeArray() {
        initHybrid();
    }

    private final native void initHybrid();

    private final native void pushNativeArray(ReadableNativeArray readableNativeArray);

    private final native void pushNativeMap(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(@Nullable ReadableArray readableArray) {
        if (readableArray != null && !(readableArray instanceof ReadableNativeArray)) {
            throw new IllegalStateException("Illegal type provided");
        }
        pushNativeArray((ReadableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushBoolean(boolean z9);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushDouble(double d10);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushInt(int i10);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushLong(long j10);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(@Nullable ReadableMap readableMap) {
        if (readableMap != null && !(readableMap instanceof ReadableNativeMap)) {
            throw new IllegalStateException("Illegal type provided");
        }
        pushNativeMap((ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushNull();

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushString(@Nullable String str);
}

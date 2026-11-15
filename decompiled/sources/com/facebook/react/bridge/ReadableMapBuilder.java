package com.facebook.react.bridge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
@Metadata
public final class ReadableMapBuilder {

    @NotNull
    private final WritableMap map;

    public ReadableMapBuilder(@NotNull WritableMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    public final void put(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.putString(key, str);
    }

    public final void putArray(@NotNull String key, @NotNull Function1<? super ReadableArrayBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builder, "builder");
        WritableMap writableMap = this.map;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
        builder.invoke(new ReadableArrayBuilder(writableArrayCreateArray));
        writableMap.putArray(key, writableArrayCreateArray);
    }

    public final void putMap(@NotNull String key, @NotNull Function1<? super ReadableMapBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builder, "builder");
        WritableMap writableMap = this.map;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        builder.invoke(new ReadableMapBuilder(writableMapCreateMap));
        writableMap.putMap(key, writableMapCreateMap);
    }

    public final void putNull(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.putNull(key);
    }

    public final void put(@NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.putInt(key, i10);
    }

    public final void put(@NotNull String key, boolean z9) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.putBoolean(key, z9);
    }

    public final void put(@NotNull String key, double d10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.putDouble(key, d10);
    }

    public final void put(@NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.putDouble(key, j10);
    }

    public final void put(@NotNull String key, @NotNull ReadableMap value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.map.putMap(key, value);
    }

    public final void put(@NotNull String key, @NotNull ReadableArray value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.map.putArray(key, value);
    }
}

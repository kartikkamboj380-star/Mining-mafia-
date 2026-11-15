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
public final class ReadableArrayBuilder {

    @NotNull
    private final WritableArray array;

    public ReadableArrayBuilder(@NotNull WritableArray array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    public final void add(@Nullable String str) {
        this.array.pushString(str);
    }

    public final void addArray(@NotNull Function1<? super ReadableArrayBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        WritableArray writableArray = this.array;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
        builder.invoke(new ReadableArrayBuilder(writableArrayCreateArray));
        writableArray.pushArray(writableArrayCreateArray);
    }

    public final void addMap(@NotNull Function1<? super ReadableMapBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        WritableArray writableArray = this.array;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        builder.invoke(new ReadableMapBuilder(writableMapCreateMap));
        writableArray.pushMap(writableMapCreateMap);
    }

    public final void addNull() {
        this.array.pushNull();
    }

    public final void add(int i10) {
        this.array.pushInt(i10);
    }

    public final void add(boolean z9) {
        this.array.pushBoolean(z9);
    }

    public final void add(double d10) {
        this.array.pushDouble(d10);
    }

    public final void add(long j10) {
        this.array.pushDouble(j10);
    }

    public final void add(@NotNull ReadableMap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.array.pushMap(value);
    }

    public final void add(@NotNull ReadableArray value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.array.pushArray(value);
    }
}

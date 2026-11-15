package com.facebook.react.bridge;

import androidx.core.util.Pools$SimplePool;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class DynamicFromArray implements Dynamic {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Pools$SimplePool pool = new Pools$SimplePool(10);

    @Nullable
    private ReadableArray array;
    private int index;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DynamicFromArray create(@NotNull ReadableArray array, int i10) {
            Intrinsics.checkNotNullParameter(array, "array");
            DynamicFromArray dynamicFromArray = (DynamicFromArray) DynamicFromArray.pool.b();
            if (dynamicFromArray == null) {
                dynamicFromArray = new DynamicFromArray(null);
            }
            dynamicFromArray.array = array;
            dynamicFromArray.index = i10;
            return dynamicFromArray;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DynamicFromArray(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public static final DynamicFromArray create(@NotNull ReadableArray readableArray, int i10) {
        return Companion.create(readableArray, i10);
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableArray asArray() {
        ReadableArray array;
        ReadableArray readableArray = this.array;
        if (readableArray == null || (array = readableArray.getArray(this.index)) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return array;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.getBoolean(this.index);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.getDouble(this.index);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.getInt(this.index);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableMap asMap() {
        ReadableMap map;
        ReadableArray readableArray = this.array;
        if (readableArray == null || (map = readableArray.getMap(this.index)) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return map;
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public String asString() {
        String string;
        ReadableArray readableArray = this.array;
        if (readableArray == null || (string = readableArray.getString(this.index)) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return string;
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableType getType() {
        ReadableType type;
        ReadableArray readableArray = this.array;
        if (readableArray == null || (type = readableArray.getType(this.index)) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return type;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.isNull(this.index);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
        this.array = null;
        this.index = -1;
        pool.a(this);
    }

    private DynamicFromArray() {
        this.index = -1;
    }
}

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
@Metadata
public final class DynamicFromObject implements Dynamic {

    @Nullable
    private final Object value;

    public DynamicFromObject(@Nullable Object obj) {
        this.value = obj;
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableArray asArray() {
        Object obj = this.value;
        if (obj instanceof ReadableArray) {
            return (ReadableArray) obj;
        }
        throw new ClassCastException("Dynamic value from Object is not a ReadableArray");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        Object obj = this.value;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new ClassCastException("Dynamic value from Object is not a boolean");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        Object obj = this.value;
        if (!(obj instanceof Number)) {
            throw new ClassCastException("Dynamic value from Object is not a number");
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) obj).doubleValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        Object obj = this.value;
        if (!(obj instanceof Number)) {
            throw new ClassCastException("Dynamic value from Object is not a number");
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Double");
        return (int) ((Double) obj).doubleValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableMap asMap() {
        Object obj = this.value;
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        throw new ClassCastException("Dynamic value from Object is not a ReadableMap");
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public String asString() {
        Object obj = this.value;
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException("Dynamic value from Object is not a string");
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableType getType() {
        Object obj = this.value;
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        Z1.a.m("ReactNative", "Unmapped object type " + obj.getClass().getName());
        return ReadableType.Null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        return this.value == null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
    }
}

package com.facebook.react.bridge;

import androidx.core.util.Pools$SimplePool;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
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
public final class DynamicFromMap implements Dynamic {

    @NotNull
    private static final String DYNAMIC_VALUE_RECYCLED_FAILURE_MESSAGE = "This dynamic value has been recycled";

    @Nullable
    private ReadableMap map;

    @Nullable
    private String name;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final ThreadLocal<Pools$SimplePool> pool = new ThreadLocal<Pools$SimplePool>() { // from class: com.facebook.react.bridge.DynamicFromMap$Companion$pool$1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Pools$SimplePool initialValue() {
            return new Pools$SimplePool(10);
        }
    };

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DynamicFromMap create(@NotNull ReadableMap map, @NotNull String name) {
            DynamicFromMap dynamicFromMap;
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(name, "name");
            Pools$SimplePool pools$SimplePool = (Pools$SimplePool) DynamicFromMap.pool.get();
            if (pools$SimplePool == null || (dynamicFromMap = (DynamicFromMap) pools$SimplePool.b()) == null) {
                dynamicFromMap = new DynamicFromMap(null);
            }
            dynamicFromMap.map = map;
            dynamicFromMap.name = name;
            return dynamicFromMap;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DynamicFromMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_isNull_$lambda$0(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.isNull(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableType _get_type_$lambda$7(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getType(name);
    }

    private final <T> T accessMapSafely(Function2<? super ReadableMap, ? super String, ? extends T> function2) {
        String str = this.name;
        if (str == null) {
            throw new IllegalStateException(DYNAMIC_VALUE_RECYCLED_FAILURE_MESSAGE);
        }
        ReadableMap readableMap = this.map;
        if (readableMap != null) {
            return (T) function2.invoke(readableMap, str);
        }
        throw new IllegalStateException(DYNAMIC_VALUE_RECYCLED_FAILURE_MESSAGE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableArray asArray$lambda$5(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getArray(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBoolean$lambda$1(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getBoolean(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double asDouble$lambda$2(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getDouble(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt$lambda$3(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getInt(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableMap asMap$lambda$6(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getMap(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String asString$lambda$4(ReadableMap map, String name) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(name, "name");
        return map.getString(name);
    }

    @Override // com.facebook.react.bridge.Dynamic
    @Nullable
    public ReadableArray asArray() {
        return (ReadableArray) accessMapSafely(new Function2() { // from class: com.facebook.react.bridge.t
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DynamicFromMap.asArray$lambda$5((ReadableMap) obj, (String) obj2);
            }
        });
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        return ((Boolean) accessMapSafely(new Function2() { // from class: com.facebook.react.bridge.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(DynamicFromMap.asBoolean$lambda$1((ReadableMap) obj, (String) obj2));
            }
        })).booleanValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        return ((Number) accessMapSafely(new Function2() { // from class: com.facebook.react.bridge.v
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Double.valueOf(DynamicFromMap.asDouble$lambda$2((ReadableMap) obj, (String) obj2));
            }
        })).doubleValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        return ((Number) accessMapSafely(new Function2() { // from class: com.facebook.react.bridge.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(DynamicFromMap.asInt$lambda$3((ReadableMap) obj, (String) obj2));
            }
        })).intValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    @Nullable
    public ReadableMap asMap() {
        return (ReadableMap) accessMapSafely(new Function2() { // from class: com.facebook.react.bridge.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DynamicFromMap.asMap$lambda$6((ReadableMap) obj, (String) obj2);
            }
        });
    }

    @Override // com.facebook.react.bridge.Dynamic
    @Nullable
    public String asString() {
        return (String) accessMapSafely(new Function2() { // from class: com.facebook.react.bridge.r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DynamicFromMap.asString$lambda$4((ReadableMap) obj, (String) obj2);
            }
        });
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableType getType() {
        return (ReadableType) accessMapSafely(new Function2() { // from class: com.facebook.react.bridge.s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DynamicFromMap._get_type_$lambda$7((ReadableMap) obj, (String) obj2);
            }
        });
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        return ((Boolean) accessMapSafely(new Function2() { // from class: com.facebook.react.bridge.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(DynamicFromMap._get_isNull_$lambda$0((ReadableMap) obj, (String) obj2));
            }
        })).booleanValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
        this.map = null;
        this.name = null;
        Pools$SimplePool pools$SimplePool = pool.get();
        if (pools$SimplePool != null) {
            pools$SimplePool.a(this);
        }
    }

    private DynamicFromMap() {
    }
}

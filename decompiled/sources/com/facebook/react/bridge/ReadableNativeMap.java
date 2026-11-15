package com.facebook.react.bridge;

import android.annotation.SuppressLint;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
public class ReadableNativeMap extends NativeMap implements ReadableMap {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static int jniPassCounter;

    @NotNull
    private final Lazy keys$delegate;

    @NotNull
    private final Lazy localMap$delegate;

    @NotNull
    private final Lazy localTypeMap$delegate;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getJNIPassCounter() {
            return ReadableNativeMap.jniPassCounter;
        }

        private Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    protected ReadableNativeMap() {
        p129m8.j jVar = p129m8.j.SYNCHRONIZED;
        this.keys$delegate = p129m8.g.b(jVar, new Function0() { // from class: com.facebook.react.bridge.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReadableNativeMap.keys_delegate$lambda$1(this.f14515a);
            }
        });
        this.localMap$delegate = p129m8.g.b(jVar, new Function0() { // from class: com.facebook.react.bridge.A
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReadableNativeMap.localMap_delegate$lambda$2(this.f14499a);
            }
        });
        this.localTypeMap$delegate = p129m8.g.b(jVar, new Function0() { // from class: com.facebook.react.bridge.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReadableNativeMap.localTypeMap_delegate$lambda$3(this.f14500a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ReflectionMethodUse"})
    private final /* synthetic */ <T> T checkInstance(String str, Object obj, Class<T> cls) {
        Intrinsics.i(2, "T");
        if (obj != 0) {
            return obj;
        }
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + (obj != 0 ? obj.getClass().getSimpleName() : "NULL") + " to " + cls.getSimpleName());
    }

    public static final int getJNIPassCounter() {
        return Companion.getJNIPassCounter();
    }

    private final String[] getKeys() {
        return (String[]) this.keys$delegate.getValue();
    }

    private final HashMap<String, Object> getLocalMap() {
        return (HashMap) this.localMap$delegate.getValue();
    }

    private final HashMap<String, ReadableType> getLocalTypeMap() {
        return (HashMap) this.localTypeMap$delegate.getValue();
    }

    private final Object getNullableValue(String str) {
        return getLocalMap().get(str);
    }

    private final Object getValue(String str) {
        if (!hasKey(str)) {
            throw new NoSuchKeyException(str);
        }
        Object objC = p004a3.a.c(getLocalMap().get(str));
        Intrinsics.checkNotNullExpressionValue(objC, "assertNotNull(...)");
        return objC;
    }

    private final native String[] importKeys();

    private final native Object[] importTypes();

    private final native Object[] importValues();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] keys_delegate$lambda$1(ReadableNativeMap readableNativeMap) {
        String[] strArrImportKeys = readableNativeMap.importKeys();
        jniPassCounter++;
        return strArrImportKeys;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap localMap_delegate$lambda$2(ReadableNativeMap readableNativeMap) {
        int length = readableNativeMap.getKeys().length;
        HashMap map = new HashMap(length);
        Object[] objArrImportValues = readableNativeMap.importValues();
        jniPassCounter++;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(readableNativeMap.getKeys()[i10], objArrImportValues[i10]);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap localTypeMap_delegate$lambda$3(ReadableNativeMap readableNativeMap) {
        int length = readableNativeMap.getKeys().length;
        HashMap map = new HashMap(length);
        Object[] objArrImportTypes = readableNativeMap.importTypes();
        jniPassCounter++;
        for (int i10 = 0; i10 < length; i10++) {
            String str = readableNativeMap.getKeys()[i10];
            Object obj = objArrImportTypes[i10];
            Intrinsics.d(obj, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableType");
            map.put(str, (ReadableType) obj);
        }
        return map;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ReadableNativeMap) {
            return Intrinsics.b(getLocalMap(), ((ReadableNativeMap) obj).getLocalMap());
        }
        return false;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public ReadableArray getArray(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object nullableValue = getNullableValue(name);
        if (nullableValue == null) {
            return null;
        }
        ReadableArray readableArray = (ReadableArray) (nullableValue instanceof ReadableArray ? nullableValue : null);
        if (readableArray != null) {
            return readableArray;
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + nullableValue.getClass().getSimpleName() + " to " + ReadableArray.class.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object value = getValue(name);
        Boolean bool = (Boolean) (!(value instanceof Boolean) ? null : value);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + (value != null ? value.getClass().getSimpleName() : "NULL") + " to " + Boolean.TYPE.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object value = getValue(name);
        Double d10 = (Double) (!(value instanceof Double) ? null : value);
        if (d10 != null) {
            return d10.doubleValue();
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + (value != null ? value.getClass().getSimpleName() : "NULL") + " to " + Double.TYPE.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public Dynamic getDynamic(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return DynamicFromMap.Companion.create(this, name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        ReadableNativeMap$entryIterator$1$1 readableNativeMap$entryIterator$1$1;
        synchronized (this) {
            String[] keys = getKeys();
            Object[] objArrImportValues = importValues();
            jniPassCounter++;
            readableNativeMap$entryIterator$1$1 = new ReadableNativeMap$entryIterator$1$1(keys, objArrImportValues);
        }
        return readableNativeMap$entryIterator$1$1;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object value = getValue(name);
        Double d10 = (Double) (!(value instanceof Double) ? null : value);
        if (d10 != null) {
            return (int) d10.doubleValue();
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + (value != null ? value.getClass().getSimpleName() : "NULL") + " to " + Double.TYPE.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public long getLong(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object value = getValue(name);
        Long l10 = (Long) (!(value instanceof Long) ? null : value);
        if (l10 != null) {
            return l10.longValue();
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + (value != null ? value.getClass().getSimpleName() : "NULL") + " to " + Long.TYPE.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public String getString(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object nullableValue = getNullableValue(name);
        if (nullableValue == null) {
            return null;
        }
        String str = (String) (nullableValue instanceof String ? nullableValue : null);
        if (str != null) {
            return str;
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + nullableValue.getClass().getSimpleName() + " to " + String.class.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public ReadableType getType(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ReadableType readableType = getLocalTypeMap().get(name);
        if (readableType != null) {
            return readableType;
        }
        throw new NoSuchKeyException(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return getLocalMap().containsKey(name);
    }

    public int hashCode() {
        return getLocalMap().hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (getLocalMap().containsKey(name)) {
            return getLocalMap().get(name) == null;
        }
        throw new NoSuchKeyException(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public ReadableMapKeySetIterator keySetIterator() {
        final String[] keys = getKeys();
        return new ReadableMapKeySetIterator() { // from class: com.facebook.react.bridge.ReadableNativeMap.keySetIterator.1
            private int currentIndex;

            public final int getCurrentIndex() {
                return this.currentIndex;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public boolean hasNextKey() {
                return this.currentIndex < keys.length;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public String nextKey() {
                String[] strArr = keys;
                int i10 = this.currentIndex;
                this.currentIndex = i10 + 1;
                return strArr[i10];
            }

            public final void setCurrentIndex(int i10) {
                this.currentIndex = i10;
            }
        };
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> map = new HashMap<>(getLocalMap());
        for (String str : map.keySet()) {
            Intrinsics.d(str, "null cannot be cast to non-null type kotlin.String");
            String str2 = str;
            switch (WhenMappings.$EnumSwitchMapping$0[getType(str2).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 5:
                    map.put(str2, ((ReadableNativeMap) p004a3.a.c(getMap(str2))).toHashMap());
                    break;
                case 6:
                    map.put(str2, ((ReadableArray) p004a3.a.c(getArray(str2))).toArrayList());
                    break;
                default:
                    throw new p129m8.k();
            }
        }
        return map;
    }

    private final /* synthetic */ <T> T getNullableValue(String str, Class<T> cls) {
        T t10 = (T) getNullableValue(str);
        if (t10 == null) {
            return null;
        }
        Intrinsics.i(2, "T");
        return t10;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public ReadableNativeMap getMap(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object nullableValue = getNullableValue(name);
        if (nullableValue == null) {
            return null;
        }
        ReadableNativeMap readableNativeMap = (ReadableNativeMap) (nullableValue instanceof ReadableNativeMap ? nullableValue : null);
        if (readableNativeMap != null) {
            return readableNativeMap;
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + nullableValue.getClass().getSimpleName() + " to " + ReadableNativeMap.class.getSimpleName());
    }

    private final /* synthetic */ <T> T getValue(String str, Class<T> cls) {
        T t10 = (T) getValue(str);
        Intrinsics.i(2, "T");
        if (t10 != null) {
            return t10;
        }
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + (t10 != null ? t10.getClass().getSimpleName() : "NULL") + " to " + cls.getSimpleName());
    }
}

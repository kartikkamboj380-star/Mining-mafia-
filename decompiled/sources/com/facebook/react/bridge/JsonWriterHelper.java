package com.facebook.react.bridge;

import android.util.JsonWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
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
public final class JsonWriterHelper {

    @NotNull
    public static final JsonWriterHelper INSTANCE = new JsonWriterHelper();

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

    private JsonWriterHelper() {
    }

    private final void dynamicValue(JsonWriter jsonWriter, Dynamic dynamic) throws IOException {
        switch (WhenMappings.$EnumSwitchMapping$0[dynamic.getType().ordinal()]) {
            case 1:
                jsonWriter.nullValue();
                return;
            case 2:
                jsonWriter.value(dynamic.asBoolean());
                return;
            case 3:
                jsonWriter.value(dynamic.asDouble());
                return;
            case 4:
                jsonWriter.value(dynamic.asString());
                return;
            case 5:
                ReadableMap readableMapAsMap = dynamic.asMap();
                if (readableMapAsMap == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                readableMapValue(jsonWriter, readableMapAsMap);
                Unit unit = Unit.f45918a;
                return;
            case 6:
                ReadableArray readableArrayAsArray = dynamic.asArray();
                if (readableArrayAsArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                readableArrayValue(jsonWriter, readableArrayAsArray);
                Unit unit2 = Unit.f45918a;
                return;
            default:
                throw new p129m8.k();
        }
    }

    private final void listValue(JsonWriter jsonWriter, List<?> list) throws IOException {
        jsonWriter.beginArray();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            objectValue(jsonWriter, it.next());
        }
        jsonWriter.endArray();
    }

    private final void mapValue(JsonWriter jsonWriter, Map<?, ?> map) throws IOException {
        jsonWriter.beginObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            jsonWriter.name(String.valueOf(key));
            value(jsonWriter, value);
        }
        jsonWriter.endObject();
    }

    private final void objectValue(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else {
            if (obj instanceof Boolean) {
                jsonWriter.value(((Boolean) obj).booleanValue());
                return;
            }
            throw new IllegalArgumentException("Unknown value: " + obj);
        }
    }

    public static final void readableArrayValue(@NotNull JsonWriter writer, @NotNull ReadableArray value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.beginArray();
        try {
            int size = value.size();
            for (int i10 = 0; i10 < size; i10++) {
                switch (WhenMappings.$EnumSwitchMapping$0[value.getType(i10).ordinal()]) {
                    case 1:
                        writer.nullValue();
                        break;
                    case 2:
                        writer.value(value.getBoolean(i10));
                        break;
                    case 3:
                        writer.value(value.getDouble(i10));
                        break;
                    case 4:
                        writer.value(value.getString(i10));
                        break;
                    case 5:
                        ReadableMap map = value.getMap(i10);
                        JsonWriterHelper jsonWriterHelper = INSTANCE;
                        if (map == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        jsonWriterHelper.readableMapValue(writer, map);
                        Unit unit = Unit.f45918a;
                        break;
                        break;
                    case 6:
                        ReadableArray array = value.getArray(i10);
                        if (array == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        readableArrayValue(writer, array);
                        Unit unit2 = Unit.f45918a;
                        break;
                        break;
                    default:
                        throw new p129m8.k();
                }
            }
            writer.endArray();
        } catch (Throwable th) {
            writer.endArray();
            throw th;
        }
    }

    private final void readableMapValue(JsonWriter jsonWriter, ReadableMap readableMap) throws IOException {
        jsonWriter.beginObject();
        try {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                jsonWriter.name(strNextKey);
                switch (WhenMappings.$EnumSwitchMapping$0[readableMap.getType(strNextKey).ordinal()]) {
                    case 1:
                        jsonWriter.nullValue();
                        break;
                    case 2:
                        jsonWriter.value(readableMap.getBoolean(strNextKey));
                        break;
                    case 3:
                        jsonWriter.value(readableMap.getDouble(strNextKey));
                        break;
                    case 4:
                        jsonWriter.value(readableMap.getString(strNextKey));
                        break;
                    case 5:
                        ReadableMap map = readableMap.getMap(strNextKey);
                        if (map == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        readableMapValue(jsonWriter, map);
                        Unit unit = Unit.f45918a;
                        break;
                        break;
                    case 6:
                        ReadableArray array = readableMap.getArray(strNextKey);
                        if (array == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        readableArrayValue(jsonWriter, array);
                        Unit unit2 = Unit.f45918a;
                        break;
                        break;
                    default:
                        throw new p129m8.k();
                }
            }
            jsonWriter.endObject();
        } catch (Throwable th) {
            jsonWriter.endObject();
            throw th;
        }
    }

    public static final void value(@NotNull JsonWriter writer, @Nullable Object obj) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (obj instanceof Map) {
            INSTANCE.mapValue(writer, (Map) obj);
            return;
        }
        if (obj instanceof List) {
            INSTANCE.listValue(writer, (List) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            INSTANCE.readableMapValue(writer, (ReadableMap) obj);
            return;
        }
        if (obj instanceof ReadableArray) {
            readableArrayValue(writer, (ReadableArray) obj);
        } else if (obj instanceof Dynamic) {
            INSTANCE.dynamicValue(writer, (Dynamic) obj);
        } else {
            INSTANCE.objectValue(writer, obj);
        }
    }
}

package com.google.protobuf;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final b metadata;
    private final V value;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41150a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f41150a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41150a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41150a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f41151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f41152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WireFormat.FieldType f41153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f41154d;

        public b(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
            this.f41151a = fieldType;
            this.f41152b = obj;
            this.f41153c = fieldType2;
            this.f41154d = obj2;
        }
    }

    private MapEntryLite(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v10) {
        this.metadata = new b(fieldType, k10, fieldType2, v10);
        this.key = k10;
        this.value = v10;
    }

    static <K, V> int computeSerializedSize(b bVar, K k10, V v10) {
        return FieldSet.e(bVar.f41151a, 1, k10) + FieldSet.e(bVar.f41153c, 2, v10);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v10) {
        return new MapEntryLite<>(fieldType, k10, fieldType2, v10);
    }

    static <T> T parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t10) {
        int i10 = a.f41150a[fieldType.ordinal()];
        if (i10 == 1) {
            MessageLite.Builder builder = ((MessageLite) t10).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i10 == 2) {
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        if (i10 != 3) {
            return (T) FieldSet.C(codedInputStream, fieldType, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    static <K, V> void writeTo(CodedOutputStream codedOutputStream, b bVar, K k10, V v10) {
        FieldSet.G(codedOutputStream, bVar.f41151a, 1, k10);
        FieldSet.G(codedOutputStream, bVar.f41153c, 2, v10);
    }

    public int computeMessageSize(int i10, K k10, V v10) {
        return CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k10, v10));
    }

    public K getKey() {
        return this.key;
    }

    b getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        b bVar = this.metadata;
        Object field = bVar.f41152b;
        Object field2 = bVar.f41154d;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == WireFormat.makeTag(1, this.metadata.f41151a.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, this.metadata.f41151a, field);
            } else if (tag == WireFormat.makeTag(2, this.metadata.f41153c.getWireType())) {
                field2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.f41153c, field2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(iPushLimit);
        mapFieldLite.put(field, field2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i10, K k10, V v10) {
        codedOutputStream.writeTag(i10, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k10, v10));
        writeTo(codedOutputStream, this.metadata, k10, v10);
    }

    static <K, V> Map.Entry<K, V> parseEntry(CodedInputStream codedInputStream, b bVar, ExtensionRegistryLite extensionRegistryLite) {
        Object field = bVar.f41152b;
        Object field2 = bVar.f41154d;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == WireFormat.makeTag(1, bVar.f41151a.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, bVar.f41151a, field);
            } else if (tag == WireFormat.makeTag(2, bVar.f41153c.getWireType())) {
                field2 = parseField(codedInputStream, extensionRegistryLite, bVar.f41153c, field2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(field, field2);
    }

    private MapEntryLite(b bVar, K k10, V v10) {
        this.metadata = bVar;
        this.key = k10;
        this.value = v10;
    }
}

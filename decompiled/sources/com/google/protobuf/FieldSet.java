package com.google.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class FieldSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FieldSet f41085d = new FieldSet(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q f41086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41088c;

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        Internal.EnumLiteMap<?> getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f41090b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f41090b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41090b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41090b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41090b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41090b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41090b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41090b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41090b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41090b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41090b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41090b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41090b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41090b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f41090b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f41090b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f41090b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f41090b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f41090b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f41089a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f41089a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f41089a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f41089a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f41089a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f41089a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f41089a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f41089a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f41089a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    private FieldSet() {
        this.f41086a = Q.r(16);
    }

    private void A(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (fieldDescriptorLite.isRepeated()) {
            Object objJ = j(fieldDescriptorLite);
            if (objJ == null) {
                objJ = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objJ).add(d(it.next()));
            }
            this.f41086a.s(fieldDescriptorLite, objJ);
            return;
        }
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            this.f41086a.s(fieldDescriptorLite, d(value));
            return;
        }
        Object objJ2 = j(fieldDescriptorLite);
        if (objJ2 == null) {
            this.f41086a.s(fieldDescriptorLite, d(value));
        } else {
            this.f41086a.s(fieldDescriptorLite, fieldDescriptorLite.internalMergeFrom(((MessageLite) objJ2).toBuilder(), (MessageLite) value).build());
        }
    }

    public static FieldSet B() {
        return new FieldSet();
    }

    public static Object C(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z9) {
        return z9 ? WireFormat.readPrimitiveField(codedInputStream, fieldType, WireFormat.b.f41232b) : WireFormat.readPrimitiveField(codedInputStream, fieldType, WireFormat.b.f41231a);
    }

    private void F(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!w(fieldDescriptorLite.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    static void G(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i10, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i10, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i10, p(fieldType, false));
            H(codedOutputStream, fieldType, obj);
        }
    }

    static void H(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (a.f41090b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                }
                break;
        }
    }

    public static void I(FieldDescriptorLite fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            if (obj instanceof LazyField) {
                G(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
                return;
            } else {
                G(codedOutputStream, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!fieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                G(codedOutputStream, liteType, number, it.next());
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            codedOutputStream.writeTag(number, 2);
            Iterator it2 = list.iterator();
            int iF = 0;
            while (it2.hasNext()) {
                iF += f(liteType, it2.next());
            }
            codedOutputStream.writeUInt32NoTag(iF);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                H(codedOutputStream, liteType, it3.next());
            }
        }
    }

    private static Object d(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int e(WireFormat.FieldType fieldType, int i10, Object obj) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + f(fieldType, obj);
    }

    static int f(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f41090b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int g(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return e(liteType, number, obj);
        }
        List list = (List) obj;
        int iE = 0;
        if (!fieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iE += e(liteType, number, it.next());
            }
            return iE;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iE += f(liteType, it2.next());
        }
        return CodedOutputStream.computeTagSize(number) + iE + CodedOutputStream.computeUInt32SizeNoTag(iE);
    }

    public static FieldSet i() {
        return f41085d;
    }

    private int l(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
            return g(fieldDescriptorLite, value);
        }
        return value instanceof LazyField ? CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value) : CodedOutputStream.computeMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
    }

    static int p(WireFormat.FieldType fieldType, boolean z9) {
        if (z9) {
            return 2;
        }
        return fieldType.getWireType();
    }

    private static boolean u(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (!fieldDescriptorLite.isRepeated()) {
            return v(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!v(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean v(Object obj) {
        if (obj instanceof MessageLiteOrBuilder) {
            return ((MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean w(WireFormat.FieldType fieldType, Object obj) {
        Internal.checkNotNull(obj);
        switch (a.f41089a[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof Internal.EnumLite);
            case 9:
                return (obj instanceof MessageLite) || (obj instanceof LazyField);
            default:
                return false;
        }
    }

    public void D(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!fieldDescriptorLite.isRepeated()) {
            F(fieldDescriptorLite, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                F(fieldDescriptorLite, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f41088c = true;
        }
        this.f41086a.s(fieldDescriptorLite, obj);
    }

    public void E(FieldDescriptorLite fieldDescriptorLite, int i10, Object obj) {
        if (!fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objJ = j(fieldDescriptorLite);
        if (objJ == null) {
            throw new IndexOutOfBoundsException();
        }
        F(fieldDescriptorLite, obj);
        ((List) objJ).set(i10, obj);
    }

    public void a(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        List arrayList;
        if (!fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        F(fieldDescriptorLite, obj);
        Object objJ = j(fieldDescriptorLite);
        if (objJ == null) {
            arrayList = new ArrayList();
            this.f41086a.s(fieldDescriptorLite, arrayList);
        } else {
            arrayList = (List) objJ;
        }
        arrayList.add(obj);
    }

    public void b(FieldDescriptorLite fieldDescriptorLite) {
        this.f41086a.remove(fieldDescriptorLite);
        if (this.f41086a.isEmpty()) {
            this.f41088c = false;
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FieldSet clone() {
        FieldSet fieldSetB = B();
        for (int i10 = 0; i10 < this.f41086a.l(); i10++) {
            Map.Entry entryK = this.f41086a.k(i10);
            fieldSetB.D((FieldDescriptorLite) entryK.getKey(), entryK.getValue());
        }
        for (Map.Entry entry : this.f41086a.n()) {
            fieldSetB.D((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSetB.f41088c = this.f41088c;
        return fieldSetB;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.f41086a.equals(((FieldSet) obj).f41086a);
        }
        return false;
    }

    Iterator h() {
        return this.f41088c ? new LazyField.c(this.f41086a.i().iterator()) : this.f41086a.i().iterator();
    }

    public int hashCode() {
        return this.f41086a.hashCode();
    }

    public Object j(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f41086a.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public int k() {
        int iL = 0;
        for (int i10 = 0; i10 < this.f41086a.l(); i10++) {
            iL += l(this.f41086a.k(i10));
        }
        Iterator it = this.f41086a.n().iterator();
        while (it.hasNext()) {
            iL += l((Map.Entry) it.next());
        }
        return iL;
    }

    public Object m(FieldDescriptorLite fieldDescriptorLite, int i10) {
        if (!fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objJ = j(fieldDescriptorLite);
        if (objJ != null) {
            return ((List) objJ).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int n(FieldDescriptorLite fieldDescriptorLite) {
        if (!fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objJ = j(fieldDescriptorLite);
        if (objJ == null) {
            return 0;
        }
        return ((List) objJ).size();
    }

    public int o() {
        int iG = 0;
        for (int i10 = 0; i10 < this.f41086a.l(); i10++) {
            Map.Entry entryK = this.f41086a.k(i10);
            iG += g((FieldDescriptorLite) entryK.getKey(), entryK.getValue());
        }
        for (Map.Entry entry : this.f41086a.n()) {
            iG += g((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iG;
    }

    public boolean q(FieldDescriptorLite fieldDescriptorLite) {
        if (fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f41086a.get(fieldDescriptorLite) != null;
    }

    boolean r() {
        return this.f41086a.isEmpty();
    }

    public boolean s() {
        return this.f41087b;
    }

    public boolean t() {
        for (int i10 = 0; i10 < this.f41086a.l(); i10++) {
            if (!u(this.f41086a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f41086a.n().iterator();
        while (it.hasNext()) {
            if (!u((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator x() {
        return this.f41088c ? new LazyField.c(this.f41086a.entrySet().iterator()) : this.f41086a.entrySet().iterator();
    }

    public void y() {
        if (this.f41087b) {
            return;
        }
        for (int i10 = 0; i10 < this.f41086a.l(); i10++) {
            Map.Entry entryK = this.f41086a.k(i10);
            if (entryK.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryK.getValue()).makeImmutable();
            }
        }
        this.f41086a.q();
        this.f41087b = true;
    }

    public void z(FieldSet fieldSet) {
        for (int i10 = 0; i10 < fieldSet.f41086a.l(); i10++) {
            A(fieldSet.f41086a.k(i10));
        }
        Iterator it = fieldSet.f41086a.n().iterator();
        while (it.hasNext()) {
            A((Map.Entry) it.next());
        }
    }

    private FieldSet(boolean z9) {
        this(Q.r(0));
        y();
    }

    private FieldSet(Q q10) {
        this.f41086a = q10;
        y();
    }
}

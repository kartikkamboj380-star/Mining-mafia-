package com.google.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6749g implements Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f41256a;

    /* JADX INFO: renamed from: com.google.protobuf.g$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41257a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f41257a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41257a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41257a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41257a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41257a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41257a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41257a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41257a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41257a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41257a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41257a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41257a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C6749g(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.f41256a = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public static C6749g Q(CodedOutputStream codedOutputStream) {
        C6749g c6749g = codedOutputStream.wrapper;
        return c6749g != null ? c6749g : new C6749g(codedOutputStream);
    }

    private void R(int i10, boolean z9, Object obj, MapEntryLite.b bVar) {
        this.f41256a.writeTag(i10, 2);
        this.f41256a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, Boolean.valueOf(z9), obj));
        MapEntryLite.writeTo(this.f41256a, bVar, Boolean.valueOf(z9), obj);
    }

    private void S(int i10, MapEntryLite.b bVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            Object obj = map.get(Integer.valueOf(i13));
            this.f41256a.writeTag(i10, 2);
            this.f41256a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, Integer.valueOf(i13), obj));
            MapEntryLite.writeTo(this.f41256a, bVar, Integer.valueOf(i13), obj);
        }
    }

    private void T(int i10, MapEntryLite.b bVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            Object obj = map.get(Long.valueOf(j10));
            this.f41256a.writeTag(i10, 2);
            this.f41256a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, Long.valueOf(j10), obj));
            MapEntryLite.writeTo(this.f41256a, bVar, Long.valueOf(j10), obj);
        }
    }

    private void U(int i10, MapEntryLite.b bVar, Map map) {
        switch (a.f41257a[bVar.f41151a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    R(i10, false, obj, bVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    R(i10, true, obj2, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                S(i10, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                T(i10, bVar, map);
                return;
            case 12:
                V(i10, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.f41151a);
        }
    }

    private void V(int i10, MapEntryLite.b bVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = (String) it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            Object obj = map.get(str);
            this.f41256a.writeTag(i10, 2);
            this.f41256a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, str, obj));
            MapEntryLite.writeTo(this.f41256a, bVar, str, obj);
        }
    }

    private void W(int i10, Object obj) {
        if (obj instanceof String) {
            this.f41256a.writeString(i10, (String) obj);
        } else {
            this.f41256a.writeBytes(i10, (ByteString) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public void A(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeBool(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeBoolSizeNoTag += CodedOutputStream.computeBoolSizeNoTag(((Boolean) list.get(i12)).booleanValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeBoolNoTag(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void B(int i10, float f10) {
        this.f41256a.writeFloat(i10, f10);
    }

    @Override // com.google.protobuf.Writer
    public void C(int i10) {
        this.f41256a.writeTag(i10, 4);
    }

    @Override // com.google.protobuf.Writer
    public void D(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeSInt32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeSInt32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void E(int i10, int i11) {
        this.f41256a.writeEnum(i10, i11);
    }

    @Override // com.google.protobuf.Writer
    public void F(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeInt64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeInt64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void G(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeDouble(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeDoubleSizeNoTag += CodedOutputStream.computeDoubleSizeNoTag(((Double) list.get(i12)).doubleValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeDoubleNoTag(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void H(int i10, int i11) {
        this.f41256a.writeSInt32(i10, i11);
    }

    @Override // com.google.protobuf.Writer
    public void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f41256a.writeBytes(i10, (ByteString) list.get(i11));
        }
    }

    @Override // com.google.protobuf.Writer
    public void J(int i10, List list, N n10) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), n10);
        }
    }

    @Override // com.google.protobuf.Writer
    public void K(int i10, Object obj, N n10) {
        this.f41256a.writeGroup(i10, (MessageLite) obj, n10);
    }

    @Override // com.google.protobuf.Writer
    public void L(int i10, ByteString byteString) {
        this.f41256a.writeBytes(i10, byteString);
    }

    @Override // com.google.protobuf.Writer
    public void M(int i10, List list, N n10) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11), n10);
        }
    }

    @Override // com.google.protobuf.Writer
    public void N(int i10, Object obj, N n10) {
        this.f41256a.writeMessage(i10, (MessageLite) obj, n10);
    }

    @Override // com.google.protobuf.Writer
    public void O(int i10, Object obj) {
        this.f41256a.writeMessage(i10, (MessageLite) obj);
    }

    @Override // com.google.protobuf.Writer
    public void P(int i10, MapEntryLite.b bVar, Map map) {
        if (this.f41256a.isSerializationDeterministic()) {
            U(i10, bVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f41256a.writeTag(i10, 2);
            this.f41256a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, entry.getKey(), entry.getValue()));
            MapEntryLite.writeTo(this.f41256a, bVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.Writer
    public void a(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeFloat(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeFloatSizeNoTag += CodedOutputStream.computeFloatSizeNoTag(((Float) list.get(i12)).floatValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeFloatNoTag(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void b(int i10, Object obj) {
        if (obj instanceof ByteString) {
            this.f41256a.writeRawMessageSetExtension(i10, (ByteString) obj);
        } else {
            this.f41256a.writeMessageSetExtension(i10, (MessageLite) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public void c(int i10, int i11) {
        this.f41256a.writeFixed32(i10, i11);
    }

    @Override // com.google.protobuf.Writer
    public void d(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof LazyStringList)) {
            while (i11 < list.size()) {
                this.f41256a.writeString(i10, (String) list.get(i11));
                i11++;
            }
        } else {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i11 < list.size()) {
                W(i10, lazyStringList.getRaw(i11));
                i11++;
            }
        }
    }

    @Override // com.google.protobuf.Writer
    public void e(int i10, String str) {
        this.f41256a.writeString(i10, str);
    }

    @Override // com.google.protobuf.Writer
    public void f(int i10, long j10) {
        this.f41256a.writeUInt64(i10, j10);
    }

    @Override // com.google.protobuf.Writer
    public void g(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeInt32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeInt32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void h(int i10, int i11) {
        this.f41256a.writeInt32(i10, i11);
    }

    @Override // com.google.protobuf.Writer
    public void i(int i10, long j10) {
        this.f41256a.writeSFixed64(i10, j10);
    }

    @Override // com.google.protobuf.Writer
    public void j(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeFixed32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeFixed32SizeNoTag += CodedOutputStream.computeFixed32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeFixed32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void k(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeUInt32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeUInt32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void l(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeSInt64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeSInt64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void m(int i10, long j10) {
        this.f41256a.writeSInt64(i10, j10);
    }

    @Override // com.google.protobuf.Writer
    public void n(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeEnum(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i12)).intValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeEnumNoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void o(int i10, int i11) {
        this.f41256a.writeUInt32(i10, i11);
    }

    @Override // com.google.protobuf.Writer
    public void p(int i10, double d10) {
        this.f41256a.writeDouble(i10, d10);
    }

    @Override // com.google.protobuf.Writer
    public void q(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeSFixed64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSFixed64SizeNoTag += CodedOutputStream.computeSFixed64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeSFixed64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void r(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeUInt64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeUInt64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void s(int i10, long j10) {
        this.f41256a.writeFixed64(i10, j10);
    }

    @Override // com.google.protobuf.Writer
    public Writer.FieldOrder t() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // com.google.protobuf.Writer
    public void u(int i10, long j10) {
        this.f41256a.writeInt64(i10, j10);
    }

    @Override // com.google.protobuf.Writer
    public void v(int i10, boolean z9) {
        this.f41256a.writeBool(i10, z9);
    }

    @Override // com.google.protobuf.Writer
    public void w(int i10, int i11) {
        this.f41256a.writeSFixed32(i10, i11);
    }

    @Override // com.google.protobuf.Writer
    public void x(int i10) {
        this.f41256a.writeTag(i10, 3);
    }

    @Override // com.google.protobuf.Writer
    public void y(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeFixed64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeFixed64SizeNoTag += CodedOutputStream.computeFixed64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeFixed64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void z(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f41256a.writeSFixed32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f41256a.writeTag(i10, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSFixed32SizeNoTag += CodedOutputStream.computeSFixed32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        this.f41256a.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i11 < list.size()) {
            this.f41256a.writeSFixed32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }
}

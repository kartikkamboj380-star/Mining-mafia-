package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6753k extends AbstractC6752j {

    /* JADX INFO: renamed from: com.google.protobuf.k$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41262a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f41262a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41262a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41262a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41262a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41262a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41262a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41262a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41262a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41262a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41262a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41262a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41262a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41262a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f41262a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f41262a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f41262a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f41262a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f41262a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    C6753k() {
    }

    @Override // com.google.protobuf.AbstractC6752j
    int a(Map.Entry entry) {
        return ((GeneratedMessageLite.b) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.AbstractC6752j
    Object b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i10) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i10);
    }

    @Override // com.google.protobuf.AbstractC6752j
    FieldSet c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.AbstractC6752j
    FieldSet d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.AbstractC6752j
    boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.AbstractC6752j
    void f(Object obj) {
        c(obj).y();
    }

    @Override // com.google.protobuf.AbstractC6752j
    Object g(Object obj, L l10, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, T t10) {
        Object objValueOf;
        Object objJ;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (a.f41262a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    l10.G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    l10.C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    l10.h(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    l10.f(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    l10.w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    l10.q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    l10.x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    l10.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    l10.t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    l10.b(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    l10.v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    l10.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    l10.c(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    l10.i(arrayList);
                    obj3 = P.z(obj, number, arrayList, generatedExtension.descriptor.getEnumType(), obj3, t10);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
            fieldSet.D(generatedExtension.descriptor, arrayList);
            return obj3;
        }
        if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
            switch (a.f41262a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(l10.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(l10.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(l10.H());
                    break;
                case 4:
                    objValueOf = Long.valueOf(l10.s());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(l10.p());
                    break;
                case 6:
                    objValueOf = Long.valueOf(l10.a());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(l10.u());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(l10.d());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(l10.g());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(l10.E());
                    break;
                case 11:
                    objValueOf = Long.valueOf(l10.e());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(l10.l());
                    break;
                case 13:
                    objValueOf = Long.valueOf(l10.y());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = l10.o();
                    break;
                case 16:
                    objValueOf = l10.z();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        Object objJ2 = fieldSet.j(generatedExtension.descriptor);
                        if (objJ2 instanceof GeneratedMessageLite) {
                            N nD = I.a().d(objJ2);
                            if (!((GeneratedMessageLite) objJ2).isMutable()) {
                                Object objE = nD.e();
                                nD.a(objE, objJ2);
                                fieldSet.D(generatedExtension.descriptor, objE);
                                objJ2 = objE;
                            }
                            l10.O(objJ2, nD, extensionRegistryLite);
                            return obj3;
                        }
                    }
                    objValueOf = l10.L(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        Object objJ3 = fieldSet.j(generatedExtension.descriptor);
                        if (objJ3 instanceof GeneratedMessageLite) {
                            N nD2 = I.a().d(objJ3);
                            if (!((GeneratedMessageLite) objJ3).isMutable()) {
                                Object objE2 = nD2.e();
                                nD2.a(objE2, objJ3);
                                fieldSet.D(generatedExtension.descriptor, objE2);
                                objJ3 = objE2;
                            }
                            l10.P(objJ3, nD2, extensionRegistryLite);
                            return obj3;
                        }
                    }
                    objValueOf = l10.N(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iP = l10.p();
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(iP) == null) {
                return P.J(obj, number, iP, obj3, t10);
            }
            objValueOf = Integer.valueOf(iP);
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.a(generatedExtension.descriptor, objValueOf);
            return obj3;
        }
        int i10 = a.f41262a[generatedExtension.getLiteType().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objJ = fieldSet.j(generatedExtension.descriptor)) != null) {
            objValueOf = Internal.mergeMessage(objJ, objValueOf);
        }
        fieldSet.D(generatedExtension.descriptor, objValueOf);
        return obj3;
    }

    @Override // com.google.protobuf.AbstractC6752j
    void h(L l10, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.D(generatedExtension.descriptor, l10.N(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    @Override // com.google.protobuf.AbstractC6752j
    void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder builderNewBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        builderNewBuilderForType.mergeFrom(codedInputStreamNewCodedInput, extensionRegistryLite);
        fieldSet.D(generatedExtension.descriptor, builderNewBuilderForType.buildPartial());
        codedInputStreamNewCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.AbstractC6752j
    void j(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.b bVar = (GeneratedMessageLite.b) entry.getKey();
        if (!bVar.isRepeated()) {
            switch (a.f41262a[bVar.getLiteType().ordinal()]) {
                case 1:
                    writer.p(bVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.B(bVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.u(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.f(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.h(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.s(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.c(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.v(bVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    writer.o(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    writer.w(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    writer.i(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.H(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.m(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.h(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.L(bVar.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.e(bVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    writer.K(bVar.getNumber(), entry.getValue(), I.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.N(bVar.getNumber(), entry.getValue(), I.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f41262a[bVar.getLiteType().ordinal()]) {
            case 1:
                P.O(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 2:
                P.S(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 3:
                P.V(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 4:
                P.d0(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 5:
                P.U(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 6:
                P.R(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 7:
                P.Q(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 8:
                P.M(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 9:
                P.c0(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 10:
                P.X(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 11:
                P.Y(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 12:
                P.Z(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 13:
                P.a0(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 14:
                P.U(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 15:
                P.N(bVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                P.b0(bVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    P.T(bVar.getNumber(), (List) entry.getValue(), writer, I.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    P.W(bVar.getNumber(), (List) entry.getValue(), writer, I.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}

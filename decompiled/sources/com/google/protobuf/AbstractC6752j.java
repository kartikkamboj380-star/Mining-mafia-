package com.google.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6752j {
    AbstractC6752j() {
    }

    abstract int a(Map.Entry entry);

    abstract Object b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i10);

    abstract FieldSet c(Object obj);

    abstract FieldSet d(Object obj);

    abstract boolean e(MessageLite messageLite);

    abstract void f(Object obj);

    abstract Object g(Object obj, L l10, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, T t10);

    abstract void h(L l10, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet);

    abstract void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet);

    abstract void j(Writer writer, Map.Entry entry);
}

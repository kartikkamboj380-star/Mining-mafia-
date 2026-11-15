package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6764w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC6762u f41291a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC6762u f41292b = new C6763v();

    static InterfaceC6762u a() {
        return f41291a;
    }

    static InterfaceC6762u b() {
        return f41292b;
    }

    private static InterfaceC6762u c() {
        try {
            return (InterfaceC6762u) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}

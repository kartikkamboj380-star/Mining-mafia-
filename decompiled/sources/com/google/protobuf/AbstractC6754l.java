package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6754l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC6752j f41263a = new C6753k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC6752j f41264b = c();

    static AbstractC6752j a() {
        AbstractC6752j abstractC6752j = f41264b;
        if (abstractC6752j != null) {
            return abstractC6752j;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC6752j b() {
        return f41263a;
    }

    private static AbstractC6752j c() {
        try {
            return (AbstractC6752j) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}

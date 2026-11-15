package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C f41057a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C f41058b = new D();

    static C a() {
        return f41057a;
    }

    static C b() {
        return f41058b;
    }

    private static C c() {
        try {
            return (C) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}

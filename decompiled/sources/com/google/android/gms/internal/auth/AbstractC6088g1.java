package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6088g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6085f1 f36028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C6085f1 f36029b;

    static {
        C6085f1 c6085f1 = null;
        try {
            c6085f1 = (C6085f1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f36028a = c6085f1;
        f36029b = new C6085f1();
    }

    static C6085f1 a() {
        return f36028a;
    }

    static C6085f1 b() {
        return f36029b;
    }
}

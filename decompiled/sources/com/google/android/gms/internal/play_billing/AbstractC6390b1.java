package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6390b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6386a1 f37194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C6386a1 f37195b;

    static {
        C6386a1 c6386a1 = null;
        try {
            c6386a1 = (C6386a1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f37194a = c6386a1;
        f37195b = new C6386a1();
    }

    static C6386a1 a() {
        return f37194a;
    }

    static C6386a1 b() {
        return f37195b;
    }
}

package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
abstract class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final P0 f37137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final P0 f37138b;

    static {
        P0 p10 = null;
        try {
            p10 = (P0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f37137a = p10;
        f37138b = new P0();
    }

    static P0 a() {
        return f37137a;
    }

    static P0 b() {
        return f37138b;
    }
}

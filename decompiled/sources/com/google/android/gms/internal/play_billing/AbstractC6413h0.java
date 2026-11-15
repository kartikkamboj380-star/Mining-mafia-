package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6413h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC6405f0 f37218a = new C6409g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC6405f0 f37219b;

    static {
        AbstractC6405f0 abstractC6405f0 = null;
        try {
            abstractC6405f0 = (AbstractC6405f0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f37219b = abstractC6405f0;
    }

    static AbstractC6405f0 a() {
        AbstractC6405f0 abstractC6405f0 = f37219b;
        if (abstractC6405f0 != null) {
            return abstractC6405f0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC6405f0 b() {
        return f37218a;
    }
}

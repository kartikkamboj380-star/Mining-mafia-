package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6140y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC6134w0 f36167a = new C6137x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC6134w0 f36168b;

    static {
        AbstractC6134w0 abstractC6134w0 = null;
        try {
            abstractC6134w0 = (AbstractC6134w0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f36168b = abstractC6134w0;
    }

    static AbstractC6134w0 a() {
        AbstractC6134w0 abstractC6134w0 = f36168b;
        if (abstractC6134w0 != null) {
            return abstractC6134w0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC6134w0 b() {
        return f36167a;
    }
}

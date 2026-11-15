package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6751i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f41261a = e();

    public static ExtensionRegistryLite a() {
        ExtensionRegistryLite extensionRegistryLiteC = c("newInstance");
        return extensionRegistryLiteC != null ? extensionRegistryLiteC : new ExtensionRegistryLite();
    }

    public static ExtensionRegistryLite b() {
        ExtensionRegistryLite extensionRegistryLiteC = c("getEmptyRegistry");
        return extensionRegistryLiteC != null ? extensionRegistryLiteC : ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    private static final ExtensionRegistryLite c(String str) {
        Class cls = f41261a;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean d(ExtensionRegistryLite extensionRegistryLite) {
        Class cls = f41261a;
        return cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass());
    }

    static Class e() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}

package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6744b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f41235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f41236b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f41237c;

    static {
        f41237c = (f41235a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f41236b;
    }

    static boolean c() {
        if (f41235a) {
            return true;
        }
        return (f41236b == null || f41237c) ? false : true;
    }
}

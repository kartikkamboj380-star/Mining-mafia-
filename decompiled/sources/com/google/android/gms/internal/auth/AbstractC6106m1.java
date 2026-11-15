package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6106m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f36120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC6115p1 f36121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC6115p1 f36122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f36123d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC6115p1 abstractC6115p1 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f36120a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC6115p1 = (AbstractC6115p1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f36121b = abstractC6115p1;
        f36122c = new C6123s1();
    }

    public static AbstractC6115p1 a() {
        return f36121b;
    }

    public static AbstractC6115p1 b() {
        return f36122c;
    }

    static void c(AbstractC6115p1 abstractC6115p1, Object obj, Object obj2) {
        abstractC6115p1.d(obj, abstractC6115p1.b(abstractC6115p1.a(obj), abstractC6115p1.a(obj2)));
    }

    public static void d(Class cls) {
        Class cls2;
        if (!C0.class.isAssignableFrom(cls) && (cls2 = f36120a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}

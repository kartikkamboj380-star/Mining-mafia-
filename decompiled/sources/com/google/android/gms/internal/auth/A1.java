package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
abstract class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f35897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f35898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f35899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z1 f35900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f35901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f35902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final boolean f35903g;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z9;
        boolean z10;
        z1 z1Var;
        Unsafe unsafeG = g();
        f35897a = unsafeG;
        int i10 = AbstractC6078d0.f36000a;
        f35898b = Memory.class;
        Class cls = Long.TYPE;
        boolean zS = s(cls);
        f35899c = zS;
        Class cls2 = Integer.TYPE;
        boolean zS2 = s(cls2);
        z1 c6138x1 = null;
        if (unsafeG != null) {
            if (zS) {
                c6138x1 = new y1(unsafeG);
            } else if (zS2) {
                c6138x1 = new C6138x1(unsafeG);
            }
        }
        f35900d = c6138x1;
        if (c6138x1 == null) {
            z9 = false;
        } else {
            try {
                Class<?> cls3 = c6138x1.f36171a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (y() == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            } catch (Throwable th) {
                h(th);
            }
        }
        f35901e = z9;
        z1 z1Var2 = f35900d;
        if (z1Var2 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = z1Var2.f36171a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z10 = true;
            } catch (Throwable th2) {
                h(th2);
                z10 = false;
            }
        }
        f35902f = z10;
        w(byte[].class);
        w(boolean[].class);
        x(boolean[].class);
        w(int[].class);
        x(int[].class);
        w(long[].class);
        x(long[].class);
        w(float[].class);
        x(float[].class);
        w(double[].class);
        x(double[].class);
        w(Object[].class);
        x(Object[].class);
        Field fieldY = y();
        if (fieldY != null && (z1Var = f35900d) != null) {
            z1Var.f36171a.objectFieldOffset(fieldY);
        }
        f35903g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static double a(Object obj, long j10) {
        return f35900d.a(obj, j10);
    }

    static float b(Object obj, long j10) {
        return f35900d.b(obj, j10);
    }

    static int c(Object obj, long j10) {
        return f35900d.f36171a.getInt(obj, j10);
    }

    static long d(Object obj, long j10) {
        return f35900d.f36171a.getLong(obj, j10);
    }

    static Object e(Class cls) {
        try {
            return f35897a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object f(Object obj, long j10) {
        return f35900d.f36171a.getObject(obj, j10);
    }

    static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C6135w1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void h(Throwable th) {
        Logger.getLogger(A1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static /* synthetic */ void i(Object obj, long j10, boolean z9) {
        z1 z1Var = f35900d;
        long j11 = (-4) & j10;
        int i10 = z1Var.f36171a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        z1Var.f36171a.putInt(obj, j11, ((z9 ? 1 : 0) << i11) | ((~(255 << i11)) & i10));
    }

    static /* synthetic */ void j(Object obj, long j10, boolean z9) {
        z1 z1Var = f35900d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        z1Var.f36171a.putInt(obj, j11, ((z9 ? 1 : 0) << i10) | ((~(255 << i10)) & z1Var.f36171a.getInt(obj, j11)));
    }

    static void k(Object obj, long j10, boolean z9) {
        f35900d.c(obj, j10, z9);
    }

    static void l(Object obj, long j10, double d10) {
        f35900d.d(obj, j10, d10);
    }

    static void m(Object obj, long j10, float f10) {
        f35900d.e(obj, j10, f10);
    }

    static void n(Object obj, long j10, int i10) {
        f35900d.f36171a.putInt(obj, j10, i10);
    }

    static void o(Object obj, long j10, long j11) {
        f35900d.f36171a.putLong(obj, j10, j11);
    }

    static void p(Object obj, long j10, Object obj2) {
        f35900d.f36171a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean q(Object obj, long j10) {
        return ((byte) ((f35900d.f36171a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean r(Object obj, long j10) {
        return ((byte) ((f35900d.f36171a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static boolean s(Class cls) {
        int i10 = AbstractC6078d0.f36000a;
        try {
            Class cls2 = f35898b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean t(Object obj, long j10) {
        return f35900d.f(obj, j10);
    }

    static boolean u() {
        return f35902f;
    }

    static boolean v() {
        return f35901e;
    }

    private static int w(Class cls) {
        if (f35902f) {
            return f35900d.f36171a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int x(Class cls) {
        if (f35902f) {
            return f35900d.f36171a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field y() {
        int i10 = AbstractC6078d0.f36000a;
        Field fieldZ = z(Buffer.class, "effectiveDirectAddress");
        if (fieldZ != null) {
            return fieldZ;
        }
        Field fieldZ2 = z(Buffer.class, "address");
        if (fieldZ2 == null || fieldZ2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZ2;
    }

    private static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}

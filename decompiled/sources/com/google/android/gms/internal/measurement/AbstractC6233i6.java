package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6233i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f36710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f36711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f36712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC6224h6 f36713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f36714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f36715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f36716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f36717h;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z9;
        boolean z10;
        AbstractC6224h6 abstractC6224h6;
        Unsafe unsafeV = v();
        f36710a = unsafeV;
        int i10 = AbstractC6373y4.f36953a;
        f36711b = Memory.class;
        Class cls = Long.TYPE;
        boolean zW = w(cls);
        f36712c = zW;
        Class cls2 = Integer.TYPE;
        boolean zW2 = w(cls2);
        AbstractC6224h6 c6206f6 = null;
        if (unsafeV != null) {
            if (zW) {
                c6206f6 = new C6215g6(unsafeV);
            } else if (zW2) {
                c6206f6 = new C6206f6(unsafeV);
            }
        }
        f36713d = c6206f6;
        if (c6206f6 == null) {
            z9 = false;
        } else {
            try {
                Class<?> cls3 = c6206f6.f36704a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            } catch (Throwable th) {
                D(th);
            }
        }
        f36714e = z9;
        AbstractC6224h6 abstractC6224h7 = f36713d;
        if (abstractC6224h7 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = abstractC6224h7.f36704a.getClass();
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
                D(th2);
                z10 = false;
            }
        }
        f36715f = z10;
        f36716g = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (abstractC6224h6 = f36713d) != null) {
            abstractC6224h6.f36704a.objectFieldOffset(fieldB);
        }
        f36717h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static /* synthetic */ boolean A(Object obj, long j10) {
        return ((byte) ((f36713d.f36704a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void D(Throwable th) {
        Logger.getLogger(AbstractC6233i6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int E(Class cls) {
        if (f36715f) {
            return f36713d.f36704a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f36715f) {
            return f36713d.f36704a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = AbstractC6373y4.f36953a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = f36713d.f36704a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        Unsafe unsafe = f36713d.f36704a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    static boolean f() {
        return f36715f;
    }

    static boolean g() {
        return f36714e;
    }

    static Object h(Class cls) {
        try {
            return f36710a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static int i(Object obj, long j10) {
        return f36713d.f36704a.getInt(obj, j10);
    }

    static void j(Object obj, long j10, int i10) {
        f36713d.f36704a.putInt(obj, j10, i10);
    }

    static long k(Object obj, long j10) {
        return f36713d.f36704a.getLong(obj, j10);
    }

    static void l(Object obj, long j10, long j11) {
        f36713d.f36704a.putLong(obj, j10, j11);
    }

    static boolean m(Object obj, long j10) {
        return f36713d.b(obj, j10);
    }

    static void n(Object obj, long j10, boolean z9) {
        f36713d.c(obj, j10, z9);
    }

    static float o(Object obj, long j10) {
        return f36713d.d(obj, j10);
    }

    static void p(Object obj, long j10, float f10) {
        f36713d.e(obj, j10, f10);
    }

    static double q(Object obj, long j10) {
        return f36713d.f(obj, j10);
    }

    static void r(Object obj, long j10, double d10) {
        f36713d.g(obj, j10, d10);
    }

    static Object s(Object obj, long j10) {
        return f36713d.f36704a.getObject(obj, j10);
    }

    static void t(Object obj, long j10, Object obj2) {
        f36713d.f36704a.putObject(obj, j10, obj2);
    }

    static void u(byte[] bArr, long j10, byte b10) {
        f36713d.a(bArr, f36716g + j10, b10);
    }

    static Unsafe v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C6197e6());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean w(Class cls) {
        int i10 = AbstractC6373y4.f36953a;
        try {
            Class cls2 = f36711b;
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

    static /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f36713d.f36704a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }
}

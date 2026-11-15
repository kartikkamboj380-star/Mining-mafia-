package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
abstract class H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f37083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f37084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f37085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final G1 f37086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f37087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f37088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f37089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f37090h;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z9;
        boolean z10;
        G1 g10;
        Unsafe unsafeL = l();
        f37083a = unsafeL;
        int i10 = C.f37067a;
        f37084b = Memory.class;
        Class cls = Long.TYPE;
        boolean zA = A(cls);
        f37085c = zA;
        Class cls2 = Integer.TYPE;
        boolean zA2 = A(cls2);
        G1 e10 = null;
        if (unsafeL != null) {
            if (zA) {
                e10 = new F1(unsafeL);
            } else if (zA2) {
                e10 = new E1(unsafeL);
            }
        }
        f37086d = e10;
        if (e10 == null) {
            z9 = false;
        } else {
            try {
                Class<?> cls3 = e10.f37082a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            } catch (Throwable th) {
                m(th);
            }
        }
        f37087e = z9;
        G1 g11 = f37086d;
        if (g11 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = g11.f37082a.getClass();
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
                m(th2);
                z10 = false;
            }
        }
        f37088f = z10;
        f37089g = E(byte[].class);
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
        if (fieldB != null && (g10 = f37086d) != null) {
            g10.f37082a.objectFieldOffset(fieldB);
        }
        f37090h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static boolean A(Class cls) {
        int i10 = C.f37067a;
        try {
            Class cls2 = f37084b;
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

    static boolean B(Object obj, long j10) {
        return f37086d.g(obj, j10);
    }

    static boolean C() {
        return f37088f;
    }

    static boolean D() {
        return f37087e;
    }

    private static int E(Class cls) {
        if (f37088f) {
            return f37086d.f37082a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f37088f) {
            return f37086d.f37082a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = C.f37067a;
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
        G1 g10 = f37086d;
        long j11 = (-4) & j10;
        int i10 = g10.f37082a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        g10.f37082a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        G1 g10 = f37086d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        g10.f37082a.putInt(obj, j11, ((255 & b10) << i10) | (g10.f37082a.getInt(obj, j11) & (~(255 << i10))));
    }

    static double f(Object obj, long j10) {
        return f37086d.a(obj, j10);
    }

    static float g(Object obj, long j10) {
        return f37086d.b(obj, j10);
    }

    static int h(Object obj, long j10) {
        return f37086d.f37082a.getInt(obj, j10);
    }

    static long i(Object obj, long j10) {
        return f37086d.f37082a.getLong(obj, j10);
    }

    static Object j(Class cls) {
        try {
            return f37083a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object k(Object obj, long j10) {
        return f37086d.f37082a.getObject(obj, j10);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new D1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(H1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j10, boolean z9) {
        f37086d.c(obj, j10, z9);
    }

    static void s(byte[] bArr, long j10, byte b10) {
        f37086d.d(bArr, f37089g + j10, b10);
    }

    static void t(Object obj, long j10, double d10) {
        f37086d.e(obj, j10, d10);
    }

    static void u(Object obj, long j10, float f10) {
        f37086d.f(obj, j10, f10);
    }

    static void v(Object obj, long j10, int i10) {
        f37086d.f37082a.putInt(obj, j10, i10);
    }

    static void w(Object obj, long j10, long j11) {
        f37086d.f37082a.putLong(obj, j10, j11);
    }

    static void x(Object obj, long j10, Object obj2) {
        f37086d.f37082a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f37086d.f37082a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f37086d.f37082a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}

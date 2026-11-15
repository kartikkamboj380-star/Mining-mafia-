package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3726hN0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f28947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f28948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f28949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC3600gN0 f28950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f28951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f28952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f28953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f28954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f28955i;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z9;
        boolean z10;
        AbstractC3600gN0 abstractC3600gN0;
        Unsafe unsafeZ = z();
        f28947a = unsafeZ;
        int i10 = AbstractC3722hL0.f28900a;
        f28948b = Memory.class;
        Class cls = Long.TYPE;
        boolean zA = A(cls);
        f28949c = zA;
        Class cls2 = Integer.TYPE;
        boolean zA2 = A(cls2);
        AbstractC3600gN0 c3348eN0 = null;
        if (unsafeZ != null) {
            if (zA) {
                c3348eN0 = new C3474fN0(unsafeZ);
            } else if (zA2) {
                c3348eN0 = new C3348eN0(unsafeZ);
            }
        }
        f28950d = c3348eN0;
        if (c3348eN0 == null) {
            z9 = false;
        } else {
            try {
                Class<?> cls3 = c3348eN0.f28631a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (d() == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            } catch (Throwable th) {
                a(th);
            }
        }
        f28951e = z9;
        AbstractC3600gN0 abstractC3600gN1 = f28950d;
        if (abstractC3600gN1 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = abstractC3600gN1.f28631a.getClass();
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
                a(th2);
                z10 = false;
            }
        }
        f28952f = z10;
        f28953g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        Field fieldD = d();
        long jObjectFieldOffset = -1;
        if (fieldD != null && (abstractC3600gN0 = f28950d) != null) {
            jObjectFieldOffset = abstractC3600gN0.f28631a.objectFieldOffset(fieldD);
        }
        f28954h = jObjectFieldOffset;
        f28955i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static boolean A(Class cls) {
        int i10 = AbstractC3722hL0.f28900a;
        try {
            Class cls2 = f28948b;
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

    static /* synthetic */ boolean D(Object obj, long j10) {
        return ((byte) ((f28950d.f28631a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean E(Object obj, long j10) {
        return ((byte) ((f28950d.f28631a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void a(Throwable th) {
        Logger.getLogger(AbstractC3726hN0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int b(Class cls) {
        if (f28952f) {
            return f28950d.f28631a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int c(Class cls) {
        if (f28952f) {
            return f28950d.f28631a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field d() {
        int i10 = AbstractC3722hL0.f28900a;
        Field fieldE = e(Buffer.class, "effectiveDirectAddress");
        if (fieldE != null) {
            return fieldE;
        }
        Field fieldE2 = e(Buffer.class, "address");
        if (fieldE2 == null || fieldE2.getType() != Long.TYPE) {
            return null;
        }
        return fieldE2;
    }

    private static Field e(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Object obj, long j10, byte b10) {
        Unsafe unsafe = f28950d.f28631a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Object obj, long j10, byte b10) {
        Unsafe unsafe = f28950d.f28631a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    static boolean h() {
        return f28952f;
    }

    static boolean i() {
        return f28951e;
    }

    static Object j(Class cls) {
        try {
            return f28947a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static int k(Object obj, long j10) {
        return f28950d.f28631a.getInt(obj, j10);
    }

    static void l(Object obj, long j10, int i10) {
        f28950d.f28631a.putInt(obj, j10, i10);
    }

    static long m(Object obj, long j10) {
        return f28950d.f28631a.getLong(obj, j10);
    }

    static void n(Object obj, long j10, long j11) {
        f28950d.f28631a.putLong(obj, j10, j11);
    }

    static boolean o(Object obj, long j10) {
        return f28950d.b(obj, j10);
    }

    static void p(Object obj, long j10, boolean z9) {
        f28950d.c(obj, j10, z9);
    }

    static float q(Object obj, long j10) {
        return f28950d.d(obj, j10);
    }

    static void r(Object obj, long j10, float f10) {
        f28950d.e(obj, j10, f10);
    }

    static double s(Object obj, long j10) {
        return f28950d.f(obj, j10);
    }

    static void t(Object obj, long j10, double d10) {
        f28950d.g(obj, j10, d10);
    }

    static Object u(Object obj, long j10) {
        return f28950d.f28631a.getObject(obj, j10);
    }

    static void v(Object obj, long j10, Object obj2) {
        f28950d.f28631a.putObject(obj, j10, obj2);
    }

    static void w(byte[] bArr, long j10, byte b10) {
        f28950d.a(bArr, f28953g + j10, b10);
    }

    static byte x(long j10) {
        return f28950d.h(j10);
    }

    static long y(ByteBuffer byteBuffer) {
        AbstractC3600gN0 abstractC3600gN0 = f28950d;
        return abstractC3600gN0.f28631a.getLong(byteBuffer, f28954h);
    }

    static Unsafe z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C3223dN0());
        } catch (Throwable unused) {
            return null;
        }
    }
}

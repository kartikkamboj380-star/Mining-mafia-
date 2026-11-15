package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f41204a = I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f41205b = AbstractC6744b.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f41206c = r(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f41207d = r(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f41208e = G();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f41209f = a0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f41210g = Z();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f41211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f41212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f41213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f41214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f41215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f41216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f41217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f41218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f41219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f41220q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f41221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f41222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f41223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f41224u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f41225v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f41226w;

    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.V.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.V.e
        public void d(byte[] bArr, long j10, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.V.e
        public boolean e(Object obj, long j10) {
            return V.f41226w ? V.v(obj, j10) : V.w(obj, j10);
        }

        @Override // com.google.protobuf.V.e
        public byte f(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.V.e
        public byte g(Object obj, long j10) {
            return V.f41226w ? V.z(obj, j10) : V.A(obj, j10);
        }

        @Override // com.google.protobuf.V.e
        public double h(Object obj, long j10) {
            return Double.longBitsToDouble(l(obj, j10));
        }

        @Override // com.google.protobuf.V.e
        public float i(Object obj, long j10) {
            return Float.intBitsToFloat(j(obj, j10));
        }

        @Override // com.google.protobuf.V.e
        public long k(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.V.e
        public void o(Object obj, long j10, boolean z9) {
            if (V.f41226w) {
                V.O(obj, j10, z9);
            } else {
                V.P(obj, j10, z9);
            }
        }

        @Override // com.google.protobuf.V.e
        public void p(long j10, byte b10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.V.e
        public void q(Object obj, long j10, byte b10) {
            if (V.f41226w) {
                V.S(obj, j10, b10);
            } else {
                V.T(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.V.e
        public void r(Object obj, long j10, double d10) {
            u(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.V.e
        public void s(Object obj, long j10, float f10) {
            t(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.V.e
        public boolean x() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.V.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.V.e
        public void d(byte[] bArr, long j10, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.V.e
        public boolean e(Object obj, long j10) {
            return V.f41226w ? V.v(obj, j10) : V.w(obj, j10);
        }

        @Override // com.google.protobuf.V.e
        public byte f(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.V.e
        public byte g(Object obj, long j10) {
            return V.f41226w ? V.z(obj, j10) : V.A(obj, j10);
        }

        @Override // com.google.protobuf.V.e
        public double h(Object obj, long j10) {
            return Double.longBitsToDouble(l(obj, j10));
        }

        @Override // com.google.protobuf.V.e
        public float i(Object obj, long j10) {
            return Float.intBitsToFloat(j(obj, j10));
        }

        @Override // com.google.protobuf.V.e
        public long k(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.V.e
        public void o(Object obj, long j10, boolean z9) {
            if (V.f41226w) {
                V.O(obj, j10, z9);
            } else {
                V.P(obj, j10, z9);
            }
        }

        @Override // com.google.protobuf.V.e
        public void p(long j10, byte b10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.V.e
        public void q(Object obj, long j10, byte b10) {
            if (V.f41226w) {
                V.S(obj, j10, b10);
            } else {
                V.T(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.V.e
        public void r(Object obj, long j10, double d10) {
            u(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.V.e
        public void s(Object obj, long j10, float f10) {
            t(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.V.e
        public boolean x() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.V.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            this.f41227a.copyMemory((Object) null, j10, bArr, V.f41211h + j11, j12);
        }

        @Override // com.google.protobuf.V.e
        public void d(byte[] bArr, long j10, long j11, long j12) {
            this.f41227a.copyMemory(bArr, V.f41211h + j10, (Object) null, j11, j12);
        }

        @Override // com.google.protobuf.V.e
        public boolean e(Object obj, long j10) {
            return this.f41227a.getBoolean(obj, j10);
        }

        @Override // com.google.protobuf.V.e
        public byte f(long j10) {
            return this.f41227a.getByte(j10);
        }

        @Override // com.google.protobuf.V.e
        public byte g(Object obj, long j10) {
            return this.f41227a.getByte(obj, j10);
        }

        @Override // com.google.protobuf.V.e
        public double h(Object obj, long j10) {
            return this.f41227a.getDouble(obj, j10);
        }

        @Override // com.google.protobuf.V.e
        public float i(Object obj, long j10) {
            return this.f41227a.getFloat(obj, j10);
        }

        @Override // com.google.protobuf.V.e
        public long k(long j10) {
            return this.f41227a.getLong(j10);
        }

        @Override // com.google.protobuf.V.e
        public void o(Object obj, long j10, boolean z9) {
            this.f41227a.putBoolean(obj, j10, z9);
        }

        @Override // com.google.protobuf.V.e
        public void p(long j10, byte b10) {
            this.f41227a.putByte(j10, b10);
        }

        @Override // com.google.protobuf.V.e
        public void q(Object obj, long j10, byte b10) {
            this.f41227a.putByte(obj, j10, b10);
        }

        @Override // com.google.protobuf.V.e
        public void r(Object obj, long j10, double d10) {
            this.f41227a.putDouble(obj, j10, d10);
        }

        @Override // com.google.protobuf.V.e
        public void s(Object obj, long j10, float f10) {
            this.f41227a.putFloat(obj, j10, f10);
        }

        @Override // com.google.protobuf.V.e
        public boolean w() {
            if (!super.w()) {
                return false;
            }
            try {
                Class<?> cls = this.f41227a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                V.L(th);
                return false;
            }
        }

        @Override // com.google.protobuf.V.e
        public boolean x() {
            if (!super.x()) {
                return false;
            }
            try {
                Class<?> cls = this.f41227a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                V.L(th);
                return false;
            }
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f41227a;

        e(Unsafe unsafe) {
            this.f41227a = unsafe;
        }

        public final int a(Class cls) {
            return this.f41227a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f41227a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract void d(byte[] bArr, long j10, long j11, long j12);

        public abstract boolean e(Object obj, long j10);

        public abstract byte f(long j10);

        public abstract byte g(Object obj, long j10);

        public abstract double h(Object obj, long j10);

        public abstract float i(Object obj, long j10);

        public final int j(Object obj, long j10) {
            return this.f41227a.getInt(obj, j10);
        }

        public abstract long k(long j10);

        public final long l(Object obj, long j10) {
            return this.f41227a.getLong(obj, j10);
        }

        public final Object m(Object obj, long j10) {
            return this.f41227a.getObject(obj, j10);
        }

        public final long n(java.lang.reflect.Field field) {
            return this.f41227a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j10, boolean z9);

        public abstract void p(long j10, byte b10);

        public abstract void q(Object obj, long j10, byte b10);

        public abstract void r(Object obj, long j10, double d10);

        public abstract void s(Object obj, long j10, float f10);

        public final void t(Object obj, long j10, int i10) {
            this.f41227a.putInt(obj, j10, i10);
        }

        public final void u(Object obj, long j10, long j11) {
            this.f41227a.putLong(obj, j10, j11);
        }

        public final void v(Object obj, long j10, Object obj2) {
            this.f41227a.putObject(obj, j10, obj2);
        }

        public boolean w() {
            Unsafe unsafe = this.f41227a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                V.L(th);
                return false;
            }
        }

        public boolean x() {
            Unsafe unsafe = this.f41227a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return V.o() != null;
            } catch (Throwable th) {
                V.L(th);
                return false;
            }
        }
    }

    static {
        long jM = m(byte[].class);
        f41211h = jM;
        f41212i = m(boolean[].class);
        f41213j = n(boolean[].class);
        f41214k = m(int[].class);
        f41215l = n(int[].class);
        f41216m = m(long[].class);
        f41217n = n(long[].class);
        f41218o = m(float[].class);
        f41219p = n(float[].class);
        f41220q = m(double[].class);
        f41221r = n(double[].class);
        f41222s = m(Object[].class);
        f41223t = n(Object[].class);
        f41224u = t(o());
        f41225v = (int) (jM & 7);
        f41226w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte A(Object obj, long j10) {
        return (byte) ((D(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double B(Object obj, long j10) {
        return f41208e.h(obj, j10);
    }

    static float C(Object obj, long j10) {
        return f41208e.i(obj, j10);
    }

    static int D(Object obj, long j10) {
        return f41208e.j(obj, j10);
    }

    static long E(long j10) {
        return f41208e.k(j10);
    }

    static long F(Object obj, long j10) {
        return f41208e.l(obj, j10);
    }

    private static e G() {
        Unsafe unsafe = f41204a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC6744b.c()) {
            return new d(unsafe);
        }
        if (f41206c) {
            return new c(unsafe);
        }
        if (f41207d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object H(Object obj, long j10) {
        return f41208e.m(obj, j10);
    }

    static Unsafe I() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean J() {
        return f41210g;
    }

    static boolean K() {
        return f41209f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Throwable th) {
        Logger.getLogger(V.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static long M(java.lang.reflect.Field field) {
        return f41208e.n(field);
    }

    static void N(Object obj, long j10, boolean z9) {
        f41208e.o(obj, j10, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O(Object obj, long j10, boolean z9) {
        S(obj, j10, z9 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(Object obj, long j10, boolean z9) {
        T(obj, j10, z9 ? (byte) 1 : (byte) 0);
    }

    static void Q(long j10, byte b10) {
        f41208e.p(j10, b10);
    }

    static void R(byte[] bArr, long j10, byte b10) {
        f41208e.q(bArr, f41211h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iD = D(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        W(obj, j11, ((255 & b10) << i10) | (iD & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void T(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        W(obj, j11, ((255 & b10) << i10) | (D(obj, j11) & (~(255 << i10))));
    }

    static void U(Object obj, long j10, double d10) {
        f41208e.r(obj, j10, d10);
    }

    static void V(Object obj, long j10, float f10) {
        f41208e.s(obj, j10, f10);
    }

    static void W(Object obj, long j10, int i10) {
        f41208e.t(obj, j10, i10);
    }

    static void X(Object obj, long j10, long j11) {
        f41208e.u(obj, j10, j11);
    }

    static void Y(Object obj, long j10, Object obj2) {
        f41208e.v(obj, j10, obj2);
    }

    private static boolean Z() {
        e eVar = f41208e;
        if (eVar == null) {
            return false;
        }
        return eVar.w();
    }

    private static boolean a0() {
        e eVar = f41208e;
        if (eVar == null) {
            return false;
        }
        return eVar.x();
    }

    static long k(ByteBuffer byteBuffer) {
        return f41208e.l(byteBuffer, f41224u);
    }

    static Object l(Class cls) {
        try {
            return f41204a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int m(Class cls) {
        if (f41210g) {
            return f41208e.a(cls);
        }
        return -1;
    }

    private static int n(Class cls) {
        if (f41210g) {
            return f41208e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field o() {
        java.lang.reflect.Field fieldS;
        if (AbstractC6744b.c() && (fieldS = s(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldS;
        }
        java.lang.reflect.Field fieldS2 = s(Buffer.class, "address");
        if (fieldS2 == null || fieldS2.getType() != Long.TYPE) {
            return null;
        }
        return fieldS2;
    }

    static void p(long j10, byte[] bArr, long j11, long j12) {
        f41208e.c(j10, bArr, j11, j12);
    }

    static void q(byte[] bArr, long j10, long j11, long j12) {
        f41208e.d(bArr, j10, j11, j12);
    }

    static boolean r(Class cls) {
        if (!AbstractC6744b.c()) {
            return false;
        }
        try {
            Class cls2 = f41205b;
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

    private static java.lang.reflect.Field s(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long t(java.lang.reflect.Field field) {
        e eVar;
        if (field == null || (eVar = f41208e) == null) {
            return -1L;
        }
        return eVar.n(field);
    }

    static boolean u(Object obj, long j10) {
        return f41208e.e(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(Object obj, long j10) {
        return z(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w(Object obj, long j10) {
        return A(obj, j10) != 0;
    }

    static byte x(long j10) {
        return f41208e.f(j10);
    }

    static byte y(byte[] bArr, long j10) {
        return f41208e.g(bArr, f41211h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte z(Object obj, long j10) {
        return (byte) ((D(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }
}

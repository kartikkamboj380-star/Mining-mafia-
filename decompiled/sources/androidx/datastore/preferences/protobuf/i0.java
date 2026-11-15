package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f9523a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f9524b = AbstractC1108d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f9525c = m(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f9526d = m(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f9527e = y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f9528f = Q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f9529g = P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f9530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f9531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f9532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f9533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f9534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f9535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f9536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f9537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f9538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f9539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f9540r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f9541s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f9542t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f9543u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f9544v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f9545w;

    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
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

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean c(Object obj, long j10) {
            return i0.f9545w ? i0.q(obj, j10) : i0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void j(Object obj, long j10, boolean z9) {
            if (i0.f9545w) {
                i0.F(obj, j10, z9);
            } else {
                i0.G(obj, j10, z9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void k(Object obj, long j10, byte b10) {
            if (i0.f9545w) {
                i0.I(obj, j10, b10);
            } else {
                i0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean r() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean c(Object obj, long j10) {
            return i0.f9545w ? i0.q(obj, j10) : i0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void j(Object obj, long j10, boolean z9) {
            if (i0.f9545w) {
                i0.F(obj, j10, z9);
            } else {
                i0.G(obj, j10, z9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void k(Object obj, long j10, byte b10) {
            if (i0.f9545w) {
                i0.I(obj, j10, b10);
            } else {
                i0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean r() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean c(Object obj, long j10) {
            return this.f9546a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public double d(Object obj, long j10) {
            return this.f9546a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public float e(Object obj, long j10) {
            return this.f9546a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void j(Object obj, long j10, boolean z9) {
            this.f9546a.putBoolean(obj, j10, z9);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void k(Object obj, long j10, byte b10) {
            this.f9546a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void l(Object obj, long j10, double d10) {
            this.f9546a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void m(Object obj, long j10, float f10) {
            this.f9546a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f9546a.getClass();
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
                i0.D(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f9546a.getClass();
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
                i0.D(th);
                return false;
            }
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f9546a;

        e(Unsafe unsafe) {
            this.f9546a = unsafe;
        }

        public final int a(Class cls) {
            return this.f9546a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f9546a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract double d(Object obj, long j10);

        public abstract float e(Object obj, long j10);

        public final int f(Object obj, long j10) {
            return this.f9546a.getInt(obj, j10);
        }

        public final long g(Object obj, long j10) {
            return this.f9546a.getLong(obj, j10);
        }

        public final Object h(Object obj, long j10) {
            return this.f9546a.getObject(obj, j10);
        }

        public final long i(Field field) {
            return this.f9546a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j10, boolean z9);

        public abstract void k(Object obj, long j10, byte b10);

        public abstract void l(Object obj, long j10, double d10);

        public abstract void m(Object obj, long j10, float f10);

        public final void n(Object obj, long j10, int i10) {
            this.f9546a.putInt(obj, j10, i10);
        }

        public final void o(Object obj, long j10, long j11) {
            this.f9546a.putLong(obj, j10, j11);
        }

        public final void p(Object obj, long j10, Object obj2) {
            this.f9546a.putObject(obj, j10, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f9546a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
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
                i0.D(th);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f9546a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return i0.l() != null;
            } catch (Throwable th) {
                i0.D(th);
                return false;
            }
        }
    }

    static {
        long j10 = j(byte[].class);
        f9530h = j10;
        f9531i = j(boolean[].class);
        f9532j = k(boolean[].class);
        f9533k = j(int[].class);
        f9534l = k(int[].class);
        f9535m = j(long[].class);
        f9536n = k(long[].class);
        f9537o = j(float[].class);
        f9538p = k(float[].class);
        f9539q = j(double[].class);
        f9540r = k(double[].class);
        f9541s = j(Object[].class);
        f9542t = k(Object[].class);
        f9543u = o(l());
        f9544v = (int) (j10 & 7);
        f9545w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean B() {
        return f9529g;
    }

    static boolean C() {
        return f9528f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Throwable th) {
        Logger.getLogger(i0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void E(Object obj, long j10, boolean z9) {
        f9527e.j(obj, j10, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z9) {
        I(obj, j10, z9 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z9) {
        J(obj, j10, z9 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f9527e.k(bArr, f9530h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iW = w(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (iW & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w(obj, j11) & (~(255 << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f9527e.l(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f9527e.m(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f9527e.n(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f9527e.o(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f9527e.p(obj, j10, obj2);
    }

    private static boolean P() {
        e eVar = f9527e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f9527e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static Object i(Class cls) {
        try {
            return f9523a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class cls) {
        if (f9529g) {
            return f9527e.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (f9529g) {
            return f9527e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field fieldN;
        if (AbstractC1108d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    static boolean m(Class cls) {
        if (!AbstractC1108d.c()) {
            return false;
        }
        try {
            Class cls2 = f9524b;
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

    private static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f9527e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j10) {
        return f9527e.c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        return s(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    private static byte s(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    private static byte t(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double u(Object obj, long j10) {
        return f9527e.d(obj, j10);
    }

    static float v(Object obj, long j10) {
        return f9527e.e(obj, j10);
    }

    static int w(Object obj, long j10) {
        return f9527e.f(obj, j10);
    }

    static long x(Object obj, long j10) {
        return f9527e.g(obj, j10);
    }

    private static e y() {
        Unsafe unsafe = f9523a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC1108d.c()) {
            return new d(unsafe);
        }
        if (f9525c) {
            return new c(unsafe);
        }
        if (f9526d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j10) {
        return f9527e.h(obj, j10);
    }
}

package D2;

import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f423f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[][] f431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f437t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0016a f419b = new C0016a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f424g = f.a("GIF87a");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f425h = f.a("GIF89a");

    /* JADX INFO: renamed from: D2.a$a, reason: collision with other inner class name */
    public static final class C0016a {
        public /* synthetic */ C0016a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int k(byte[] bArr) {
            if (bArr.length < 4) {
                return -1;
            }
            return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c l(byte[] bArr, int i10) {
            if (!p073h2.b.h(bArr, 0, i10)) {
                throw new IllegalStateException("Check failed.");
            }
            if (p073h2.b.g(bArr, 0)) {
                return b.f445g;
            }
            if (p073h2.b.f(bArr, 0)) {
                return b.f446h;
            }
            if (!p073h2.b.c(bArr, 0, i10)) {
                return c.f456d;
            }
            if (p073h2.b.b(bArr, 0)) {
                return b.f449k;
            }
            return p073h2.b.d(bArr, 0) ? b.f448j : b.f447i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(byte[] bArr, int i10) {
            if (i10 >= 12 && k(bArr) >= 8 && f.b(bArr, a.f436s, 4)) {
                return f.b(bArr, a.f437t, 8);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean n(byte[] bArr, int i10) {
            return i10 >= 4 && f.c(bArr, a.f435r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean o(byte[] bArr, int i10) {
            if (i10 < a.f426i.length) {
                return false;
            }
            return f.c(bArr, a.f426i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean p(byte[] bArr, int i10) {
            if (i10 >= a.f434q) {
                return f.c(bArr, a.f432o) || f.c(bArr, a.f433p);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean q(byte[] bArr, int i10) {
            if (i10 < 6) {
                return false;
            }
            return f.c(bArr, a.f424g) || f.c(bArr, a.f425h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r(byte[] bArr, int i10) {
            if (i10 < 12 || bArr[3] < 8 || !f.b(bArr, a.f430m, 4)) {
                return false;
            }
            for (byte[] bArr2 : a.f431n) {
                if (f.b(bArr, bArr2, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean s(byte[] bArr, int i10) {
            if (i10 < a.f428k.length) {
                return false;
            }
            return f.c(bArr, a.f428k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean t(byte[] bArr, int i10) {
            return i10 >= a.f420c.length && f.c(bArr, a.f420c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean u(byte[] bArr, int i10) {
            return i10 >= a.f422e.length && f.c(bArr, a.f422e);
        }

        private C0016a() {
        }
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f420c = bArr;
        f421d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f422e = bArr2;
        f423f = bArr2.length;
        byte[] bArrA = f.a("BM");
        f426i = bArrA;
        f427j = bArrA.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f428k = bArr3;
        f429l = bArr3.length;
        f430m = f.a("ftyp");
        f431n = new byte[][]{f.a("heic"), f.a("heix"), f.a("hevc"), f.a("hevx"), f.a("mif1"), f.a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f432o = bArr4;
        f433p = new byte[]{77, 77, 0, 42};
        f434q = bArr4.length;
        f435r = new byte[]{3, 0, 8, 0};
        f436s = f.a("ftyp");
        f437t = f.a("avif");
    }

    public a() {
        Object objQ = AbstractC7024j.Q(new Integer[]{21, 20, Integer.valueOf(f421d), Integer.valueOf(f423f), 6, Integer.valueOf(f427j), Integer.valueOf(f429l), 12, 4, 12});
        if (objQ == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f438a = ((Number) objQ).intValue();
    }

    @Override // D2.c.b
    public c a(byte[] headerBytes, int i10) {
        Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
        if (p073h2.b.h(headerBytes, 0, i10)) {
            return f419b.l(headerBytes, i10);
        }
        C0016a c0016a = f419b;
        if (c0016a.t(headerBytes, i10)) {
            return b.f440b;
        }
        if (c0016a.u(headerBytes, i10)) {
            return b.f441c;
        }
        if (c0016a.q(headerBytes, i10)) {
            return b.f442d;
        }
        if (c0016a.o(headerBytes, i10)) {
            return b.f443e;
        }
        if (c0016a.s(headerBytes, i10)) {
            return b.f444f;
        }
        if (c0016a.m(headerBytes, i10)) {
            return b.f453o;
        }
        if (c0016a.r(headerBytes, i10)) {
            return b.f450l;
        }
        if (c0016a.n(headerBytes, i10)) {
            return b.f452n;
        }
        return c0016a.p(headerBytes, i10) ? b.f451m : c.f456d;
    }

    @Override // D2.c.b
    public int b() {
        return this.f438a;
    }
}

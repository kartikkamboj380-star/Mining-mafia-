package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f46051b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f46052c = k(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f46053d = c.i(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f46054e = c.i(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f46055a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f46053d;
        }

        public final long b() {
            return b.f46054e;
        }

        public final long c() {
            return b.f46052c;
        }

        private a() {
        }
    }

    private /* synthetic */ b(long j10) {
        this.f46055a = j10;
    }

    public static final boolean A(long j10) {
        return !D(j10);
    }

    private static final boolean B(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean C(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean D(long j10) {
        return j10 == f46053d || j10 == f46054e;
    }

    public static final boolean E(long j10) {
        return j10 < 0;
    }

    public static final boolean F(long j10) {
        return j10 > 0;
    }

    public static final long G(long j10, long j11) {
        return H(j10, L(j11));
    }

    public static final long H(long j10, long j11) {
        if (D(j10)) {
            if (A(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (D(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return B(j10) ? f(j10, y(j10), y(j11)) : f(j10, y(j11), y(j10));
        }
        long jY = y(j10) + y(j11);
        return C(j10) ? c.l(jY) : c.j(jY);
    }

    public static final double I(long j10, H8.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f46053d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f46054e) {
            return Double.NEGATIVE_INFINITY;
        }
        return d.a(y(j10), x(j10), unit);
    }

    public static final long J(long j10, H8.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f46053d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f46054e) {
            return Long.MIN_VALUE;
        }
        return d.b(y(j10), x(j10), unit);
    }

    public static String K(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f46053d) {
            return "Infinity";
        }
        if (j10 == f46054e) {
            return "-Infinity";
        }
        boolean zE = E(j10);
        StringBuilder sb = new StringBuilder();
        if (zE) {
            sb.append('-');
        }
        long jN = n(j10);
        long jP = p(jN);
        int iO = o(jN);
        int iU = u(jN);
        int iW = w(jN);
        int iV = v(jN);
        int i10 = 0;
        boolean z9 = jP != 0;
        boolean z10 = iO != 0;
        boolean z11 = iU != 0;
        boolean z12 = (iW == 0 && iV == 0) ? false : true;
        if (z9) {
            sb.append(jP);
            sb.append('d');
            i10 = 1;
        }
        if (z10 || (z9 && (z11 || z12))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iO);
            sb.append('h');
            i10 = i11;
        }
        if (z11 || (z12 && (z10 || z9))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iU);
            sb.append('m');
            i10 = i12;
        }
        if (z12) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            if (iW != 0 || z9 || z10 || z11) {
                g(j10, sb, iW, iV, 9, "s", false);
            } else if (iV >= 1000000) {
                g(j10, sb, iV / 1000000, iV % 1000000, 6, "ms", false);
            } else if (iV >= 1000) {
                g(j10, sb, iV / 1000, iV % 1000, 3, "us", false);
            } else {
                sb.append(iV);
                sb.append("ns");
            }
            i10 = i13;
        }
        if (zE && i10 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long L(long j10) {
        return c.h(-y(j10), ((int) j10) & 1);
    }

    private static final long f(long j10, long j11, long j12) {
        long jN = c.n(j12);
        long j13 = j11 + jN;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return c.i(kotlin.ranges.b.k(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return c.k(c.m(j13) + (j12 - c.m(jN)));
    }

    private static final void g(long j10, StringBuilder sb, int i10, int i11, int i12, String str, boolean z9) {
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String strK0 = StringsKt.k0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strK0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strK0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z9 || i15 >= 3) {
                sb.append((CharSequence) strK0, 0, ((i13 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strK0, 0, i15);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ b h(long j10) {
        return new b(j10);
    }

    public static int j(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return Intrinsics.f(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return E(j10) ? -i10 : i10;
    }

    public static long k(long j10) {
        if (!H8.a.a()) {
            return j10;
        }
        if (C(j10)) {
            long jY = y(j10);
            if (-4611686018426999999L <= jY && jY < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(y(j10) + " ns is out of nanoseconds range");
        }
        long jY2 = y(j10);
        if (-4611686018427387903L > jY2 || jY2 >= 4611686018427387904L) {
            throw new AssertionError(y(j10) + " ms is out of milliseconds range");
        }
        long jY3 = y(j10);
        if (-4611686018426L > jY3 || jY3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(y(j10) + " ms is denormalized");
    }

    public static boolean l(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).M();
    }

    public static final boolean m(long j10, long j11) {
        return j10 == j11;
    }

    public static final long n(long j10) {
        return E(j10) ? L(j10) : j10;
    }

    public static final int o(long j10) {
        if (D(j10)) {
            return 0;
        }
        return (int) (q(j10) % ((long) 24));
    }

    public static final long p(long j10) {
        return J(j10, H8.b.DAYS);
    }

    public static final long q(long j10) {
        return J(j10, H8.b.HOURS);
    }

    public static final long r(long j10) {
        return (B(j10) && A(j10)) ? y(j10) : J(j10, H8.b.MILLISECONDS);
    }

    public static final long s(long j10) {
        return J(j10, H8.b.MINUTES);
    }

    public static final long t(long j10) {
        return J(j10, H8.b.SECONDS);
    }

    public static final int u(long j10) {
        if (D(j10)) {
            return 0;
        }
        return (int) (s(j10) % ((long) 60));
    }

    public static final int v(long j10) {
        if (D(j10)) {
            return 0;
        }
        return (int) (B(j10) ? c.m(y(j10) % ((long) 1000)) : y(j10) % ((long) 1000000000));
    }

    public static final int w(long j10) {
        if (D(j10)) {
            return 0;
        }
        return (int) (t(j10) % ((long) 60));
    }

    private static final H8.b x(long j10) {
        return C(j10) ? H8.b.NANOSECONDS : H8.b.MILLISECONDS;
    }

    private static final long y(long j10) {
        return j10 >> 1;
    }

    public static int z(long j10) {
        return Long.hashCode(j10);
    }

    public final /* synthetic */ long M() {
        return this.f46055a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return i(((b) obj).M());
    }

    public boolean equals(Object obj) {
        return l(this.f46055a, obj);
    }

    public int hashCode() {
        return z(this.f46055a);
    }

    public int i(long j10) {
        return j(this.f46055a, j10);
    }

    public String toString() {
        return K(this.f46055a);
    }
}

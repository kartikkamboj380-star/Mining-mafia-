package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements H8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f46059a = new h();

    public static final class a implements kotlin.time.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f46060a;

        private /* synthetic */ a(long j10) {
            this.f46060a = j10;
        }

        public static final /* synthetic */ a d(long j10) {
            return new a(j10);
        }

        public static long f(long j10) {
            return j10;
        }

        public static long g(long j10) {
            return g.f46057a.c(j10);
        }

        public static boolean h(long j10, Object obj) {
            return (obj instanceof a) && j10 == ((a) obj).m();
        }

        public static int i(long j10) {
            return Long.hashCode(j10);
        }

        public static final long j(long j10, long j11) {
            return g.f46057a.b(j10, j11);
        }

        public static long k(long j10, kotlin.time.a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof a) {
                return j(j10, ((a) other).m());
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) l(j10)) + " and " + other);
        }

        public static String l(long j10) {
            return "ValueTimeMark(reading=" + j10 + ')';
        }

        @Override // kotlin.time.a
        public long a(kotlin.time.a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return k(this.f46060a, other);
        }

        @Override // kotlin.time.TimeMark
        public long c() {
            return g(this.f46060a);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(kotlin.time.a aVar) {
            return kotlin.time.a.C0465a.a(this, aVar);
        }

        public boolean equals(Object obj) {
            return h(this.f46060a, obj);
        }

        public int hashCode() {
            return i(this.f46060a);
        }

        public final /* synthetic */ long m() {
            return this.f46060a;
        }

        public String toString() {
            return l(this.f46060a);
        }
    }

    private h() {
    }

    @Override // H8.c
    public /* bridge */ /* synthetic */ kotlin.time.a a() {
        return a.d(b());
    }

    public long b() {
        return g.f46057a.d();
    }

    public String toString() {
        return g.f46057a.toString();
    }
}

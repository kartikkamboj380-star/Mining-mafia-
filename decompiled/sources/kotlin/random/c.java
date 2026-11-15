package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f45991a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f45992b = p199t8.b.f49744a.b();

    public static final class a extends c implements Serializable {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // kotlin.random.c
        public int b(int i10) {
            return c.f45992b.b(i10);
        }

        @Override // kotlin.random.c
        public int c() {
            return c.f45992b.c();
        }

        @Override // kotlin.random.c
        public int d(int i10) {
            return c.f45992b.d(i10);
        }

        @Override // kotlin.random.c
        public int e(int i10, int i11) {
            return c.f45992b.e(i10, i11);
        }

        @Override // kotlin.random.c
        public long f() {
            return c.f45992b.f();
        }

        @Override // kotlin.random.c
        public long g(long j10, long j11) {
            return c.f45992b.g(j10, j11);
        }

        private a() {
        }
    }

    public abstract int b(int i10);

    public int c() {
        return b(32);
    }

    public int d(int i10) {
        return e(0, i10);
    }

    public int e(int i10, int i11) {
        int iC;
        int i12;
        int iB;
        d.b(i10, i11);
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iB = b(d.d(i13));
            } else {
                do {
                    iC = c() >>> 1;
                    i12 = iC % i13;
                } while ((iC - i12) + (i13 - 1) < 0);
                iB = i12;
            }
            return i10 + iB;
        }
        while (true) {
            int iC2 = c();
            if (i10 <= iC2 && iC2 < i11) {
                return iC2;
            }
        }
    }

    public long f() {
        return (((long) c()) << 32) + ((long) c());
    }

    public long g(long j10, long j11) {
        long jF;
        long j12;
        long jB;
        int iC;
        d.c(j10, j11);
        long j13 = j11 - j10;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i10 = (int) j13;
                int i11 = (int) (j13 >>> 32);
                if (i10 != 0) {
                    iC = b(d.d(i10));
                } else if (i11 == 1) {
                    iC = c();
                } else {
                    jB = (((long) b(d.d(i11))) << 32) + (((long) c()) & 4294967295L);
                }
                jB = ((long) iC) & 4294967295L;
            } else {
                do {
                    jF = f() >>> 1;
                    j12 = jF % j13;
                } while ((jF - j12) + (j13 - 1) < 0);
                jB = j12;
            }
            return j10 + jB;
        }
        while (true) {
            long jF2 = f();
            if (j10 <= jF2 && jF2 < j11) {
                return jF2;
            }
        }
    }
}

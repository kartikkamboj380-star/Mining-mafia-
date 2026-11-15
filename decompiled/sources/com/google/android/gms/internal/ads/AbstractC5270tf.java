package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5270tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC5270tf f33438a = new C2231Pd();

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    protected AbstractC5270tf() {
    }

    public abstract int a();

    public abstract C2337Re b(int i10, C2337Re c2337Re, long j10);

    public abstract int c();

    public abstract C4891qe d(int i10, C4891qe c4891qe, boolean z9);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int iJ;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5270tf)) {
            return false;
        }
        AbstractC5270tf abstractC5270tf = (AbstractC5270tf) obj;
        if (abstractC5270tf.a() == a() && abstractC5270tf.c() == c()) {
            C2337Re c2337Re = new C2337Re();
            C4891qe c4891qe = new C4891qe();
            C2337Re c2337Re2 = new C2337Re();
            C4891qe c4891qe2 = new C4891qe();
            for (int i10 = 0; i10 < a(); i10++) {
                if (!b(i10, c2337Re, 0L).equals(abstractC5270tf.b(i10, c2337Re2, 0L))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < c(); i11++) {
                if (!d(i11, c4891qe, true).equals(abstractC5270tf.d(i11, c4891qe2, true))) {
                    return false;
                }
            }
            int iK = k(true);
            if (iK == abstractC5270tf.k(true) && (iJ = j(true)) == abstractC5270tf.j(true)) {
                while (iK != iJ) {
                    int iH = h(iK, 0, true);
                    if (iH != abstractC5270tf.h(iK, 0, true)) {
                        return false;
                    }
                    iK = iH;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i10);

    public final boolean g() {
        return a() == 0;
    }

    public int h(int i10, int i11, boolean z9) {
        if (i11 == 0) {
            if (i10 == j(z9)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == j(z9) ? k(z9) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i10;
        C2337Re c2337Re = new C2337Re();
        C4891qe c4891qe = new C4891qe();
        int iA = a() + 217;
        int i11 = 0;
        while (true) {
            i10 = iA * 31;
            if (i11 >= a()) {
                break;
            }
            iA = i10 + b(i11, c2337Re, 0L).hashCode();
            i11++;
        }
        int iC = i10 + c();
        for (int i12 = 0; i12 < c(); i12++) {
            iC = (iC * 31) + d(i12, c4891qe, true).hashCode();
        }
        int iK = k(true);
        while (iK != -1) {
            iC = (iC * 31) + iK;
            iK = h(iK, 0, true);
        }
        return iC;
    }

    public int i(int i10, int i11, boolean z9) {
        if (i10 == k(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public int j(boolean z9) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z9) {
        return g() ? -1 : 0;
    }

    public final int l(int i10, C4891qe c4891qe, C2337Re c2337Re, int i11, boolean z9) {
        int i12 = d(i10, c4891qe, false).f32697c;
        if (b(i12, c2337Re, 0L).f22880n != i10) {
            return i10 + 1;
        }
        int iH = h(i12, i11, z9);
        if (iH == -1) {
            return -1;
        }
        return b(iH, c2337Re, 0L).f22879m;
    }

    public final Pair m(C2337Re c2337Re, C4891qe c4891qe, int i10, long j10) {
        Pair pairN = n(c2337Re, c4891qe, i10, j10, 0L);
        pairN.getClass();
        return pairN;
    }

    public final Pair n(C2337Re c2337Re, C4891qe c4891qe, int i10, long j10, long j11) {
        AbstractC2418Ss0.m(i10, a(), "index");
        b(i10, c2337Re, j11);
        if (j10 == -9223372036854775807L) {
            long j12 = c2337Re.f22877k;
            j10 = 0;
        }
        int i11 = c2337Re.f22879m;
        d(i11, c4891qe, false);
        while (i11 < c2337Re.f22880n) {
            long j13 = c4891qe.f32699e;
            if (j10 == 0) {
                break;
            }
            int i12 = i11 + 1;
            long j14 = d(i12, c4891qe, false).f32699e;
            if (j10 < 0) {
                break;
            }
            i11 = i12;
        }
        d(i11, c4891qe, true);
        long j15 = c4891qe.f32699e;
        long j16 = c4891qe.f32698d;
        if (j16 != -9223372036854775807L) {
            j10 = Math.min(j10, j16 - 1);
        }
        long jMax = Math.max(0L, j10);
        Object obj = c4891qe.f32696b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public C4891qe o(Object obj, C4891qe c4891qe) {
        return d(e(obj), c4891qe, true);
    }
}

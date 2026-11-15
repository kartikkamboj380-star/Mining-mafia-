package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class YO0 extends AbstractC5270tf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5189t01 f25602c;

    public YO0(boolean z9, C5189t01 c5189t01) {
        this.f25602c = c5189t01;
        this.f25601b = c5189t01.a();
    }

    private final int w(int i10, boolean z9) {
        if (z9) {
            return this.f25602c.b(i10);
        }
        if (i10 >= this.f25601b - 1) {
            return -1;
        }
        return i10 + 1;
    }

    private final int x(int i10, boolean z9) {
        if (z9) {
            return this.f25602c.c(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final C2337Re b(int i10, C2337Re c2337Re, long j10) {
        int iQ = q(i10);
        int iU = u(iQ);
        int iT = t(iQ);
        s(iQ).b(i10 - iU, c2337Re, j10);
        Object objV = v(iQ);
        if (!C2337Re.f22865o.equals(c2337Re.f22867a)) {
            objV = Pair.create(objV, c2337Re.f22867a);
        }
        c2337Re.f22867a = objV;
        c2337Re.f22879m += iT;
        c2337Re.f22880n += iT;
        return c2337Re;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final C4891qe d(int i10, C4891qe c4891qe, boolean z9) {
        int iP = p(i10);
        int iU = u(iP);
        s(iP).d(i10 - t(iP), c4891qe, z9);
        c4891qe.f32697c += iU;
        if (z9) {
            Object objV = v(iP);
            Object obj = c4891qe.f32696b;
            obj.getClass();
            c4891qe.f32696b = Pair.create(objV, obj);
        }
        return c4891qe;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int e(Object obj) {
        int iE;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iR = r(obj2);
            if (iR != -1 && (iE = s(iR).e(obj3)) != -1) {
                return t(iR) + iE;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final Object f(int i10) {
        int iP = p(i10);
        return Pair.create(v(iP), s(iP).f(i10 - t(iP)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int h(int i10, int i11, boolean z9) {
        int iQ = q(i10);
        int iU = u(iQ);
        int iH = s(iQ).h(i10 - iU, i11 == 2 ? 0 : i11, z9);
        if (iH != -1) {
            return iU + iH;
        }
        int iW = w(iQ, z9);
        while (iW != -1 && s(iW).g()) {
            iW = w(iW, z9);
        }
        if (iW != -1) {
            return u(iW) + s(iW).k(z9);
        }
        if (i11 == 2) {
            return k(z9);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int i(int i10, int i11, boolean z9) {
        int iQ = q(i10);
        int iU = u(iQ);
        int i12 = s(iQ).i(i10 - iU, 0, false);
        if (i12 != -1) {
            return iU + i12;
        }
        int iX = x(iQ, false);
        while (iX != -1 && s(iX).g()) {
            iX = x(iX, false);
        }
        if (iX != -1) {
            return u(iX) + s(iX).j(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int j(boolean z9) {
        int i10 = this.f25601b;
        if (i10 != 0) {
            int iD = z9 ? this.f25602c.d() : i10 - 1;
            while (s(iD).g()) {
                iD = x(iD, z9);
                if (iD == -1) {
                }
            }
            return u(iD) + s(iD).j(z9);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int k(boolean z9) {
        if (this.f25601b != 0) {
            int iE = z9 ? this.f25602c.e() : 0;
            while (s(iE).g()) {
                iE = w(iE, z9);
                if (iE == -1) {
                }
            }
            return u(iE) + s(iE).k(z9);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final C4891qe o(Object obj, C4891qe c4891qe) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iR = r(obj2);
        int iU = u(iR);
        s(iR).o(obj3, c4891qe);
        c4891qe.f32697c += iU;
        c4891qe.f32696b = obj;
        return c4891qe;
    }

    protected abstract int p(int i10);

    protected abstract int q(int i10);

    protected abstract int r(Object obj);

    protected abstract AbstractC5270tf s(int i10);

    protected abstract int t(int i10);

    protected abstract int u(int i10);

    protected abstract Object v(int i10);
}

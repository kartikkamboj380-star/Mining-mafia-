package com.google.android.material.carousel;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f38923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f38924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38926d;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f38927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f38928b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f38930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f38931e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f38929c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f38932f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f38933g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f38934h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f38935i = -1;

        b(float f10, float f11) {
            this.f38927a = f10;
            this.f38928b = f11;
        }

        private static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        b c(float f10, float f11, float f12, boolean z9) {
            return d(f10, f11, f12, z9, false);
        }

        b d(float f10, float f11, float f12, boolean z9, boolean z10) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.f38928b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f14 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
            }
            return e(f10, f11, f12, z9, z10, fAbs);
        }

        b e(float f10, float f11, float f12, boolean z9, boolean z10, float f13) {
            return f(f10, f11, f12, z9, z10, f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        b f(float f10, float f11, float f12, boolean z9, boolean z10, float f13, float f14, float f15) {
            if (f12 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return this;
            }
            if (z10) {
                if (z9) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f38935i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f38935i = this.f38929c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z10, f13, f14, f15);
            if (z9) {
                if (this.f38930d == null) {
                    this.f38930d = cVar;
                    this.f38932f = this.f38929c.size();
                }
                if (this.f38933g != -1 && this.f38929c.size() - this.f38933g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f38930d.f38939d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f38931e = cVar;
                this.f38933g = this.f38929c.size();
            } else {
                if (this.f38930d == null && cVar.f38939d < this.f38934h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f38931e != null && cVar.f38939d > this.f38934h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f38934h = cVar.f38939d;
            this.f38929c.add(cVar);
            return this;
        }

        b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        b h(float f10, float f11, float f12, int i10, boolean z9) {
            if (i10 > 0 && f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z9);
                }
            }
            return this;
        }

        f i() {
            if (this.f38930d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f38929c.size(); i10++) {
                c cVar = (c) this.f38929c.get(i10);
                arrayList.add(new c(j(this.f38930d.f38937b, this.f38927a, this.f38932f, i10), cVar.f38937b, cVar.f38938c, cVar.f38939d, cVar.f38940e, cVar.f38941f, cVar.f38942g, cVar.f38943h));
            }
            return new f(this.f38927a, arrayList, this.f38932f, this.f38933g);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f38936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f38937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f38938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f38939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f38940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f38941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f38942g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f38943h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(p196t5.a.a(cVar.f38936a, cVar2.f38936a, f10), p196t5.a.a(cVar.f38937b, cVar2.f38937b, f10), p196t5.a.a(cVar.f38938c, cVar2.f38938c, f10), p196t5.a.a(cVar.f38939d, cVar2.f38939d, f10));
        }

        c(float f10, float f11, float f12, float f13, boolean z9, float f14, float f15, float f16) {
            this.f38936a = f10;
            this.f38937b = f11;
            this.f38938c = f12;
            this.f38939d = f13;
            this.f38940e = z9;
            this.f38941f = f14;
            this.f38942g = f15;
            this.f38943h = f16;
        }
    }

    static f m(f fVar, f fVar2, float f10) {
        if (fVar.f() != fVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listG = fVar.g();
        List listG2 = fVar2.g();
        if (listG.size() != listG2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < fVar.g().size(); i10++) {
            arrayList.add(c.a((c) listG.get(i10), (c) listG2.get(i10), f10));
        }
        return new f(fVar.f(), arrayList, p196t5.a.c(fVar.b(), fVar2.b(), f10), p196t5.a.c(fVar.i(), fVar2.i(), f10));
    }

    static f n(f fVar, float f10) {
        b bVar = new b(fVar.f(), f10);
        float f11 = (f10 - fVar.j().f38937b) - (fVar.j().f38939d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = (c) fVar.g().get(size);
            bVar.d((cVar.f38939d / 2.0f) + f11, cVar.f38938c, cVar.f38939d, size >= fVar.b() && size <= fVar.i(), cVar.f38940e);
            f11 += cVar.f38939d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return (c) this.f38924b.get(this.f38925c);
    }

    int b() {
        return this.f38925c;
    }

    c c() {
        return (c) this.f38924b.get(0);
    }

    c d() {
        for (int i10 = 0; i10 < this.f38924b.size(); i10++) {
            c cVar = (c) this.f38924b.get(i10);
            if (!cVar.f38940e) {
                return cVar;
            }
        }
        return null;
    }

    List e() {
        return this.f38924b.subList(this.f38925c, this.f38926d + 1);
    }

    float f() {
        return this.f38923a;
    }

    List g() {
        return this.f38924b;
    }

    c h() {
        return (c) this.f38924b.get(this.f38926d);
    }

    int i() {
        return this.f38926d;
    }

    c j() {
        List list = this.f38924b;
        return (c) list.get(list.size() - 1);
    }

    c k() {
        for (int size = this.f38924b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f38924b.get(size);
            if (!cVar.f38940e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator it = this.f38924b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f38940e) {
                i10++;
            }
        }
        return this.f38924b.size() - i10;
    }

    private f(float f10, List list, int i10, int i11) {
        this.f38923a = f10;
        this.f38924b = Collections.unmodifiableList(list);
        this.f38925c = i10;
        this.f38926d = i11;
    }
}

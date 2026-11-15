package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1837Hn0 extends AbstractC1681En0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f19394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC2718Ym0 f19395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final DisplayMetrics f19396h;

    C1837Hn0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, Map map, DisplayMetrics displayMetrics, C5043rr0 c5043rr0) {
        super("HAMf3XP8KIibPGIFc5yJF+oNVlSUbFLkUHSZdrZ2Dhl4Bh9ge4/6z6Usrb+mfprj", "vYv0JfNJ2rw4TIvbzqBhbKW0tXWLxxqXfI+gpZUSK1Y=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(123));
        this.f19395g = interfaceC2718Ym0;
        this.f19394f = map;
        this.f19396h = displayMetrics;
    }

    private static long b(double d10, DisplayMetrics displayMetrics) {
        return Math.round(d10 / ((double) displayMetrics.density));
    }

    private static boolean c(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) {
        Object[] objArr;
        Map map = this.f19394f;
        MotionEvent motionEvent = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.f19396h;
        Object[] objArr2 = (Object[]) method.invoke("", motionEvent, displayMetrics);
        objArr2.getClass();
        C3753hb c3753hbD0 = C3879ib.d0();
        Object obj = objArr2[0];
        if (obj != null && objArr2[1] != null) {
            c3753hbD0.A(((Long) obj).longValue());
            c3753hbD0.B(((Long) objArr2[1]).longValue());
        }
        Object obj2 = objArr2[2];
        if (obj2 != null) {
            c3753hbD0.H(((Long) obj2).longValue());
        }
        Object obj3 = objArr2[3];
        if (obj3 != null) {
            c3753hbD0.F(((Long) obj3).longValue());
        }
        Object obj4 = objArr2[4];
        if (obj4 != null) {
            c3753hbD0.C(((Long) obj4).longValue());
        }
        Object obj5 = objArr2[5];
        if (obj5 != null) {
            c3753hbD0.X(((Long) obj5).longValue() != 0 ? 2 : 1);
        }
        Object obj6 = objArr2[6];
        if (obj6 != null) {
            c3753hbD0.K(((Long) obj6).longValue());
        }
        Object obj7 = objArr2[7];
        if (obj7 != null) {
            c3753hbD0.I(((Long) obj7).longValue());
        }
        Object obj8 = objArr2[8];
        if (obj8 != null) {
            c3753hbD0.Y(((Long) obj8).longValue() != 0 ? 2 : 1);
        }
        synchronized (c1966Ka) {
            try {
                Method methodO = this.f19395g.o("LTqeYOkKjRvgMVLXGWwl9QUpPl0hs86RILvnzsnpkgBkbbANt+0KM6wwB7tA8s8M", "qJFn6bhMeF50E1eku7tYH88ZkNeM8ctWC3me80VkO1s=");
                if (methodO == null || (objArr = (Object[]) methodO.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                    throw null;
                }
                Object obj9 = objArr[0];
                if (obj9 != null) {
                    c1966Ka.w0(((Long) obj9).longValue());
                }
                Object obj10 = objArr[1];
                if (obj10 != null) {
                    c1966Ka.x0(((Long) obj10).longValue());
                }
                Object obj11 = objArr[2];
                if (obj11 != null) {
                    c1966Ka.y0(((Long) obj11).longValue());
                }
                Object obj12 = objArr[3];
                if (obj12 != null) {
                    c1966Ka.K0(((Long) obj12).longValue());
                }
                Object obj13 = objArr[4];
                if (obj13 != null) {
                    c1966Ka.L0(((Long) obj13).longValue());
                }
                C5033rm0 c5033rm0 = (C5033rm0) map.get("oe");
                if (c5033rm0 != null) {
                    long j10 = c5033rm0.f33011a;
                    if (j10 > 0) {
                        c1966Ka.O0(j10);
                    }
                    long j11 = c5033rm0.f33012b;
                    if (j11 > 0) {
                        c1966Ka.N0(j11);
                    }
                    long j12 = c5033rm0.f33013c;
                    if (j12 > 0) {
                        c1966Ka.M0(j12);
                    }
                    long j13 = c5033rm0.f33014d;
                    if (j13 > 0) {
                        c1966Ka.A(j13);
                    }
                }
                C5033rm0 c5033rm1 = (C5033rm0) map.get("oe");
                if (c5033rm1 != null && c5033rm1.f33011a != 0 && c(displayMetrics)) {
                    double d10 = c5033rm1.f33017g;
                    if (displayMetrics == null) {
                        throw null;
                    }
                    c3753hbD0.M(b(d10, displayMetrics));
                    c3753hbD0.O(b(c5033rm1.f33020j - c5033rm1.f33018h, displayMetrics));
                    c3753hbD0.P(b(c5033rm1.f33021k - c5033rm1.f33019i, displayMetrics));
                    c3753hbD0.V(b(c5033rm1.f33018h, displayMetrics));
                    c3753hbD0.W(b(c5033rm1.f33019i, displayMetrics));
                    MotionEvent motionEvent2 = (MotionEvent) map.get("nv");
                    if (motionEvent2 != null) {
                        long jB = b(((c5033rm1.f33018h - c5033rm1.f33020j) + motionEvent2.getRawX()) - motionEvent2.getX(), displayMetrics);
                        if (jB != 0) {
                            c3753hbD0.R(jB);
                        }
                        long jB2 = b(((c5033rm1.f33019i - c5033rm1.f33021k) + motionEvent2.getRawY()) - motionEvent2.getY(), displayMetrics);
                        if (jB2 != 0) {
                            c3753hbD0.U(jB2);
                        }
                    }
                }
                c1966Ka.K(c3753hbD0);
                C5159sm0[] c5159sm0Arr = (C5159sm0[]) map.get("ro");
                if (c5159sm0Arr != null && c(displayMetrics)) {
                    for (int i10 = 0; i10 <= c5159sm0Arr.length - 2; i10++) {
                        C5159sm0 c5159sm0 = c5159sm0Arr[i10];
                        C3753hb c3753hbD1 = C3879ib.d0();
                        double d11 = c5159sm0.f33229a;
                        if (displayMetrics == null) {
                            throw null;
                        }
                        c3753hbD1.A(b(d11, displayMetrics));
                        c3753hbD1.B(b(c5159sm0.f33230b, displayMetrics));
                        c1966Ka.L((C3879ib) c3753hbD1.w());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

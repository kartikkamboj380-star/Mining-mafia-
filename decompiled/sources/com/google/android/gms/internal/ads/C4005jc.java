package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4005jc implements InterfaceC4509nc {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static C4005jc f30493I;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private volatile boolean f30494G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private volatile boolean f30495H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4900qi0 f30497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5781xi0 f30498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1463Ai0 f30499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2333Rc f30500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1721Fh0 f30501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f30502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final EnumC2647Xd f30503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC5655wi0 f30504i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C3757hd f30506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C2697Yc f30507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C2229Pc f30508m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    volatile long f30509v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Object f30510w = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CountDownLatch f30505j = new CountDownLatch(1);

    C4005jc(Context context, C1721Fh0 c1721Fh0, C4900qi0 c4900qi0, C5781xi0 c5781xi0, C1463Ai0 c1463Ai0, C2333Rc c2333Rc, Executor executor, C1461Ah0 c1461Ah0, EnumC2647Xd enumC2647Xd, C3757hd c3757hd, C2697Yc c2697Yc, C2229Pc c2229Pc) {
        this.f30495H = false;
        this.f30496a = context;
        this.f30501f = c1721Fh0;
        this.f30497b = c4900qi0;
        this.f30498c = c5781xi0;
        this.f30499d = c1463Ai0;
        this.f30500e = c2333Rc;
        this.f30502g = executor;
        this.f30503h = enumC2647Xd;
        this.f30506k = c3757hd;
        this.f30507l = c2697Yc;
        this.f30508m = c2229Pc;
        this.f30495H = false;
        this.f30504i = new C3755hc(this, c1461Ah0);
    }

    public static synchronized C4005jc a(Context context, C4253la c4253la, boolean z9) {
        AbstractC1773Gh0 abstractC1773Gh0H;
        abstractC1773Gh0H = AbstractC1825Hh0.h();
        abstractC1773Gh0H.a(c4253la.d0());
        abstractC1773Gh0H.b(c4253la.e0());
        return s(context, Executors.newCachedThreadPool(), abstractC1773Gh0H.h(), z9);
    }

    private static synchronized C4005jc s(Context context, Executor executor, AbstractC1825Hh0 abstractC1825Hh0, boolean z9) {
        try {
            if (f30493I == null) {
                C1721Fh0 c1721Fh0A = C1721Fh0.a(context, executor, z9);
                C5894yc c5894ycA = ((Boolean) H4.B.c().d(AbstractC3892ii.f29863j4)).booleanValue() ? C5894yc.a(context) : null;
                C3757hd c3757hdA = ((Boolean) H4.B.c().d(AbstractC3892ii.f29874k4)).booleanValue() ? C3757hd.a(context, executor) : null;
                C2697Yc c2697Yc = ((Boolean) H4.B.c().d(AbstractC3892ii.f29961s3)).booleanValue() ? new C2697Yc() : null;
                C2229Pc c2229Pc = ((Boolean) H4.B.c().d(AbstractC3892ii.f29513B3)).booleanValue() ? new C2229Pc() : null;
                C2552Vh0 c2552Vh0A = C2552Vh0.a(context, executor, c1721Fh0A, abstractC1825Hh0);
                C2281Qc c2281Qc = new C2281Qc(context);
                C2333Rc c2333Rc = new C2333Rc(abstractC1825Hh0, c2552Vh0A, new ViewOnAttachStateChangeListenerC3379ed(context, c2281Qc), c2281Qc, c5894ycA, c3757hdA, c2697Yc, c2229Pc);
                EnumC2647Xd enumC2647XdB = AbstractC3265di0.b(context, c1721Fh0A);
                C1461Ah0 c1461Ah0 = new C1461Ah0();
                C4005jc c4005jc = new C4005jc(context, c1721Fh0A, new C4900qi0(context, enumC2647XdB), new C5781xi0(context, enumC2647XdB, new C3629gc(c1721Fh0A), ((Boolean) H4.B.c().d(AbstractC3892ii.f29785c3)).booleanValue()), new C1463Ai0(context, c2333Rc, c1721Fh0A, c1461Ah0, false), c2333Rc, executor, c1461Ah0, enumC2647XdB, c3757hdA, c2697Yc, c2229Pc);
                f30493I = c4005jc;
                c4005jc.l();
                f30493I.m();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f30493I;
    }

    private final void t() {
        C3757hd c3757hd = this.f30506k;
        if (c3757hd != null) {
            c3757hd.b();
        }
    }

    private final C4774pi0 u(int i10) {
        if (AbstractC3265di0.a(this.f30503h)) {
            return ((Boolean) H4.B.c().d(AbstractC3892ii.f29763a3)).booleanValue() ? this.f30498c.c(1) : this.f30497b.b(1);
        }
        return null;
    }

    public final synchronized boolean b() {
        return this.f30495H;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final void c(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.vd)).booleanValue() || (displayMetrics = this.f30496a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i10;
        float f11 = displayMetrics.density;
        float f12 = i11;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        g(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        g(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i12, 1, f10 * f14, f12 * f14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        g(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String e(Context context) {
        t();
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29961s3)).booleanValue()) {
            this.f30507l.a();
        }
        m();
        InterfaceC1877Ih0 interfaceC1877Ih0B = this.f30499d.b();
        if (interfaceC1877Ih0B == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strB = interfaceC1877Ih0B.b(context, null);
        this.f30501f.d(5001, System.currentTimeMillis() - jCurrentTimeMillis, strB, null);
        return strB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String f(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final void g(MotionEvent motionEvent) {
        InterfaceC1877Ih0 interfaceC1877Ih0B = this.f30499d.b();
        if (interfaceC1877Ih0B != null) {
            try {
                interfaceC1877Ih0B.a(null, motionEvent);
            } catch (C5907yi0 e10) {
                this.f30501f.c(e10.a(), -1L, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String h(Context context, String str, View view, Activity activity) {
        t();
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29961s3)).booleanValue()) {
            this.f30507l.c();
        }
        m();
        InterfaceC1877Ih0 interfaceC1877Ih0B = this.f30499d.b();
        if (interfaceC1877Ih0B == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = interfaceC1877Ih0B.d(context, null, str, view, activity);
        this.f30501f.d(5000, System.currentTimeMillis() - jCurrentTimeMillis, strD, null);
        return strD;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final void i(StackTraceElement[] stackTraceElementArr) {
        C2229Pc c2229Pc = this.f30508m;
        if (c2229Pc != null) {
            c2229Pc.a(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final void j(View view) {
        this.f30500e.a(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4509nc
    public final String k(Context context, View view, Activity activity) {
        t();
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29961s3)).booleanValue()) {
            this.f30507l.b(context, view);
        }
        m();
        InterfaceC1877Ih0 interfaceC1877Ih0B = this.f30499d.b();
        if (interfaceC1877Ih0B == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = interfaceC1877Ih0B.c(context, null, view, activity);
        this.f30501f.d(5002, System.currentTimeMillis() - jCurrentTimeMillis, strC, null);
        return strC;
    }

    final synchronized void l() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4774pi0 c4774pi0U = u(1);
        if (c4774pi0U == null) {
            this.f30501f.b(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f30499d.a(c4774pi0U)) {
            this.f30495H = true;
            this.f30505j.countDown();
        }
    }

    public final void m() {
        if (this.f30494G) {
            return;
        }
        synchronized (this.f30510w) {
            try {
                if (!this.f30494G) {
                    if ((System.currentTimeMillis() / 1000) - this.f30509v < 3600) {
                        return;
                    }
                    C4774pi0 c4774pi0C = this.f30499d.c();
                    if ((c4774pi0C == null || c4774pi0C.e(3600L)) && AbstractC3265di0.a(this.f30503h)) {
                        this.f30502g.execute(new RunnableC3881ic(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[Catch: all -> 0x009f, gM0 -> 0x00a2, TryCatch #1 {gM0 -> 0x00a2, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:34:0x00a5, B:38:0x00be, B:44:0x00d7, B:45:0x00e4, B:47:0x00ea, B:49:0x00f2, B:50:0x00f4, B:41:0x00c8, B:42:0x00cf, B:23:0x0074, B:25:0x007a, B:27:0x008c, B:51:0x00fe, B:52:0x010b, B:53:0x0118), top: B:62:0x0021, outer: #2 }] */
    final /* synthetic */ void n() {
        String str;
        String strE0;
        int length;
        C4774pi0 c4774pi0U;
        C3507fe c3507feA;
        boolean zA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4774pi0 c4774pi0U2 = u(1);
        if (c4774pi0U2 != null) {
            String strD0 = c4774pi0U2.a().d0();
            strE0 = c4774pi0U2.a().e0();
            str = strD0;
        } else {
            str = null;
            strE0 = null;
        }
        try {
            try {
                Context context = this.f30496a;
                EnumC2647Xd enumC2647Xd = this.f30503h;
                C1721Fh0 c1721Fh0 = this.f30501f;
                C5403ui0 c5403ui0A = AbstractC2188Oh0.a(context, 1, enumC2647Xd, str, strE0, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, c1721Fh0);
                byte[] bArr = c5403ui0A.f33885b;
                if (bArr == null || (length = bArr.length) == 0) {
                    c1721Fh0.b(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        C2751Zd c2751ZdG0 = C2751Zd.g0(AbstractC5231tL0.w(bArr, 0, length), HL0.a());
                        if (c2751ZdG0.d0().d0().isEmpty() || c2751ZdG0.d0().e0().isEmpty() || c2751ZdG0.f0().D().length == 0 || ((c4774pi0U = u(1)) != null && (c3507feA = c4774pi0U.a()) != null && c2751ZdG0.d0().d0().equals(c3507feA.d0()) && c2751ZdG0.d0().e0().equals(c3507feA.e0()))) {
                            this.f30501f.b(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            InterfaceC5655wi0 interfaceC5655wi0 = this.f30504i;
                            int i10 = c5403ui0A.f33886c;
                            if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29763a3)).booleanValue()) {
                                zA = this.f30497b.a(c2751ZdG0, interfaceC5655wi0);
                            } else if (i10 == 3) {
                                zA = this.f30498c.b(c2751ZdG0);
                            } else if (i10 == 4) {
                                zA = this.f30498c.a(c2751ZdG0, interfaceC5655wi0);
                            } else {
                                this.f30501f.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zA) {
                                C4774pi0 c4774pi0U3 = u(1);
                                if (c4774pi0U3 != null) {
                                    if (this.f30499d.a(c4774pi0U3)) {
                                        this.f30495H = true;
                                    }
                                    this.f30509v = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.f30501f.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.f30501f.b(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (C3598gM0 e10) {
                this.f30501f.c(4002, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            }
        } finally {
            this.f30505j.countDown();
        }
    }

    final /* synthetic */ C1721Fh0 o() {
        return this.f30501f;
    }

    final /* synthetic */ Object p() {
        return this.f30510w;
    }

    final /* synthetic */ boolean q() {
        return this.f30494G;
    }

    final /* synthetic */ void r(boolean z9) {
        this.f30494G = z9;
    }
}

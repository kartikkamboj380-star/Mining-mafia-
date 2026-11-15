package com.google.android.gms.internal.ads;

import H4.InterfaceC0599g0;
import K4.AbstractC0786o0;
import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5145sf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f33209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2756Zf0 f33210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1561Cf0 f33211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f33212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile ConnectivityManager f33213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f33214f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Clock f33215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AtomicInteger f33216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C4516nf0 f33217i;

    C5145sf0(C2756Zf0 c2756Zf0, C1561Cf0 c1561Cf0, Context context, Clock clock, C4516nf0 c4516nf0) {
        HashMap map = new HashMap();
        this.f33209a = map;
        map.put(B4.b.APP_OPEN_AD, new HashMap());
        map.put(B4.b.INTERSTITIAL, new HashMap());
        map.put(B4.b.REWARDED, new HashMap());
        this.f33210b = c2756Zf0;
        this.f33211c = c1561Cf0;
        this.f33212d = context;
        this.f33215g = clock;
        this.f33217i = c4516nf0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final synchronized void k(boolean z9) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f30023y)).booleanValue()) {
            l(z9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final synchronized void l(boolean z9) {
        try {
            Iterator it = this.f33209a.values().iterator();
            while (it.hasNext()) {
                for (AbstractC2704Yf0 abstractC2704Yf0 : ((Map) it.next()).values()) {
                    if (z9) {
                        abstractC2704Yf0.H();
                    } else {
                        abstractC2704Yf0.G();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized Object o(Class cls, B4.b bVar, String str) {
        C1561Cf0 c1561Cf0 = this.f33211c;
        Clock clock = this.f33215g;
        c1561Cf0.e(clock.currentTimeMillis(), CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
        Map map = this.f33209a;
        if (!map.containsKey(bVar)) {
            return null;
        }
        AbstractC2704Yf0 abstractC2704Yf0 = (AbstractC2704Yf0) ((Map) map.get(bVar)).get(str);
        if (abstractC2704Yf0 != null && bVar.equals(abstractC2704Yf0.M())) {
            C1873If0 c1873If0 = new C1873If0(abstractC2704Yf0.f25665e.f1242a, abstractC2704Yf0.M());
            c1873If0.a(str);
            C1925Jf0 c1925Jf0 = new C1925Jf0(c1873If0, null);
            c1561Cf0.f(clock.currentTimeMillis(), c1925Jf0, abstractC2704Yf0.f25665e.f1245d, abstractC2704Yf0.N(), CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
            try {
                String strI = abstractC2704Yf0.I();
                Object objE = abstractC2704Yf0.E();
                Object objCast = objE == null ? null : cls.cast(objE);
                if (objCast != null) {
                    c1561Cf0.h(clock.currentTimeMillis(), abstractC2704Yf0.f25665e.f1245d, abstractC2704Yf0.N(), strI, c1925Jf0, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                }
                return objCast;
            } catch (ClassCastException e10) {
                G4.t.l().j(e10, "PreloadAdManager.pollAd");
                AbstractC0786o0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
                return null;
            }
        }
        return null;
    }

    private final synchronized boolean p(B4.b bVar) {
        int size;
        int iMax;
        try {
            Map map = this.f33209a;
            size = map.containsKey(bVar) ? ((Map) map.get(bVar)).size() : 0;
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 1) {
                iMax = Math.max(((Integer) H4.B.c().d(AbstractC3892ii.f29963s5)).intValue(), 1);
            } else if (iOrdinal == 2) {
                iMax = Math.max(((Integer) H4.B.c().d(AbstractC3892ii.f29974t5)).intValue(), 1);
            } else if (iOrdinal != 5) {
                iMax = 0;
            } else {
                iMax = Math.max(((Integer) H4.B.c().d(AbstractC3892ii.f29985u5)).intValue(), 1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return size < iMax;
    }

    public final synchronized boolean a(String str, H4.S1 s10, InterfaceC0599g0 interfaceC0599g0) {
        AbstractC2704Yf0 abstractC2704Yf0B;
        try {
            if (!this.f33214f.getAndSet(true)) {
                if (this.f33213e == null) {
                    synchronized (this) {
                        if (this.f33213e == null) {
                            try {
                                this.f33213e = (ConnectivityManager) this.f33212d.getSystemService("connectivity");
                            } catch (ClassCastException e10) {
                                int i10 = AbstractC0786o0.f2696b;
                                L4.p.g("Failed to get connectivity manager", e10);
                            }
                        }
                    }
                }
                if (!PlatformVersion.isAtLeastO() || this.f33213e == null) {
                    this.f33216h = new AtomicInteger(((Integer) H4.B.c().d(AbstractC3892ii.f29579I)).intValue());
                } else {
                    try {
                        this.f33213e.registerDefaultNetworkCallback(new C4894qf0(this));
                    } catch (RuntimeException e11) {
                        int i11 = AbstractC0786o0.f2696b;
                        L4.p.g("Failed to register network callback", e11);
                        this.f33216h = new AtomicInteger(((Integer) H4.B.c().d(AbstractC3892ii.f29579I)).intValue());
                    }
                }
                G4.t.k().b(new C5019rf0(this));
            }
            B4.b bVarC = B4.b.c(s10.f1243b);
            if (bVarC != null) {
                Map map = this.f33209a;
                if (map.containsKey(bVarC) && !((Map) map.get(bVarC)).containsKey(str) && p(bVarC) && (abstractC2704Yf0B = this.f33210b.b(str, s10, interfaceC0599g0)) != null) {
                    AtomicInteger atomicInteger = this.f33216h;
                    if (atomicInteger != null) {
                        abstractC2704Yf0B.K(atomicInteger.get());
                    }
                    C1561Cf0 c1561Cf0 = this.f33211c;
                    abstractC2704Yf0B.J(c1561Cf0);
                    C4516nf0 c4516nf0 = this.f33217i;
                    if (c4516nf0 != null) {
                        c4516nf0.d(str, bVarC, abstractC2704Yf0B);
                    } else {
                        abstractC2704Yf0B.B();
                    }
                    ((Map) map.get(bVarC)).put(str, abstractC2704Yf0B);
                    C1873If0 c1873If0 = new C1873If0(s10.f1242a, bVarC);
                    c1873If0.a(str);
                    c1561Cf0.a(s10.f1245d, this.f33215g.currentTimeMillis(), new C1925Jf0(c1873If0, null), CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b(B4.b bVar, String str) {
        C1925Jf0 c1925Jf0;
        try {
            Clock clock = this.f33215g;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            Map map = this.f33209a;
            int iN = 0;
            if (!map.containsKey(bVar)) {
                return false;
            }
            AbstractC2704Yf0 abstractC2704Yf0 = (AbstractC2704Yf0) ((Map) map.get(bVar)).get(str);
            String strI = abstractC2704Yf0 == null ? null : abstractC2704Yf0.I();
            boolean z9 = strI != null && bVar.equals(abstractC2704Yf0.M());
            Long lValueOf = z9 ? Long.valueOf(clock.currentTimeMillis()) : null;
            if (abstractC2704Yf0 == null) {
                c1925Jf0 = null;
            } else {
                C1873If0 c1873If0 = new C1873If0(abstractC2704Yf0.f25665e.f1242a, bVar);
                c1873If0.a(str);
                c1925Jf0 = new C1925Jf0(c1873If0, null);
            }
            C1561Cf0 c1561Cf0 = this.f33211c;
            int i10 = abstractC2704Yf0 == null ? 0 : abstractC2704Yf0.f25665e.f1245d;
            if (abstractC2704Yf0 != null) {
                iN = abstractC2704Yf0.N();
            }
            c1561Cf0.d(i10, iN, jCurrentTimeMillis, lValueOf, strI, c1925Jf0, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
            return z9;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized InterfaceC3033bs c(String str) {
        return (InterfaceC3033bs) o(InterfaceC3033bs.class, B4.b.REWARDED, str);
    }

    public final synchronized InterfaceC4893qf d(String str) {
        return (InterfaceC4893qf) o(InterfaceC4893qf.class, B4.b.APP_OPEN_AD, str);
    }

    public final synchronized H4.W e(String str) {
        return (H4.W) o(H4.W.class, B4.b.INTERSTITIAL, str);
    }

    public final synchronized H4.S1 f(B4.b bVar, String str) {
        Map map = this.f33209a;
        if (map.containsKey(bVar)) {
            AbstractC2704Yf0 abstractC2704Yf0 = (AbstractC2704Yf0) ((Map) map.get(bVar)).get(str);
            this.f33211c.o(this.f33215g.currentTimeMillis(), str, abstractC2704Yf0 == null ? null : abstractC2704Yf0.f25665e.f1242a, bVar, abstractC2704Yf0 == null ? -1 : abstractC2704Yf0.f25665e.f1245d, abstractC2704Yf0 != null ? abstractC2704Yf0.N() : -1);
            if (abstractC2704Yf0 != null) {
                return abstractC2704Yf0.f25665e;
            }
        }
        return null;
    }

    public final synchronized int g(B4.b bVar, String str) {
        Map map = this.f33209a;
        if (!map.containsKey(bVar)) {
            return 0;
        }
        AbstractC2704Yf0 abstractC2704Yf0 = (AbstractC2704Yf0) ((Map) map.get(bVar)).get(str);
        int iN = abstractC2704Yf0 != null ? abstractC2704Yf0.N() : 0;
        this.f33211c.p(iN, this.f33215g.currentTimeMillis(), str, abstractC2704Yf0 == null ? null : abstractC2704Yf0.f25665e.f1242a, bVar, abstractC2704Yf0 == null ? -1 : abstractC2704Yf0.f25665e.f1245d);
        return iN;
    }

    public final synchronized Map h(int i10) {
        try {
            HashMap map = new HashMap();
            B4.b bVarC = B4.b.c(i10);
            if (bVarC != null) {
                Map map2 = this.f33209a;
                if (map2.containsKey(bVarC)) {
                    for (AbstractC2704Yf0 abstractC2704Yf0 : ((Map) map2.get(bVarC)).values()) {
                        map.put(abstractC2704Yf0.L(), abstractC2704Yf0.f25665e);
                    }
                    this.f33211c.n(bVarC, this.f33215g.currentTimeMillis(), map.size());
                    return map;
                }
            }
            return map;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i(B4.b bVar, String str) {
        AbstractC2704Yf0 abstractC2704Yf0;
        try {
            Map map = this.f33209a;
            if (map.containsKey(bVar) && (abstractC2704Yf0 = (AbstractC2704Yf0) ((Map) map.get(bVar)).get(str)) != null) {
                ((Map) map.get(bVar)).remove(str);
                abstractC2704Yf0.F();
                C4516nf0 c4516nf0 = this.f33217i;
                if (c4516nf0 != null) {
                    c4516nf0.e(str, bVar);
                }
                abstractC2704Yf0.P();
                C1561Cf0 c1561Cf0 = this.f33211c;
                long jCurrentTimeMillis = this.f33215g.currentTimeMillis();
                H4.S1 s10 = abstractC2704Yf0.f25665e;
                c1561Cf0.m(jCurrentTimeMillis, str, s10.f1242a, bVar, s10.f1245d, abstractC2704Yf0.N());
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(int i10) {
        try {
            B4.b bVarC = B4.b.c(i10);
            if (bVarC != null) {
                Map map = this.f33209a;
                if (map.containsKey(bVarC)) {
                    Map map2 = (Map) map.get(bVarC);
                    int size = map2.size();
                    for (String str : map2.keySet()) {
                        AbstractC2704Yf0 abstractC2704Yf0 = (AbstractC2704Yf0) map2.get(str);
                        if (abstractC2704Yf0 != null) {
                            abstractC2704Yf0.F();
                            C4516nf0 c4516nf0 = this.f33217i;
                            if (c4516nf0 != null) {
                                c4516nf0.e(str, bVarC);
                            }
                            abstractC2704Yf0.P();
                            String strValueOf = String.valueOf(str);
                            int i11 = AbstractC0786o0.f2696b;
                            L4.p.e("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                        }
                    }
                    map2.clear();
                    String strConcat = "Destroyed all ad preloaders for ad format: ".concat(bVarC.toString());
                    int i12 = AbstractC0786o0.f2696b;
                    L4.p.e(strConcat);
                    this.f33211c.l(this.f33215g.currentTimeMillis(), bVarC, size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

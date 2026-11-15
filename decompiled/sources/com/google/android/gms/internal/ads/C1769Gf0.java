package com.google.android.gms.internal.ads;

import H4.InterfaceC0593e0;
import K4.AbstractC0786o0;
import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1769Gf0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2756Zf0 f19088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1561Cf0 f19089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f19090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile ConnectivityManager f19091f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Clock f19093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicInteger f19094i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f19092g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f19086a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f19087b = new ConcurrentHashMap();

    C1769Gf0(C2756Zf0 c2756Zf0, C1561Cf0 c1561Cf0, Context context, Clock clock) {
        this.f19088c = c2756Zf0;
        this.f19089d = c1561Cf0;
        this.f19090e = context;
        this.f19093h = clock;
    }

    static String h(String str, B4.b bVar) {
        String strName = bVar == null ? "NULL" : bVar.name();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length());
        sb.append(str);
        sb.append("#");
        sb.append(strName);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final synchronized void i(boolean z9) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f30023y)).booleanValue()) {
            j(z9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized void j(boolean z9) {
        try {
            if (z9) {
                Iterator it = this.f19086a.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC2704Yf0) it.next()).H();
                }
            } else {
                Iterator it2 = this.f19086a.values().iterator();
                while (it2.hasNext()) {
                    ((AbstractC2704Yf0) it2.next()).G();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f8 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00e6, B:35:0x00fb, B:37:0x0101, B:34:0x00f8), top: B:43:0x0001 }] */
    private final synchronized List m(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                H4.S1 s10 = (H4.S1) it.next();
                String strH = h(s10.f1242a, B4.b.c(s10.f1243b));
                hashSet.add(strH);
                ConcurrentMap concurrentMap = this.f19086a;
                AbstractC2704Yf0 abstractC2704Yf0 = (AbstractC2704Yf0) concurrentMap.get(strH);
                if (abstractC2704Yf0 == null) {
                    ConcurrentMap concurrentMap2 = this.f19087b;
                    if (concurrentMap2.containsKey(strH)) {
                        AbstractC2704Yf0 abstractC2704Yf1 = (AbstractC2704Yf0) concurrentMap2.get(strH);
                        if (abstractC2704Yf1.f25665e.equals(s10)) {
                            abstractC2704Yf1.U(s10.f1245d);
                            abstractC2704Yf1.H();
                            concurrentMap.put(strH, abstractC2704Yf1);
                            concurrentMap2.remove(strH);
                        } else {
                            arrayList.add(s10);
                        }
                    } else {
                        arrayList.add(s10);
                    }
                } else if (abstractC2704Yf0.f25665e.equals(s10)) {
                    abstractC2704Yf0.U(s10.f1245d);
                } else {
                    this.f19087b.put(strH, abstractC2704Yf0);
                    concurrentMap.remove(strH);
                    arrayList.add(s10);
                }
            }
            Iterator it2 = this.f19086a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.f19087b.put((String) entry.getKey(), (AbstractC2704Yf0) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.f19087b.entrySet().iterator();
            while (it3.hasNext()) {
                AbstractC2704Yf0 abstractC2704Yf2 = (AbstractC2704Yf0) ((Map.Entry) it3.next()).getValue();
                abstractC2704Yf2.F();
                if (((Boolean) H4.B.c().d(AbstractC3892ii.f29499A)).booleanValue()) {
                    abstractC2704Yf2.P();
                } else {
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.f29509B)).booleanValue()) {
                        abstractC2704Yf2.P();
                    }
                }
                if (!abstractC2704Yf2.D()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized void n(String str, AbstractC2704Yf0 abstractC2704Yf0) {
        abstractC2704Yf0.B();
        this.f19086a.put(str, abstractC2704Yf0);
    }

    private final synchronized boolean o(String str, B4.b bVar) {
        boolean z9;
        try {
            Clock clock = this.f19093h;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            AbstractC2704Yf0 abstractC2704Yf0Q = q(str, bVar);
            int iN = 0;
            z9 = abstractC2704Yf0Q != null && abstractC2704Yf0Q.D();
            Long lValueOf = z9 ? Long.valueOf(clock.currentTimeMillis()) : null;
            C1925Jf0 c1925Jf0 = new C1925Jf0(new C1873If0(str, bVar), null);
            C1561Cf0 c1561Cf0 = this.f19089d;
            int i10 = abstractC2704Yf0Q == null ? 0 : abstractC2704Yf0Q.f25665e.f1245d;
            if (abstractC2704Yf0Q != null) {
                iN = abstractC2704Yf0Q.N();
            }
            c1561Cf0.d(i10, iN, jCurrentTimeMillis, lValueOf, abstractC2704Yf0Q != null ? abstractC2704Yf0Q.I() : null, c1925Jf0, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        } catch (Throwable th) {
            throw th;
        }
        return z9;
    }

    private final synchronized Object p(Class cls, String str, B4.b bVar) {
        C1925Jf0 c1925Jf0 = new C1925Jf0(new C1873If0(str, bVar), null);
        C1561Cf0 c1561Cf0 = this.f19089d;
        Clock clock = this.f19093h;
        c1561Cf0.f(clock.currentTimeMillis(), c1925Jf0, -1, -1, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        AbstractC2704Yf0 abstractC2704Yf0Q = q(str, bVar);
        if (abstractC2704Yf0Q == null) {
            return null;
        }
        try {
            String strI = abstractC2704Yf0Q.I();
            Object objE = abstractC2704Yf0Q.E();
            Object objCast = objE == null ? null : cls.cast(objE);
            if (objCast != null) {
                c1561Cf0.h(clock.currentTimeMillis(), abstractC2704Yf0Q.f25665e.f1245d, abstractC2704Yf0Q.N(), strI, c1925Jf0, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
            return objCast;
        } catch (ClassCastException e10) {
            G4.t.l().j(e10, "PreloadAdManager.pollAd");
            AbstractC0786o0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
            return null;
        }
    }

    private final synchronized AbstractC2704Yf0 q(String str, B4.b bVar) {
        return (AbstractC2704Yf0) this.f19086a.get(h(str, bVar));
    }

    public final synchronized void a(List list, InterfaceC0593e0 interfaceC0593e0) {
        try {
            if (!this.f19092g.getAndSet(true)) {
                if (this.f19091f == null) {
                    synchronized (this) {
                        if (this.f19091f == null) {
                            try {
                                this.f19091f = (ConnectivityManager) this.f19090e.getSystemService("connectivity");
                            } catch (ClassCastException e10) {
                                int i10 = AbstractC0786o0.f2696b;
                                L4.p.g("Failed to get connectivity manager", e10);
                            }
                        }
                    }
                }
                if (!PlatformVersion.isAtLeastO() || this.f19091f == null) {
                    this.f19094i = new AtomicInteger(((Integer) H4.B.c().d(AbstractC3892ii.f29579I)).intValue());
                } else {
                    try {
                        this.f19091f.registerDefaultNetworkCallback(new C1717Ff0(this));
                    } catch (RuntimeException e11) {
                        int i11 = AbstractC0786o0.f2696b;
                        L4.p.g("Failed to register network callback", e11);
                        this.f19094i = new AtomicInteger(((Integer) H4.B.c().d(AbstractC3892ii.f29579I)).intValue());
                    }
                }
                G4.t.k().b(new C1665Ef0(this));
            }
            List<H4.S1> listM = m(list);
            EnumMap enumMap = new EnumMap(B4.b.class);
            for (H4.S1 s10 : listM) {
                String str = s10.f1242a;
                B4.b bVarC = B4.b.c(s10.f1243b);
                AbstractC2704Yf0 abstractC2704Yf0A = this.f19088c.a(s10, interfaceC0593e0);
                if (bVarC != null && abstractC2704Yf0A != null) {
                    AtomicInteger atomicInteger = this.f19094i;
                    if (atomicInteger != null) {
                        abstractC2704Yf0A.K(atomicInteger.get());
                    }
                    C1561Cf0 c1561Cf0 = this.f19089d;
                    abstractC2704Yf0A.J(c1561Cf0);
                    n(h(str, bVarC), abstractC2704Yf0A);
                    enumMap.put(bVarC, Integer.valueOf(((Integer) L4.g.m(enumMap, bVarC, 0)).intValue() + 1));
                    c1561Cf0.a(s10.f1245d, this.f19093h.currentTimeMillis(), new C1925Jf0(new C1873If0(str, bVarC), null), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                }
            }
            this.f19089d.b(enumMap, this.f19093h.currentTimeMillis(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b(String str) {
        return o(str, B4.b.REWARDED);
    }

    public final synchronized InterfaceC3033bs c(String str) {
        return (InterfaceC3033bs) p(InterfaceC3033bs.class, str, B4.b.REWARDED);
    }

    public final synchronized boolean d(String str) {
        return o(str, B4.b.APP_OPEN_AD);
    }

    public final synchronized InterfaceC4893qf e(String str) {
        return (InterfaceC4893qf) p(InterfaceC4893qf.class, str, B4.b.APP_OPEN_AD);
    }

    public final synchronized boolean f(String str) {
        return o(str, B4.b.INTERSTITIAL);
    }

    public final synchronized H4.W g(String str) {
        return (H4.W) p(H4.W.class, str, B4.b.INTERSTITIAL);
    }
}

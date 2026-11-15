package com.google.android.gms.internal.ads;

import H4.BinderC0656z1;
import H4.InterfaceC0591d1;
import K4.AbstractC0786o0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0591d1 f21514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2399Sj f21515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f21516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f21517e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BinderC0656z1 f21519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Bundle f21520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC1750Fw f21521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC1750Fw f21522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC1750Fw f21523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C3747hY f21524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.common.util.concurrent.p f21525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C2575Vt f21526n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f21527o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f21528p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.android.gms.dynamic.a f21529q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private double f21530r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private InterfaceC2763Zj f21531s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InterfaceC2763Zj f21532t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f21533u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f21536x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f21537y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final p190t.k f21534v = new p190t.k();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p190t.k f21535w = new p190t.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f21518f = Collections.EMPTY_LIST;

    public static OM G(InterfaceC2097Mo interfaceC2097Mo) {
        try {
            return L(N(interfaceC2097Mo.zzn(), interfaceC2097Mo), interfaceC2097Mo.zzo(), (View) M(interfaceC2097Mo.h()), interfaceC2097Mo.zze(), interfaceC2097Mo.b(), interfaceC2097Mo.zzg(), interfaceC2097Mo.f(), interfaceC2097Mo.zzi(), (View) M(interfaceC2097Mo.a()), interfaceC2097Mo.l(), interfaceC2097Mo.zzl(), interfaceC2097Mo.e(), interfaceC2097Mo.zzk(), interfaceC2097Mo.c(), interfaceC2097Mo.d(), interfaceC2097Mo.m());
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    public static OM H(C1942Jo c1942Jo) {
        try {
            NM nmN = N(c1942Jo.i2(), null);
            InterfaceC2399Sj interfaceC2399SjB2 = c1942Jo.B2();
            View view = (View) M(c1942Jo.l());
            String strZze = c1942Jo.zze();
            List listB = c1942Jo.b();
            String strZzg = c1942Jo.zzg();
            Bundle bundleZ1 = c1942Jo.Z1();
            String strZzi = c1942Jo.zzi();
            View view2 = (View) M(c1942Jo.zzu());
            com.google.android.gms.dynamic.a aVarQ = c1942Jo.q();
            String strD = c1942Jo.d();
            InterfaceC2763Zj interfaceC2763ZjC = c1942Jo.c();
            OM om = new OM();
            om.f21513a = 1;
            om.f21514b = nmN;
            om.f21515c = interfaceC2399SjB2;
            om.f21516d = view;
            om.f0("headline", strZze);
            om.f21517e = listB;
            om.f0("body", strZzg);
            om.f21520h = bundleZ1;
            om.f0("call_to_action", strZzi);
            om.f21527o = view2;
            om.f21529q = aVarQ;
            om.f0("advertiser", strD);
            om.f21532t = interfaceC2763ZjC;
            return om;
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Failed to get native ad from content ad mapper", e10);
            return null;
        }
    }

    public static OM I(C1890Io c1890Io) {
        try {
            NM nmN = N(c1890Io.Z2(), null);
            InterfaceC2399Sj interfaceC2399SjX3 = c1890Io.x3();
            View view = (View) M(c1890Io.zzu());
            String strZze = c1890Io.zze();
            List listB = c1890Io.b();
            String strZzg = c1890Io.zzg();
            Bundle bundleI2 = c1890Io.i2();
            String strZzi = c1890Io.zzi();
            View view2 = (View) M(c1890Io.S3());
            com.google.android.gms.dynamic.a aVarB4 = c1890Io.b4();
            String strZ1 = c1890Io.Z1();
            String strZzl = c1890Io.zzl();
            double dH1 = c1890Io.H1();
            InterfaceC2763Zj interfaceC2763ZjC = c1890Io.c();
            try {
                OM om = new OM();
                om.f21513a = 2;
                om.f21514b = nmN;
                om.f21515c = interfaceC2399SjX3;
                om.f21516d = view;
                om.f0("headline", strZze);
                om.f21517e = listB;
                om.f0("body", strZzg);
                om.f21520h = bundleI2;
                om.f0("call_to_action", strZzi);
                om.f21527o = view2;
                om.f21529q = aVarB4;
                om.f0("store", strZ1);
                om.f0(InAppPurchaseMetaData.KEY_PRICE, strZzl);
                om.f21530r = dH1;
                om.f21531s = interfaceC2763ZjC;
                return om;
            } catch (RemoteException e10) {
                e = e10;
                int i10 = AbstractC0786o0.f2696b;
                L4.p.g("Failed to get native ad from app install ad mapper", e);
                return 0;
            }
        } catch (RemoteException e11) {
            e = e11;
        }
    }

    public static OM J(C1890Io c1890Io) {
        try {
            return L(N(c1890Io.Z2(), null), c1890Io.x3(), (View) M(c1890Io.zzu()), c1890Io.zze(), c1890Io.b(), c1890Io.zzg(), c1890Io.i2(), c1890Io.zzi(), (View) M(c1890Io.S3()), c1890Io.b4(), c1890Io.Z1(), c1890Io.zzl(), c1890Io.H1(), c1890Io.c(), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Failed to get native ad assets from app install ad mapper", e10);
            return null;
        }
    }

    public static OM K(C1942Jo c1942Jo) {
        try {
            return L(N(c1942Jo.i2(), null), c1942Jo.B2(), (View) M(c1942Jo.l()), c1942Jo.zze(), c1942Jo.b(), c1942Jo.zzg(), c1942Jo.Z1(), c1942Jo.zzi(), (View) M(c1942Jo.zzu()), c1942Jo.q(), null, null, -1.0d, c1942Jo.c(), c1942Jo.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Failed to get native ad assets from content ad mapper", e10);
            return null;
        }
    }

    private static OM L(InterfaceC0591d1 interfaceC0591d1, InterfaceC2399Sj interfaceC2399Sj, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, com.google.android.gms.dynamic.a aVar, String str4, String str5, double d10, InterfaceC2763Zj interfaceC2763Zj, String str6, float f10) {
        OM om = new OM();
        om.f21513a = 6;
        om.f21514b = interfaceC0591d1;
        om.f21515c = interfaceC2399Sj;
        om.f21516d = view;
        om.f0("headline", str);
        om.f21517e = list;
        om.f0("body", str2);
        om.f21520h = bundle;
        om.f0("call_to_action", str3);
        om.f21527o = view2;
        om.f21529q = aVar;
        om.f0("store", str4);
        om.f0(InAppPurchaseMetaData.KEY_PRICE, str5);
        om.f21530r = d10;
        om.f21531s = interfaceC2763Zj;
        om.f0("advertiser", str6);
        om.h0(f10);
        return om;
    }

    private static Object M(com.google.android.gms.dynamic.a aVar) {
        if (aVar == null) {
            return null;
        }
        return com.google.android.gms.dynamic.b.h0(aVar);
    }

    private static NM N(InterfaceC0591d1 interfaceC0591d1, InterfaceC2097Mo interfaceC2097Mo) {
        if (interfaceC0591d1 == null) {
            return null;
        }
        return new NM(interfaceC0591d1, interfaceC2097Mo);
    }

    public final synchronized void A(int i10) {
        this.f21513a = i10;
    }

    public final synchronized p190t.k B() {
        return this.f21534v;
    }

    public final synchronized float C() {
        return this.f21536x;
    }

    public final synchronized String D() {
        return this.f21537y;
    }

    public final synchronized p190t.k E() {
        return this.f21535w;
    }

    public final synchronized void F() {
        try {
            InterfaceC1750Fw interfaceC1750Fw = this.f21521i;
            if (interfaceC1750Fw != null) {
                interfaceC1750Fw.destroy();
                this.f21521i = null;
            }
            InterfaceC1750Fw interfaceC1750Fw2 = this.f21522j;
            if (interfaceC1750Fw2 != null) {
                interfaceC1750Fw2.destroy();
                this.f21522j = null;
            }
            InterfaceC1750Fw interfaceC1750Fw3 = this.f21523k;
            if (interfaceC1750Fw3 != null) {
                interfaceC1750Fw3.destroy();
                this.f21523k = null;
            }
            com.google.common.util.concurrent.p pVar = this.f21525m;
            if (pVar != null) {
                pVar.cancel(false);
                this.f21525m = null;
            }
            C2575Vt c2575Vt = this.f21526n;
            if (c2575Vt != null) {
                c2575Vt.cancel(false);
                this.f21526n = null;
            }
            this.f21524l = null;
            this.f21534v.clear();
            this.f21535w.clear();
            this.f21514b = null;
            this.f21515c = null;
            this.f21516d = null;
            this.f21517e = null;
            this.f21520h = null;
            this.f21527o = null;
            this.f21528p = null;
            this.f21529q = null;
            this.f21531s = null;
            this.f21532t = null;
            this.f21533u = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void O(InterfaceC0591d1 interfaceC0591d1) {
        this.f21514b = interfaceC0591d1;
    }

    public final synchronized void P(InterfaceC2399Sj interfaceC2399Sj) {
        this.f21515c = interfaceC2399Sj;
    }

    public final synchronized void Q(List list) {
        this.f21517e = list;
    }

    public final synchronized void R(List list) {
        this.f21518f = list;
    }

    public final synchronized void S(BinderC0656z1 binderC0656z1) {
        this.f21519g = binderC0656z1;
    }

    public final synchronized void T(View view) {
        this.f21527o = view;
    }

    public final synchronized void U(View view) {
        this.f21528p = view;
    }

    public final synchronized void V(double d10) {
        this.f21530r = d10;
    }

    public final synchronized void W(InterfaceC2763Zj interfaceC2763Zj) {
        this.f21531s = interfaceC2763Zj;
    }

    public final synchronized void X(InterfaceC2763Zj interfaceC2763Zj) {
        this.f21532t = interfaceC2763Zj;
    }

    public final synchronized void Y(String str) {
        this.f21533u = str;
    }

    public final synchronized void Z(InterfaceC1750Fw interfaceC1750Fw) {
        this.f21521i = interfaceC1750Fw;
    }

    public final synchronized View a() {
        return this.f21516d;
    }

    public final synchronized void a0(InterfaceC1750Fw interfaceC1750Fw) {
        this.f21522j = interfaceC1750Fw;
    }

    public final synchronized String b() {
        return j0("headline");
    }

    public final synchronized void b0(InterfaceC1750Fw interfaceC1750Fw) {
        this.f21523k = interfaceC1750Fw;
    }

    public final synchronized List c() {
        return this.f21517e;
    }

    public final synchronized void c0(com.google.common.util.concurrent.p pVar) {
        this.f21525m = pVar;
    }

    public final InterfaceC2763Zj d() {
        List list = this.f21517e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f21517e.get(0);
        if (obj instanceof IBinder) {
            return AbstractBinderC2711Yj.y6((IBinder) obj);
        }
        return null;
    }

    public final synchronized void d0(C3747hY c3747hY) {
        this.f21524l = c3747hY;
    }

    public final synchronized List e() {
        return this.f21518f;
    }

    public final synchronized void e0(C2575Vt c2575Vt) {
        this.f21526n = c2575Vt;
    }

    public final synchronized BinderC0656z1 f() {
        return this.f21519g;
    }

    public final synchronized void f0(String str, String str2) {
        try {
            if (str2 == null) {
                this.f21535w.remove(str);
            } else {
                this.f21535w.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String g() {
        return j0("body");
    }

    public final synchronized void g0(String str, BinderC1984Kj binderC1984Kj) {
        try {
            if (binderC1984Kj == null) {
                this.f21534v.remove(str);
            } else {
                this.f21534v.put(str, binderC1984Kj);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Bundle h() {
        try {
            if (this.f21520h == null) {
                this.f21520h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21520h;
    }

    public final synchronized void h0(float f10) {
        this.f21536x = f10;
    }

    public final synchronized String i() {
        return j0("call_to_action");
    }

    public final synchronized void i0(String str) {
        this.f21537y = str;
    }

    public final synchronized View j() {
        return this.f21527o;
    }

    public final synchronized String j0(String str) {
        return (String) this.f21535w.get(str);
    }

    public final synchronized View k() {
        return this.f21528p;
    }

    public final synchronized int k0() {
        return this.f21513a;
    }

    public final synchronized com.google.android.gms.dynamic.a l() {
        return this.f21529q;
    }

    public final synchronized InterfaceC0591d1 l0() {
        return this.f21514b;
    }

    public final synchronized String m() {
        return j0("store");
    }

    public final synchronized InterfaceC2399Sj m0() {
        return this.f21515c;
    }

    public final synchronized String n() {
        return j0(InAppPurchaseMetaData.KEY_PRICE);
    }

    public final synchronized double o() {
        return this.f21530r;
    }

    public final synchronized InterfaceC2763Zj p() {
        return this.f21531s;
    }

    public final synchronized String q() {
        return j0("advertiser");
    }

    public final synchronized InterfaceC2763Zj r() {
        return this.f21532t;
    }

    public final synchronized String s() {
        return this.f21533u;
    }

    public final synchronized InterfaceC1750Fw t() {
        return this.f21521i;
    }

    public final synchronized InterfaceC1750Fw u() {
        return this.f21522j;
    }

    public final synchronized boolean v() {
        return this.f21522j != null;
    }

    public final synchronized InterfaceC1750Fw w() {
        return this.f21523k;
    }

    public final synchronized com.google.common.util.concurrent.p x() {
        return this.f21525m;
    }

    public final synchronized C2575Vt y() {
        return this.f21526n;
    }

    public final synchronized C3747hY z() {
        return this.f21524l;
    }
}

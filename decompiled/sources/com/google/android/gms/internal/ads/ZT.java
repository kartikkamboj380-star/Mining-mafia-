package com.google.android.gms.internal.ads;

import H4.InterfaceC0582a1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ZT extends H4.U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f26194a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f26195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f26196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MT f26197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f26198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BT f26199f;

    ZT(Context context, WeakReference weakReference, MT mt, C2985bU c2985bU, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        this.f26195b = context;
        this.f26196c = weakReference;
        this.f26197d = mt;
        this.f26198e = interfaceExecutorServiceC1805Gx0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E6, reason: merged with bridge method [inline-methods] */
    public final synchronized void g0(String str) {
        try {
            AbstractC5685wx0.r(this.f26199f.o(str), new TT(this), this.f26198e);
        } catch (NullPointerException e10) {
            G4.t.l().j(e10, "OutOfContextTester.setAdAsOutOfContext");
            this.f26197d.e();
        }
    }

    private final synchronized void F6(String str) {
        try {
            AbstractC5685wx0.r(this.f26199f.o(str), new UT(this), this.f26198e);
        } catch (NullPointerException e10) {
            G4.t.l().j(e10, "OutOfContextTester.setAdAsShown");
            this.f26197d.e();
        }
    }

    private final Context G6() {
        Context context = (Context) this.f26196c.get();
        return context == null ? this.f26195b : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String H6(Object obj) {
        B4.u uVarJ;
        InterfaceC0582a1 interfaceC0582a1G;
        if (obj instanceof B4.k) {
            uVarJ = ((B4.k) obj).f();
        } else if (obj instanceof D4.a) {
            uVarJ = ((D4.a) obj).a();
        } else if (obj instanceof M4.a) {
            uVarJ = ((M4.a) obj).a();
        } else if (obj instanceof U4.c) {
            uVarJ = ((U4.c) obj).a();
        } else if (obj instanceof V4.a) {
            uVarJ = ((V4.a) obj).a();
        } else if (obj instanceof B4.h) {
            uVarJ = ((B4.h) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            uVarJ = ((NativeAd) obj).j();
        }
        if (uVarJ == null || (interfaceC0582a1G = uVarJ.g()) == null) {
            return "";
        }
        try {
            return interfaceC0582a1G.d();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final synchronized void A6(String str) {
        Map map;
        Object obj;
        try {
            Activity activityF = this.f26197d.f();
            if (activityF != null && (obj = (map = this.f26194a).get(str)) != null) {
                AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.Qa;
                if (!((Boolean) H4.B.c().d(abstractC2759Zh)).booleanValue() || (obj instanceof D4.a) || (obj instanceof M4.a) || (obj instanceof U4.c) || (obj instanceof V4.a)) {
                    map.remove(str);
                }
                F6(H6(obj));
                if (obj instanceof D4.a) {
                    ((D4.a) obj).f(activityF);
                    return;
                }
                if (obj instanceof M4.a) {
                    ((M4.a) obj).f(activityF);
                    return;
                }
                if (obj instanceof U4.c) {
                    ((U4.c) obj).i(activityF, YT.f25613a);
                    return;
                }
                if (obj instanceof V4.a) {
                    ((V4.a) obj).i(activityF, VT.f24291a);
                    return;
                }
                if (((Boolean) H4.B.c().d(abstractC2759Zh)).booleanValue() && ((obj instanceof B4.h) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextG6 = G6();
                    intent.setClassName(contextG6, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    G4.t.g();
                    K4.F0.B(contextG6, intent);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    protected final synchronized void B6(String str, Object obj) {
        this.f26194a.put(str, obj);
        g0(H6(obj));
    }

    final /* synthetic */ MT D6() {
        return this.f26197d;
    }

    @Override // H4.V0
    public final void M2(String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2) {
        Context context = (Context) com.google.android.gms.dynamic.b.h0(aVar);
        ViewGroup viewGroup = (ViewGroup) com.google.android.gms.dynamic.b.h0(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.f26194a;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof B4.h) {
            C2985bU.a(context, viewGroup, (B4.h) obj);
        } else if (obj instanceof NativeAd) {
            C2985bU.b(context, viewGroup, (NativeAd) obj);
        }
    }

    public final void y6(BT bt) {
        this.f26199f = bt;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void z6(C2859aU c2859aU) {
        byte b10;
        try {
            String strB = c2859aU.b();
            switch (strB.hashCode()) {
                case -1999289321:
                    if (!strB.equals("NATIVE")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -1372958932:
                    if (!strB.equals("INTERSTITIAL")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case -428325382:
                    if (!strB.equals("APP_OPEN_AD")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case 543046670:
                    if (!strB.equals("REWARDED")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 1854800829:
                    if (!strB.equals("REWARDED_INTERSTITIAL")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case 1951953708:
                    if (!strB.equals("BANNER")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                String strA = c2859aU.a();
                D4.a.b(G6(), strA, c2859aU.c(), new NT(this, strA));
                return;
            }
            if (b10 == 1) {
                String strA2 = c2859aU.a();
                AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.Ra;
                com.google.android.gms.ads.c bVar = (((Boolean) H4.B.c().d(abstractC2759Zh)).booleanValue() && c2859aU.g()) ? new C4.b(G6()) : new B4.h(G6());
                bVar.setAdSize(c2859aU.d());
                bVar.setAdUnitId(strA2);
                bVar.setAdListener(new OT(this, strA2, bVar));
                B4.x xVarF = c2859aU.f();
                if (((Boolean) H4.B.c().d(abstractC2759Zh)).booleanValue() && c2859aU.g() && xVarF != null) {
                    ((C4.b) bVar).setVideoOptions(xVarF);
                }
                bVar.b(c2859aU.c());
                return;
            }
            if (b10 == 2) {
                String strA3 = c2859aU.a();
                M4.a.b(G6(), strA3, c2859aU.c(), new PT(this, strA3));
                return;
            }
            if (b10 != 3) {
                if (b10 == 4) {
                    String strA4 = c2859aU.a();
                    U4.c.d(G6(), strA4, c2859aU.c(), new QT(this, strA4));
                    return;
                } else {
                    if (b10 != 5) {
                        return;
                    }
                    String strA5 = c2859aU.a();
                    V4.a.d(G6(), strA5, c2859aU.c(), new RT(this, strA5));
                    return;
                }
            }
            final String strA6 = c2859aU.a();
            com.google.android.gms.ads.b.a aVar = new com.google.android.gms.ads.b.a(G6(), strA6);
            aVar.b(new NativeAd.c() { // from class: com.google.android.gms.internal.ads.XT
                @Override // com.google.android.gms.ads.nativead.NativeAd.c
                public final /* synthetic */ void a(NativeAd nativeAd) {
                    this.f25280a.B6(strA6, nativeAd);
                }
            });
            aVar.c(new ST(this));
            com.google.android.gms.ads.nativead.c cVarE = c2859aU.e();
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Ra)).booleanValue() && cVarE != null) {
                aVar.d(cVarE);
            }
            aVar.a().b(c2859aU.c());
        } catch (Throwable th) {
            throw th;
        }
    }
}

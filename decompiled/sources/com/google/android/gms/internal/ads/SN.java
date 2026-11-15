package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SN implements WM, GI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2097Mo f23175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4968rG f23176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5348uH f23177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final XF f23178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4347mK f23179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f23180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3502fb0 f23181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final L4.a f23182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C6019zb0 f23183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23184j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23185k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23186l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1890Io f23187m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C1942Jo f23188v;

    public SN(C1890Io c1890Io, C1942Jo c1942Jo, InterfaceC2097Mo interfaceC2097Mo, C4968rG c4968rG, C5348uH c5348uH, XF xf, C4347mK c4347mK, Context context, C3502fb0 c3502fb0, L4.a aVar, C6019zb0 c6019zb0) {
        this.f23187m = c1890Io;
        this.f23188v = c1942Jo;
        this.f23175a = interfaceC2097Mo;
        this.f23176b = c4968rG;
        this.f23177c = c5348uH;
        this.f23178d = xf;
        this.f23179e = c4347mK;
        this.f23180f = context;
        this.f23181g = c3502fb0;
        this.f23182h = aVar;
        this.f23183i = c6019zb0;
    }

    private static final HashMap x(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    private final void y(View view) {
        try {
            InterfaceC2097Mo interfaceC2097Mo = this.f23175a;
            if (interfaceC2097Mo != null && !interfaceC2097Mo.zzu()) {
                interfaceC2097Mo.y0(com.google.android.gms.dynamic.b.N0(view));
                this.f23178d.onAdClicked();
                if (((Boolean) H4.B.c().d(AbstractC3892ii.kc)).booleanValue()) {
                    this.f23179e.t0();
                    return;
                }
                return;
            }
            C1890Io c1890Io = this.f23187m;
            if (c1890Io != null && !c1890Io.a()) {
                c1890Io.R(com.google.android.gms.dynamic.b.N0(view));
                this.f23178d.onAdClicked();
                if (((Boolean) H4.B.c().d(AbstractC3892ii.kc)).booleanValue()) {
                    this.f23179e.t0();
                    return;
                }
                return;
            }
            C1942Jo c1942Jo = this.f23188v;
            if (c1942Jo == null || c1942Jo.zzo()) {
                return;
            }
            c1942Jo.o6(com.google.android.gms.dynamic.b.N0(view));
            this.f23178d.onAdClicked();
            if (((Boolean) H4.B.c().d(AbstractC3892ii.kc)).booleanValue()) {
                this.f23179e.t0();
            }
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Failed to call handleClick", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void a() {
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00cc A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:51:0x00cc), top: B:70:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00ca A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.WM
    public final void b(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ArrayList arrayList;
        ClassLoader classLoader;
        int size;
        int i10;
        Object obj2;
        com.google.android.gms.dynamic.a aVarA;
        try {
            com.google.android.gms.dynamic.a aVarN0 = com.google.android.gms.dynamic.b.N0(view);
            JSONObject jSONObject = this.f23181g.f28414j0;
            boolean z9 = true;
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29795d2)).booleanValue() && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29806e2)).booleanValue() && next.equals("3010")) {
                                InterfaceC2097Mo interfaceC2097Mo = this.f23175a;
                                Object objH0 = null;
                                if (interfaceC2097Mo != null) {
                                    try {
                                        aVarA = interfaceC2097Mo.a();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    C1890Io c1890Io = this.f23187m;
                                    if (c1890Io != null) {
                                        aVarA = c1890Io.S3();
                                    } else {
                                        C1942Jo c1942Jo = this.f23188v;
                                        aVarA = c1942Jo != null ? c1942Jo.zzu() : null;
                                    }
                                }
                                if (aVarA != null) {
                                    objH0 = com.google.android.gms.dynamic.b.h0(aVarA);
                                }
                                if (objH0 != null) {
                                    cls = objH0.getClass();
                                    arrayList = new ArrayList();
                                    K4.S.a(jSONArrayOptJSONArray, arrayList);
                                    G4.t.g();
                                    classLoader = this.f23180f.getClassLoader();
                                    size = arrayList.size();
                                    i10 = 0;
                                    while (true) {
                                        if (i10 < size) {
                                            obj2 = arrayList.get(i10);
                                            i10++;
                                            if (Class.forName((String) obj2, false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    arrayList = new ArrayList();
                                    K4.S.a(jSONArrayOptJSONArray, arrayList);
                                    G4.t.g();
                                    classLoader = this.f23180f.getClassLoader();
                                    size = arrayList.size();
                                    i10 = 0;
                                    while (true) {
                                        if (i10 < size) {
                                            obj2 = arrayList.get(i10);
                                            i10++;
                                            if (Class.forName((String) obj2, false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z9 = false;
                        break;
                    }
                }
            }
            this.f23186l = z9;
            HashMap mapX = x(map);
            HashMap mapX2 = x(map2);
            InterfaceC2097Mo interfaceC2097Mo2 = this.f23175a;
            if (interfaceC2097Mo2 != null) {
                interfaceC2097Mo2.i1(aVarN0, com.google.android.gms.dynamic.b.N0(mapX), com.google.android.gms.dynamic.b.N0(mapX2));
                return;
            }
            C1890Io c1890Io2 = this.f23187m;
            if (c1890Io2 != null) {
                c1890Io2.t4(aVarN0, com.google.android.gms.dynamic.b.N0(mapX), com.google.android.gms.dynamic.b.N0(mapX2));
                c1890Io2.g1(aVarN0);
                return;
            }
            C1942Jo c1942Jo2 = this.f23188v;
            if (c1942Jo2 != null) {
                c1942Jo2.Z2(aVarN0, com.google.android.gms.dynamic.b.N0(mapX), com.google.android.gms.dynamic.b.N0(mapX2));
                c1942Jo2.H1(aVarN0);
            }
        } catch (RemoteException e10) {
            int i11 = AbstractC0786o0.f2696b;
            L4.p.g("Failed to call trackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final boolean c() {
        return this.f23181g.f28380L;
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void c0(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void d(View view, Map map) {
        try {
            com.google.android.gms.dynamic.a aVarN0 = com.google.android.gms.dynamic.b.N0(view);
            InterfaceC2097Mo interfaceC2097Mo = this.f23175a;
            if (interfaceC2097Mo != null) {
                interfaceC2097Mo.B4(aVarN0);
                return;
            }
            C1890Io c1890Io = this.f23187m;
            if (c1890Io != null) {
                c1890Io.B2(aVarN0);
                return;
            }
            C1942Jo c1942Jo = this.f23188v;
            if (c1942Jo != null) {
                c1942Jo.X1(aVarN0);
            }
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Failed to call untrackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void d0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void e(View view) {
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void f(InterfaceC2245Pk interfaceC2245Pk) {
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void g() {
        int i10 = AbstractC0786o0.f2696b;
        L4.p.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final JSONObject h(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void i(H4.I0 i10) {
        int i11 = AbstractC0786o0.f2696b;
        L4.p.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void j(View view, View view2, Map map, Map map2, boolean z9, ImageView.ScaleType scaleType, int i10) {
        if (!this.f23185k) {
            int i11 = AbstractC0786o0.f2696b;
            L4.p.f("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f23181g.f28380L) {
            y(view2);
        } else {
            int i12 = AbstractC0786o0.f2696b;
            L4.p.f("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void k(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final boolean l(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void m(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void n(H4.F0 f10) {
        int i10 = AbstractC0786o0.f2696b;
        L4.p.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final JSONObject o(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void p(View view, View view2, Map map, Map map2, boolean z9, ImageView.ScaleType scaleType) {
        if (this.f23185k && this.f23181g.f28380L) {
            return;
        }
        y(view);
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final boolean q() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void s() {
        try {
            InterfaceC2097Mo interfaceC2097Mo = this.f23175a;
            if (interfaceC2097Mo != null) {
                interfaceC2097Mo.z();
            }
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Failed to call destroy", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void t(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f23184j) {
                this.f23184j = G4.t.s().g(this.f23180f, this.f23182h.f3097a, this.f23181g.f28365C.toString(), this.f23183i.f35798g);
            }
            if (this.f23186l) {
                InterfaceC2097Mo interfaceC2097Mo = this.f23175a;
                if (interfaceC2097Mo == null) {
                    C1890Io c1890Io = this.f23187m;
                    if (c1890Io != null && !c1890Io.h()) {
                        c1890Io.e();
                        this.f23176b.zza();
                        return;
                    }
                    C1942Jo c1942Jo = this.f23188v;
                    if (c1942Jo == null || c1942Jo.zzn()) {
                        return;
                    }
                    c1942Jo.zzk();
                    this.f23176b.zza();
                    return;
                }
                C3502fb0 c3502fb0 = this.f23181g;
                if (c3502fb0.f28368D0) {
                    if (interfaceC2097Mo.g()) {
                        return;
                    }
                    interfaceC2097Mo.q();
                    this.f23176b.zza();
                    return;
                }
                if (interfaceC2097Mo.g() && c3502fb0.f28403e == 4) {
                    this.f23177c.zza();
                } else {
                    interfaceC2097Mo.q();
                    this.f23176b.zza();
                }
            }
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Failed to call recordImpression", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void u() {
    }

    @Override // com.google.android.gms.internal.ads.GI
    public final void v() {
        try {
            InterfaceC2097Mo interfaceC2097Mo = this.f23175a;
            if (interfaceC2097Mo == null || !interfaceC2097Mo.g()) {
                return;
            }
            C3502fb0 c3502fb0 = this.f23181g;
            if (c3502fb0.f28403e != 4 && !c3502fb0.f28368D0) {
                return;
            }
            interfaceC2097Mo.q();
            this.f23176b.zza();
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Failed to report impression from an adapter", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.GI
    public final void w() {
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void zzg() {
        this.f23185k = true;
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.WM
    public final int zzu() {
        return 0;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4646oh0 implements InterfaceC2290Qg0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C4646oh0 f32172h = new C4646oh0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Handler f32173i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f32174j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Runnable f32175k = new RunnableC4394mh0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f32176l = new RunnableC4520nh0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32178b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f32183g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32177a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f32179c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4016jh0 f32181e = new C4016jh0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2394Sg0 f32180d = new C2394Sg0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C4142kh0 f32182f = new C4142kh0(new C5023rh0());

    C4646oh0() {
    }

    public static C4646oh0 b() {
        return f32172h;
    }

    private final void k(View view, InterfaceC2342Rg0 interfaceC2342Rg0, JSONObject jSONObject, int i10, boolean z9) {
        interfaceC2342Rg0.b(view, jSONObject, this, i10 == 1, z9);
    }

    private static final void l() {
        Handler handler = f32174j;
        if (handler != null) {
            handler.removeCallbacks(f32176l);
            f32174j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2290Qg0
    public final void a(View view, InterfaceC2342Rg0 interfaceC2342Rg0, JSONObject jSONObject, boolean z9) {
        C4016jh0 c4016jh0;
        int iL;
        boolean z10;
        if (AbstractC3766hh0.a(view) != null || (iL = (c4016jh0 = this.f32181e).l(view)) == 3) {
            return;
        }
        JSONObject jSONObjectA = interfaceC2342Rg0.a(view);
        AbstractC3137ch0.e(jSONObject, jSONObjectA);
        String strG = c4016jh0.g(view);
        if (strG != null) {
            AbstractC3137ch0.d(jSONObjectA, strG);
            try {
                jSONObjectA.put("hasWindowFocus", Boolean.valueOf(this.f32181e.j(view)));
            } catch (JSONException e10) {
                AbstractC3263dh0.a("Error with setting has window focus", e10);
            }
            boolean zK = this.f32181e.k(strG);
            Boolean boolValueOf = Boolean.valueOf(zK);
            if (zK) {
                try {
                    jSONObjectA.put("isPipActive", boolValueOf);
                } catch (JSONException e11) {
                    AbstractC3263dh0.a("Error with setting is picture-in-picture active", e11);
                }
            }
            this.f32181e.f();
            this = this;
        } else {
            C3891ih0 c3891ih0I = c4016jh0.i(view);
            if (c3891ih0I != null) {
                C1875Ig0 c1875Ig0B = c3891ih0I.b();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListC = c3891ih0I.c();
                int size = arrayListC.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put((String) arrayListC.get(i10));
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", c1875Ig0B.b());
                    jSONObjectA.put("friendlyObstructionPurpose", c1875Ig0B.c());
                    jSONObjectA.put("friendlyObstructionReason", c1875Ig0B.d());
                } catch (JSONException e12) {
                    AbstractC3263dh0.a("Error with setting friendly obstruction", e12);
                }
                z10 = true;
            } else {
                z10 = false;
            }
            k(view, interfaceC2342Rg0, jSONObjectA, iL, z9 || z10);
        }
        this.f32178b++;
    }

    public final void c() {
        if (f32174j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f32174j = handler;
            handler.post(f32175k);
            f32174j.postDelayed(f32176l, 200L);
        }
    }

    public final void d() {
        l();
        this.f32177a.clear();
        f32173i.post(new RunnableC4268lh0(this));
    }

    public final void e() {
        l();
    }

    final /* synthetic */ void f() {
        C4646oh0 c4646oh0;
        this.f32178b = 0;
        this.f32179c.clear();
        for (C4266lg0 c4266lg0 : C1719Fg0.a().f()) {
        }
        this.f32183g = System.nanoTime();
        C4016jh0 c4016jh0 = this.f32181e;
        c4016jh0.d();
        C2394Sg0 c2394Sg0 = this.f32180d;
        long jNanoTime = System.nanoTime();
        InterfaceC2342Rg0 interfaceC2342Rg0A = c2394Sg0.a();
        if (c4016jh0.b().size() > 0) {
            for (String str : c4016jh0.b()) {
                JSONObject jSONObjectA = interfaceC2342Rg0A.a(null);
                View viewH = c4016jh0.h(str);
                InterfaceC2342Rg0 interfaceC2342Rg0B = c2394Sg0.b();
                String strC = c4016jh0.c(str);
                if (strC != null) {
                    JSONObject jSONObjectA2 = interfaceC2342Rg0B.a(viewH);
                    AbstractC3137ch0.d(jSONObjectA2, str);
                    try {
                        jSONObjectA2.put("notVisibleReason", strC);
                    } catch (JSONException e10) {
                        AbstractC3263dh0.a("Error with setting not visible reason", e10);
                    }
                    AbstractC3137ch0.e(jSONObjectA, jSONObjectA2);
                }
                AbstractC3137ch0.f(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.f32182f.b(jSONObjectA, hashSet, jNanoTime);
            }
        }
        C4016jh0 c4016jh1 = this.f32181e;
        if (c4016jh1.a().size() > 0) {
            JSONObject jSONObjectA3 = interfaceC2342Rg0A.a(null);
            c4646oh0 = this;
            c4646oh0.k(null, interfaceC2342Rg0A, jSONObjectA3, 1, false);
            AbstractC3137ch0.f(jSONObjectA3);
            c4646oh0.f32182f.a(jSONObjectA3, c4016jh1.a(), jNanoTime);
        } else {
            c4646oh0 = this;
            c4646oh0.f32182f.c();
        }
        c4016jh1.e();
        long jNanoTime2 = System.nanoTime() - c4646oh0.f32183g;
        List list = c4646oh0.f32177a;
        if (list.size() > 0) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                p070h.w.a(it.next());
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                throw null;
            }
        }
        C2238Pg0.a().c();
    }

    final /* synthetic */ C4142kh0 h() {
        return this.f32182f;
    }
}

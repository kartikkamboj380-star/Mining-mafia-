package com.google.android.gms.internal.ads;

import H4.C0654z;
import K4.AbstractC0786o0;
import android.os.IBinder;
import android.text.TextUtils;
import app.notifee.core.event.LogEvent;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4617oT implements InterfaceC3082cG, IH, SG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BT f32078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32080c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RF f32083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private H4.Z0 f32084g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JSONObject f32088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSONObject f32089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f32090m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f32091v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f32092w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f32085h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f32086i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f32087j = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32081d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnumC4491nT f32082e = EnumC4491nT.AD_REQUESTED;

    C4617oT(BT bt, C6019zb0 c6019zb0, String str) {
        this.f32078a = bt;
        this.f32080c = str;
        this.f32079b = c6019zb0.f35798g;
    }

    private final JSONObject f(RF rf) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", rf.zze());
        jSONObject.put("responseSecsSinceEpoch", rf.z6());
        jSONObject.put("responseId", rf.b());
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Ia)).booleanValue()) {
            String strA6 = rf.A6();
            if (!TextUtils.isEmpty(strA6)) {
                String strValueOf = String.valueOf(strA6);
                int i10 = AbstractC0786o0.f2696b;
                L4.p.a("Bidding data: ".concat(strValueOf));
                jSONObject.put("biddingData", new JSONObject(strA6));
            }
        }
        if (!TextUtils.isEmpty(this.f32085h)) {
            jSONObject.put("adRequestUrl", this.f32085h);
        }
        if (!TextUtils.isEmpty(this.f32086i)) {
            jSONObject.put("postBody", this.f32086i);
        }
        if (!TextUtils.isEmpty(this.f32087j)) {
            jSONObject.put("adResponseBody", this.f32087j);
        }
        Object obj = this.f32088k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f32089l;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.La)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f32092w);
        }
        JSONArray jSONArray = new JSONArray();
        for (H4.q2 q2Var : rf.zzg()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", q2Var.f1418a);
            jSONObject2.put("latencyMillis", q2Var.f1419b);
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Ja)).booleanValue()) {
                jSONObject2.put("credentials", C0654z.a().v(q2Var.f1421d));
            }
            H4.Z0 z9 = q2Var.f1420c;
            jSONObject2.put(LogEvent.LEVEL_ERROR, z9 == null ? null : g(z9));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    private static JSONObject g(H4.Z0 z9) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", z9.f1254c);
        jSONObject.put("errorCode", z9.f1252a);
        jSONObject.put("errorDescription", z9.f1253b);
        H4.Z0 z10 = z9.f1255d;
        jSONObject.put("underlyingError", z10 == null ? null : g(z10));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void D0(C5420ur c5420ur) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Pa)).booleanValue()) {
            return;
        }
        BT bt = this.f32078a;
        if (bt.t()) {
            bt.l(this.f32079b, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.SG
    public final void W0(AbstractC4711pD abstractC4711pD) {
        BT bt = this.f32078a;
        if (bt.t()) {
            this.f32083f = abstractC4711pD.d();
            this.f32082e = EnumC4491nT.AD_LOADED;
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Pa)).booleanValue()) {
                bt.l(this.f32079b, this);
            }
        }
    }

    public final boolean a() {
        return this.f32082e != EnumC4491nT.AD_REQUESTED;
    }

    public final String b() {
        return this.f32080c;
    }

    public final void c() {
        this.f32090m = true;
    }

    public final void d() {
        this.f32091v = true;
    }

    public final JSONObject e() throws JSONException {
        JSONObject jSONObjectF;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f32082e);
        jSONObject.put("format", C3502fb0.a(this.f32081d));
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Pa)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f32090m);
            if (this.f32090m) {
                jSONObject.put("shown", this.f32091v);
            }
        }
        RF rf = this.f32083f;
        if (rf != null) {
            jSONObjectF = f(rf);
        } else {
            H4.Z0 z9 = this.f32084g;
            JSONObject jSONObjectF2 = null;
            if (z9 != null && (iBinder = z9.f1256e) != null) {
                RF rf2 = (RF) iBinder;
                jSONObjectF2 = f(rf2);
                if (rf2.zzg().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(g(this.f32084g));
                    jSONObjectF2.put("errors", jSONArray);
                }
            }
            jSONObjectF = jSONObjectF2;
        }
        jSONObject.put("responseInfo", jSONObjectF);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void i(C5011rb0 c5011rb0) {
        BT bt = this.f32078a;
        if (bt.t()) {
            C4886qb0 c4886qb0 = c5011rb0.f32991b;
            List list = c4886qb0.f32671a;
            if (!list.isEmpty()) {
                this.f32081d = ((C3502fb0) list.get(0)).f28397b;
            }
            C3880ib0 c3880ib0 = c4886qb0.f32672b;
            String str = c3880ib0.f29465l;
            if (!TextUtils.isEmpty(str)) {
                this.f32085h = str;
            }
            String str2 = c3880ib0.f29466m;
            if (!TextUtils.isEmpty(str2)) {
                this.f32086i = str2;
            }
            JSONObject jSONObject = c3880ib0.f29469p;
            if (jSONObject.length() > 0) {
                this.f32089l = jSONObject;
            }
            if (((Boolean) H4.B.c().d(AbstractC3892ii.La)).booleanValue()) {
                if (!bt.n()) {
                    this.f32092w = true;
                    return;
                }
                String str3 = c3880ib0.f29467n;
                if (!TextUtils.isEmpty(str3)) {
                    this.f32087j = str3;
                }
                JSONObject jSONObject2 = c3880ib0.f29468o;
                if (jSONObject2.length() > 0) {
                    this.f32088k = jSONObject2;
                }
                JSONObject jSONObject3 = this.f32088k;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f32087j)) {
                    length += this.f32087j.length();
                }
                bt.m(length);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3082cG
    public final void w(H4.Z0 z9) {
        BT bt = this.f32078a;
        if (bt.t()) {
            this.f32082e = EnumC4491nT.AD_LOAD_FAILED;
            this.f32084g = z9;
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Pa)).booleanValue()) {
                bt.l(this.f32079b, this);
            }
        }
    }
}

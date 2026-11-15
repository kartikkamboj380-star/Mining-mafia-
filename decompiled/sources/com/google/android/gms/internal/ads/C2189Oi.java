package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import Q4.AbstractC0928c;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import app.notifee.core.event.LogEvent;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2189Oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f21632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q4.k0 f21633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q4.b0 f21634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WR f21635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f21636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2034Li f21637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p180s.f f21638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f21640i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f21641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JSONArray f21642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f21643l;

    public C2189Oi(ScheduledExecutorService scheduledExecutorService, Q4.k0 k0Var, Q4.b0 b0Var, WR wr) {
        this.f21632a = scheduledExecutorService;
        this.f21633b = k0Var;
        this.f21634c = b0Var;
        this.f21635d = wr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (((java.lang.Boolean) H4.B.c().d(com.google.android.gms.internal.ads.AbstractC3892ii.pb)).booleanValue() != false) goto L23;
     */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.Li r0 = r5.f21637f
            if (r0 != 0) goto Lc
            int r0 = K4.AbstractC0786o0.f2696b
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            L4.p.c(r0)
            return
        Lc:
            java.lang.Boolean r0 = r0.l()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.String r0 = r5.f21639h
            if (r0 == 0) goto L70
            s.f r0 = r5.f21638g
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r5.f21632a
            if (r0 == 0) goto L70
            long r1 = r5.f21640i
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2c
            goto L3b
        L2c:
            com.google.android.gms.common.util.Clock r1 = G4.t.o()
            long r1 = r1.elapsedRealtime()
            long r3 = r5.f21640i
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3b
            goto L4d
        L3b:
            com.google.android.gms.internal.ads.Zh r1 = com.google.android.gms.internal.ads.AbstractC3892ii.pb
            com.google.android.gms.internal.ads.gi r2 = H4.B.c()
            java.lang.Object r1 = r2.d(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L70
        L4d:
            s.f r1 = r5.f21638g
            java.lang.String r2 = r5.f21639h
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.i(r2)
            java.lang.Runnable r1 = r5.f21636e
            com.google.android.gms.internal.ads.Zh r2 = com.google.android.gms.internal.ads.AbstractC3892ii.qb
            com.google.android.gms.internal.ads.gi r3 = H4.B.c()
            java.lang.Object r2 = r3.d(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L70:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            K4.AbstractC0786o0.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2189Oi.h():void");
    }

    private final void k(JSONObject jSONObject) {
        try {
            if (this.f21642k == null) {
                this.f21642k = new JSONArray((String) H4.B.c().d(AbstractC3892ii.sb));
            }
            jSONObject.put("eids", this.f21642k);
        } catch (JSONException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Error fetching the PACT active eids JSON: ", e10);
        }
    }

    public final void a(Context context, p180s.c cVar, String str, p180s.b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.f21643l = context;
        this.f21639h = str;
        WR wr = this.f21635d;
        C2034Li c2034Li = new C2034Li(this, bVar, wr);
        this.f21637f = c2034Li;
        p180s.f fVarE = cVar.e(c2034Li);
        this.f21638g = fVarE;
        if (fVarE == null) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.c("CustomTabsClient failed to create new session.");
        }
        AbstractC0928c.e(wr, null, "pact_action", new Pair("pe", "pact_init"));
    }

    public final p180s.f b() {
        return this.f21638g;
    }

    final void c() {
        this.f21640i = G4.t.o().elapsedRealtime() + ((long) ((Integer) H4.B.c().d(AbstractC3892ii.ob)).intValue());
        if (this.f21636e == null) {
            this.f21636e = new Runnable() { // from class: com.google.android.gms.internal.ads.Ni
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f21327a.h();
                }
            };
        }
        h();
    }

    final void d(String str) {
        try {
            p180s.f fVar = this.f21638g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f21641j).toString());
            k(jSONObject);
            if (((Boolean) AbstractC4775pj.f32463c.e()).booleanValue()) {
                jSONObject.put("as", this.f21634c.b());
            }
            fVar.h(jSONObject.toString(), null);
            C2085Mi c2085Mi = new C2085Mi(this, str);
            if (((Boolean) AbstractC4775pj.f32465e.e()).booleanValue()) {
                this.f21633b.b(this.f21638g, c2085Mi);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            T4.a.a(this.f21643l, B4.b.BANNER, ((AdRequest.Builder) new AdRequest.Builder().d(AdMobAdapter.class, bundle)).n(), c2085Mi);
        } catch (JSONException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Error creating JSON: ", e10);
        }
    }

    final JSONObject e(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put(LogEvent.LEVEL_ERROR, str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC4775pj.f32465e.e()).booleanValue() ? ((Long) AbstractC4775pj.f32468h.e()).longValue() : 0L);
        k(jSONObject);
        if (((Boolean) AbstractC4775pj.f32463c.e()).booleanValue()) {
            jSONObject.put("as", this.f21634c.b());
        }
        return jSONObject;
    }

    final JSONObject f(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC4775pj.f32465e.e()).booleanValue() ? ((Long) AbstractC4775pj.f32468h.e()).longValue() : 0L);
        k(jSONObject);
        if (((Boolean) AbstractC4775pj.f32463c.e()).booleanValue()) {
            jSONObject.put("as", this.f21634c.b());
        }
        return jSONObject;
    }

    public final void g(long j10) {
        this.f21641j = j10;
    }

    final /* synthetic */ p180s.f i() {
        return this.f21638g;
    }
}

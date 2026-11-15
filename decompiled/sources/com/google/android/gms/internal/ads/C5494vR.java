package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5494vR implements IH, OG, InterfaceC3082cG, AK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JR f34059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WR f34060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34061c;

    C5494vR(JR jr, WR wr, int i10) {
        this.f34059a = jr;
        this.f34060b = wr;
        this.f34061c = i10;
    }

    private final void b(Bundle bundle, AbstractC5931yu0 abstractC5931yu0) {
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29602K2)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(EnumC5746xR.PUBLIC_API_CALLBACK.c(), G4.t.o().currentTimeMillis());
        JR jr = this.f34059a;
        jr.f();
        boolean zContainsKey = bundle.containsKey("ls");
        String str = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        if (zContainsKey) {
            jr.d("ls", true != bundle.getBoolean("ls") ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
        int size = abstractC5931yu0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C5872yR c5872yR = (C5872yR) abstractC5931yu0.get(i10);
            long j10 = bundle.getLong(c5872yR.b().c(), -1L);
            long j11 = bundle.getLong(c5872yR.c().c(), -1L);
            if (j10 > 0 && j11 > 0) {
                jr.d(c5872yR.a(), String.valueOf(j11 - j10));
            }
        }
        c(bundle.getBundle("client_sig_latency_key"));
        c(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f30032y8)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                if (true != bundle.getBoolean("sod_h")) {
                    str = "0";
                }
                jr.d("sod_h", str);
            }
            if (bundle.containsKey("cmr")) {
                jr.d("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    private final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j10 = bundle.getLong(str);
            if (j10 >= 0) {
                this.f34059a.d(str, String.valueOf(j10));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void D0(C5420ur c5420ur) {
        this.f34059a.b(c5420ur.f33908a);
    }

    @Override // com.google.android.gms.internal.ads.AK
    public final void a(Q4.M m10) {
        String str;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29677R7)).booleanValue()) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f30032y8)).booleanValue()) {
                this.f34059a.c().put("sgw", String.valueOf(this.f34061c));
            }
            if (m10 == null) {
                JR jr = this.f34059a;
                jr.c().put(HandleInvocationsFromAdViewer.KEY_ACTION, "sgs");
                jr.c().put("request_id", "-1");
                this.f34060b.b(jr.c());
                return;
            }
            C5420ur c5420ur = m10.f4847d;
            Bundle bundle = m10.f4848e;
            if (c5420ur != null) {
                b(c5420ur.f33920m, C5872yR.f35351d);
            } else if (bundle != null && !bundle.isEmpty()) {
                b(bundle, C5872yR.f35351d);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(m10.f4846c) ? m10.f4845b : m10.f4846c);
                JR jr2 = this.f34059a;
                jr2.c().put(HandleInvocationsFromAdViewer.KEY_ACTION, "sgs");
                Map mapC = jr2.c();
                if (((Boolean) H4.B.c().d(AbstractC3892ii.fb)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS).getBoolean("accept_3p_cookie") ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0";
                    } catch (JSONException e10) {
                        int i10 = AbstractC0786o0.f2696b;
                        L4.p.d("Error retrieving JSONObject from the requestJson, ", e10);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                mapC.put("tpc", str);
                C5420ur c5420ur2 = m10.f4847d;
                if (c5420ur2 != null) {
                    this.f34059a.b(c5420ur2.f33908a);
                }
                JR jr3 = this.f34059a;
                jr3.g();
                this.f34060b.b(jr3.c());
            } catch (JSONException unused) {
                JR jr4 = this.f34059a;
                jr4.c().put(HandleInvocationsFromAdViewer.KEY_ACTION, "sgf");
                jr4.c().put("sgf_reason", "request_invalid");
                this.f34060b.b(jr4.c());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void i(C5011rb0 c5011rb0) {
        this.f34059a.a(c5011rb0);
    }

    @Override // com.google.android.gms.internal.ads.AK
    public final void k(String str) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29677R7)).booleanValue()) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f30032y8)).booleanValue()) {
                this.f34059a.c().put("sgw", String.valueOf(this.f34061c));
            }
            JR jr = this.f34059a;
            jr.c().put(HandleInvocationsFromAdViewer.KEY_ACTION, "sgf");
            jr.d("sgf_reason", str);
            jr.g();
            this.f34060b.b(jr.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3082cG
    public final void w(H4.Z0 z9) {
        JR jr = this.f34059a;
        jr.c().put(HandleInvocationsFromAdViewer.KEY_ACTION, "ftl");
        jr.d("ftl", String.valueOf(z9.f1252a));
        jr.d("ed", z9.f1254c);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29834g8)).booleanValue()) {
            jr.d("emsg", z9.f1253b);
        }
        jr.g();
        this.f34060b.b(jr.c());
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void zzg() {
        JR jr = this.f34059a;
        jr.c().put(HandleInvocationsFromAdViewer.KEY_ACTION, "loaded");
        b(jr.e(), C5872yR.f35352e);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.de)).booleanValue()) {
            jr.c().put("mafe", true != I0.j.a("MUTE_AUDIO") ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
        jr.g();
        this.f34060b.b(jr.c());
    }
}

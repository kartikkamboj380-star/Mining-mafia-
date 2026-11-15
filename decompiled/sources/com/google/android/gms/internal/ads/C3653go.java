package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3653go implements InterfaceC2303Qn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2407Sn f28738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2459Tn f28739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2095Mn f28740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28741d;

    C3653go(C2095Mn c2095Mn, String str, InterfaceC2459Tn interfaceC2459Tn, InterfaceC2407Sn interfaceC2407Sn) {
        this.f28740c = c2095Mn;
        this.f28741d = str;
        this.f28739b = interfaceC2459Tn;
        this.f28738a = interfaceC2407Sn;
    }

    final /* synthetic */ void a(C1784Gn c1784Gn, InterfaceC2147Nn interfaceC2147Nn, Object obj, C2575Vt c2575Vt) {
        try {
            G4.t.g();
            String string = UUID.randomUUID().toString();
            AbstractC2040Ll.f20649o.b(string, new C3527fo(this, c1784Gn, c2575Vt));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", this.f28739b.zzb(obj));
            interfaceC2147Nn.zzb(this.f28741d, jSONObject);
        } catch (Exception e10) {
            try {
                c2575Vt.c(e10);
                int i10 = AbstractC0786o0.f2696b;
                L4.p.d("Unable to invokeJavascript", e10);
            } finally {
                c1784Gn.g();
            }
        }
    }

    final /* synthetic */ InterfaceC2407Sn b() {
        return this.f28738a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
    public final com.google.common.util.concurrent.p zza(Object obj) {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2303Qn
    public final com.google.common.util.concurrent.p zzb(Object obj) {
        C2575Vt c2575Vt = new C2575Vt();
        C1784Gn c1784GnB = this.f28740c.b(null);
        AbstractC0786o0.k("callJs > getEngine: Promise created");
        c1784GnB.a(new C3150co(this, c1784GnB, obj, c2575Vt), new C3401eo(this, c2575Vt, c1784GnB));
        return c2575Vt;
    }
}

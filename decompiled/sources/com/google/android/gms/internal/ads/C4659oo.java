package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4659oo implements InterfaceC3294dx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32201a = "google.afma.activeView.handleUpdate";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.common.util.concurrent.p f32202b;

    C4659oo(com.google.common.util.concurrent.p pVar, String str, InterfaceC2459Tn interfaceC2459Tn, InterfaceC2407Sn interfaceC2407Sn) {
        this.f32202b = pVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.p a(Object obj, InterfaceC2147Nn interfaceC2147Nn) throws JSONException {
        C2575Vt c2575Vt = new C2575Vt();
        G4.t.g();
        String string = UUID.randomUUID().toString();
        AbstractC2040Ll.f20649o.b(string, new C4407mo(this, c2575Vt));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        interfaceC2147Nn.zzb(this.f32201a, jSONObject);
        return c2575Vt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
    public final com.google.common.util.concurrent.p zza(Object obj) {
        return zzb(obj);
    }

    public final com.google.common.util.concurrent.p zzb(final Object obj) {
        return AbstractC5685wx0.j(this.f32202b, new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.no
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj2) {
                return this.f31888a.a(obj, (InterfaceC2147Nn) obj2);
            }
        }, AbstractC2315Qt.f22479g);
    }
}

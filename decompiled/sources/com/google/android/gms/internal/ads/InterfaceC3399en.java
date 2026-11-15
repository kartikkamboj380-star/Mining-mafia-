package com.google.android.gms.internal.ads;

import H4.C0654z;
import K4.AbstractC0786o0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3399en extends InterfaceC4783pn, InterfaceC3274dn {
    @Override // com.google.android.gms.internal.ads.InterfaceC3274dn
    default void b(String str, Map map) {
        try {
            p(str, C0654z.a().t(map));
        } catch (JSONException unused) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4783pn
    void k(String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC4783pn
    default void o(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        k(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274dn
    default void p(String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        String string2 = sb.toString();
        int i10 = AbstractC0786o0.f2696b;
        L4.p.a("Dispatching AFMA event: ".concat(string2));
        k(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4783pn
    default void zzb(String str, JSONObject jSONObject) {
        o(str, jSONObject.toString());
    }
}

package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3272dm implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f27503a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f27504b = new HashMap();

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.f27503a) {
            try {
                InterfaceC3146cm interfaceC3146cm = (InterfaceC3146cm) this.f27504b.remove(str);
                if (interfaceC3146cm == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                    sb.append("Received result for unexpected method invocation: ");
                    sb.append(str);
                    String string = sb.toString();
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.f(string);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + strConcat.length());
                    sb2.append(str3);
                    sb2.append(strConcat);
                    interfaceC3146cm.j(sb2.toString());
                    return;
                }
                if (str5 == null) {
                    interfaceC3146cm.k(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (AbstractC0786o0.m()) {
                        String string2 = jSONObject.toString(2);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 13);
                        sb3.append("Result GMSG: ");
                        sb3.append(string2);
                        AbstractC0786o0.k(sb3.toString());
                    }
                    interfaceC3146cm.k(jSONObject);
                } catch (JSONException e10) {
                    interfaceC3146cm.j(e10.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, InterfaceC3146cm interfaceC3146cm) {
        synchronized (this.f27503a) {
            this.f27504b.put(str, interfaceC3146cm);
        }
    }

    public final com.google.common.util.concurrent.p c(InterfaceC4783pn interfaceC4783pn, String str, JSONObject jSONObject) {
        C2575Vt c2575Vt = new C2575Vt();
        G4.t.g();
        String string = UUID.randomUUID().toString();
        b(string, new C3021bm(this, c2575Vt));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            interfaceC4783pn.zzb(str, jSONObject2);
            return c2575Vt;
        } catch (Exception e10) {
            c2575Vt.c(e10);
            return c2575Vt;
        }
    }
}

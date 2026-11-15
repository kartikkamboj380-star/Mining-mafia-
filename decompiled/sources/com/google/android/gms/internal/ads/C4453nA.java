package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4453nA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f31727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f31728b;

    C4453nA(Map map, Map map2) {
        this.f31727a = map;
        this.f31728b = map2;
    }

    public final void a(C5011rb0 c5011rb0) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (C4760pb0 c4760pb0 : c5011rb0.f32991b.f32673c) {
            Map map = this.f31727a;
            String str = c4760pb0.f32431a;
            if (!map.containsKey(str) || (jSONObject2 = c4760pb0.f32432b) == null) {
                Map map2 = this.f31728b;
                if (map2.containsKey(str) && (jSONObject = c4760pb0.f32432b) != null) {
                    InterfaceC4705pA interfaceC4705pA = (InterfaceC4705pA) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    interfaceC4705pA.a(map3);
                }
            } else {
                ((InterfaceC4831qA) map.get(str)).k(jSONObject2);
            }
        }
    }
}

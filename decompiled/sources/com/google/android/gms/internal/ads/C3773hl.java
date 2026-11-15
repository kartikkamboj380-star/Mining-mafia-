package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3773hl implements InterfaceC2091Ml {
    C3773hl() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObjectZzc;
        InterfaceC1750Fw interfaceC1750Fw = (InterfaceC1750Fw) obj;
        InterfaceC2087Mj interfaceC2087MjY = interfaceC1750Fw.Y();
        if (interfaceC2087MjY == null || (jSONObjectZzc = interfaceC2087MjY.zzc()) == null) {
            interfaceC1750Fw.p("nativeAdViewSignalsReady", new JSONObject());
        } else {
            interfaceC1750Fw.p("nativeAdViewSignalsReady", jSONObjectZzc);
        }
    }
}

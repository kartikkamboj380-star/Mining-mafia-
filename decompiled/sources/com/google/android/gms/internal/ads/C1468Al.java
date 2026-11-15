package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1468Al implements InterfaceC2091Ml {
    C1468Al() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC1750Fw interfaceC1750Fw = (InterfaceC1750Fw) obj;
        if (map.containsKey("start")) {
            interfaceC1750Fw.q0(true);
        }
        if (map.containsKey("stop")) {
            interfaceC1750Fw.q0(false);
        }
    }
}

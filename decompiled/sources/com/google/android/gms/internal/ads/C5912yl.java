package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5912yl implements InterfaceC2091Ml {
    C5912yl() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC1750Fw interfaceC1750Fw = (InterfaceC1750Fw) obj;
        String str = (String) map.get(HandleInvocationsFromAdViewer.KEY_ACTION);
        if ("pause".equals(str)) {
            interfaceC1750Fw.j1();
        } else if ("resume".equals(str)) {
            interfaceC1750Fw.b1();
        }
    }
}

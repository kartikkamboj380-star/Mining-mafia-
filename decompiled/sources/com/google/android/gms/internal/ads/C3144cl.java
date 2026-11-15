package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import app.notifee.core.event.LogEvent;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3144cl implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3270dl f27193a;

    public C3144cl(InterfaceC3270dl interfaceC3270dl) {
        this.f27193a = interfaceC3270dl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        String str = (String) map.get(MediationMetaData.KEY_NAME);
        if (str != null) {
            this.f27193a.I0(str, (String) map.get(LogEvent.LEVEL_INFO));
        } else {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.f("App event with no name parameter.");
        }
    }
}

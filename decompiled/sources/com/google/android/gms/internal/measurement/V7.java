package com.google.android.gms.internal.measurement;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class V7 extends AbstractC6235j {
    public V7() {
        super("internal.platform");
        this.f36719b.put(MobileAdsBridge.versionMethodName, new U7(this, MobileAdsBridge.versionMethodName));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6235j
    public final InterfaceC6289p c(C6157a2 c6157a2, List list) {
        return InterfaceC6289p.f36808x;
    }
}

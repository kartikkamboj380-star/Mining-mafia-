package com.google.android.gms.internal.measurement;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class U7 extends AbstractC6235j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U7(V7 v10, String str) {
        super(MobileAdsBridge.versionMethodName);
        Objects.requireNonNull(v10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6235j
    public final InterfaceC6289p c(C6157a2 c6157a2, List list) {
        return new C6226i(Double.valueOf(0.0d));
    }
}
